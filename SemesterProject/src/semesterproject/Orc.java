/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a dungeon-crawl-style adventure. 
 *  Title:       IvyGames' Dungeon Crawl
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
 *               scores for an Orc enemy.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Orc extends FantasyRace {
    
    // set stats
    // base 1-11, then add multiples of 5 to adjust
    
    /*
    // Hard mode stats
    // base +2x, 3x, 1x * 5
    // between 11-21, 16-26, 6-16
    int constituton = (int) (Math.random() * ((21 - 11) + 1)) + 11;
    int strength = (int) (Math.random() * ((26 - 16) + 1)) + 16;
    int dexterity = (int) (Math.random() * ((16 - 6) + 1)) + 6;
    */
    
    // base +1x, 2x, 0x * 5
    // between 6-16, 11-21, 1-11
    int constituton = (int) (Math.random() * ((16 - 6) + 1)) + 6;
    int strength = (int) (Math.random() * ((21 - 11) + 1)) + 11;
    int dexterity = (int) (Math.random() * ((11 - 1) + 1)) + 1;
    
    // create a orc
    Orc() {
        super();
    }
    
    public void setOrcStats() {
        setEnemyHealth(constituton * 10);
        setEnemyMaxHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
