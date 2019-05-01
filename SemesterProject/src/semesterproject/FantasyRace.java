/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class contains the methods for getting and setting the stats
                 for players and enemies.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public abstract class FantasyRace {
    
    // variables
    private static int characterHealth;
    private static int characterAttackPower;
    private static int characterSpeed;
    
    private static int enemyHealth;
    private static int enemyAttackPower;
    private static int enemySpeed;
    
    
    // getters
    // character stats
    public static int getCharacterHealth() {
        return characterHealth;
    }
    public static int getCharacterAttackPower() {
        return characterAttackPower;
    }
    public static int getCharacterSpeed() {
        return characterSpeed;
    }
    // enemy stats    
    public static int getEnemyHealth() {
        return enemyHealth;
    }
    public static int getEnemyAttackPower() {
        return enemyAttackPower;
    }
    public static int getEnemySpeed() {
        return enemySpeed;
    }
    
    
    // setters
    // character stats
    public static void setCharacterHealth(int newCharacterHealth) {
        characterHealth = newCharacterHealth;
    }
    public static void setCharacterAttackPower(int newCharacterAttackPower) {
        characterAttackPower = newCharacterAttackPower;
    }
    public static void setCharacterSpeed(int newCharacterSpeed) {
        characterSpeed = newCharacterSpeed;
    }
    // enemy stats
    public static void setEnemyHealth(int newEnemyHealth) {
        enemyHealth = newEnemyHealth;
    }
    public static void setEnemyAttackPower(int newEnemyAttackPower) {
        enemyAttackPower = newEnemyAttackPower;
    }
    public static void setEnemySpeed(int newEnemySpeed) {
        enemySpeed = newEnemySpeed;
    }
    
        
    // constructor with arguments
    FantasyRace(){
        characterHealth = getCharacterHealth() ;
        characterAttackPower = getCharacterAttackPower();
        characterSpeed = getCharacterSpeed();
        enemyHealth = getEnemyHealth();
        enemyAttackPower = getEnemyAttackPower();
        enemySpeed = getEnemySpeed();
    }
}
