//Create a function that takes an array and a number and selectively reverse the order 
//of the array based on the number you're given (second argument). If you're given the 
//arguments [1,2,3,4,5,6] and 2, you would return the array [2,1, 4,3, 6,5].

public class problem1 {

    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5,6};
        selReverse(array1, 2);
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        
        System.out.println();
        int [] array2 = {2,4,6,8,10,12,14,16};
        selReverse(array2, 3);
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        int [] array3 = {5,7,2,6,0,4,6};
        selReverse(array3, 100);
        for(int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + " ");
        }
    }

    public static int [] selReverse(int [] array, int num){
        //If the array is empty. Just return empty array
        if(array.length == 0){
            return array;
        }

        //Initialize variables of start and end position
        int start = 0;
        int end = num -1;

        //While loop that iterates through entire array
        while(start<array.length-1){
            //If the number given is larger than the array, reverse the entire array
            if(end >= array.length-1){
                end = array.length-1;
            }
            //Reverse the array from the index[start] all the way to index[end]
            reverse(start, end, array);
            //Make the variables correspond to the next interval of numbers to be reversed
            start = end + 1;
            end+=num;
        }
        return array;
    }

    //Helper function to reverse the array at the given start and end index.
    private static void reverse(int start, int end,int[] array){
        while(start < end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;  
            end--;
            start++;
        }
    }
}