public class Study05for {
    public static void main(String[] arg){
        //구구단 만들어보기
        
        for(int table = 1; table <=9; table++){
            System.out.println(table + "단");
            for(int i = 1; i <=9; i++){
                System.out.println(table + "*" + i + "=" + (table * i)+"\t");
            }
        }
    }
    //for 문은 배열과 함께하니 배열을 제대로 알아두도록하자.
    
}
