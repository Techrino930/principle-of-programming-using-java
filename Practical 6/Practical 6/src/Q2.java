public class Q2 {
    public static void main(String[] args) {
        int[] list = {1,2,-8000,-4000,-1000,-1020,12,22};
        int totalIndex = (list.length);
        int min = 0;
        int minimumIndex = 0;

        for(int counter = 0; counter < totalIndex;counter++){
            if(list[counter] < min){
                min = list[counter] ;
            }
        }
//        check the array value index
        for(int i = 0; i < totalIndex ; i ++){
            if(min == list[i]){
                minimumIndex = i;
            }
        }
        System.out.println(minimumIndex);

    }
}