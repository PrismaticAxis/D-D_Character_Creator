package dndCharacterCreator;
import java.util.Scanner;

/**
 * <p>Walks user through the process of making
 * a 1st-Level character for Dungeons and Dragons (fifth edition)
 * <br>through a series of prompts, ending by printing a
 * character sheet with the character's information.</p>
 * 
 * @author Stephen Lovell
 * <p>Last edited: 02 Jul 2020</p>
 *
 */
public class DnDCharacterCreator
{
	/**
	 * Primary handling of prompts and user input.
	 * 
	 * @param args (String[]; unused)
	 */
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
			
		final String[][] BACKGROUNDS = new String[13][2];
			for (int i = 0; i < BACKGROUNDS.length; i++)
				BACKGROUNDS[i][0] = (i + 1) + ") ";
			BACKGROUNDS[0][1] = "Acoylte";
			BACKGROUNDS[1][1] = "Charlatan";
			BACKGROUNDS[2][1] = "Criminal";
			BACKGROUNDS[3][1] = "Entertainer";
			BACKGROUNDS[4][1] = "Folk Hero";
			BACKGROUNDS[5][1] = "Guild Artisan";
			BACKGROUNDS[6][1] = "Hermit";
			BACKGROUNDS[7][1] = "Noble";
			BACKGROUNDS[8][1] = "Outlander";
			BACKGROUNDS[9][1] = "Sage";
			BACKGROUNDS[10][1] = "Sailor";
			BACKGROUNDS[11][1] = "Soldier";
			BACKGROUNDS[12][1] = "Urchin";
			
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
			
		final String[][] ARTISAN_TOOLS = new String[17][2];
			for (int i = 0; i < ARTISAN_TOOLS.length; i++)
				ARTISAN_TOOLS[i][0] = (i + 1) + ") ";
			ARTISAN_TOOLS[0][1] = "Alchemist's Supplies";
			ARTISAN_TOOLS[1][1] = "Brewer's Supplies";
			ARTISAN_TOOLS[2][1] = "Calligrapher's Supplies";
			ARTISAN_TOOLS[3][1] = "Carpenter's Tools";
			ARTISAN_TOOLS[4][1] = "Cartographer's Tools";
			ARTISAN_TOOLS[5][1] = "Cobbler's Tools";
			ARTISAN_TOOLS[6][1] = "Cook's Utensils";
			ARTISAN_TOOLS[7][1] = "Glassblower's Tools";
			ARTISAN_TOOLS[8][1] = "Jeweler's Tools";
			ARTISAN_TOOLS[9][1] = "Leatherworker's Tools";
			ARTISAN_TOOLS[10][1] = "Mason's Tools";
			ARTISAN_TOOLS[11][1] = "Painter's Supplies";
			ARTISAN_TOOLS[12][1] = "Potter's Tools";
			ARTISAN_TOOLS[13][1] = "Smith's Tools";
			ARTISAN_TOOLS[14][1] = "Tinker's Tools";
			ARTISAN_TOOLS[15][1] = "Weaver's Tools";
			ARTISAN_TOOLS[16][1] = "Woodcarver's Tools";
			
		final String[][] GAMING_SETS = new String[6][2];
			for (int i = 0; i < GAMING_SETS.length; i++)
				GAMING_SETS[i][0] = (i + 1) + ") ";
			GAMING_SETS[0][1] = "Dice Set";
			GAMING_SETS[1][1] = "Dragonchess Set";
			GAMING_SETS[2][1] = "Playing Card Set";
			GAMING_SETS[3][1] = "Three-Dragon Ante Set";
			
		final String[][] INSTRUMENTS = new String[20][2];
			for (int i = 0; i < INSTRUMENTS.length; i++)
				INSTRUMENTS[i][0] = (i + 1) + ") ";
			INSTRUMENTS[0][1] = "Bagpipes";
			INSTRUMENTS[1][1] = "Drum";
			INSTRUMENTS[2][1] = "Dulcimer";
			INSTRUMENTS[3][1] = "Flute";
			INSTRUMENTS[4][1] = "Lute";
			INSTRUMENTS[5][1] = "Lyre";
			INSTRUMENTS[6][1] = "Horn";
			INSTRUMENTS[7][1] = "Pan Flute";
			INSTRUMENTS[8][1] = "Shawm";
			INSTRUMENTS[9][1] = "Viol";
		
		/*
		 * in the interest of time, only doing Fighter, Rogue, and
		 * Wizard for now
		 */
		final String[][] CLASSES = new String[13][2];
			for (int i = 0; i < CLASSES.length; i++)
				CLASSES[i][0] = (i + 1) + ") ";
			CLASSES[0][1] = "Fighter";
			CLASSES[1][1] = "Rogue";
			CLASSES[2][1] = "Wizard";
			
		final String[][] WIZARD_SPELLS_0 = new String[16][2];
			for (int i = 0; i < WIZARD_SPELLS_0.length; i++)
				WIZARD_SPELLS_0[i][0] = (i + 1) + ") ";
			WIZARD_SPELLS_0[0][1] = "Acid Splash";
			WIZARD_SPELLS_0[1][1] = "Blade Ward";
			WIZARD_SPELLS_0[2][1] = "Chill Touch";
			WIZARD_SPELLS_0[3][1] = "Dancing Lights";
			WIZARD_SPELLS_0[4][1] = "Fire Bolt";
			WIZARD_SPELLS_0[5][1] = "Friends";
			WIZARD_SPELLS_0[6][1] = "Light";
			WIZARD_SPELLS_0[7][1] = "Mage Hand";
			WIZARD_SPELLS_0[8][1] = "Mending";
			WIZARD_SPELLS_0[9][1] = "Message";
			WIZARD_SPELLS_0[10][1] = "Minor Illusion";
			WIZARD_SPELLS_0[11][1] = "Poison Spray";
			WIZARD_SPELLS_0[12][1] = "Prestidigitation";
			WIZARD_SPELLS_0[13][1] = "Ray of Frost";
			WIZARD_SPELLS_0[14][1] = "Shocking Grasp";
			WIZARD_SPELLS_0[15][1] = "True Strike";
			
		final String[][] WIZARD_SPELLS_1 = new String[30][2];
			for (int i = 0; i < WIZARD_SPELLS_1.length; i++)
				WIZARD_SPELLS_1[i][0] = (i + 1) + ") ";
			WIZARD_SPELLS_1[0][1] = "Alarm";
			WIZARD_SPELLS_1[1][1] = "Burning Hands";
			WIZARD_SPELLS_1[2][1] = "Charm Person";
			WIZARD_SPELLS_1[3][1] = "Chromatic Orb";
			WIZARD_SPELLS_1[4][1] = "Color Spray";
			WIZARD_SPELLS_1[5][1] = "Comprehend Languages";
			WIZARD_SPELLS_1[6][1] = "Detect Magic";
			WIZARD_SPELLS_1[7][1] = "Disguise Self";
			WIZARD_SPELLS_1[8][1] = "Expeditious Retreat";
			WIZARD_SPELLS_1[9][1] = "False Life";
			WIZARD_SPELLS_1[10][1] = "Feather Fall";
			WIZARD_SPELLS_1[11][1] = "Find Familiar";
			WIZARD_SPELLS_1[12][1] = "Fog Cloud";
			WIZARD_SPELLS_1[13][1] = "Grease";
			WIZARD_SPELLS_1[14][1] = "Identify";
			WIZARD_SPELLS_1[15][1] = "Illusory Script";
			WIZARD_SPELLS_1[16][1] = "Jump";
			WIZARD_SPELLS_1[17][1] = "Longstrider";
			WIZARD_SPELLS_1[18][1] = "Mage Armor";
			WIZARD_SPELLS_1[19][1] = "Magic Missile";
			WIZARD_SPELLS_1[20][1] = "Protection from Evil and Good";
			WIZARD_SPELLS_1[21][1] = "Ray of Sickness";
			WIZARD_SPELLS_1[22][1] = "Shield";
			WIZARD_SPELLS_1[23][1] = "Silent Image";
			WIZARD_SPELLS_1[24][1] = "Sleep";
			WIZARD_SPELLS_1[25][1] = "Tasha's Hideous Laughter";
			WIZARD_SPELLS_1[26][1] = "Tenser's Floating Disk";
			WIZARD_SPELLS_1[27][1] = "Thunderwave";
			WIZARD_SPELLS_1[28][1] = "Unseen Servant";
			WIZARD_SPELLS_1[29][1] = "Witch Bolt";
			
		final String[][] FIGHTING_STYLES_F = new String[6][2];
			for (int i = 0; i < FIGHTING_STYLES_F.length; i++)
				FIGHTING_STYLES_F[i][0] = (i + 1) + ") ";
			FIGHTING_STYLES_F[0][1] = "Archery";
			FIGHTING_STYLES_F[1][1] = "Defense";
			FIGHTING_STYLES_F[2][1] = "Dueling";
			FIGHTING_STYLES_F[3][1] = "Great Weapon Fighting";
			FIGHTING_STYLES_F[4][1] = "Protection";
			FIGHTING_STYLES_F[5][1] = "Two-Weapon Fighting";
		
		
			
			
			
		String characterName = "";
		String characterRace = "";
		String characterClass = "";
		int characterLevel = 1;
		String characterBackground = "";
		int speed = 0;
		
		System.out.println("Enter character name:");
		characterName = input.nextLine();
		System.out.println();
		
		
		//generate ability scores
		int[] scores = setAbilityScores();
		int strScore = scores[0];
		int dexScore = scores[1];
		int conScore = scores[2];
		int intScore = scores[3];
		int wisScore = scores[4];
		int chaScore = scores[5];
		
		
		
		int languagesCount = 0;
		String[] languages = new String[10];
		
		String armorProficiency = "";
		int weaponProficiencyCount = 0;
		String[] weaponProficiency = new String[20];
		int toolProficiencyCount = 0;
		String[] toolProficiency = new String[10];
		int featureCount = 0;
		String[] features = new String[20];
			
		boolean isCaster = false;
		String casterClass = "";
		String spellcastingAbility = "";
		int spellcastingModifier = 0;
		int[] spellSlots = new int[10];
		int[] spellCount = new int[10];
		String[][] spellList = new String[10][15];
			
		int saveProficiencyCount = 0;
		String[] saveProficiency = new String[6];
		
		boolean[] skillProficiencies = new boolean[18];
			
			
			
			
		
		//choose race
		while (true)
		{
			for (int i = 0; i < RACES.length; i++)
			{
				if (RACES[i][1] != null)
					System.out.println(RACES[i][0] + RACES[i][1]);
				else
					break;
			}
			System.out.println("\nSelect race:");
			int raceChoice = input.nextInt();
			
			if (raceChoice == 1)	//Hill Dwarf
			{
				//race, speed, languages
				characterRace = "Hill Dwarf";
				speed = 25;
				languages[languagesCount] = "Common";
				languagesCount++;
				languages[languagesCount] = "Dwarvish";
				languagesCount++;
				
				//ability score increase
				conScore += 2;
				wisScore++;
				
				//misc traits
				features[featureCount] = "Darkvision (60 ft)";
				featureCount++;
				features[featureCount] = "Dwarven Resilience";
				featureCount++;
				features[featureCount] = "Stonecunning";
				featureCount++;
				features[featureCount] = "Dwarven Toughness";
				featureCount++;
				
				//misc proficiencies
				weaponProficiency[weaponProficiencyCount] = "Battleaxe";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Handaxe";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Light Hammer";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Warhammer";
				weaponProficiencyCount++;
				
				while (true)
				{
					System.out.println("1) Smith's Tools");
					System.out.println("2) Brewer's Supplies");
					System.out.println("3) Mason's Tools");
					System.out.println();
					System.out.println("Choose a tool proficiency:");
					int choice = input.nextInt();
					if (choice == 1)
					{
						toolProficiency[toolProficiencyCount] = "Smith's Tools";
						toolProficiencyCount++;
						break;
					}
					else if (choice == 2)
					{
						toolProficiency[toolProficiencyCount] = "Brewer's Supplies";
						toolProficiencyCount++;
						break;
					}
					else if (choice == 3)
					{
						toolProficiency[toolProficiencyCount] = "Mason's Tools";
						toolProficiencyCount++;
						break;
					}
					else
					{
						System.out.println("Invalid input\n");
						continue;
					}
						
					
				}
				
				break;
			}
			else if (raceChoice == 2)	//Mountain Dwarf
			{
				//race, speed, languages
				characterRace = "Hill Dwarf";
				speed = 25;
				languages[languagesCount] = "Common";
				languagesCount++;
				languages[languagesCount] = "Dwarvish";
				languagesCount++;
				
				//ability score increase
				conScore += 2;
				strScore += 2;
				
				//misc traits
				features[featureCount] = "Darkvision (60 ft)";
				featureCount++;
				features[featureCount] = "Dwarven Resilience";
				featureCount++;
				features[featureCount] = "Stonecunning";
				featureCount++;
				
				//misc proficiencies
				armorProficiency = setArmorProficiency(armorProficiency, 'd');
				weaponProficiency[weaponProficiencyCount] = "Battleaxe";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Handaxe";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Light Hammer";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Warhammer";
				weaponProficiencyCount++;
				while (true)
				{
					System.out.println("1) Smith's Tools");
					System.out.println("2) Brewer's Supplies");
					System.out.println("3) Mason's Tools");
					System.out.println();
					System.out.println("Choose a tool proficiency:");
					int choice = input.nextInt();
					if (choice == 1)
					{
						toolProficiency[toolProficiencyCount] = "Smith's Tools";
						toolProficiencyCount++;
						break;
					}
					else if (choice == 2)
					{
						toolProficiency[toolProficiencyCount] = "Brewer's Supplies";
						toolProficiencyCount++;
						break;
					}
					else if (choice == 3)
					{
						toolProficiency[toolProficiencyCount] = "Mason's Tools";
						toolProficiencyCount++;
						break;
					}
					else
					{
						System.out.println("Invalid input\n");
						continue;
					}
						
					
				}
				
				break;
			}
			else if (raceChoice == 3)	//High Elf
			{
				//race, speed, languages
				characterRace = "High Elf";
				speed = 30;
				System.out.println(
						"As a high elf, you know Common, Elvish, and one other language.");
				languages[languagesCount] = "Common";
				languagesCount++;
				languages[languagesCount] = "Elvish";
				languagesCount++;
				languages[languagesCount] = pickFromList(LANGUAGES, "language");
				languagesCount++;
				
				//ability score increase
				dexScore += 2;
				intScore++;
				
				//wizard cantrip
				System.out.println("You also get a wizard cantrip (Intelligence is your spellcasting ability for it)");
				isCaster = true;
				casterClass = "N/A";
				spellcastingAbility = "Int";
				spellcastingModifier = getModifier(intScore);
				spellList[0][spellCount[0]] = pickFromList(WIZARD_SPELLS_0, "cantrip");
				spellCount[0]++;
				
				//misc traits
				features[featureCount] = "Darkvision (60 ft)";
				featureCount++;
				features[featureCount] = "Fey Ancestry";
				featureCount++;
				features[featureCount] = "Trance";
				featureCount++;
				
				//misc proficiencies
				skillProficiencies[11] = true;
				weaponProficiency[weaponProficiencyCount] = "Longsword";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Shortsword";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Shortbow";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Longbow";
				weaponProficiencyCount++;
				
				break;
			}
			else if (raceChoice == 4)	//Wood Elf
			{
				//race, speed, languages
				characterRace = "Wood Elf";
				speed = 35;
				languages[languagesCount] = "Common";
				languagesCount++;
				languages[languagesCount] = "Elvish";
				languagesCount++;
				
				//ability score increase
				dexScore += 2;
				wisScore++;
				
				//misc traits
				features[featureCount] = "Darkvision (60 ft)";
				featureCount++;
				features[featureCount] = "Fey Ancestry";
				featureCount++;
				features[featureCount] = "Trance";
				featureCount++;
				features[featureCount] = "Mask of the Wild";
				featureCount++;
				
				//misc proficiencies
				skillProficiencies[11] = true;
				weaponProficiency[weaponProficiencyCount] = "Longsword";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Shortsword";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Shortbow";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Longbow";
				weaponProficiencyCount++;
				
				break;
			}
			else if (raceChoice == 5)	//Drow
			{
				//race, speed, languages
				characterRace = "Drow";
				speed = 30;
				languages[languagesCount] = "Common";
				languagesCount++;
				languages[languagesCount] = "Elvish";
				languagesCount++;
											//still not sure why drow don't
											//get Undercommon
				
				//ability score increase
				dexScore += 2;
				chaScore++;
				
				//misc traits
				features[featureCount] = "Darkvision (120 ft)";
				featureCount++;
				features[featureCount] = "Sunlight Sensitivity";
				featureCount++;
				features[featureCount] = "Fey Ancestry";
				featureCount++;
				features[featureCount] = "Trance";
				featureCount++;
				
				//misc proficiencies
				skillProficiencies[11] = true;
				weaponProficiency[weaponProficiencyCount] = "Rapier";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Shortsword";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Hand Crossbow";
				weaponProficiencyCount++;
				
				//drow magic
				isCaster = true;
				casterClass = "N/A";
				spellcastingModifier = getModifier(chaScore);
				spellList[0][spellCount[0]] = "Dancing Lights";
				spellCount[0]++;
				/*
				 * there is more to this trait, but only comes into
				 * effect at higher levels; beyond the scope of the
				 * current project
				 */
				
				break;
			}
			else if (raceChoice == 6)	//Lightfoot Halfling
			{
				//race, speed, languages
				characterRace = "Lightfoot Halfling";
				speed = 25;
				languages[languagesCount] = "Common";
				languagesCount++;
				languages[languagesCount] = "Halfling";
				languagesCount++;
				
				//ability score increase
				dexScore += 2;
				chaScore++;
				
				//misc traits
				features[featureCount] = "Lucky";
				featureCount++;
				features[featureCount] = "Brave";
				featureCount++;
				features[featureCount] = "Halfling Nimbleness";
				featureCount++;
				features[featureCount] = "Naturally Stealthy";
				featureCount++;
				
				break;
			}
			else if (raceChoice == 7)	//Stout Halfling
			{
				//race, speed, languages
				characterRace = "Stout Halfling";
				speed = 25;
				languages[languagesCount] = "Common";
				languagesCount++;
				languages[languagesCount] = "Halfling";
				languagesCount++;
				
				//ability score increase
				dexScore += 2;
				conScore++;
				
				//misc traits
				features[featureCount] = "Lucky";
				featureCount++;
				features[featureCount] = "Brave";
				featureCount++;
				features[featureCount] = "Halfling Nimbleness";
				featureCount++;
				features[featureCount] = "Stout Resilience";
				featureCount++;
				
				break;
			}
			else if (raceChoice == 8)	//Human
			{
				//race, speed, languages
				characterRace = "Human";
				speed = 30;
				System.out.println(
						"As a human, you know Common and one other language.");
				languages[languagesCount] = "Common";
				languagesCount++;
				languages[languagesCount] = pickFromList(LANGUAGES, "language");
				languagesCount++;
				
				//ability score increase
				strScore++;
				dexScore++;
				conScore++;
				intScore++;
				wisScore++;
				chaScore++;
				
				break;
			}
			else						//invalid input
			{
				System.out.println("Invalid input\n");
				continue;
			}
		}
		
		int strModifier = getModifier(strScore);
		int dexModifier = getModifier(dexScore);
		int conModifier = getModifier(conScore);
		int intModifier = getModifier(intScore);
		int wisModifier = getModifier(wisScore);
		int chaModifier = getModifier(chaScore);
		
		int ac = 10 + dexModifier;
		int hpMax = 0;
		int proficiencyBonus = 2;
		int initiativeModifier = dexModifier;
				
				

		//chose background
		while (true)
		{
			for (int i = 0; i < BACKGROUNDS.length; i++)
			{
				if (BACKGROUNDS[i][1] != null)
					System.out.println(BACKGROUNDS[i][0] + BACKGROUNDS[i][1]);
				else
					break;
			}
			System.out.println("\nSelect background:");
			int backgroundChoice = input.nextInt();
			
			if (backgroundChoice == 1)		//acolyte
			{
				characterBackground = "Acolyte"; 
				
				skillProficiencies[6] = true;
				skillProficiencies[14] = true;
				
				languages[languagesCount] = pickFromList(LANGUAGES, "language");
				languagesCount++;
				languages[languagesCount] = pickFromList(LANGUAGES, "language");
				languagesCount++;
				
				features[featureCount] = "Shelter of the Faithful";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 2)	//charlatan
			{
				characterBackground = "Charlatan";
				
				skillProficiencies[4] = true;
				skillProficiencies[15] = true;
				
				toolProficiency[toolProficiencyCount] = "Disguise Kit";
				toolProficiencyCount++;
				toolProficiency[toolProficiencyCount] = "Forgery Kit";
				toolProficiencyCount++;
				
				features[featureCount] = "False Identity";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 3)	//criminal
			{
				characterBackground = "Criminal";
				
				skillProficiencies[4] = true;
				skillProficiencies[16] = true;
				
				toolProficiency[toolProficiencyCount] = pickFromList(GAMING_SETS, "gaming set");
				toolProficiencyCount++;
				toolProficiency[toolProficiencyCount] = "Thieves' Tools";
				toolProficiencyCount++;
				
				features[featureCount] = "Criminal Contact";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 4)	//entertainer
			{
				characterBackground = "Entertainer";
				
				skillProficiencies[0] = true;
				skillProficiencies[12] = true;
				
				toolProficiency[toolProficiencyCount] = "Disguise Kit";
				toolProficiencyCount++;
				toolProficiency[toolProficiencyCount] = pickFromList(INSTRUMENTS, "musical instrument");
				toolProficiencyCount++;
				
				features[featureCount] = "By Popular Demand";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 5)	//folk hero
			{
				characterBackground = "Folk Hero";
				
				skillProficiencies[1] = true;
				skillProficiencies[17] = true;
				
				toolProficiency[toolProficiencyCount] = pickFromList(ARTISAN_TOOLS, "type of artisan's tools");
				toolProficiencyCount++;
				
				features[featureCount] = "Rustic Hospitality";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 6)	//guild artisan
			{
				characterBackground = "Guild Artisan";
				
				skillProficiencies[6] = true;
				skillProficiencies[13] = true;
				
				toolProficiency[toolProficiencyCount] = pickFromList(ARTISAN_TOOLS, "type of artisan's tools");
				toolProficiencyCount++;
				languages[languagesCount] = pickFromList(LANGUAGES, "language");
				languagesCount++;
				
				features[featureCount] = "Guild Membership";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 7)	//hermit
			{
				characterBackground = "Hermit";
				
				skillProficiencies[9] = true;
				skillProficiencies[14] = true;
				
				toolProficiency[toolProficiencyCount] = "Herbalism Kit";
				toolProficiencyCount++;
				languages[languagesCount] = pickFromList(LANGUAGES, "language");
				languagesCount++;
				
				features[featureCount] = "Discovery";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 8)	//noble
			{
				characterBackground = "Noble";
				
				skillProficiencies[5] = true;
				skillProficiencies[13] = true;
				
				toolProficiency[toolProficiencyCount] = pickFromList(GAMING_SETS, "gaming set");
				toolProficiencyCount++;
				
				features[featureCount] = "Position of Privilege";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 9)	//outlander
			{
				characterBackground = "Outlander";
				
				skillProficiencies[3] = true;
				skillProficiencies[17] = true;
				
				toolProficiency[toolProficiencyCount] = pickFromList(INSTRUMENTS, "musical instrument");
				toolProficiencyCount++;
				languages[languagesCount] = pickFromList(LANGUAGES, "language");
				languagesCount++;
				
				features[featureCount] = "Wanderer";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 10) //sage
			{
				characterBackground = "Sage";
				
				skillProficiencies[2] = true;
				skillProficiencies[5] = true;
				
				languages[languagesCount] = pickFromList(LANGUAGES, "language");
				languagesCount++;
				languages[languagesCount] = pickFromList(LANGUAGES, "language");
				languagesCount++;
				
				features[featureCount] = "Researcher";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 11) //sailor
			{
				characterBackground = "Sailor";
				
				skillProficiencies[3] = true;
				skillProficiencies[11] = true;
				
				toolProficiency[toolProficiencyCount] = "Navigator's Tools";
				toolProficiencyCount++;
				toolProficiency[toolProficiencyCount] = "Water Vehicles";
				toolProficiencyCount++;
				
				features[featureCount] = "Ship's Passage";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 12) //soldier
			{
				characterBackground = "Soldier";
				
				skillProficiencies[3] = true;
				skillProficiencies[7] = true;
				
				toolProficiency[toolProficiencyCount] = pickFromList(GAMING_SETS, "gaming set");
				toolProficiencyCount++;
				toolProficiency[toolProficiencyCount] = "Land Vehicles";
				toolProficiencyCount++;
				
				features[featureCount] = "Military Rank";
				featureCount++;
				
				break;
			}
			else if (backgroundChoice == 13) //urchin
			{
				characterBackground = "Urchin";
				
				skillProficiencies[15] = true;
				skillProficiencies[16] = true;
				
				toolProficiency[toolProficiencyCount] = "Disguise Kit";
				toolProficiencyCount++;
				toolProficiency[toolProficiencyCount] = "Thieves' Tools";
				toolProficiencyCount++;
				
				features[featureCount] = "City Secrets";
				featureCount++;
				
				break;
			}
			else
			{
				System.out.println("Invalid input\n");
				continue;
			}
		}
		
		
		
		
		//choose class
		while (true)
		{
			for (int i = 0; i < CLASSES.length; i++)
			{
				if (CLASSES[i][1] != null)
					System.out.println(CLASSES[i][0] + CLASSES[i][1]);
				else
					break;
			}
			System.out.println("\nChoose class:");
			int classChoice = input.nextInt();
			
			if (classChoice == 1)		//fighter
			{
				characterClass = "Fighter";
				hpMax = 10 + conModifier;
				if (characterRace == "Hill Dwarf")
					hpMax++;
				armorProficiency = setArmorProficiency(armorProficiency, 'h');
				weaponProficiency[weaponProficiencyCount] = "Simple Weapons";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Martial Weapons";
				weaponProficiencyCount++;
				saveProficiency[saveProficiencyCount] = "Strength";
				saveProficiencyCount++;
				saveProficiency[saveProficiencyCount] = "Constitution";
				saveProficiencyCount++;
				
				for (int i = 0; i < 2; i++)
				{
					while (true)
					{
						System.out.println();
						for (int j = 0; j < skillProficiencies.length; j++)
						{
							if (j == 0 || j == 1 || j == 3 || j == 5
									|| j == 6 || j == 7 || j == 11
									|| j == 17)
							{
								System.out.println((j + 1) + ") " + SKILLS[j]);
							}
						}
						System.out.println("\nChoose a skill:");
						int choice = input.nextInt();
						
						if (!(skillProficiencies[choice - 1]) && choice >= 0
								&& choice < skillProficiencies.length)
						{
							if (choice == 1 || choice == 2 || choice == 4
									|| choice == 6 || choice == 7
									|| choice == 8 || choice == 12
									|| choice == 18)
							{
								skillProficiencies[choice - 1] = true;
								break;
							}
							else
							{
								System.out.println("Invalid input\n");
								continue;
							}
						}
						else
						{
							System.out.println("You already have proficiency in this skill\n");
							continue;
						}
					}
				}
				
				String fightingStyle = pickFromList(FIGHTING_STYLES_F, "fighting style");
				features[featureCount] = "Fighting Style: " + fightingStyle;
				featureCount++;
				features[featureCount] = "Second Wind";
				featureCount++;
				
				break;
			}
			else if (classChoice == 2)	//rogue
			{
				characterClass = "Rogue";
				hpMax = 8 + conModifier;
				if (characterRace == "Hill Dwarf")
					hpMax++;
				armorProficiency = setArmorProficiency(armorProficiency, 'l');
				weaponProficiency[weaponProficiencyCount] = "Simple Weapons";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Hand Crossbow";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Longsword";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Rapier";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Shortsword";
				weaponProficiencyCount++;
				toolProficiency[toolProficiencyCount] = "Thieves' Tools";
				toolProficiencyCount++;
				saveProficiency[saveProficiencyCount] = "Dexterity";
				saveProficiencyCount++;
				saveProficiency[saveProficiencyCount] = "Intelligence";
				saveProficiencyCount++;
				
				for (int i = 0; i < 4; i++)
				{
					while (true)
					{
						System.out.println();
						for (int j = 0; j < skillProficiencies.length; j++)
						{
							if (j == 0 || j == 3 || j == 4 || j == 6
									|| j == 7 || j == 8 || j == 11
									|| j == 12 || j == 13 || j == 15
									|| j == 16)
							{
								System.out.println((j + 1) + ") " + SKILLS[j]);
							}
						}
						System.out.println("\nChoose a skill:");
						int choice = input.nextInt();
						
						if (choice >= 0 && choice < skillProficiencies.length)
						{
							if (!(skillProficiencies[choice - 1]))
							{
								if (choice == 1 || choice == 4 || choice == 5
										|| choice == 7 || choice == 8
										|| choice == 9 || choice == 12
										|| choice == 13 || choice == 14
										|| choice == 16 || choice == 17)
								{
									skillProficiencies[choice - 1] = true;
									break;
								}
								else
								{
									System.out.println("Invalid input\n");
									continue;
								}
							}
							else
							{
								System.out.println("You already have proficiency with this skill.");
								continue;
							}
						}
						else
						{
							System.out.println("You already have proficiency in this skill\n");
							continue;
						}
					}
				}
				
				//expertise
				for (int i = 0; i < 2; i++)
				{
					while (true)
					{
						System.out.println("\n0) Thieves' Tools");
						for (int j = 0; j < skillProficiencies.length; j++)
						{
							if (skillProficiencies[j])
								System.out.println((j + 1) + ") " + SKILLS[j]);
						}
						
						System.out.println("\nChoose a skill/tool to have expertise with:");
						int choice = input.nextInt();
						
						if (choice == 0)
						{
							features[featureCount] = "Expertise: Thieves' Tools";
							featureCount++;
							break;
						}
						else if (skillProficiencies[choice - 1])
						{
							features[featureCount] = "Expertise: " + SKILLS[choice - 1];
							featureCount++;
							break;
						}
						else
						{
							System.out.println("Invalid input\n");
							continue;
						}
					}
				}
				
				features[featureCount] = "Sneak Attack (1d6)";
				featureCount++;
				features[featureCount] = "Thieves' Cant";
				featureCount++;
				
				break;
			}
			else if (classChoice == 3)	//wizard
			{
				characterClass = "Wizard";
				hpMax = 6 + conModifier;
				if (characterRace == "Hill Dwarf")
					hpMax++;
				weaponProficiency[weaponProficiencyCount] = "Dagger";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Dart";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Sling";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Quarterstaff";
				weaponProficiencyCount++;
				weaponProficiency[weaponProficiencyCount] = "Light Crossbow";
				weaponProficiencyCount++;
				saveProficiency[saveProficiencyCount] = "Intelligence";
				saveProficiencyCount++;
				saveProficiency[saveProficiencyCount] = "Wisdom";
				saveProficiencyCount++;
				
				for (int i = 0; i < 2; i++)
				{
					while (true)
					{
						System.out.println();
						for (int j = 0; j < skillProficiencies.length; j++)
						{
							if (j == 2 || j == 5 || j == 6 || j == 8
									|| j == 9 || j == 14)
							{
								System.out.println((j + 1) + ") " + SKILLS[j]);
							}
						}
						System.out.println("\nChoose a skill:");
						int choice = input.nextInt();
						
						if (choice >= 0 && choice < skillProficiencies.length)
						{
							if (!(skillProficiencies[choice - 1]))
							{
								if (choice == 3 || choice == 6 || choice == 7
										|| choice == 9 || choice == 10
										|| choice == 15)
								{
									skillProficiencies[choice - 1] = true;
									break;
								}
								else
								{
									System.out.println("Invalid input\n");
									continue;
								}
							}
							else
							{
								System.out.println("You already have proficiency with this skill.");
								continue;
							}
						}
						else
						{
							System.out.println("Invalid input\n");
							continue;
						}
					}
				}
				
				//spellcasting
				features[featureCount] = "Spellcasting (Wizard)";
				featureCount++;
				isCaster = true;
				casterClass = "Wizard";
				spellcastingAbility = "Int";
				spellcastingModifier = getModifier(intScore);
				spellSlots[1] = 2;
				for (int i = 0; i < 3; i++)
				{
					spellList[0][spellCount[0]] = pickFromList(WIZARD_SPELLS_0, "cantrip");
					spellCount[0]++;
				}
				for (int i = 0; i < 6; i++)
				{
					spellList[1][spellCount[1]] = pickFromList(WIZARD_SPELLS_1, "1st level spell");
					spellCount[1]++;
				}
				
				
				break;
			}
			else						//invalid input
			{
				System.out.println("Invalid input\n");
				continue;
			}
		}
		
		
		int hpCurrent = hpMax;
		
		
		//print character sheet
		System.out.println();
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
		System.out.println("Initiative: +" + initiativeModifier);
		System.out.println("Speed\t" + speed + " ft");
		System.out.println(sectionBreak);
		
		//ability scores and modifiers
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
		System.out.println("\tFeatures & Traits");
		printList(features);
		
		//spellcasting
		if (isCaster)
		{
			System.out.println(sectionBreak);
			System.out.println("\tSpellcasting\n");
			//general
			System.out.println("Spellcasting class/ability:\t" + 
					casterClass + " (" + spellcastingAbility + ")");
			System.out.printf("Spell save DC:\t\t\t%2d\n", 
					(8 + proficiencyBonus + spellcastingModifier));
			System.out.printf("Spell attack modifier:\t\t%2s",
					modifierToString(proficiencyBonus + 
							spellcastingModifier));
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
	
	
	
	/**
	 * Returns integer modifier for a given ability score
	 * 
	 * @param score - the ability score to get the modifier for
	 * @return the ability modifier
	 */
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
	
	/**
	 * Returns modifier with + or - sign for formatting purposes.
	 * 
	 * @param modifier - the ability modifier to be converted
	 * @return the ability modifier with + or - sign (or space if 0)
	 */
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
	
	/**
	 * Returns modifier for a particular skill.<br><br>
	 * (Note: method currently a bit clunky and awkward. Will clean
	 * this up later)
	 * 
	 * @param str - character's Strength score
	 * @param dex - character's Dexterity score
	 * @param con - character's Constitution score
	 * @param intel - character's Intelligence score
	 * @param wis - character's Wisdom score
	 * @param cha - character's Charisma score
	 * @param prof - character's proficiency bonus (as int)
	 * @param key - the relevant ability score (1 for Strength,
	 * 2 for Dexterity, 3 for Constitution, <br>4 for Intelligence,
	 * 5 for Wisdom, 6 for Charisma)
	 * @param isProf - whether character is proficient in the skill in question
	 * @return the modifier for the skill (with + or - as appropriate),
	 * including proficiency bonus
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
	
	/**
	 * Prints a given list.
	 * 
	 * @param list - the list to display
	 */
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
	
	/**
	 * Sets the character's initial ability scores based on user input.<br>
	 * Currently only supports generation through the standard array<br>
	 * (15, 14, 13, 12, 10, 8)
	 * 
	 * @return ability scores as array
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
	
	/**
	 * Sets character's armor and shield proficiencies.
	 * 
	 * @param current - character's current armor/shield proficiencies as string
	 * @param a - the proficiency level to set ('l' for light, 'm' for medium and shields,
	 * 'h' for all armor/shields,<br>'d' for special case of Mountain Dwarves)
	 * @return adjusted armor/shield proficiencies
	 */
	public static String setArmorProficiency(String current, char a)
	{
		if (a == 'l' && !(current.contains("Armor")))
			return "Light Armor";
		else if (a == 'd' && !(current.contains("Shields")))
			return "Light, Medium Armor";
		else if (a == 'm' && !(current.contains("All")))
			return "Light, Medium Armor, Shields";
		else if (a == 'h')
			return "All Armor, Shields";
		else
			return current;
	}
	
	/**
	 * prompts the user to choose and item from a printed
	 * list, then returns that item as a string.
	 * 
	 * @param list - the list to pick from
	 * @param prompt - prompt displays as "Choose a ", followed by this string
	 * @return the item the user selects
	 */
	public static String pickFromList(String[][] list, String prompt)
	{
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			System.out.println();
			for (int i = 0; i < list.length; i++)
			{
				if (list[i][1] != null)
					System.out.println(list[i][0] + list [i][1]);
			}
			System.out.println();
			System.out.println("\nChoose a " + prompt + ":");
			int choice = input.nextInt();
			if (choice >= 0 && choice <= list.length && list[choice - 1][1] != null)
				return list[choice - 1][1];
			else
			{
				System.out.println("Invalid input.\n");
				continue;
			}
		}
	}
	
}
