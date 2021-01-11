public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length - 1; i ++){
            if(i % 2 == 0){
                newArr[i] = arr[i / 2];
            }else{
                newArr[i] = arr[i / 2 + arr.length / 2];
            }
        }
        newArr[arr.length - 1] = arr[arr.length - 1];
        return newArr;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int temp;
        int idx;
        for(int i = 0; i < arr.length; i ++){
            idx = (int) (Math.random() * arr.length);
            temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        int[] arr = {};
        arr = selectionShuffle(arr);
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
