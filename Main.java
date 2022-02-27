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

            //Splitting array
        int leftArr[] = new int[midPoint];
        int rightArr[] = new int[endPoint];
        for(int i = 0; i < midPoint; i++){
            leftArr[i] = arr[i];
        }
        for(int i = 0; i + endPoint < arr.length; i++){
            rightArr[i] = arr[i + endPoint];
        }

            //Recursive step
        sort(leftArr);
        sort(rightArr);
        
        //Merge sort;
        int merged[] = new int[midPoint + endPoint];
        int leftPtr = 0, rightPtr = 0;
        for(int i = 0; i < merged.length; i++){
            if(leftArr[leftPtr] >= rightArr[rightPtr]){
                merged[i] = rightArr[rightPtr];
                if(rightPtr < rightArr.length) rightPtr++;
            }
            else{
                merged[i] = leftArr[leftPtr];
                if(leftPtr < leftArr.length) leftPtr++;
            }
        }

        return;
    }
}