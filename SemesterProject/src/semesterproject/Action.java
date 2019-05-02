/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a dungeon-crawl-style adventure.  
 *  Title:       IvyGames' Dungeon Crawl
 *  Authors: 	 Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class contains the methods needed for the actions that a player
 * 		 can take. 
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Action extends FantasyRace {
    // global variables
    private static boolean playerDead;
    private static boolean playerWon;
    private static int characterHealth;
    private static int characterAttack;
    private static int characterSpeed;
    private static int enemyHealth;
    private static int enemyMaxHealth;
    private static int enemyAttack;
    private static int enemySpeed;
    private static int hpChange;
    private static int atkChange;
    private static int spdChange;
	
    
    // getters
    public static boolean getPlayerDead() {
        return playerDead;
    }
    public static boolean getPlayerWon() {
        return playerWon;
    }
    
    // setters
    public static boolean setPlayerDead(boolean dead) {
        playerDead = dead;
        return playerDead;
    }
    public static boolean setPlayerWon(boolean won) {
        playerWon = won;
        return playerWon;
    }
    
    
    // methods
    public static void goWest() {
    	if ((!getPlayerDead()) && (!getPlayerWon())) {
    		if (!Areas.getHasEnemy(Areas.getArea())) {
                switch (Areas.getArea()) {
	                case 2:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(2);
	                	Areas.setArea(1);
	                	Areas.activateArea();
	                	break;
	                case 3:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(3);
	                	Areas.setArea(2);
	                	Areas.activateArea();
	                    break;
	                case 9:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(9);
	                	Areas.setArea(8);
	                	Areas.activateArea();
	                    break;
	                case 10:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(10);
	                	Areas.setArea(9);
	                	Areas.activateArea();
	                    break;
	                case 11:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(11);
	                	Areas.setArea(10);
	                	Areas.activateArea();
	                    break;
	                case 12:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(12);
	                	Areas.setArea(11);
	                	Areas.activateArea();
	                    break;
	                case 13:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(13);
	                	Areas.setArea(12);
	                	Areas.activateArea();
	                    break;
	                case 14:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(14);
	                	Areas.setArea(13);
	                	Areas.activateArea();
	                    break;
	                case 16:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(16);
	                	Areas.setArea(15);
	                	Areas.activateArea();
	                    break;
	                case 17:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(17);
	                	Areas.setArea(16);
	                	Areas.activateArea();
	                    break;
	                case 21:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(21);
	                	Areas.setArea(20);
	                	Areas.activateArea();
	                    break;
	                case 22:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(22);
	                	Areas.setArea(21);
	                	Areas.activateArea();
	                    break;
	                case 23:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(23);
	                	Areas.setArea(22);
	                	Areas.activateArea();
	                    break;
	                case 24:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(24);
	                	Areas.setArea(23);
	                	Areas.activateArea();
	                    break;
	                case 25:
	                	pickUpItem(Areas.getArea());
	                	Areas.setLastArea(25);
	                	Areas.setArea(24);
	                	Areas.activateArea();
	                    break;
	                default:
	                    // if no other case numbers activate
	                    SemesterProject.storyOutputTF.appendText("\n- You can't go West.\n");
                }
            } else {SemesterProject.storyOutputTF.appendText("\n- There is an enemy here, Run or Attack!\n");}
    	}
    }
    
    
    public static void goEast() {
    	if ((!getPlayerDead()) && (!getPlayerWon())) {
    		if (!Areas.getHasEnemy(Areas.getArea())) {
    	        switch (Areas.getArea()) {
	    	        case 1:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(1);
	    	        	Areas.setArea(2);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 2:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(2);
	    	        	Areas.setArea(3);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 8:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(8);
	    	        	Areas.setArea(9);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 9:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(9);
	    	        	Areas.setArea(10);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 10:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(10);
	    	        	Areas.setArea(11);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 11:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(11);
	    	        	Areas.setArea(12);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 12:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(12);
	    	        	Areas.setArea(13);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 13:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(13);
	    	        	Areas.setArea(14);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 15:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(15);
	    	        	Areas.setArea(16);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 16:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(16);
	    	        	Areas.setArea(17);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 20:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(20);
	    	        	Areas.setArea(21);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 21:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(21);
	    	        	Areas.setArea(22);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 22:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(22);
	    	        	Areas.setArea(23);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 23:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(23);
	    	        	Areas.setArea(24);
	    	        	Areas.activateArea();
	    	            break;
	    	        case 24:
	                	pickUpItem(Areas.getArea());
	    	        	Areas.setLastArea(24);
	    	        	Areas.setArea(25);
	    	        	Areas.activateArea();
	    	            break;
	    	            default:
	    	                // if no other case numbers activate
	    	                SemesterProject.storyOutputTF.appendText("\n- You can't go East.\n");
    	        }
    		} else {SemesterProject.storyOutputTF.appendText("\n- There is an enemy here, Run or Attack!\n");}
    	}
    }
    
    
    public static void goNorth() {
    	if ((!getPlayerDead()) && (!getPlayerWon())) {
    		if (!Areas.getHasEnemy(Areas.getArea())) {
    	        switch (Areas.getArea()) {
    	            case 0:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(0);
    	            	Areas.setArea(2);
    	            	Areas.activateArea();
    	                break;
    	            case 1:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(1);
    	            	Areas.setArea(5);
    	            	Areas.activateArea();
    	                break;
    	            case 3:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(3);
    	            	Areas.setArea(6);
    	            	Areas.activateArea();
    	                break;
    	            case 4:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(4);
    	            	Areas.setArea(8);
    	            	Areas.activateArea();
    	                break;
    	            case 5:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(5);
    	            	Areas.setArea(10);
    	            	Areas.activateArea();
    	                break;
    	            case 6:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(6);
    	            	Areas.setArea(12);
    	            	Areas.activateArea();
    	                break;
    	            case 7:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(7);
    	            	Areas.setArea(14);
    	            	Areas.activateArea();
    	                break;
    	            case 8:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(8);
    	            	Areas.setArea(15);
    	            	Areas.activateArea();
    	                break;
    	            case 9:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(9);
    	            	Areas.setArea(16);
    	            	Areas.activateArea();
    	                break;
    	            case 12:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(12);
    	            	Areas.setArea(18);
    	            	Areas.activateArea();
    	                break;
    	            case 14:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(14);
    	            	Areas.setArea(19);
    	            	Areas.activateArea();
    	                break;
    	            case 16:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(16);
    	            	Areas.setArea(20);
    	            	Areas.activateArea();
    	                break;
    	            case 19:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(19);
    	            	Areas.setArea(25);
    	            	Areas.activateArea();
    	                break;
    	            default:
    	                // if no other case numbers activate
    	                SemesterProject.storyOutputTF.appendText("\n- You can't go North.\n");
    	        }
    	    } else {SemesterProject.storyOutputTF.appendText("\n- There is an enemy here, Run or Attack!\n");}
    	}
    }
    
    
    public static void goSouth() {
    	if ((!getPlayerDead()) && (!getPlayerWon())) {
    		if (!Areas.getHasEnemy(Areas.getArea())) {
    	        switch (Areas.getArea()) {
    	            case 2:
	                	SemesterProject.storyOutputTF.appendText("\n- You feel like you shouldn't leave yet!");
    	                break;
    	            case 5:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(5);
    	            	Areas.setArea(1);
    	            	Areas.activateArea();
    	                break;
    	            case 6:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(6);
    	            	Areas.setArea(3);
    	            	Areas.activateArea();
    	                break;
    	            case 8:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(8);
    	            	Areas.setArea(4);
    	            	Areas.activateArea();
    	                break;
    	            case 10:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(10);
    	            	Areas.setArea(5);
    	            	Areas.activateArea();
    	                break;
    	            case 12:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(12);
    	            	Areas.setArea(6);
    	            	Areas.activateArea();
    	                break;
    	            case 14:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(14);
    	            	Areas.setArea(7);
    	            	Areas.activateArea();
    	                break;
    	            case 15:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(15);
    	            	Areas.setArea(8);
    	            	Areas.activateArea();
    	                break;
    	            case 16:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(16);
    	            	Areas.setArea(9);
    	            	Areas.activateArea();
    	                break;
    	            case 18:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(18);
    	            	Areas.setArea(12);
    	            	Areas.activateArea();
    	                break;
    	            case 19:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(19);
    	            	Areas.setArea(14);
    	            	Areas.activateArea();
    	                break;
    	            case 20:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(20);
    	            	Areas.setArea(16);
    	            	Areas.activateArea();
    	                break;
    	            case 25:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(25);
    	            	Areas.setArea(19);
    	            	Areas.activateArea();
    	                break;
    	            default:
    	                // if no other case numbers activate
    	                SemesterProject.storyOutputTF.appendText("\n- You can't go South.\n");
    	        }
    		} else {SemesterProject.storyOutputTF.appendText("\n- There is an enemy here, Run or Attack!\n");}
    	}
    }
    
    
    public static void attack() {
    	if ((!getPlayerDead()) && (!getPlayerWon())) {
            if (Areas.getHasEnemy(Areas.getArea())) {
        	characterHealth = FantasyRace.getCharacterHealth();
                characterAttack = FantasyRace.getCharacterAttackPower();
                characterSpeed = FantasyRace.getCharacterSpeed();
                enemyHealth = FantasyRace.getEnemyHealth();
                enemyMaxHealth = FantasyRace.getEnemyMaxHealth();
                enemyAttack = FantasyRace.getEnemyAttackPower();
                enemySpeed = FantasyRace.getEnemySpeed();
                if ((enemyHealth > 0) && (characterHealth > 0)) {
                    int characterAttackDamage;
                    int enemyAttackDamage;
                    // character or enemy gets two attacks (attack damage x2) if speed is more than, or equal to, 
                    // double the opponent's speed. Otherwise, they each only get x1 attack speed.
                    // if enemy has less than %10 health left, you attack first, so they do not get a final attack
                    if (enemyHealth <= (enemyMaxHealth*.10)) {
                        SemesterProject.storyOutputTF.appendText("\n- It is almost dead, you swiftly strike the final blow!\n");
                        characterAttackDamage = characterAttack;
                        enemyAttackDamage = 0;
                    } else if ((characterSpeed*2) <= enemySpeed) {
                        SemesterProject.storyOutputTF.appendText("\nYour enemy is much faster than you. They attacked twice!");
                        characterAttackDamage = characterAttack;
                        enemyAttackDamage = enemyAttack * 2;
                    } else if (characterSpeed >= (enemySpeed*2)){
                        SemesterProject.storyOutputTF.appendText("\nYou are much faster than your opponent. You attacked twice!");
                        characterAttackDamage = characterAttack * 2;
                        enemyAttackDamage = enemyAttack;
                    } else {
                        characterAttackDamage = characterAttack;
                        enemyAttackDamage = enemyAttack;
                    }
                    enemyHealth -= characterAttackDamage;
                    characterHealth -= enemyAttackDamage;
                    FantasyRace.setEnemyHealth(enemyHealth);
                    FantasyRace.setCharacterHealth(characterHealth);
                    SemesterProject.setStatsTextField();
                    SemesterProject.storyOutputTF.appendText("\nYou dealt " + characterAttackDamage + " damage.");
                    SemesterProject.storyOutputTF.appendText("\nYou recieved " + enemyAttackDamage + " damage.");
                    SemesterProject.storyOutputTF.appendText("\nFoe has " + enemyHealth + " health remaining.\n");
                }
                if (characterHealth <= 0) {
                    characterDied();
        	}
                if (enemyHealth <= 0) {
                    if (Areas.getArea() == 11) {
                        SemesterProject.storyOutputTF.appendText("\n-- You defeated the Bandit Leader! --\n");
            		youWin();
                    } else {
            		SemesterProject.storyOutputTF.appendText("-- You killed the enemy! --\n");
                    }
        		Areas.setEnemyDead(Areas.getArea());
        	}        	
            } else {
                SemesterProject.storyOutputTF.appendText("\n- There is nothing to attack.\n");
            } 
        }   	
    }
    
    
    // try to run away from battle
    // determine percent chance of being able to run based on speed
    // if unsuccessful, initiate another round of attack()
    public static void run() {
    	if ((!getPlayerDead()) && (!getPlayerWon())) {
    		if (Areas.getHasEnemy(Areas.getArea())) {
                if (!Areas.getEnemyDead(Areas.getArea())) { 
                    int runChance = (int) (Math.random()*100);
                    SemesterProject.storyOutputTF.appendText("\n- You have a %" + runChance + " chance to get away.");
                    // enemy is faster than player - %30 chance to get away
                    if (characterSpeed < enemySpeed) {
                        if (runChance >= 70 ) {
                            SemesterProject.storyOutputTF.appendText("\n- You got away!");
                            gotAway();
                        } else {
                            SemesterProject.storyOutputTF.appendText("\n- You were too slow and couldn't get away!\n");
                            attack();
                        }
                        // enemy is slower than player - %70 to get away
                    } else if (characterSpeed > enemySpeed) {
                        if (runChance >= 30) {
                            SemesterProject.storyOutputTF.appendText("\n- You got away!");
                            gotAway();
                        } else {
                            SemesterProject.storyOutputTF.appendText("\n- You were too slow and couldn't get away!\n");
                            attack();
                        }
                        // enemy and player are the same speed - %50 chance to get away
                    } else if (characterSpeed == enemySpeed) {
                        if (runChance >= 50) {
                            SemesterProject.storyOutputTF.appendText("\n- You got away!");
                            gotAway();
                        } else {
                            SemesterProject.storyOutputTF.appendText("\n- You were too slow and couldn't get away!\n");
                            attack();
                        }
                    }
                }
            } else {
            	SemesterProject.storyOutputTF.appendText("\n- There is nothing to run away from.\n");
            }
        }
    }
    
    
    private static void pickUpItem(int roomNum) {
    	if (Areas.getHasItem(roomNum) && !Areas.getGottenItem(roomNum)) {    		
	    	// set stats for the item that the user picks up                
	    	String item = Item.getItemName();
                String itemDescription = Item.getItemDescription();               
                Item.determineItemStats(item);
                atkChange = Item.getAttackChange();
                spdChange = Item.getSpeedChange();
                hpChange = Item.getHealthChange();
                SemesterProject.storyOutputTF.appendText("\n-- ");
                SemesterProject.storyOutputTF.appendText(item);
                SemesterProject.storyOutputTF.appendText(" --\n");
                SemesterProject.storyOutputTF.appendText("- " + itemDescription);
                SemesterProject.storyOutputTF.appendText("\n- Stats Changed: " + atkChange + " Attack, " + spdChange + " Speed, " + hpChange + " Health\n");
	    	Areas.setGottenItem(roomNum);
    	} else {
    	}
    }
    
    
    // change character's stats after getting an item
    public static void changeCharacterStats(int hp, int att, int spd) {
        // change character hp
        characterHealth = FantasyRace.getCharacterHealth() + hp;
        FantasyRace.setCharacterHealth(characterHealth);
        
        // change character attack
        characterAttack = FantasyRace.getCharacterAttackPower() + att;
        FantasyRace.setCharacterAttackPower(characterAttack);
        
        // change character speed
        characterSpeed = FantasyRace.getCharacterSpeed() + spd;
        FantasyRace.setCharacterSpeed(characterSpeed);
        
        // set changes in the player's stat text views
        SemesterProject.setStatsTextField();
    }
    
    
    // allow player to retreat to the previous room they were in
    // get rid of the enemy that they ran away from, unless it was the boss
    public static void gotAway() {
    	SemesterProject.storyOutputTF.appendText("You are filled with determination: +5 HP\n");
    	characterHealth += 5;
    	FantasyRace.setCharacterHealth(characterHealth);
    	SemesterProject.setStatsTextField();
    	pickUpItem(Areas.getArea());
        if (Areas.getArea() != 11) {
            Areas.setHasEnemy(Areas.getArea(), false);
        }        
    	Areas.setArea(Areas.getLastArea());
    	Areas.activateArea();
    }
    
    
    public static void characterDied() {
    	// output that character is dead
    	// end the game or restart
    	setPlayerDead(true);
    	SemesterProject.storyOutputTF.appendText("\nYou Died!\n");
    	SemesterProject.storyOutputTF.appendText("\nExit the game and restart to try again!\n");
    }
    
     
    public static void youWin() {
        // set end game message
    	setPlayerWon(true);
        SemesterProject.storyOutputTF.appendText("\nCongradulations!"
        		+ "\nYou have completed the dungeon! You defeated the leader of the bandits, "
        		+ "and they will no longer terrorize the countryside."
        		+ "\nHowever, bandits like these are always on the move, and"
        		+ "a new band of mauraders is sure to take this one's place."
        		+ "\nWill you come back for more?\n\n");
        SemesterProject.storyOutputTF.appendText("\nWritten and Developed by:\n"
        		+ "Riley Tucker - Aiden Hutton - Karen Stackhouse - Christopher Fields");
    }
}
