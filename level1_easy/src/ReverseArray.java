public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("hii");
        int[] arr={2,3,4,5,5,6,3};
        int[] anotherArr=new int[]{3,4,3,2,};
        reverseArr(arr);

    }

    public static void reverseArr(int []arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }

    }
}
// need to start quickly .................