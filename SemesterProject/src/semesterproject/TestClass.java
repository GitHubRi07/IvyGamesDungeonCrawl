/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: 
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class TestClass {
    
    public static void main(String[] args) {        
        // test that stats, attack(), and run() work
        testFantacyRaces();
        testActions();     
    }
    
    
    public static void testFantacyRaces() {
        
        System.out.println("\n--------------------Start FantasyRaceTest--------------------\n");
        // test human stats
        Human human = new Human();
        human.setHumanStats();
        System.out.println("Human's health, attack, speed");
        System.out.print("\t");
        System.out.print(human.getCharacterHealth() + "\t");
        System.out.print(human.getCharacterAttackPower() + "\t");
        System.out.print(human.getCharacterSpeed() + "\n");
        
        //test dwarf stats
        Dwarf dwarf = new Dwarf();
        dwarf.setDwarfStats();
        System.out.println("Dwarf's health, attack, speed");
        System.out.print("\t");
        System.out.print(dwarf.getCharacterHealth() + "\t");
        System.out.print(dwarf.getCharacterAttackPower() + "\t");
        System.out.print(dwarf.getCharacterSpeed() + "\n");
        
        // test elf stats
        Elf elf = new Elf();
        elf.setElfStats();
        System.out.println("Elf's health, attack, speed");
        System.out.print("\t");
        System.out.print(elf.getCharacterHealth() + "\t");
        System.out.print(elf.getCharacterAttackPower() + "\t");
        System.out.print(elf.getCharacterSpeed() + "\n");
        
        // test goblin stats
        Goblin goblin = new Goblin();
        goblin.setGoblinStats();
        System.out.println("Goblin's health, attack, speed");
        System.out.print("\t");
        System.out.print(goblin.getEnemyHealth() + "\t");
        System.out.print(goblin.getEnemyAttackPower() + "\t");
        System.out.print(goblin.getEnemySpeed() + "\n");
        
        // test orc stats
        Orc orc = new Orc();
        orc.setOrcStats();
        System.out.println("Orc's health, attack, speed");
        System.out.print("\t");
        System.out.print(orc.getEnemyHealth() + "\t");
        System.out.print(orc.getEnemyAttackPower() + "\t");
        System.out.print(orc.getEnemySpeed() + "\n");
        
        // test ogre stats
        Ogre ogre = new Ogre();
        ogre.setOgreStats();
        System.out.println("Ogre's health, attack, speed");
        System.out.print("\t");
        System.out.print(ogre.getEnemyHealth() + "\t");
        System.out.print(ogre.getEnemyAttackPower() + "\t");
        System.out.print(ogre.getEnemySpeed() + "\n");
        
        // test boss stats
        Boss boss = new Boss();
        boss.setBossStats();
        System.out.println("Boss's health, attack, speed");
        System.out.print("\t");
        System.out.print(boss.getEnemyHealth() + "\t");
        System.out.print(boss.getEnemyAttackPower() + "\t");
        System.out.print(boss.getEnemySpeed() + "\n");
        
        System.out.println("\n--------------------End FantasyRaceTest--------------------\n");
    }
    
    
    public static void testActions() {
        
        System.out.println("\n--------------------Start ActionsTest--------------------\n");
        // set up a character and an enemy
        Human human = new Human();
        human.setHumanStats();
        System.out.println("Human's health, attack, speed");
        System.out.print("\t");
        System.out.print(human.getCharacterHealth() + "\t");
        System.out.print(human.getCharacterAttackPower() + "\t");
        System.out.print(human.getCharacterSpeed() + "\n");
        
        Goblin goblin = new Goblin();
        goblin.setGoblinStats();
        System.out.println("Goblin's health, attack, speed");
        System.out.print("\t");
        System.out.print(goblin.getEnemyHealth() + "\t");
        System.out.print(goblin.getEnemyAttackPower() + "\t");
        System.out.print(goblin.getEnemySpeed() + "\n");
        
        // test attack
        attack();
        System.out.println("Human Health After Attack: " + FantasyRace.getCharacterHealth());
        System.out.println("Goblin Health After Attack: " + FantasyRace.getEnemyHealth() + "\n");
        
        // test run
        run();
        System.out.println("Human Health After Run: " + FantasyRace.getCharacterHealth());
        System.out.println("Goblin Health After Run: " + FantasyRace.getEnemyHealth());
        
        System.out.println("\n--------------------End ActionsTest--------------------\n");
    }
    
    // Testing versions of the attack() and run() methods. 
    // Printing to user output(non-existent in this test class) is replaced with prints to console
    private static void attack() {
    	if (!Action.getPlayerDead()) {
    		System.out.println("Attack!");
    		if ((FantasyRace.getEnemyHealth() > 0) && (FantasyRace.getCharacterHealth() > 0)) {
    			int characterAttackDamage;
    			int enemyAttackDamage;
    			int characterHealth;
    			int enemyHealth;
    			// character or enemy gets two attacks (attack damage x2) if speed is more than, or equal to, 
    			// double the opponent's speed. Otherwise, they each only get x1 attack speed.            
    			if ((FantasyRace.getCharacterSpeed()*2) <= FantasyRace.getEnemySpeed()) {
    				characterAttackDamage = FantasyRace.getCharacterAttackPower();
    				enemyAttackDamage = FantasyRace.getEnemyAttackPower() * 2;
    			} else if (FantasyRace.getCharacterSpeed() >= (FantasyRace.getEnemySpeed()*2)){
    				characterAttackDamage = FantasyRace.getCharacterAttackPower() * 2;
    				enemyAttackDamage = FantasyRace.getEnemyAttackPower();
    			} else {
    				characterAttackDamage = FantasyRace.getCharacterAttackPower();
    				enemyAttackDamage = FantasyRace.getEnemyAttackPower();
    			}
    			characterHealth = FantasyRace.getCharacterHealth();
    			enemyHealth = FantasyRace.getEnemyHealth();
    			characterHealth -= enemyAttackDamage;
    			enemyHealth -= characterAttackDamage;
    			FantasyRace.setCharacterHealth(characterHealth);
    			FantasyRace.setEnemyHealth(enemyHealth);
    			System.out.println("\nDealt " + characterAttackDamage + " damage\n");
    			System.out.println("\nFoe has " + FantasyRace.getEnemyHealth() + " health remaining.\n");
    		} else if (FantasyRace.getEnemyHealth() <= 0) {
    			Areas.setEnemyDead(Areas.getArea());
    		} else if (FantasyRace.getCharacterHealth() <= 0) {
    			Action.characterDied();
    		}
    	}
    }
    
    
    // try to run away from battle
    // determine percent chance of being able to run based on speed
    // if unsuccessful, initiate another round of attack()
    private static void run() {
		System.out.println("Run!");
        if (!Action.getPlayerDead()) { 
                int runChance = (int) (Math.random()*100);
                System.out.println("\nRun Chance: " + runChance + "%\n");
                if (FantasyRace.getCharacterSpeed() < FantasyRace.getEnemySpeed()) {
                    if (runChance > 75 ) {
                    	Action.gotAway(true);
                    	System.out.println("\nGot away!\n");
                    } else {
                    	System.out.println("\nCouldn't get away!\n");
                        attack();
                    }
                }
                
                if (FantasyRace.getCharacterSpeed() > FantasyRace.getEnemySpeed()) {
                    if (runChance > 25) {
                    	Action.gotAway(true);
                    	System.out.println("\nGot away!\n");
                    } else {
                    	System.out.println("\nCouldn't get away!\n");
                        attack();
                    }
                }
                
                if (FantasyRace.getCharacterSpeed() == FantasyRace.getEnemySpeed()) {
                    if (runChance <= 50) {
                    	Action.gotAway(true);
                    	System.out.println("\nGot away!\n");
                    } else {
                    	System.out.println("\nCouldn't get away!\n");
                        attack();
                    }
                }
        	}
        }
}
