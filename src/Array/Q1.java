package Array;

public class Q1 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        for (int i = 0 ; i < arr.length ;i++){
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }

        }
        System.out.println();
    }
}
