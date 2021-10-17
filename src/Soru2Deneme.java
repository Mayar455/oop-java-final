 
import java.util.Scanner;

public class Soru2Deneme {

    public static void main ( String [] args){

        //instances of sort classes and soru2 deneme
        BubbleSort bubbleSort =new BubbleSort();
        InsertionSort insertionSort =new InsertionSort();
        QuickSort quickSort =new QuickSort();
        Soru2Deneme srt =new Soru2Deneme();
        int [] initialArray = srt.array();


        System.out.println("Write s to leave from the loop.");
        Scanner reader = new Scanner(System.in);
        System.out.println("Please type one of the followings: insertion bubble or quick");
        String flag = reader.nextLine();



        while ( !flag.equals("s") ){

            switch (flag){
                case "bubble":  // will printout the text file in bubble sorting way with
                    System.out.println("Bubble: ");
                    long initalTime = System.nanoTime();
                    int [] returnedArray = bubbleSort.getSortedArray(initialArray);
                    long lastTime = System.nanoTime();
                    for ( int ele: returnedArray){
                        System.out.print(ele+" ");
                    }
                    System.out.println("");
                    long runtime=(lastTime - initalTime);
                    System.out.println("Run time for bubble algorithm is "+ runtime+"ns");
                    break;
                case "insertion": // will printout the text file in bubble sorting way with
                    System.out.println("Insertion: ");
                    initalTime = System.nanoTime();
                    returnedArray = insertionSort.getSortedArray(initialArray);
                    lastTime = System.nanoTime();
                    for ( int ele: returnedArray){
                        System.out.print(ele+" ");
                    }
                    System.out.println("");
                    runtime=(lastTime - initalTime);
                    System.out.println("Run time for insertion algorithm is "+runtime+"ns" );
                    break;
                case "quick":
                    System.out.println("Quick: "); // will printout the text file in bubble sorting way with
                    int high = initialArray.length-1;
                    int low =0;
                    initalTime = System.nanoTime();
                    returnedArray = quickSort.getSortedArray(initialArray, low, high);
                    lastTime = System.nanoTime();
                    for ( int ele: returnedArray){
                        System.out.print(ele+" ");
                    }
                    System.out.println("");
                    runtime=(lastTime - initalTime);
                    System.out.println("Run time for quick algorithm is "+runtime+"ns" );
                    break;
                default:
                    System.out.println("Please choose a correct word for the sort algorithm");
                    break;

            } // yanlis girdi girildiginde tekrar kontrol etmesini istenir.
            System.out.println("Please type one of the followings: insertion bubble or quick");
            flag = reader.nextLine();
        }
    }
    public int [] array(){
        int [] arr =new int[15];
        for (int i = 0; i < arr.length; i++){
            int rand = (int)(1+Math.random() * 100 );
            arr[i]= rand;
        }
        return arr;
    }
}
