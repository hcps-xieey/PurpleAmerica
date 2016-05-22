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
import edu.princeton.cs.introcs.*;
import java.io.File;
import java.util.*;
/**
 *
 * @author 
 */
public class PoliticalMap {
    public static void main(String[] args) throws Exception{
        
    File file = new File("src/map/USA.txt");
    File elect = new File("src/data/USA2012.txt");
    String strState[] = {"AL","AR","AZ","CA","CO","CT","DC","DE","FL","GA",
        "IA","ID","IL","IN","KS","KY","LA","MA","MD","ME","MI","MN","MO","MS",
        "MT","NC","ND","NE","NH","NJ","NM","NV","NY","OH","OK","OR","PA","RI",
        "SC","SD","TN","TX","UT","VA","VT","WA","WI","WV","WY"}; 
        //array with all the names of the States' abbreviations
    
    StdDraw.setCanvasSize(1100, 700);
     
    mapMake map = new mapMake(file, elect);  
    map.getVotes(elect);
    map.mapColor();
    map.mapBorder();
 
    // Calls strState and calls methods involed from CountiesMap class.   
    for (int i=0;i<strState.length;i++){
        File countyFile = new File ("src/data/" + strState[i]+ ".txt");
        File countyVotes = new File ("src/data/"+ strState[i]+"2012.txt");
        CountiesMap county = new CountiesMap(countyFile,countyVotes); 
        county.getVotes(countyVotes);
        county.mapColor(); 
        county.mapBorder();
    } 
  }
}