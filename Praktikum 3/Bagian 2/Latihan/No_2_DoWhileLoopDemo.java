public class No_2_DoWhileLoopDemo {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        
        int i = 0;
        do{
            if(arr.length==0) break;
            System.out.println("elemen ke-" + i + " = " + arr[i]);
            i++;
        }while(i<arr.length);
    }
}
