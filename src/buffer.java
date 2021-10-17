 
public class buffer {
    int [][] finalmatrix;
    public buffer(int r, int c){
        this.finalmatrix =new int[r][c];
    }
    public  void put(int loc, int [] r){
        this.finalmatrix[loc]= r;
    }
    public  void print (int [][] multmat){
        System.out.println("New matrix");
       for(int[] row : multmat) {
            for (int col : row) {
                System.out.print(col + "   ");
            }
            System.out.println("");
        }
    }
}
