/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class contains methods that creates each room as an object, 
 		 sets its enemies, items, picture, and prints it's description.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


import java.io.File;
import java.util.Random;
import javafx.scene.image.Image;


public class Areas {
	// global variables
    private static int currentArea;
    private static int lastArea;
    private static String[] itemNames = {"Dagger","Longsword","Buckler","Plate Armor","Leather Armor","Thief Idol",
    		"Berserker Stone","Great Axe","Nibbles, the House Cat","Priestly Vestments","Rapier","Hammer",
    		"Well-Crafted Boots","Assassin Gloves","Spiffy Hat","Sack Lunch","Embarrassing Drawings",
    		"Some Self-Esteem","Miniature Mother-in-Law","Elven Nutcracker","Vorpal Sword","Yoga Pants",
    		"Book of Mormon","Gladius, Fair Broadsword"};
    private static String itemName = "";
    private static boolean[] beenTo = new boolean[26];
    private static boolean[] hasItem = new boolean[26];
    private static boolean[] gottenItem = new boolean[26];
    private static boolean[] hasEnemy = new boolean[26];
    private static boolean[] enemyDead = new boolean[26];
    private static Areas[] roomsArray = new Areas[26];
    private static File roomImagePath;
    private static Random randomGenerator = new Random();
    private static Goblin goblin;
    private static Orc orc;
    private static Ogre ogre;
    private static Boss boss;
    
    
    // constructors
    Areas(int roomNum) {
        System.out.println("Areas() -- activated function to create a new area.");
        int area = roomNum;
        System.out.println("Areas() -- Room Area: " + area);
        // check if they have been to the room before
        // if not, determine if this room has an item and set enemies
        if (!beenTo[area]) {
            determineIfHasItem(area);
            determineIfHasEnemy(area);
            AreaDefinition.areaMessage(area);
            generateEnemies(area);
            setRoomImage(area);
            setBeenTo(area);
        }
        // If the room has an item, check if the player has gotten the item. If not, set the item.
        if ((hasItem[area]) && (!gottenItem[area])) {
            // get item name from array of item names
            int itemNum = randomGenerator.nextInt(24);
            setItemName(itemNum);
        }
        System.out.println("Areas() -- Area " + roomNum + " Created.");
    }
    
	
    // getters
    public static int getArea() {
        return currentArea;
    }
    public static int getLastArea() {
        return lastArea;
    }
    public static boolean getBeenTo(int roomNum) {
        return beenTo[roomNum];
    }
    public static String getItemName() {
    	return itemName;
    }
    public static boolean getHasEnemy(int roomNum) {
    	return hasEnemy[roomNum];
    }
    public static boolean getEnemyDead(int roomNum) {
    	return enemyDead[roomNum];
    }
    public static boolean getHasItem(int roomNum) {
    	return hasItem[roomNum];
    }
    public static boolean getGottenItem(int roomNum) {
    	return gottenItem[roomNum];
    }
    
    //setters
    public static void setArea(int newArea) {
        currentArea = newArea;
    }
    public static void setLastArea(int newArea) {
        lastArea = newArea;
    }
    public static void setBeenTo(int roomNum) {
    	beenTo[roomNum] = true;
    }
    public static void setHasItem(int roomNum) {
    	hasItem[roomNum] = true;
    }
    public static void setGottenItem(int roomNum) {
    	gottenItem[roomNum] = true;
    }
    private static void setItemName(int itemNum) {
    	itemName = itemNames[itemNum];
    }
    private static void setRoomImage(int roomNum) {
    	roomImagePath = new File(("semesterProject/mapRooms/room") + (Integer.toString(roomNum)) + (".jpg"));
    	String roomImagePathString = roomImagePath.toString();
    	Image RoomPic = new Image(roomImagePathString);
    	SemesterProject.mapIV.setImage(RoomPic);
    }
    public static void setHasEnemy(int roomNum) {
    	hasEnemy[roomNum] = true;
    }
    public static void setEnemyDead(int roomNum) {
    	enemyDead[roomNum] = true;
    }
        
    
    // If its the first time to that room:
    	// Create new Areas object for the room and display the first-time-to-room message
    	// Display first time area message
    // If not the first time to the room, set room image and message
    public static void activateArea() {
    	System.out.println("activateArea() -- Activated function to create an area, or display its image & message.");
    	switch (getArea()) {
    		case 0:
    			if (!beenTo[0]) {
        			roomsArray[0] = new Areas(0);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
    			break;
    		case 1:
    			if (!beenTo[1]) {
    				roomsArray[1] = new Areas(1);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 2:              
            	if (!beenTo[2]) {
            		roomsArray[2] = new Areas(2);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 3:               
            	if (!beenTo[3]) {
            		roomsArray[3] = new Areas(3);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 4:
            	if (!beenTo[4]) {
            		roomsArray[4] = new Areas(4);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 5:
            	if (!beenTo[5]) {
            		roomsArray[5] = new Areas(5);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 6:                
            	if (!beenTo[6]) {
            		roomsArray[6] = new Areas(6);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 7:               
            	if (!beenTo[7]) {
            		roomsArray[7] = new Areas(7);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 8:               
            	if (!beenTo[8]) {
            		roomsArray[8] = new Areas(8);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 9:                
            	if (!beenTo[9]) {
            		roomsArray[9] = new Areas(9);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 10:               
            	if (!beenTo[10]) {
            		roomsArray[10] = new Areas(10);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 11:
            	if (!beenTo[11]) {
            		roomsArray[11] = new Areas(11);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 12:
            	if (!beenTo[12]) {
            		roomsArray[12] = new Areas(12);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 13:
            	if (!beenTo[13]) {
            		roomsArray[13] = new Areas(13);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 14:
            	if (!beenTo[14]) {
            		roomsArray[14] = new Areas(14);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 15:
            	if (!beenTo[15]) {
            		roomsArray[15] = new Areas(15);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 16:
            	if (!beenTo[16]) {
            		roomsArray[16] = new Areas(16);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 17:
                if (!beenTo[17]) {
                	roomsArray[17] = new Areas(17);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 18:
                if (!beenTo[18]) {
                	roomsArray[18] = new Areas(18);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 19:
                if (!beenTo[19]) {
                	roomsArray[19] = new Areas(19);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 20:
                if (!beenTo[20]) {
                	roomsArray[20] = new Areas(20);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 21:
                if (!beenTo[21]) {
                	roomsArray[21] = new Areas(21);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 22:
                if (!beenTo[22]) {
                	roomsArray[22] = new Areas(22);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 23:
                if (!beenTo[23]) {
                	roomsArray[23] = new Areas(23);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 24:
                if (!beenTo[24]) {
                	roomsArray[24] = new Areas(24);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
            case 25:
                if (!beenTo[25]) {
                	roomsArray[25] = new Areas(25);
    			} else {
    				setRoomImage(currentArea);
        			AreaDefinition.areaMessage(currentArea);    		
    			}
                break;
    	}
    }
    
      
    private void determineIfHasItem(int roomNum) {
    	System.out.println("determineIfHasItem() -- Activated function to determine if a room has an item.");
        int percentChance = (int) Math.ceil(Math.random()*100);
    	System.out.println("determineIfHasItem() -- Percent chance to get an item: %" + percentChance);
        // there are no items in room0, the cave entrance
    	if ((roomNum != 0)) {
            // rooms 20-25 have a 40% chance to find an item because they are dark
            if ((roomNum == 20) || (roomNum != 21) || (roomNum != 22) || 
                    (roomNum != 23) || (roomNum != 24) || (roomNum != 25)) {
                if (percentChance > 40) {
        		setHasItem(roomNum);
        		System.out.println("determineIfHasItem() -- There is an item in room: " + roomNum);
        	}
            } else {
                // all other rooms have an 80% chance to find an item.
        	if (percentChance > 20) {
        		setHasItem(roomNum);
        		System.out.println("determineIfHasItem() -- There is an item in room: " + roomNum);
        	}
            }
    	}
    }
    
    private void determineIfHasEnemy(int roomNum) {
    	System.out.println("determineIfHasEnemy() -- Activated function to determine if a room has an enemy.");
        int percentChance = (int) Math.ceil(Math.random()*100);
    	System.out.println("determineIfHasEnemy() -- Percent chance to find an enemy: %" + percentChance);
        // there are no enemies at the cave entrance and there is a boss in area 11
    	if (roomNum != 0) {
            // rooms 20-25 have a 50% chance to find an enemy because they are dark
            if ((roomNum == 20) || (roomNum == 21) || (roomNum == 22) || 
                    (roomNum == 23) || (roomNum == 24) || (roomNum == 25)) {
                if (percentChance > 50) {
        		setHasEnemy(roomNum);
        		System.out.println("determineIfHasEnemy() -- there is an enemy in room: " + roomNum);
        	}
            } else if (roomNum == 11) {
    		setHasEnemy(roomNum);
    		System.out.print("determineIfHasEnemy() -- Boss enemy room");
            } else {
                // in all other rooms there is a 25% chance that there will be an enemy
        	if (percentChance > 25) {
                    setHasEnemy(roomNum);
                    System.out.println("determineIfHasEnemy() -- there is an enemy in room: " + roomNum);
        	}
            }
    	}
    }
    
    public static void generateEnemies(int roomNum) {
    	System.out.println("generateEnemies() -- Activated function to generate enemies.");
    	if (hasEnemy[roomNum] == true) {
    		System.out.println("generateEnemies() -- There is an enemy in room: " + roomNum);
    		if (roomNum == 11) {
    	    	System.out.println("generateEnemies() -- room number equal to 11: " + (roomNum == 11));
        		// set boss room enemy
        		boss = new Boss();
        		boss.setBossStats();
        		System.out.println("generateEnemies() -- Enemies Here: " + boss);
    		} else {
    			// code to set the enemies for the specific room
        		int randomInt = randomGenerator.nextInt(3) + 1;
        		switch (randomInt) {
        		case 1:
        			goblin = new Goblin();
        			goblin.setGoblinStats();
        			SemesterProject.storyOutputTF.appendText("\nThere is a Goblin!");
            		System.out.println("generateEnemies() -- Enemies Here: " + goblin);
        			break;
        		case 2:
        			orc = new Orc();
        			orc.setOrcStats();
        			SemesterProject.storyOutputTF.appendText("\nThere is an Orc!");
            		System.out.println("generateEnemies() -- Enemies Here: " + orc);
        			break;
        		case 3:
        			ogre = new Ogre();
        			ogre.setOgreStats();
        			SemesterProject.storyOutputTF.appendText("\nThere is an Ogre!");
            		System.out.println("generateEnemies() -- Enemies Here: " + ogre);
        			break;
        		}
    		}
    	}
    }
}
