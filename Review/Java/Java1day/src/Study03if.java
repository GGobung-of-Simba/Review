public class Study03if {
    public static void main(String[] arg){
        int a=5;
        int b=2;

        if (a==b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        boolean c = true;
        if (c) {
            System.out.println("참");
        }else {
            System.out.println("거짓");
        }

        if (a==b){
            System.out.println("같다");
        }else if(a>b){
            System.out.println("a가 더 크다");
        }else{
            System.out.println("b가 더 크다");
        }
    }
    
}
