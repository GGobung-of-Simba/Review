# D+1
1. 도커란무엇인가?
```
 웹 서버를 실행하거나 웹 애플리케이션을 개발하고, 데이터베이스와 같은 정보를 저장하려면 보통 운영체제 위에 필요한 프로그램을 설치해야 한다.
 
 하지만, 이러한 프로그램들을 설치하고 실행할 때 서로 다른 실행 환경이나 운영체제의 차이로 인해 환경 설정이 어렵거나 호환성 문제가 발생할 수 있다.
 
 이 문제를 해결하기 위해 하나의 컴퓨터에서 각각 가상의 컴퓨터를 만들고 그 위에 운영체제를 설치한 뒤 프로그램을 실행하는 방법이 있을 수 있습니다. 
 하지만, 이런 방식은 운영체제 위에 또 다른 운영체제를 설치해야 하므로 시스템 자원이 많이 소모되고 실행 속도가 느려질 수 있습니다. 
 또한 저장 공간도 많이 차지하게 되어 효율적이지 않습니다.
 
 도커는 이러한 문제를 해결하기 위해 만들어진 소프트웨어다. 
 도커는 하나의 컴퓨터에서 여러 프로그램을 격리된 환경에서 실행할 수 있는 가상화 기술을 제공한다. 
 이 격리된 환경을 컨테이너라고 부르며, 컨테이너에는 운영체제 전체를 포함하지 않고, 프로그램 실행에 필요한 최소한의 라이브러리와 소프트웨어만 포함한다.
 
 도커는 기존 운영체제를 공유하기 때문에 별도의 운영체제를 추가로 설치할 필요가 없다.
 따라서 실행 속도가 빠르고, 저장 공간도 적게 사용하며, 자원 낭비를 줄일 수 있다.
```

2. 도커 환경 설정하기

- Extension Tab에서
- dev containers 설치
- 관리 탭에서 command palette 
- devcontainers rebuild and peopen in container 선택
- 도커이미지가 받아지며 컨테이너가 실행 됨.

java, python, db등 1일차 youtube 참조

---

# D+2 
# 도커 알아보기
---
+ 기본 명령어
+ 도커파일을 docker build하기
---

+ 현재 실행중인 도커 버전 확인
```
docker --version
docker -v
```

+ 도커 명령어
```
docker --help
```

+ 도커 허브에 있는 repositoy의 `image` 내려받기
```
docker pull [이미지명:태그명]
(ex)
docker pull ubuntu:24.04
```

+ 도커 `이미지` 확인
```
docker images
docker imase ls
docker imase list
```
+ 도커 컨테이너 `생성` 하기
```
docker create -i --name ubt ubuntu:24.04
```

+ 도커 컨테이너 `시작` 하기
```
docker start ubt
```
+ 도커 컨테이너 `생성+실행`하기
```
docker run [옵션] [컨테이너명] [도커이미지]

(example)
docker run -d -it --name ubt 

(explaination)
ubuntu:24.04

-d : 백그라운드에서 실행하겠다
ubt : 내가 지은 컨테이너 이름
```

+ 도커 컨테이너 `실행` 확인
```
docker ps
```


+ 도커 컨테이너 `전체` 확인
```
docker ps -a
```

+ 도커 컨테이너 `정지` 하기
```
docker stop ubt
```

+ 도커 컨테이너 `삭제` 하기
```
docker rm ubt
docker rm -f ubt 
(강제로 삭제하 방는법)
```

+ `dockerfile` 만들어 보기
- 도커이미지를 개인화하여 교체하기 위해 사용하는 방법
```
docker run -d -p 80:80 --name web httpd:2.4.62
```
- dockerfile 파일 만들고 넣기
(이미지를 만들기 위한 속성을 채워줌)
```
FROM ubuntu:24.04
(운영체제를 정해줌, 베이스 이미지)

RUN apt-get update
(위의 운영체제를 최신화시켜줘라)

RUN apt-get install -y apache2
(아파치2 설치해라)

EXPOSE 80
(Fort forwarding)

CMD ["apache2ctl", "-D", "FOREGROUND"]
(아파치2컨트롤 백그라운드에서 )
```
도커 이미지 생성 (`build`) 하기
```
docker build -t web:1 .
```
+ 생성한 이미지 실행 하기
```
docker run -d -p 80:80 --name web web:1
```

## Dockerfile 
```
FROM        : 기본 대상 이미지를 정의 하는 속성

MAINTAINER  : 작성자의 정보를 기록하는 속성

RUN         : FROM의 기반 이미지 위에서 실행될 명령어 정의

COPY        : 도커 컨테이너의 경로로 파일을 복사 할때 사용하는 속성
COPY 로컬:컨테이너 
COPY c:\IDE\works\vscode\index.html:/var/www/html/index.html

ENV         : 도커 컨테이너의 환경변수를 정의 하는 속성

EXPOSE      : 연결할 포트 번호 정의

ENTRYPOINT  : 도커 컨테이너 생성 후 실행될 명령어 (1회 실행)

CMD         : 도커 컨테이너 시작 이후 실행될 명령어
```

## `docker run` 옵션
```
-i          : 컨터이너와 상호 입출력 활성화 정의
-t          : tty 활성화. 주로 -i 옵션과 함께 이용
-it         : -i와 -t를 한번에 정의하는 옵션

-p          : 포트포워딩 옵션   (ex 로컬포트:컨테이너포트)

-e          : 환경변수를 지정하거나 값을 변경 하는 옵션

-v          : 저장소 연경 또는 공유 하는 옵션
> 도커의 저장소 (도커 내부의 `Volumes` 영역 공간)
> 로컬의 저장소 (컴퓨터의 HDD 또는 SSD)
```
---
## 도커 `network` 알아보기

1. 도커 호스트에 있는 `network` 목록 확인
```
docker network ls
```

2. 도커 Network의 드라이버 중 `bridge`의 정보 확인
```
docker network inspect [NETWORK ID]
```

3. 도커 Network를 `생성` 하기
```
docker network create myNet
```

4. 도커 컨테이너 `실행` 할때 network 연결해주기
```
docker run -d -p 9090:80 --network=myNet --name web3 web:2
```
---
## `docker compose` 만들어 보기

1. 데이터베이스 컨테이너 `실행` 해보기
+ `docker run` 사용해 보기
```
docker run -d -p 13306:3306 -e MARIADB_ROOT_PASSWORD=1234 mariadb:11.5.2
```
+ `docker compose` 실행 하기
```
docker compose up -d
```
+ `docker compose`에서 `network` 설정 하기
```yml
networks:
  myNet:
    driver: bridge
    ipam:
      config:
        - subnet: 192.168.100.0/24
          gateway: 192.168.100.254
```
+ `service`에 적용 시 `ip` 설정
```yml
services:
  db:
    container_name: db
    image: mariadb:11.5.2
    restart: always
    ports: 
      - 23306:3306
    environment:
      - MARIADB_ROOT_PASSWORD=4321
    networks:
      myNet:
        ipv4_address: 192.168.100.10
```
+ `compose.yml` 전체 내용
```yml
services:
  db:
    container_name: db
    image: mariadb:11.5.2
    restart: always
    ports: 
      - 23306:3306
    environment:
      - MARIADB_ROOT_PASSWORD=4321
    networks:
      myNet:
        ipv4_address: 192.168.100.10

networks:
  myNet:
    driver: bridge
    ipam:
      config:
        - subnet: 192.168.100.0/24
          gateway: 192.168.100.254
```