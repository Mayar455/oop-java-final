 

public class multiplyworker extends Thread {
    buffer bf;int [] r;int [][] mat;int location;
    public multiplyworker(buffer bf, int [] r, int [][] mat, int location){
        this.bf = bf;
        this.r = r; //satirlar
        this.mat = mat;
        this.location = location;  // satir indexi
    }
    @Override
     public void run (){
        int location =0;
        int [] cell =new int[this.mat[0].length];
        for (int n = 0; n < this.mat[0].length; n++) {
            int total =0;
            for (int m = 0; m < this.r.length; m++) {
                total +=this.r[m] * this.mat[m][n];
            }
            cell[location]= total;
            location++;
        }
         this.bf.put(this.location, cell);
    }
}
