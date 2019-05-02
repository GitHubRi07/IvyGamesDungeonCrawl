/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
 *               scores for a Boss enemy.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Boss extends FantasyRace {
	
	// variables
	// between 21-31, 46-56, 21-31
    int constituton = (int) (Math.random() * ((31 - 21) + 1)) + 21;
    int strength = (int) (Math.random() * ((56 - 46) + 1)) + 46;
    int dexterity = (int) (Math.random() * ((31 - 21) + 1)) + 21;

    // create boss
    Boss() {
        super();
    }

    public void setBossStats() {
        setEnemyHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
