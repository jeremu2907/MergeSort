public class Main{
    public static void main(String[] arg){
        int arr[] = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = (int) (Math.random()*100);
        }

        for(int i:arr)
            System.out.println(i);
        System.out.println();
        sort(arr);
    }

    private static void sort(int arr[]){
        //Base case
        if(arr.length < 2){
            return;
        }

        //Break current array to smaller arrays
        int midPoint = arr.length / 2;
        int endPoint = arr.length - midPoint;

        int leftArr[] = new int[midPoint];
        int rightArr[] = new int[endPoint];

            //Recursive step
        sort(leftArr);
        sort(rightArr);
        

    }

    private static void swap(){}
}