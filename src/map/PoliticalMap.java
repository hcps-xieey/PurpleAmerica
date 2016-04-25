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
import static edu.princeton.cs.introcs.StdDraw.setCanvasSize;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class PoliticalMap {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException{
        File test = new File(PoliticalMap.class.getResource("/map/USA.txt").toURI()); 
        Scanner sc = new Scanner(test); 
        sc.nextInt(); 
        sc.nextInt(); 
        sc.nextInt(); 
        sc.nextInt(); 
        sc.nextInt(); 
        
        sc.nextLine();
        sc.nextLine();
        sc.nextInt(); 
        
        double[] ary = new double[10000];
        double[] ary2 = new double[10000]; 
        double input; 
        int counter = 0; 
        while(sc.hasNextDouble()){
            input = sc.nextInt(); 
            ary[counter] = input; 
            input = sc.nextInt(); 
            ary2[counter] = input; 
            counter ++; 
        }
        
        setCanvasSize(1000,1000); 
        
    }
}
