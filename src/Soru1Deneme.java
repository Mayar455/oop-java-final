 
import java.io.File;
import java.util.Scanner;
public class Soru1Deneme {
    public int[][] readmatFromText(String filePath){
        int r =this.matrixDimension(filePath)[0];
        int column =this.matrixDimension(filePath)[1];
        int [][] matFromText=new int[r][column];
        try {
            File f = new File(filePath);
            Scanner reader = new Scanner(f);
            int location =0;
            while (reader.hasNextLine()) {
                int [] cell =new int[column];
                String fileContent = reader.nextLine();
                String [] item = fileContent.split(" ");
                for (int i = 0; i < item.length; i++){
                    int numberFromString =Integer.parseInt(item[i].trim());
                    cell[i]= numberFromString;
                }
                matFromText[location]= cell; // tzt dosyasinin icindeki matrisin konumunu cell e aktariyor
                location++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("dosya bulundmadi.");
        }
        return matFromText;
    } //txt dosyasinin icindeki matrislerin boyutunu olcer
    public int[] matrixDimension(String fileName){
        int column =0;
        int row=0;
        int [] rowcol =new int[2];
        try {
            File f = new File(fileName);
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                row++;
                column =data.split(" ").length;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("dosya bulunmadi.");
        }
        rowcol[0]=row;
        rowcol[1]= column;
        return rowcol;
    }
    public static void main(String[] args) {
        Soru1Deneme denemeBir =new Soru1Deneme();
        //matrix one and matrix two
        int[][] matrixTwo = denemeBir.readmatFromText("matris2.txt");
        int[][] matrixOne =denemeBir.readmatFromText("matris1.txt");
        int r1 = matrixOne.length;
        int c2 = matrixTwo[0].length;
        buffer bf =new buffer(r1, c2);
        multiplyworker multiplyWorker;
        for (int index = 0; index < r1; index++ ){
            int [] r =matrixOne[index];
           multiplyWorker = new multiplyworker(bf, r, matrixTwo, index);
           multiplyWorker.start();
           while( multiplyWorker.isAlive()){}
        }
        bf.print(bf.finalmatrix);
    }
}
