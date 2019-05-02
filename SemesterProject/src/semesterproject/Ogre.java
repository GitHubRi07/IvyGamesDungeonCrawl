/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
 *               scores for an Ogre enemy.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Ogre extends FantasyRace {
	// this is my swamp now, donkey
	
    // variables
	// between 16-26, 21-31, 1-10
    int constituton = (int) (Math.random() * ((26 - 16) + 1)) + 16;
    int strength = (int) (Math.random() * ((31 - 21) + 1)) + 21;
    int dexterity = (int) (Math.random() * ((10 - 1) + 1)) + 1;
    
    // create an ogre
    Ogre() {
        super();
    }
    
    public void setOgreStats() {
        setEnemyHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
