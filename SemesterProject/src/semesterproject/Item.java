/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a dungeon-crawl-style adventure. 
 *  Title:       IvyGames' Dungeon Crawl
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class contains methods that creates an item list from file
 *               and apply stats to the player after picking an item up.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Item {
    
    // global variables
    private static String itemName; // from action class, pickupitem() method
    private static String itemDescription;
    private static int attackChange;
    private static int speedChange;
    private static int healthChange;
    private static String[] itemNamesList; // from areas class
    private static String[] itemDescriptionsList;
    private static File itemFilePath;
    private static int itemNameIndex;
    private static int itemDescriptionIndex;
    
    // getters
    public static String[] getItemNameList() {
    	return itemNamesList;
    }
    public static String[] getItemDescriptionList() {
    	return itemDescriptionsList;
    }
    public static int getAttackChange() {
    	return attackChange;
    }
    public static int getSpeedChange() {
    	return speedChange;
    }
    public static int getHealthChange() {
    	return healthChange;
    }
    public static String getItemName() {
    	return itemName;
    }
    public static String getItemDescription() {
    	return itemDescription;
    }
    
    // setters
    public static void setItemName(int itemNum) {
    	itemName = itemNamesList[itemNum];
    }
    public static void setItemDescription(int itemNum) {
    	itemDescription = itemDescriptionsList[itemNum];
    }
    
    
    // methods
    // set up the item name list and item description list
    public static void setupItems() {        
        System.out.println("setupItems() -- Activate function to read items and definitions from file");
        itemNamesList = new String[24];
        itemDescriptionsList = new String[24];
        itemNameIndex = 0;
        itemDescriptionIndex = 0;
        try {
            // set items description file
            itemFilePath = new File("src/semesterproject/itemList.txt");
            System.out.println("Item file path: " + itemFilePath);
            
            // create a scanner for the item description file
            Scanner itemNameScanner = new Scanner(itemFilePath);
            
            System.out.println("\nItem Names:");
            // Item names
            for (int i = 0; i < 1; i++) {
                String readLine;
                for (itemNameIndex = 0; itemNameIndex <= 23; itemNameIndex++) {
                    readLine = itemNameScanner.nextLine();
                    itemNamesList[itemNameIndex] = readLine;
                    System.out.println("Line " + itemNameIndex + " Read From First Item Name File. = " + readLine);
                }
                System.out.print("\n----------------------------\n");
                for (itemDescriptionIndex = 0; itemDescriptionIndex <= 23; itemDescriptionIndex++) {
                    readLine = itemNameScanner.nextLine();
                    itemDescriptionsList[itemDescriptionIndex] = readLine;
                    System.out.println("Line " + itemDescriptionIndex + " Read From Item Description File. = " + readLine);
                }                
            }            
            
            // close files to complete file read
            itemNameScanner.close();
        } catch (IOException ex) {
            if ((!itemFilePath.exists()) || (itemFilePath.isDirectory())) {
                System.out.println("The file at: " + itemFilePath + " does exist or can not be found.");
            } else {
                System.out.println("\nException: " + ex + "\n");
                ex.printStackTrace();
            }
        }
        System.out.println("----------------------------------------------------------------");
    }
    
    // set the stats for an item that the user picks up
    public static void determineItemStats(String item) {
        switch (item) {
            case "Dagger":
                healthChange=0*10;
                attackChange=1;
                speedChange=1;
                Action.changeCharacterStats(healthChange, attackChange, speedChange);
                break;
            case "Longsword":
                healthChange=0*10;
                attackChange=3;
                speedChange=0;
                Action.changeCharacterStats(healthChange, attackChange, speedChange);
                break;
            case "Buckler":
                healthChange=3*10;
                attackChange=0;
                speedChange=0;
                Action.changeCharacterStats(healthChange, attackChange, speedChange);
                break;
	case "Plate Armor":
        	healthChange=5*10;
		attackChange=0;
		speedChange=-2;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Leather Armor":
		healthChange=2*10;
		attackChange=0;
		speedChange=2;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Thief Idol":
		healthChange=0*10;
		attackChange=2;
		speedChange=4;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Berserker Stone":
		healthChange=-5*10;
		attackChange=10;
		speedChange=3;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Great Axe":
		healthChange=0*10;
		attackChange=5;
		speedChange=-2;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Nibbles, the House Cat":
		healthChange=1*10;
		attackChange=1;
		speedChange=1;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Priestly Vestments":
		healthChange=10*10;
		attackChange=-5;
		speedChange=0;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Rapier":
		healthChange=0*10;
		attackChange=3;
		speedChange=3;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Hammer":
		healthChange=0*10;
		attackChange=2;
		speedChange=0;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Well-Crafted Boots":
		healthChange=1*10;
		attackChange=0;
		speedChange=3;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Assassin Gloves":
		healthChange=0*10;
		attackChange=3;
		speedChange=5;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Spiffy Hat":
		healthChange=2*10;
		attackChange=2;
		speedChange=2;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Sack Lunch":
		healthChange=5*10;
		attackChange=0;
		speedChange=0;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Embarrassing Drawings":
		healthChange=-3*10;
		attackChange=-3;
		speedChange=3;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
        	break;
        case "Some Self-Esteem":
		healthChange=5*10;
		attackChange=5;
		speedChange=5;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Miniature Mother-in-Law": 
		healthChange=3*10;
		attackChange=-3;
		speedChange=-5;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Elven Nutcracker":
		healthChange=0*10;
		attackChange=1;
        	speedChange=0;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Vorpal Sword":
		healthChange=0*10;
		attackChange=5;
		speedChange=7;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Yoga Pants":
		healthChange=1*10;
		attackChange=0;
		speedChange=5;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Book of Mormon":
		healthChange=0*10;
		attackChange=0;
		speedChange=0;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	case "Gladius, Fair Broadsword":
		healthChange=1*10;
		attackChange=8;
		speedChange=3;
		Action.changeCharacterStats(healthChange, attackChange, speedChange);
		break;
	}
        // print the stat changes to the player output
        SemesterProject.storyOutputTF.appendText("");
        System.out.println("pickUpItem() -- Stats Added: " + healthChange + " HP, " + attackChange + " ATK, " + speedChange + " SPD");
    }
    
    
    
    
    
    
}
