/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:       Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
                 scores for an Elf character.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Elf extends FantasyRace {
    
    // variables
	// between 3-22, 4-23, 5-24
    int constituton = (int) ((Math.random()*((20-1)+1))+1) + 2;
    int strength = (int) ((Math.random()*((20-1)+1))+1) + 3;
    int dexterity = (int) ((Math.random()*((20-1)+1))+1) + 4;
    
    // create a elf
    Elf() {
        super();
    }
    
    public void setElfStats() {
        setCharacterHealth(constituton * 10);
        setCharacterAttackPower(strength);
        setCharacterSpeed(dexterity);
    } 
}
