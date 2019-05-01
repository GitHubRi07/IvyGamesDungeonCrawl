/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:       Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
                 scores for a Dwarf character.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Dwarf extends FantasyRace {
    
    // variables
	// between 5-24, 4-23, 3-22
    int constituton = (int) ((Math.random()*((20-1)+1))+1) + 4;
    int strength = (int) ((Math.random()*((20-1)+1))+1) + 3;
    int dexterity = (int) ((Math.random()*((20-1)+1))+1) + 2;
    
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
