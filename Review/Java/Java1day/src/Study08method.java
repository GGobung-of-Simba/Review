public class Study08method {
    //0번 클래스 만든다
    int a; // 멤버 변수 a
    // 1번 변수a를 선언한다 (a는 정수야 기본값은 0이지)
    int b; // 멤버 변수 b
    // 2번 변수b를 선언한다 (b는 정수야 기본값은 0이지)

    public static void main(String[] arg) {
        //3번 프로그램의 시작 매서드 만들자
        Study08method cl = new Study08method();
        //4번 위의 시작을 나타내는 매서드를 실행하려면 객체가 필요해 객체만들자
        int[] array = cl.A(); // A() 메서드가 반환한 배열 저장
        //5번 그리고 나는 지역변수 a,b 값을 배열로 반환하는 A() 메서드를 호출할거야
        int a = array[0]; // 배열의 첫 번째 값
        //6번 a는 배열의 첫 번째 값이고
        int b = array[1]; // 배열의 두 번째 값
        //7번 b는 배열의 두 번째 값이야
        System.out.println(a + "&" + b); // 지역 변수 a, b 출력
        //8번 a랑 b 이렇게 출력해보자
    }

    int[] A() {
        //9번 근데 A메서드를 정의해주자 =A라는  이름의 배열을 만들어주자
        int a = 5; // 지역 변수
        // 정수배열을 갖는 A 메서드의 a값은 5
        int b = 10; // 지역 변수
        // 정수배열을 갖는 A 메서드의 b값은 10이야

        return new int[]{a, b}; // 배열로 반환
        // 우리는 배열을 새로 만들었잖아?
        //그걸 반환해주자
    }
}

