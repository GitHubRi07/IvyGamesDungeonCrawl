/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:       Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
                 scores for a Human character.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Human extends FantasyRace {
    
    // variables
	// between 4-23, 4-23, 4-23
    int constituton = (int) ((Math.random()*((20-1)+1))+1) + 3;
    int strength = (int) ((Math.random()*((20-1)+1))+1) + 3;
    int dexterity = (int) ((Math.random()*((20-1)+1))+1) + 3;
    
    // create a human
    Human() {
        super();
    }
    
    public void setHumanStats() {
        setCharacterHealth(constituton * 10);        
        setCharacterAttackPower(strength);
        setCharacterSpeed(dexterity);
    }    
}
