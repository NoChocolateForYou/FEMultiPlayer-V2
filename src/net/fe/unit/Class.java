package net.fe.unit;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import net.fe.fightStage.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Class.
 */
public class Class implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 9144407404798873761L;
	
	/** The crit. */
	public final int crit;
	
	/** The master skill. */
	public final CombatTrigger masterSkill;
	
	/** The usable weapon. */
	public final List<Weapon.Type> usableWeapon;
	
	/** The name. */
	public final String name;
	
	/** The description. */
	public final String description;
	
	/**
	 * Instantiates a new class.
	 *
	 * @param name the name
	 * @param desc the desc
	 * @param c the c
	 * @param m the m
	 * @param types the types
	 */
	private Class(String name, String desc, int c, CombatTrigger m, Weapon.Type... types){
		crit = c;
		masterSkill = m;
		usableWeapon = Arrays.asList(types);
		this.name = name;
		description = desc;
	}
	
	/**
	 * Creates the class.
	 *
	 * @param name the name
	 * @return the class
	 */
	public static Class createClass(String name){
		//Lords
		if(name.equals("Roy"))
			return new Class("Lord", 
					"A noble youth who commands armies.",
					0, new Aether(), Weapon.Type.SWORD);
		if(name.equals("Eliwood"))
			return new Class("Lord", 
					"A courageous royal who commands armies.",
					 0, new Sol(false), Weapon.Type.SWORD, Weapon.Type.LANCE);
		if(name.equals("Lyn"))
			return new Class("Lord", 
					"A serene youth who commands armies.",
					 0, new Astra(), Weapon.Type.SWORD, Weapon.Type.BOW);
		if(name.equals("Hector"))
			return new Class("Lord", 
					"A mighty noble who commands armies.",
					 0, new Luna(false), Weapon.Type.AXE, Weapon.Type.SWORD);
		if(name.equals("Eirika"))
			return new Class("Lord", 
					"A brave princess who commands armies.",
					 0, new Luna(false), Weapon.Type.SWORD);
		if(name.equals("Ephraim"))
			return new Class("Lord", 
					"A skilled prince who commands armies.",
					 0, new Sol(false), Weapon.Type.LANCE);
		if(name.equals("Marth"))
			return new Class("Lord", 
					"A legendary prince who commands armies.",
					 0, new Aether(), Weapon.Type.SWORD);
		if(name.equals("Ike"))
			return new Class("Lord", 
					"A radiant hero who commands armies.",
					 0, new Aether(), Weapon.Type.SWORD, Weapon.Type.AXE);
		
		//Other
		if(name.equals("Sniper"))
			return new Class("Sniper", 
					"An expert archer who has mastered the bow.",
					10, new Deadeye(), Weapon.Type.BOW);
		if(name.equals("Hero"))
			return new Class("Hero", 
					"Battle-hardened warriors who possess exceptional skill.",
					0, new Luna(false), Weapon.Type.SWORD, Weapon.Type.AXE);
		if(name.equals("Berserker"))
			return new Class("Berserker",
					"A master pirate who deals devastating attacks.",
					10, new Colossus(), Weapon.Type.AXE);
		if(name.equals("Warrior"))
			return new Class("Warrior", 
					"An experienced fighter whose might is second to none.",
					0, new Colossus(), Weapon.Type.AXE, Weapon.Type.BOW);
		if(name.equals("Assassin"))
			return new Class("Assassin", 
					"A deadly killer who lives in the shadows.",
					10, new Lethality(), Weapon.Type.SWORD);
		if(name.equals("Paladin"))
			return new Class("Paladin", 
					"An experienced and dignified knight, possessing high mobility.",
					0, new Sol(false), Weapon.Type.LANCE, Weapon.Type.SWORD, Weapon.Type.AXE);
		if(name.equals("Sage"))
			return new Class("Sage", 
					"A powerful magic user who wields mighty tomes.",
					0, new Sol(true), Weapon.Type.ANIMA, Weapon.Type.LIGHT, Weapon.Type.STAFF);
		if(name.equals("General"))
			return new Class("General", 
					"Armoured knights who possess overpowering strength and defense.",
					0, new Pavise(), Weapon.Type.AXE, Weapon.Type.LANCE);
		if(name.equals("Valkyrie"))
			return new Class("Valkyrie", 
					"A cleric who rides a horse into combat.",
					0, new Miracle(), Weapon.Type.STAFF, Weapon.Type.LIGHT);
		if(name.equals("Swordmaster"))
			return new Class("Swordmaster",
					"A seasoned myrmidon who has reached the pinnacle of swordsmanship.",
					20, new Astra(), Weapon.Type.SWORD);
		if(name.equals("Sorcerer"))
			return new Class("Sorcerer",
					"A sinister warlock who wields potent dark magic.",
					0, new Luna(true), Weapon.Type.DARK, Weapon.Type.ANIMA);
		if(name.equals("Falconknight"))
			return new Class("Falconknight", 
					"Knights who control pegasi with great mastery.",
					0, new Crisis(), Weapon.Type.LANCE, Weapon.Type.SWORD);
		if(name.equals("Phantom"))
			return new Class("Phantom", 
					"A phantom that fights for its summoner.",
					0, new Miracle(), Weapon.Type.AXE);
		return null;
		
	}
}
