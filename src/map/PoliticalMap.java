/*
 * Political Map Project
 * Name: 
 * Block:
 * 
 * Program Purpose:
 *
 * Algorithm:
 * 
 * Future/possible improvements:
 *
 */
package map;
import edu.princeton.cs.introcs.StdDraw;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class PoliticalMap {
    public static void main(String[] args) throws Exception{
          
        File file = new File("src/map/USA.txt");
        File file2 = new File("src/data/USA2012.txt"); 
        Scanner scan = new Scanner(file);
        double minX = scan.nextDouble(); 
        double minY = scan.nextDouble(); 
        double mostX = scan.nextDouble(); 
        double mostY = scan.nextDouble(); 
        StdDraw.setCanvasSize(1100, 700);
        StdDraw.setXscale(minX, mostX);
        StdDraw.setYscale(minY, mostY);
        double[] x;
        double[] y;     
        int terNum;
        int i = 0;
        StdDraw.setPenColor(StdDraw.BLUE);

        /*
        while(scan.hasNext()){
            try{
                terNum = scan.nextInt();
                x = new double[terNum];
                y = new double[terNum];
                for(i = 0; i < terNum; i++){
                  scan.nextLine();
                    x[i] = scan.nextDouble();
                    y[i] = scan.nextDouble();
                }
                StdDraw.filledPolygon(x, y);

            }catch(InputMismatchException e){
               scan.nextLine();
            }

        }
        scan = new Scanner(file);
        StdDraw.setPenColor(StdDraw.BLACK);
        while(scan.hasNext()){
            try{
                terNum = scan.nextInt();
                x = new double[terNum];
                y = new double[terNum];
                for(i = 0; i < terNum; i++){
                    scan.nextLine();
                    x[i] = scan.nextDouble();
                    y[i] = scan.nextDouble();
                }
                  StdDraw.polygon(x, y);

            }catch(InputMismatchException e){
                scan.nextLine();
            }

        }*/
        
        Scanner sc = new Scanner(file2); 
        sc.nextLine(); 
        String testInput = sc.next();
        String[] ary = testInput.split(",");
        double a1 = (double)(Integer.parseInt(ary[1])); 
        double a2 = (double)(Integer.parseInt(ary[2]));
        double a3 = (double)(Integer.parseInt(ary[3])); 
        double r = ((a1)/(a1 + a2 + a3));
        double g = ((a2)/(a1 + a2 + a3));
        double b = ((a3)/(a1 + a2 + a3));
        System.out.println(r + ", " + g + ", " + b); 
        
    }
}