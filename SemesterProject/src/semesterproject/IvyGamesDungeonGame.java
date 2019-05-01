/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:		 SoftwareProduct
 *  Authors:	 Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: IvyTech Dungeon Game is a game where the player finds a suspicious cave entrance, then enter the dungeon.
 *               The dungeon contains enemies and treasures. The player fights their way through many dungeon rooms
 *               and collects upgrades along the way. The player wins the game by making their way to the boss
 *               room and defeating that boss.
 *               This class's single method gets called to activate the starting point of the game.                 
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class IvyGamesDungeonGame { 
    
    // start IvyGames Dungeon Game!
    public static void startGame() { 
        // set starting area
    	AreaDefinition.setupAreaDefinitions();
        Areas.setArea(0);
        Areas.activateArea();
    }
}
