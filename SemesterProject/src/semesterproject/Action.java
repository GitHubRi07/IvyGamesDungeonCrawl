/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:       Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: 
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Action extends FantasyRace {
    // global variables
    private static boolean playerDead;
    private static int characterHealth;
    private static int characterAttack;
    private static int characterSpeed;
    private static int enemyHealth;
    private static int enemyAttack;
    private static int enemySpeed;
    private static int hpChange;
	private static int atkChange;
	private static int spdChange;
    
    
    // getters
    public static boolean getPlayerDead() {
        return playerDead;
    }
    
    
    // setters
    public static void changeCharacterHealth(int i) {
        characterHealth += i;
        String newHealthString = Integer.toString(characterHealth);
        SemesterProject.constitutionTF.setText(newHealthString);
    }
    public static void changeCharacterAttack(int i) {
        characterAttack += i;
        String newAttackString = Integer.toString(characterAttack);
        SemesterProject.strengthTF.setText(newAttackString);
    }
    public static void changeCharacterSpeed(int i) {
        characterSpeed += i;
        String newSpeedString = Integer.toString(characterSpeed);
        SemesterProject.dexterityTF.setText(newSpeedString);
    }
    public static boolean setPlayerDead(boolean d) {
        playerDead = d;
        return playerDead;
    }
    
    
    // methods
    public static void goWest() {
    	System.out.println("goWest() -- Pressed button to go West");
    	if (!Action.getPlayerDead()) {
    		if (Areas.getEnemyDead(Areas.getArea())) {
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
	                    SemesterProject.storyOutputTF.appendText("\nYou can't go West.\n");
                }
            } else {SemesterProject.storyOutputTF.appendText("\n\nThere is an enemy here, Run or Attack!\n\n");}
    	}
    }
    
    
    public static void goEast() {
    	System.out.println("goEast() -- Pressed button to go East");
    	if (!Action.getPlayerDead()) {
    		if (Areas.getEnemyDead(Areas.getArea())) {
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
	    	                SemesterProject.storyOutputTF.appendText("\nYou can't go East.\n");
    	        }
    		} else {SemesterProject.storyOutputTF.appendText("\n\nThere is an enemy here, Run or Attack!\n\n");}
    	}
    }
    
    
    public static void goNorth() {
    	System.out.println("goNorth() -- Pressed button to go North");
    	if (!Action.getPlayerDead()) {
    		if (Areas.getEnemyDead(Areas.getArea())) {
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
    	                SemesterProject.storyOutputTF.appendText("\nYou can't go North.\n");
    	        }
    	    } else {SemesterProject.storyOutputTF.appendText("\n\nThere is an enemy here, Run or Attack!\n\n");}
    	}
    }
    
    
    public static void goSouth() {
    	System.out.println("goSouth() -- Pressed button to go South");
    	if (!Action.getPlayerDead()) {
    		if (Areas.getEnemyDead(Areas.getArea())) {
    	        switch (Areas.getArea()) {
    	            case 2:
	                	pickUpItem(Areas.getArea());
    	            	Areas.setLastArea(2);
    	            	Areas.setArea(0);
    	            	Areas.activateArea();
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
    	                SemesterProject.storyOutputTF.appendText("\nYou can't go South.\n");
    	        }
    		} else {SemesterProject.storyOutputTF.appendText("\n\nThere is an enemy here! Run or Attack!\n\n");}
    	}
    }
    
    
    public static void attack() {
    	System.out.println("attack() -- Pressed button to Attack");
    	characterHealth = FantasyRace.getCharacterHealth();
        characterAttack = FantasyRace.getCharacterAttackPower();
        characterSpeed = FantasyRace.getCharacterSpeed();
        enemyHealth = FantasyRace.getEnemyHealth();
        enemyAttack = FantasyRace.getEnemyAttackPower();
        enemySpeed = FantasyRace.getEnemySpeed();
    	if (!getPlayerDead()) {
    		if ((enemyHealth > 0) && (characterHealth > 0)) {
    			int characterAttackDamage;
    			int enemyAttackDamage;
    			// character or enemy gets two attacks (attack damage x2) if speed is more than, or equal to, 
    			// double the opponent's speed. Otherwise, they each only get x1 attack speed.            
    			if ((characterSpeed*2) <= enemySpeed) {
    				characterAttackDamage = characterAttack;
    				enemyAttackDamage = enemyAttack * 2;
    			} else if (characterSpeed >= (enemySpeed*2)){
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
    			SemesterProject.storyOutputTF.appendText("\nDealt " + characterAttackDamage + " damage\n");
    			SemesterProject.storyOutputTF.appendText("\nFoe has " + enemyHealth + " health remaining.\n");
    		} else if (enemyHealth <= 0) {
    			Areas.setEnemyDead(Areas.getArea());
    			SemesterProject.storyOutputTF.appendText("\nYou killed the enemy!\n");
    		} else if (characterHealth <= 0) {
    			characterDied();
    		}
    	}
    }
    
    
    // try to run away from battle
    // determine percent chance of being able to run based on speed
    // if unsuccessful, initiate another round of attack()
    public static void run() {
    	System.out.println("run() -- Pressed button to Run");
        if (!getPlayerDead()) {
            if (!Areas.getEnemyDead(Areas.getArea())) { 
                int runChance = (int) (Math.random()*100);
                SemesterProject.storyOutputTF.appendText("\nRun Chance: " + runChance + "%\n");
                if (characterSpeed < enemySpeed) {
                    if (runChance > 75 ) {
                        gotAway(true);
                        SemesterProject.storyOutputTF.appendText("\nGot away!\n");
                    } else {
                        SemesterProject.storyOutputTF.appendText("\nCouldn't get away!\n");
                        attack();
                    }
                }
                
                if (characterSpeed > enemySpeed) {
                    if (runChance > 25) {
                        gotAway(true);
                        SemesterProject.storyOutputTF.appendText("\nGot away!\n");
                    } else {
                        SemesterProject.storyOutputTF.appendText("\nCouldn't get away!\n");
                        attack();
                    }
                }
                
                if (characterSpeed == enemySpeed) {
                    if (runChance <= 50) {
                        gotAway(true);
                        SemesterProject.storyOutputTF.appendText("\nGot away!\n");
                    } else {
                        SemesterProject.storyOutputTF.appendText("\nCouldn't get away!\n");
                        attack();
                    }
                }
            }
        }
    }
    
    
    private static void pickUpItem(int roomNum) {
    	System.out.println("pickUpItem() -- Activated function to pick up item.");
    	if (Areas.getHasItem(roomNum) && !Areas.getGottenItem(roomNum)) {
	    	// set stats for the item that the user picks up
	    	String item = Areas.getItemName();
	    	switch (item) {
				case "Dagger":
					hpChange=0;
					atkChange=1;
					spdChange=1;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked up a Dagger. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Longsword":
					hpChange=0;
					atkChange=3;
					spdChange=0;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up a Longsword. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Buckler":
					hpChange=3;
					atkChange=0;
					spdChange=0;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up a Buckler. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Plate Armor":
					hpChange=5;
					atkChange=0;
					spdChange=-2;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Plate Armor. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Leather Armor":
					hpChange=2;
					atkChange=0;
					spdChange=2;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Leather Armor. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Thief Idol":
					hpChange=0;
					atkChange=2;
					spdChange=4;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Thief Idol. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Berserker Stone":
					hpChange=-5;
					atkChange=10;
					spdChange=3;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Berserker Stone. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Great Axe":
					hpChange=0;
					atkChange=5;
					spdChange=-2;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up a Great Axe. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Nibbles, the House Cat":
					hpChange=1;
					atkChange=1;
					spdChange=1;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Nibbles, the House Cat. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Priestly Vestments":
					hpChange=10;
					atkChange=-5;
					spdChange=0;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Priestly Vestments. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Rapier":
					hpChange=0;
					atkChange=3;
					spdChange=3;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up a Rapier. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Hammer":
					hpChange=0;
					atkChange=2;
					spdChange=0;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up a Hammer. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Well-Crafted Boots":
					hpChange=1;
					atkChange=0;
					spdChange=3;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Some Well-Crafted Boots. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Assassin Gloves":
					hpChange=0;
					atkChange=3;
					spdChange=5;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Assassin Gloves. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Spiffy Hat":
					hpChange=2;
					atkChange=2;
					spdChange=2;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up a Spiffy Hat. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Sack Lunch":
					hpChange=5;
					atkChange=0;
					spdChange=0;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up a Sack Lunch. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Embarrassing Photos":
					hpChange=-3;
					atkChange=-3;
					spdChange=3;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Some Embarrassing Photos. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Some Self-Esteem":
					hpChange=5;
					atkChange=5;
					spdChange=5;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Some Self-Esteem. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Miniature Mother-in-Law": 
					hpChange=3;
					atkChange=-3;
					spdChange=-5;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Your Miniature Mother-in-Law. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Elven Nutcracker":
					hpChange=0;
					atkChange=1;
					spdChange=0;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Elven Nutcracker. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Vorpal Sword":
					hpChange=0;
					atkChange=5;
					spdChange=7;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Vorpal Sword. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Yoga Pants":
					hpChange=1;
					atkChange=0;
					spdChange=5;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Yoga Pants. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Book of Mormon":
					hpChange=0;
					atkChange=0;
					spdChange=0;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Book of Mormon. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
				case "Gladius, Fair Broadsword":
					hpChange=1;
					atkChange=8;
					spdChange=3;
					changeCharacterHealth(hpChange);
					changeCharacterAttack(atkChange);
					changeCharacterSpeed(spdChange);
					System.out.println("pickUpItem() -- Picked Up Gladius, Fair Broadsword. Stats Added: " + hpChange + " HP, " + atkChange + " ATK, " + spdChange + " SPD");
					break;
			}
	    	Areas.setGottenItem(roomNum);
    	} else {
    		System.out.println("pickUpItem() -- There is no item here.");
    	}
    }

    
    // allow player to retreat to the previous room they were in
    public static boolean gotAway(boolean run) {
    	System.out.println("gotAway() -- Activated function to set got away.");
         if (run = true) {
        	 pickUpItem(Areas.getArea());
             Areas.setArea(Areas.getLastArea());             
         }
        return run;
    }
    
    
    public static void characterDied() {
    	System.out.println("characterDied() -- Activated function to set character dead.");
            // output that character is dead
            // end the game or restart
            SemesterProject.storyOutputTF.appendText("\nYou Died!\n");
            SemesterProject.storyOutputTF.appendText("\nExit the game and restart to try again!\n");
            setPlayerDead(true);
    }
    
     
    public static void youWin() {
    	System.out.println("youWin() -- Activated function to set you won.");
        // set end game message
        SemesterProject.storyOutputTF.appendText("\nYou completed the dungeon!\n");
    }
}
