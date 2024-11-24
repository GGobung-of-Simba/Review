public class Study01constructor {
// 클래스 선언 
// 변수와 메서드를 정의함.
// 객체를 만들기 위한 설계도 같은 것
// 객체를 자동차라 치면 빨간 자동차의 설계도라고 생각해보자
    public static void main(String[] arg){
    // 자바 애플리케이션을 실행하기 위한 첫 메서드    
    // 메서드는 빨간자동차의 기능이라고 볼 수 있다
    // 예를 들면 달리기, 멈추기 등
        Study01constructor study = new Study01constructor();
        //객체 생성
        //study는 객체를 참조하는 변수
        //객체는 빨간자동차의 속성이라고 볼 수 있다.
        //예를 들면 빨간색 자동차 5인승 등
        System.out.println(study);
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
    }
}
