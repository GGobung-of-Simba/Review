public class Study06array {
    /**
     * @param arg
     */
    public static void main(String[] arg){
        String[] weekE = new String [7];
        weekE[0] = "Sun";
        weekE[1] = "Mon";
        weekE[2] = "Tue";
        weekE[3] = "Wed";
        weekE[4] = "Thu";
        weekE[5] = "Fri";
        weekE[6] = "Sat";
        System.out.println(weekE[3]);

        String[] weekK = {"일", "월", "화", "수", "목", "금", "토"};
        System.out.println(weekK[3]);
        System.out.println(weekK.length);
        for(int i = 0; i<weekK.length; i++){
            System.out.println(weekK[i]);
        }
        


        String[][] array01 = new String[10][10];
        for(int i = 0; i < array01.length; i++){
            for(int j = 0; j < array01[i].length; j++){
                if(i>=j){
                    array01[i][j]="0";
                }else{
                    array01[i][j]="1";
                }
                System.out.print(array01[i][j]);
            }
            System.out.println();
        }
    }
}
    

