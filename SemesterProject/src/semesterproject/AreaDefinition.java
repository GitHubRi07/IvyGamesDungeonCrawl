/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class contains the methods that set the description for each room.
 *		 The description is then sent to the player's output view.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AreaDefinition {
    
    // declare global variables
    private static String[] areaFirstMessage = new String[26];
    private static String[] areaMessage = new String[26];
    private static File areaFirstDescriptionFilePath;
    private static File areaDescriptionFilePath;
    private static int fileLineIndex;
    private static int firstFileLineIndex;
    
    
    // getters	
    public static String getFirstMessage(int roomNum) {
        return areaFirstMessage[roomNum];
    }
    public static String getAreaMessage(int roomNum) {
        return areaMessage[roomNum];
    }
    
    // setters
    
    
    
    // setup the area definitions for each room in the game.
    public static void setupAreaDefinitions() {
        System.out.println("setupAreaDefinition() -- Activate function to read area definitions from file");
        fileLineIndex = 0;
        firstFileLineIndex = 0;
        try {
            // set area description files
            areaFirstDescriptionFilePath = new File("src/semesterproject/firstAreaDescriptions.txt");
            areaDescriptionFilePath = new File("src/semesterproject/areaDescriptions.txt");
        	System.out.println(areaFirstDescriptionFilePath);
        	System.out.println(areaDescriptionFilePath);
            
            // create a scanner for the description files
            Scanner firstDescriptionscanner = new Scanner(areaFirstDescriptionFilePath);
            Scanner descriptionScanner = new Scanner(areaDescriptionFilePath);
            System.out.println("\n\nFirst Time Area Descriptions.");
            while (firstDescriptionscanner.hasNext()) {
                String message = firstDescriptionscanner.nextLine();
                areaFirstMessage[firstFileLineIndex] = message;
                firstFileLineIndex++;
                System.out.println(firstFileLineIndex + "Line Read From First Description File.");
            }
            System.out.println("\n\nArea Descriptions.");
            while (descriptionScanner.hasNext()) {
                String message = descriptionScanner.nextLine();
                areaMessage[fileLineIndex] = message;
                fileLineIndex++;
                System.out.println(fileLineIndex + "Line Read From Description File.");
            }
            
            // close files to complete file read
            firstDescriptionscanner.close();
            descriptionScanner.close();
        } catch (IOException ex) {
            if ((!areaFirstDescriptionFilePath.exists()) || (areaFirstDescriptionFilePath.isDirectory())) {
                System.out.println("The file at: " + areaFirstDescriptionFilePath + " does exist or can not be found.");
            } else if (!areaDescriptionFilePath.exists() || (areaDescriptionFilePath.isDirectory())) {
                System.out.println("The file at: " + areaDescriptionFilePath + " does exist or can not be found.");
            } else {
                System.out.println("\nException: " + ex + "\n");
                ex.printStackTrace();
            }
        }
    }
    
    
    // set and display area message
    public static void areaMessage(int roomNum) {
        if (!Areas.getBeenTo(roomNum)) {
            // first time message
            SemesterProject.storyOutputTF.appendText(getFirstMessage(roomNum));
        } else {
            // regular message
            SemesterProject.storyOutputTF.appendText(getAreaMessage(roomNum));
        }
    }
}
