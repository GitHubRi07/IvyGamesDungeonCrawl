/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:       Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: 
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Orc extends FantasyRace {
    
    // variables
    int constituton = (int) ((Math.random()*((20-1)+1))+1) + 3;
    int strength = (int) ((Math.random()*((20-1)+1))+1) + 4;
    int dexterity = (int) ((Math.random()*((20-1)+1))+1) + 2;
    
    // create a orc
    Orc() {
        super();
    }
    
    public void setOrcStats() {
        setEnemyHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
