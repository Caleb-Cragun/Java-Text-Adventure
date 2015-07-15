package zombietakeover;

import byui.cit260.zTakeover.model.*;
import byui.cit260.zTakeover.view.*;
import java.io.*;
/**
 *
 * @author Caleb Cragun and Nathan Grow
 */
public class ZombieTakeover {
    private static Game currentGame=null;
    private static Player player=null;
    private static Location currentLocation = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ZombieTakeover.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ZombieTakeover.player = player;
    }
    
    public static Location getCurrentLocation() {
        return currentLocation;
    }

    public static void setCurrentLocation(Location currentLocation) {
        ZombieTakeover.currentLocation = currentLocation;
    }
    

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ZombieTakeover.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ZombieTakeover.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ZombieTakeover.logFile = logFile;
    }
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            ZombieTakeover.inFile = new BufferedReader(new InputStreamReader(System.in));
            ZombieTakeover.outFile = new PrintWriter(System.out , true);
            
            //Open log file
            String filePath = "ZTakeover_log.txt";
            ZombieTakeover.logFile = new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
            return;
        }catch(Throwable te){
            System.out.println("Exception: "+te.toString()+
                               "\nCause: " + te.getCause()+
                               "\nMessage: " +te.getMessage());
            te.printStackTrace();
        }finally{
            try{
                if(ZombieTakeover.inFile != null)
                    ZombieTakeover.inFile.close();
                if(ZombieTakeover.outFile != null)
                    ZombieTakeover.outFile.close();
                if(ZombieTakeover.logFile != null)
                    ZombieTakeover.logFile.close();
            }catch (IOException ex){
                System.out.println("Error closing files");
                return;
            }
        }
    }
}
