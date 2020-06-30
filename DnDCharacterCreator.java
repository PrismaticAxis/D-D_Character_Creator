import java.util.Scanner;

public class DnDCharacterCreator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String sectionBreak = "_____\n";
		final String[] ORDINAL = {"1st", "2nd", "3rd", "4th", "5th",
				"6th", "7th", "8th", "9th"};
		final String[] SCORE_NAMES = {
				"Strength     ",
				"Dexterity    ",
				"Constitution ",
				"Intelligence ",
				"Wisdom       ",
				"Charisma     "};
		
		final String[] SKILLS = {
				"Acrobatics",
				"Animal Handling",
				"Arcana",
				"Athletics",
				"Deception",
				"History",
				"Insight",
				"Intimidation",
				"Investigation",
				"Medicine",
				"Nature",
				"Perception",
				"Performance",
				"Persuasion",
				"Religion",
				"Sleight of Hand",
				"Stealth",
				"Survival"};
		final int[] SKILL_ABILITIES = {2, 5, 4, 1, 6, 4, 5, 6, 4,
				5, 4, 5, 6, 6, 4, 2, 2, 5};
		
		final String[][] RACES = new String[20][2];
			RACES[0][0] = "1) ";
			RACES[0][1] = "Hill Dwarf";
			RACES[1][0] = "2) ";
			RACES[1][1] = "Mountain Dwarf";
			RACES[2][0] = "3) ";
			RACES[2][1] = "High Elf";
			RACES[3][0] = "4) ";
			RACES[3][1] = "Wood Elf";
			RACES[4][0] = "5) ";
			RACES[4][1] = "Dark Elf (Drow)";
			RACES[5][0] = "6) ";
			RACES[5][1] = "Lightfoot Halfling";
			RACES[6][0] = "7) ";
			RACES[6][1] = "Stout Halfling";
			RACES[7][0] = "8) ";
			RACES[7][1] = "Human";
			
		final String[][] LANGUAGES = new String[16][2];
			LANGUAGES[0][0] = "1) ";
			LANGUAGES[0][1] = "Common";
			LANGUAGES[1][0] = "2) ";
			LANGUAGES[1][1] = "Dwarvish";
			LANGUAGES[2][0] = "3) ";
			LANGUAGES[2][1] = "Elvish";
			LANGUAGES[3][0] = "4) ";
			LANGUAGES[3][1] = "Giant";
			LANGUAGES[4][0] = "5) ";
			LANGUAGES[4][1] = "Gnomish";
			LANGUAGES[5][0] = "6) ";
			LANGUAGES[5][1] = "Goblin";
			LANGUAGES[6][0] = "7) ";
			LANGUAGES[6][1] = "Halfling";
			LANGUAGES[7][0] = "8) ";
			LANGUAGES[7][1] = "Orc";
			LANGUAGES[8][0] = "9) ";
			LANGUAGES[8][1] = "Abyssal";
			LANGUAGES[9][0] = "10) ";
			LANGUAGES[9][1] = "Celestial";
			LANGUAGES[10][0] = "11) ";
			LANGUAGES[10][1] = "Deep Speech";
			LANGUAGES[11][0] = "12) ";
			LANGUAGES[11][1] = "Draconic";
			LANGUAGES[12][0] = "13) ";
			LANGUAGES[12][1] = "Infernal";
			LANGUAGES[13][0] = "14) ";
			LANGUAGES[13][1] = "Primordial";
			LANGUAGES[14][0] = "15) ";
			LANGUAGES[14][1] = "Sylvan";
			LANGUAGES[15][0] = "16) ";
			LANGUAGES[15][1] = "Undercommon";
		
		String characterName = "";
		String characterRace = "";
		String characterClass = "Artificer";
		int characterLevel = 1;
		String characterBackground = "Noble";
		
		int ac = 12;
		int hpCurrent = 8;
		int hpMax = 8;
		int speed = 0;
		int proficiencyBonus = 2;
		int initiativeModifier;
		
		
		
		
		
		System.out.println("Enter character name:");
		characterName = input.nextLine();
		System.out.println();
		
		
		
		
		//generate ability scores
		int[] scores = setAbilityScores();
		int strScore = scores[0] + 1;
		int dexScore = scores[1] + 1;
		int conScore = scores[2] + 1;
		int intScore = scores[3] + 1;
		int wisScore = scores[4] + 1;
		int chaScore = scores[5] + 1;
		
		int strModifier = getModifier(strScore);
		int dexModifier = getModifier(dexScore);
		int conModifier = getModifier(conScore);
		int intModifier = getModifier(intScore);
		int wisModifier = getModifier(wisScore);
		int chaModifier = getModifier(chaScore);
		
		int languagesCount = 0;
		String[] languages = new String[10];
		
		
		
		//choose race
		while (true)
		{
			for (int i = 0; i < RACES.length; i++)
			{
				if (RACES[i][0] != null)
					System.out.println(RACES[i][0] + RACES[i][1]);
				else
					break;
			}
			System.out.println("\nSelect race:");
			int raceChoice = input.nextInt();
			if (raceChoice == 1)	//Hill Dwarf
			{
				
				break;
			}
			else if (raceChoice == 2)	//Mountain Dwarf
			{
				
			}
			else if (raceChoice == 3)	//High Elf
			{
				
				break;
			}
			else if (raceChoice == 4)	//Wood Elf
			{
				
				break;
			}
			else if (raceChoice == 5)	//Drow
			{
				
				break;
			}
			else if (raceChoice == 6)	//Lightfoot Halfling
			{
				
				break;
			}
			else if (raceChoice == 7)	//Stout Halfling
			{
				
				break;
			}
			else if (raceChoice == 8)	//Human
			{
				characterRace = "Human";
				speed = 30;
				System.out.println(
						"As a human, you know Common and one other language.");
				languages[languagesCount] = "Common";
				languagesCount++;
				languages[languagesCount] = addLanguage(LANGUAGES);
				languagesCount++;
				break;
			}
			else						//invalid input
			{
				System.out.println("Invalid input\n");
				continue;
			}
		}
		

			
		
		
		int saveProficiencyCount = 0;
		String[] saveProficiency = new String[6];
			saveProficiency[saveProficiencyCount] = "Constitution";
			saveProficiencyCount++;
			saveProficiency[saveProficiencyCount] = "Intelligence";
			saveProficiencyCount++;
		
		boolean[] skillProficiencies = new boolean[18];
			skillProficiencies[5] = true;
			skillProficiencies[11] = true;
			skillProficiencies[13] = true;
			skillProficiencies[15] = true;
		
		String armorProficiency = "Light, Medium Armor";
		int weaponProficiencyCount = 0;
		String[] weaponProficiency = new String[20];
			weaponProficiency[weaponProficiencyCount] = "Simple Weapons";
			weaponProficiencyCount++;
		int toolProficiencyCount = 0;
		String[] toolProficiency = new String[10];
			toolProficiency[toolProficiencyCount] = "Thieves' Tools";
			toolProficiencyCount++;
			toolProficiency[toolProficiencyCount] = "Tinker's Tools";
			toolProficiencyCount++;
			toolProficiency[toolProficiencyCount] = "Painter's Supplies";
			toolProficiencyCount++;
			toolProficiency[toolProficiencyCount] = "Chess Set";
			toolProficiencyCount++;
		String[] features = new String[20];
			features[0] = "Magical Tinkering";
			features[1] = "Spellcasting (Artificer)";
			
			boolean isCaster = true;
			int[] spellSlots = new int[10];
				spellSlots[1] = 2;
				spellSlots[9] = 1;
			int[] spellCount = new int[10];
			String[][] spellList = new String[10][15];
				//add cantrips
				spellList[0][spellCount[0]] = "Guidance";
				spellCount[0]++;
				spellList[0][spellCount[0]] = "Prestidigitation";
				spellCount[0]++;
				//add 1st level spells
				spellList[1][spellCount[1]] = "Feather Fall";
				spellCount[1]++;
				spellList[1][spellCount[1]] = "Jump";
				spellCount[1]++;
				spellList[1][spellCount[1]] = "Purify Food and Drink";
				spellCount[1]++;
		
				
				
				
				
		//print character sheet
				
		//name, race, class, level, and background
		System.out.println(characterName);
		System.out.println(characterRace + " " + characterClass + " "
				+ characterLevel);
		System.out.println("Background: " + characterBackground);
		System.out.println(sectionBreak);
		
		//HP, AC, proficiency, and initiative
		System.out.printf("AC\t%2d\n", ac);
		System.out.printf("HP\t%2d / %d\n", hpCurrent, hpMax);
		System.out.println("Proficiency Bonus: +" + proficiencyBonus);
		System.out.println("Initiative: +2");
		System.out.println("Speed\t" + speed + " ft");
		System.out.println(sectionBreak);
		
		//ability scores and modifiers, with saving throw proficiencies
		System.out.printf("STR %2d (%2s)%s\n", strScore,
				modifierToString(strModifier), "");
		System.out.printf("DEX %2d (%2s)%s\n", dexScore,
				modifierToString(dexModifier), "");
		System.out.printf("CON %2d (%2s)%s\n", conScore,
				modifierToString(conModifier), "");
		System.out.printf("INT %2d (%2s)%s\n", intScore,
				modifierToString(intModifier), "");
		System.out.printf("WIS %2d (%2s)%s\n", wisScore,
				modifierToString(wisModifier), "");
		System.out.printf("CHA %2d (%2s)%s\n", chaScore,
				modifierToString(chaModifier), "");
		System.out.println(sectionBreak);
		
		//proficiencies
		System.out.println("\tProficiencies\n");
			//saving throws
		for (int i = 0; i < saveProficiency.length; i++)
		{
			if (saveProficiency[i] != null)
				System.out.println(saveProficiency[i] + " saving throws");
			else
				break;
		}
		System.out.println();
		
			//skills
		for (int i = 0; i < skillProficiencies.length; i++)
		{
			if (skillProficiencies[i])
			{
				System.out.printf("%-15s\t%s\n", SKILLS[i],
						getSkillModifier(strScore, dexScore, conScore,
								intScore, wisScore, chaScore,
								proficiencyBonus, SKILL_ABILITIES[i], true));
			}
		}
		System.out.println();
		
			//armor and weapons
		System.out.println(armorProficiency);
		for (int i = 0; i < weaponProficiency.length; i++)
		{
			if (weaponProficiency[i] != null)
			{
				if (weaponProficiency[i + 1] != null)
					System.out.print(weaponProficiency[i] + ", ");
				else
					System.out.print(weaponProficiency[i]);
			}
			else
				break;
		}
		System.out.println("\n");
		
			//languages
		printList(languages);
		System.out.println();
		
			//tools, etc.
		printList(toolProficiency);
		System.out.println(sectionBreak);
		
		//traits and features
		printList(features);
		
		//spellcasting
		if (isCaster)
		{
			System.out.println(sectionBreak);
			System.out.println("\tSpellcasting\n");
			//general
			System.out.println("Spellcasting class/ability:\tArtificer (Int)");
			System.out.printf("Spell save DC:\t\t\t%2d\n", 13);
			System.out.printf("Spell attack modifier:\t\t%2s", "+5");
			System.out.println("\n");
			
			//cantrips & at will
			System.out.println("\tCantrips/At will:");
			printList(spellList[0]);
			System.out.println();
			for (int i = 1; i < spellList.length; i++)
			{
				if (spellList[i][0] != null)
				{
					String header = "\t" + ORDINAL[i - 1] + " Level ("
							+ spellSlots[i];
					if (spellSlots[i] == 1)
						header += " slot)";
					else
						header += " slots)";
					
					System.out.println(header);
					printList(spellList[i]);
					System.out.println();
				}
			}
		}
		
	}
	
	//returns modifier for a given ability score
	public static int getModifier(int score)
	{
		if (score >= 10)
			return (score - 10) / 2;
		else
		{
			if (score % 2 == 0)			 //some fiddly stuff because of how
				return (score - 10) / 2; //integer division works
			else
				return (score - 11) / 2;
		}
	}
	
	//returns modifier with + or - sign
	public static String modifierToString(int modifier)
	{
		String modifierString = "";
		
		if (modifier == 0)
			modifierString += " ";
		else if (modifier > 0)
			modifierString += "+";
		
		modifierString += modifier;
		return modifierString;
	}
	
	/*
	 * returns modifier for a particular skill.
	 * key determines the applicable ability score
	 * 
	 * note: this method is a bit clunky and awkward without
	 * 		use of objects. Will clean this up later.
	 */
	public static String getSkillModifier(int str, int dex, int con,
			int intel, int wis, int cha, int prof, int key, boolean isProf)
	{
		int modifier;
		if (key == 1)
			modifier = getModifier(str);
		else if (key == 2)
			modifier = getModifier(dex);
		else if (key == 4)
			modifier = getModifier(intel);
		else if (key == 5)
			modifier = getModifier(wis);
		else
			modifier = getModifier(cha);
		
		if (isProf)
			modifier += prof;
		
		return modifierToString(modifier);
	}
	
	public static void printList(String[] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] != null)
				System.out.println(list[i]);
			else
				return;
		}
	}
	
	/*
	 * set ability scores; currently only supports standard array
	 * of scores (15, 14, 13, 12, 10, 8)
	 */
	public static int[] setAbilityScores()
	{
		Scanner input = new Scanner(System.in);
		
		String[] scoreNames = {"Strength", "Dexterity", "Constitution",
				"Intelligence", "Wisdom", "Charisma"};
		
		int[] scores = new int[6];
		int[] standard = {15, 14, 13, 12, 10, 8};
		
		for (int j = 0; j < 6; j++)
		{
			for (int i = 0; i < 3; i++)
			{
				System.out.printf("%s %12s\t%2d\t", (i + 1) + ")",
						scoreNames[i], scores[i]);
				System.out.printf("%s %12s\t%2d\n", (i + 4) + ")",
						scoreNames[i + 3], scores[i + 3]);
			}
			System.out.println("\nStandard array: 15, 14, 13, 12, 10,  8");
			System.out.println("Choose score to receive " + standard[j]
					+ " (i.e., \"Intelligence,\" \"int,\" or \"4\")");
			String choice = input.next();
			
			if (choice.equalsIgnoreCase("strength")
					|| choice.equalsIgnoreCase("str")
					|| choice.equals("1"))
			{
				if (scores[0] == 0)
					scores[0] = standard[j];
				else
				{
					System.out.println("Invalid input");
					j--;
					continue;
				}	
			}
			else if (choice.equalsIgnoreCase("dexterity")
					|| choice.equalsIgnoreCase("dex")
					|| choice.equals("2"))
			{
				if (scores[1] == 0)
					scores[1] = standard[j];
				else
				{
					System.out.println("Invalid input");
					j--;
					continue;
				}	
			}
			else if (choice.equalsIgnoreCase("constitution")
					|| choice.equalsIgnoreCase("con")
					|| choice.equals("3"))
			{
				if (scores[2] == 0)
					scores[2] = standard[j];
				else
				{
					System.out.println("Invalid input");
					j--;
					continue;
				}	
			}
			else if (choice.equalsIgnoreCase("intelligence")
					|| choice.equalsIgnoreCase("int")
					|| choice.equals("4"))
			{
				if (scores[3] == 0)
					scores[3] = standard[j];
				else
				{
					System.out.println("Invalid input");
					j--;
					continue;
				}	
			}
			else if (choice.equalsIgnoreCase("wisdom")
					|| choice.equalsIgnoreCase("wis")
					|| choice.equals("5"))
			{
				if (scores[4] == 0)
					scores[4] = standard[j];
				else
				{
					System.out.println("Invalid input");
					j--;
					continue;
				}	
			}
			else if (choice.equalsIgnoreCase("charisma")
					|| choice.equalsIgnoreCase("cha")
					|| choice.equals("6"))
			{
				if (scores[5] == 0)
					scores[5] = standard[j];
				else
				{
					System.out.println("Invalid input");
					j--;
					continue;
				}	
			}
			else
			{
				System.out.println("Invalid input");
				j--;
				continue;
			}
			System.out.println();
		}
		

		return scores;
	}
	
	public static String addLanguage(String[][] languages)
	{
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			System.out.println();
			for (int i = 0; i < languages.length; i++)
			{
				System.out.println(languages[i][0] + languages [i][1]);
			}
			System.out.println();
			System.out.println("\nChoose a language:");
			int choice = input.nextInt();
			if (choice >= 0 && choice <= languages.length)
				return languages[choice - 1][1];
			else
			{
				System.out.println("Invalid input.\n");
				continue;
			}
		}
	}
	
}
