// -- Project Name --
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/18/2019
package semesterproject;


public class Elf extends FantasyRace {
    
    // variables
    int constituton = (Math.random()*((20-1)+1))+1) + 2;
    int strength = (Math.random()*((20-1)+1))+1) + 3;
    int dexterity = (Math.random()*((20-1)+1))+1) + 4;
    
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
