import java.util.Scanner;

public class DnDCharacterCreator
{
	public static void main(String[] args)
	{
		String sectionBreak = "_____\n";
		
		Scanner input = new Scanner(System.in);
		
		//name, race, class, level, and background
		System.out.println("Sydri");
		System.out.println("Human Artificier 1");
		System.out.println("Background: Noble");
		System.out.println(sectionBreak);
		
		//HP, AC, proficiency, and initiative
		System.out.printf("AC\t%d\n", 12);
		System.out.printf("HP\t%d / %d\n", 8, 8);
		System.out.println("Proficiency Bonus: +2");
		System.out.println("Initiative: +2");
		System.out.println(sectionBreak);
		
		//ability scores and modifiers, with saving throw proficiencies
		System.out.printf("STR %2d (%2s)%s\n", 13, "+1", "");
		System.out.printf("DEX %2d (%2s)%s\n", 14, "+2", "");
		System.out.printf("CON %2d (%2s)%s\n", 11, " 0", " (save +2)");
		System.out.printf("INT %2d (%2s)%s\n", 16, "+3", " (save +5)");
		System.out.printf("WIS %2d (%2s)%s\n", 15, "+2", "");
		System.out.printf("CHA %2d (%2s)%s\n", 9, "-1", "");
		System.out.println(sectionBreak);
		
		//proficiencies
			//skills
		System.out.println("\tProficiencies");
		System.out.println("History\t(+5)");
		System.out.println("Perception\t(+4)");
		System.out.println("Persuasion\t(+1)");
		System.out.println("Sleight of Hand\t(+4)");
		System.out.println();
		
			//armor and weapons
		System.out.println("Light, Medium Armor");
		System.out.println("Simple Weapons");
		System.out.println();
		
			//languages
		System.out.println("Common");
		System.out.println("Halfling");
		System.out.println("Elvish");
		System.out.println();
		
			//tools, etc.
		System.out.println("Thieves' Tools");
		System.out.println("Tinker's Tools");
		System.out.println("Painter's Supplies");
		System.out.println("Chess Set");
		System.out.println(sectionBreak);
		
		//traits and features
		System.out.println("\tFeatures & Traits");
		System.out.println("Magical Tinkering");
		System.out.println("Spellcasting (Artificer)");
		System.out.println(sectionBreak);
		
		//spellcasting
		System.out.println("\tSpellcasting");
			//general
		System.out.println("Spellcasting class/ability:\tArtificer (Int)");
		System.out.printf("Spell save DC:\t\t\t%2d\n", 13);
		System.out.printf("Spell attack modifier:\t\t%2s", "+5");
		System.out.println();
		
			//cantrips
		System.out.println("\tCantrips/At will");
		System.out.println("Guidance");
		System.out.println("Prestidigitation");
		
			//1st level
		System.out.println("\t1st Level (2 slots)");
		System.out.println("Feather Fall");
		System.out.println("Jump");
		System.out.println("Purify Food and Drink");
	}
}
