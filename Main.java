public class Main{
    public static void main(String[] arg){
        int SIZE = 1000;
        int MAX = 987;
        int arr[] =  new int[SIZE];

        for(int i = 0; i < SIZE; i++){
            arr[i] = (int) (Math.random()*MAX);
        }
        int s[] = sort(arr);

        for(int i:s)
            System.out.println(i);
    }

    private static int[] sort(int arr[]){
        //Base case
        if(arr.length < 2){
            return arr;
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
        for(int i = 0; i < endPoint; i++){
            rightArr[i] = arr[i + midPoint];
        }

        //Recursive step
        leftArr=sort(leftArr);
        rightArr=sort(rightArr);
        
        //Merging;
        int merged[] = new int[midPoint + endPoint];
        int leftPtr = 0, rightPtr = 0;
        int i = 0;
        while(leftPtr < midPoint && rightPtr < endPoint){
            if(leftArr[leftPtr] < rightArr[rightPtr]){
                merged[i] = leftArr[leftPtr];
                leftPtr++;
            }
            else{
                merged[i] = rightArr[rightPtr];
                rightPtr++;
            }
            i++;
        }

        while(leftPtr < midPoint){
            merged[i] = leftArr[leftPtr];
            leftPtr++;
            i++;
        }

        while(rightPtr < endPoint){
            merged[i] = rightArr[rightPtr];
            rightPtr++;
            i++;
        }
        
        return merged;
    }
}