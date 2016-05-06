/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package map;
import edu.princeton.cs.introcs.*;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

/**
 *
 * @author hcps-sreekeshs
 */
public class CountiesMap  { 
       
    public CountiesMap() throws FileNotFoundException { 
         File AL = new File("src/map/AL.txt");
         Scanner scan = new Scanner(AL);
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
         scan = new Scanner(AL);
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

        }         
    }
    

    
}
