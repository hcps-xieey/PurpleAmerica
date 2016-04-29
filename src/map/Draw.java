/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package map;
import edu.princeton.cs.introcs.*;
import java.util.Scanner; 
import java.io.*; 

/**
 *
 * @author hcps-sreekeshs
 */
public class Draw {
    double[] X;
    double[] Y;
    File USA = new File("USA.txt"); 
    Scanner scan = new Scanner(System.in); 
    
    while (X > -70) {
         X = scan.nextDouble(); 
        System.out.print(USA);
    }
    
    while (Y > 20 ) { 
        Y = scan.nextDouble(); 
        System.out.println(USA);
    }
    
    StdDraw.setCanvasSize(1000,1000);//sets the size of the window 
    StdDraw.setPenRadius(0.005);
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.point(0.5, 0.5); 
    StdDraw.polygon(X, Y);
    
}
