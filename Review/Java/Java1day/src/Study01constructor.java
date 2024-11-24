public class Study01constructor {
// 클래스 선언 
// 변수와 메서드를 정의함.
// 객체를 만들기 위한 설계도 같은 것
// 객체를 자동차라 치면 빨간 자동차의 설계도라고 생각해보자
    //public Study01constructor() {}
    //기본생성자, 생략가능하기때문에 안씀
    //근데 생성자를 여러개를 만드는 경우에는 생성자를 꼭 작성해주어야함.
    //생성자는 위의 클래스를 다른 곳에 쓰기 위해 필요함.
    //뭔말인지는 모르겠으나 일단 알아두자
    //기본생성자가 아닌 다른 생성자만 만들어 둘 경우
    //public Study01constructo(int a){}
    //이러면 기본 생성자 사라지고 위의 생성자만 생김
    public static void main(String[] arg){
    // 자바 애플리케이션을 실행하기 위한 첫 메서드    
    // 메서드는 빨간자동차의 기능이라고 볼 수 있다
    // 예를 들면 달리기, 멈추기 등
        Study01constructor study = new Study01constructor();
        //객체 생성
        //study는 객체를 참조하는 변수
        //객체는 빨간자동차의 속성이라고 볼 수 있다.
        //예를 들면 빨간색 자동차 5인승 등
        //아래의 int a = study.thatmethod(); 메모리 할당이 안되어 메모리 할당이 될 수 있도록 생성자를 만듦
        //뭔말인지는 모르겠지만 일단 알았다 해두자.
        System.out.println(study);
        // 주소값이 출력됨.
        // reference
        // study 참조변수
        int a = study.thatmethod();
        // 변수 a를 만들기 위해선 자료형이 필요함 위의 케이스에서는 int사용
        //ex
        /*
         * int b; //변수 b를 만듦
         * b = 2; //b에 값을 넣음
         * System.out.print(b); //b출력한거
         */
        System.out.println(a);
    }
    public int thatmethod(){
        return 1;
        //1의 값을 반환하는 메소드
    }
}
