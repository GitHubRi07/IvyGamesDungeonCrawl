/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:       Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
                 scores for an Ogre enemy.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Ogre extends FantasyRace {
    
    // variables
	// between 5-24, 6-25, 2-21
    int constituton = (int) ((Math.random()*((20-1)+1))+1) + 4;
    // this is my swamp now, donkey
    int strength = (int) ((Math.random()*((20-1)+1))+1) + 5;
    int dexterity = (int) ((Math.random()*((20-1)+1))+1) + 1;
    
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
