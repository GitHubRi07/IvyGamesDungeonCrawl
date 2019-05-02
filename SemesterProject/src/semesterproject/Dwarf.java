/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a dungeon-crawl-style adventure. 
 *  Title:       IvyGames' Dungeon Crawl
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
 *               scores for a Dwarf character.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Dwarf extends FantasyRace {
    
    // set stats
    // base 1-11, then add multiples of 5 to adjust
    
    /*
    // Hard mode stats
    // base +3x, 2x, 1x * 5
    // between 16-26, 11-21, 6-16
    int constituton = (int) (Math.random() * ((26 - 16) + 1)) + 16;
    int strength = (int) (Math.random() * ((21 - 11) + 1)) + 11;
    int dexterity = (int) (Math.random() * ((16 - 6) + 1)) + 6;
    */
    
    // base +4x, 3x, 2x * 5
    // between 21-31, 16-26, 11-21
    int constituton = (int) (Math.random() * ((31 - 21) + 1)) + 21;
    int strength = (int) (Math.random() * ((26 - 16) + 1)) + 16;
    int dexterity = (int) (Math.random() * ((21 - 11) + 1)) + 11;
    
    // create a dwarf
    Dwarf() {
        super();
    }
    
    public void setDwarfStats() {
        setCharacterHealth(constituton * 10);
        setCharacterAttackPower(strength);
        setCharacterSpeed(dexterity);
    } 
}
