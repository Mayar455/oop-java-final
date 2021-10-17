 

public class Main extends Thread {

    @Override
    public void run(){  
        int list[]=new int[10];
        for ( int counter =0; counter < list.length; counter++){
            System.out.println("running in thread ");
        }
    }
    public static void main (String args){
        Main p=new Main();
        p.run();
        System.out.println("running in main thread ");

    }
}
