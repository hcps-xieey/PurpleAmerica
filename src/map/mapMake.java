/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package map;

import edu.princeton.cs.introcs.StdDraw;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.*;
import java.util.*;

/**
 *
 * @author hcps-mosavellb
 */
public class mapMake {
     Scanner scan;
     Scanner scanColor;     
     File file;
     double minX; 
     double minY; 
     double mostX;
     double mostY; 
     double[] x;
     double[] y;     
     int terNum;
     int i = 0;
     String sVotes;
     String[] ary;
     double[] ary2 = new double[3];
     double red; 
     double green; 
     double blue;
    int electionNum = 0;
    String[] stateName;
    int[][] votes;             
    double sum;
    File election;
    String year = "2012";
    String state;
    String county;
    int p = 0;
    int stateNum;
    int voteNum;
    File file2;
        
    int[] turnout = new int[52];
    String[] stateTurn = new String[52];
    Scanner scan2;
    int givYear;// the given year by the file
    String test;//used to see if state is DC among other things
    Double preColor;
    
    
    
    public mapMake(File f, File e) throws FileNotFoundException{
     scan = new Scanner(f);
     minX = scan.nextDouble();
     minY = scan.nextDouble();
     mostX = scan.nextDouble();
     mostY = scan.nextDouble();
     StdDraw.setCanvasSize(1100, 700);
     StdDraw.setXscale(minX, mostX);
     StdDraw.setYscale(minY, mostY);
     scanColor = new Scanner(e);     
     file = f;
     election = e;
     
    }
    

    public void mapColor() throws FileNotFoundException{
        scan = new Scanner(file);
        scan.nextLine();
        scan.nextLine();
        stateNum = scan.nextInt();
        scan.nextLine();        
        scan.nextLine();
        while(scan.hasNext()){
            try{
                state = scan.nextLine();
                county = scan.nextLine();
                terNum = scan.nextInt();
                x = new double[terNum];
                y = new double[terNum];
                for(i = 0; i < terNum; i++){
                    scan.nextLine();
                    x[i] = scan.nextDouble();
                    y[i] = scan.nextDouble();
                }
                i = 0;
                for(i=0; i < stateName.length; i++){
                    if(state.equals(stateName[i])){
                        voteNum = i;
                    }
                }
                StdDraw.setPenColor(votes[voteNum][0], votes[voteNum][2], votes[voteNum][1]);
                StdDraw.filledPolygon(x, y);
                scan.nextLine();
                scan.nextLine();
            }catch(InputMismatchException e){
               scan.nextLine();
            }
        }
     scan = new Scanner(file);       
    }
    
    public void mapTurnout() throws FileNotFoundException{
        scan = new Scanner(file);
        scan.nextLine();
        scan.nextLine();
        stateNum = scan.nextInt();
        scan.nextLine();        
        scan.nextLine();
        while(scan.hasNext()){
            try{
                state = scan.nextLine();
                county = scan.nextLine();
                terNum = scan.nextInt();
                x = new double[terNum];
                y = new double[terNum];
                for(i = 0; i < terNum; i++){
                    scan.nextLine();
                    x[i] = scan.nextDouble();
                    y[i] = scan.nextDouble();
                }
                for(i=0; i < stateTurn.length; i++){
                    if(state.equals(stateTurn[i])){
                        voteNum = i;
                    }
                }
                StdDraw.setPenColor(turnout[voteNum], turnout[voteNum], 255);
                StdDraw.filledPolygon(x, y);
                scan.nextLine();
                scan.nextLine();
            }catch(InputMismatchException e){
               scan.nextLine();
            }
        }
        
    StdDraw.setPenColor(Color.BLACK);
    StdDraw.setFont(new Font ("Serif", Font.BOLD, 25));
    StdDraw.text(-78, 48, "Voter Turnout Map for "); 
    StdDraw.text(-78, 47, turnYear + ""); 
    
    StdDraw.setFont(new Font ("Times New Roman", Font.BOLD, 14));
    
    StdDraw.text(-121, 29, "100% Turnout"); 
    StdDraw.text(-115, 29, "50% Turnout"); 
    StdDraw.text(-109, 29, "0% Turnout"); 
    
    StdDraw.setPenColor(0, 0,255);
    StdDraw.filledSquare(-121, 27, 1.5);
    
    StdDraw.setPenColor(128, 128,255);    
    StdDraw.filledSquare(-115, 27, 1.5);
    
    StdDraw.setPenColor(0,0,0);       
    StdDraw.filledSquare(-109, 27, 1.53);    
    
    StdDraw.setPenColor(254, 254,255);   
    StdDraw.filledSquare(-109, 27, 1.5);


    
    
    
    
    
    
     scan = new Scanner(file);       
    }

    int turnYear;
    
    public void getTurnout(int year, File f) throws FileNotFoundException{
        
        scan2 = new Scanner(f);
        scan2.nextLine();
        scan2.nextLine();
        i = 0;
        turnYear = year;
        
        while(scan2.hasNext()){
            givYear = scan2.nextInt();
            
            if(givYear == year){
                scan2.nextInt();
                scan2.nextInt();
                
                stateTurn[i] = scan2.next();
                try{
                    scan2.nextDouble();
                
                }catch(InputMismatchException al){
                    if(stateTurn[i].equals("District")){
                        stateTurn[i] = "District" + " "+ scan2.next() + " "+scan2.next();
                    }else{
                        test = stateTurn[i] + " ";//sets the test to the first word of a state
                        stateTurn[i] = test + scan2.next();
                    }
                    scan2.nextDouble();                
                }
                    preColor = scan2.nextDouble();
                    
                    
                    turnout[i] = (int)(255.0 - (255 *(preColor/100)));              
                    i++;
                    scan2.nextLine();
            }else{
                scan2.nextLine();
            }  
        }        
        
    }

    
    
    
    public void getVotes(File f) throws FileNotFoundException{
        scanColor = new Scanner(f);
        scanColor.nextLine();
        i = 0;
        
        while(scanColor.hasNext()){
            electionNum++;
            scanColor.nextLine();            
        }
        votes = new int[electionNum][3];
        stateName = new String[electionNum];
        scanColor = new Scanner(f);
        scanColor.nextLine();        
        
        while(scanColor.hasNext()){
            sVotes = scanColor.nextLine();
            ary = sVotes.split(",");
            stateName[i] = ary[0];
            
            ary2[0] = Double.parseDouble(ary[1]);
            ary2[1] = Double.parseDouble(ary[2]);
            ary2[2] = Double.parseDouble(ary[3]);
            sum = ary2[0] + ary2[1] + ary2[2];
            votes[i][0] = (int) (225.0 * ary2[0]/sum);//red
            votes[i][1] = (int) (225.0 * ary2[1]/sum);//blue
            votes[i][2] = (int) (225.0 * ary2[2]/sum);//green            
            i++;
        }
              
            StdDraw.setPenColor((int)red,(int)green,(int)blue);
    }
    
    
    public void mapBorder()throws FileNotFoundException{
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
         
        }  

    }
    
     
    
}
