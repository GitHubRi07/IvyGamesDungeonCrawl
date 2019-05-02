/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a dungeon-crawl-style adventure.  
 *  Title:       IvyGames' Dungeon Crawl
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
 *               scores for a Goblin enemy.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Goblin extends FantasyRace {
    
    // set stats
    // base 1-11, then add multiples of 5 to adjust
    
    /*
    // Hard mode stats
    // base +1x, 1x, 4x * 5
    // between 6-16, 6-16, 21-31
    int constituton = (int) (Math.random() * ((16 - 6) + 1)) + 6;
    int strength = (int) (Math.random() * ((16 - 6) + 1)) + 6;
    int dexterity = (int) (Math.random() * ((31 - 21) + 1)) + 21;
    */
    
    // base +0x, 0x, 3x * 5
    // between 1-11, 1-11, 16-26
    int constituton = (int) (Math.random() * ((11 - 1) + 1)) + 1;
    int strength = (int) (Math.random() * ((11 - 1) + 1)) + 1;
    int dexterity = (int) (Math.random() * ((26 - 16) + 1)) + 16;
    
    // create a goblin
    Goblin() {
        super();
    }
    
    public void setGoblinStats() {
        setEnemyHealth(constituton * 10);
        setEnemyMaxHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
