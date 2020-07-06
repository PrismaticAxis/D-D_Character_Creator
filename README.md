# Dungeond & Dragons (5e) Character Creator 

## Synopsis
This is a basic text-based character creator for Dungeons & Dragons. It prompts the user to answer a series of questions, at the end of which it prints out a simple, 1st-level character sheet.

## Motivation
This was created as the final project for an Introduction to Programming course, but also serves as basic groundwork for a much bigger piece of character creation software.

## How to Use
The program is mostly self-explanatory: for most questions, the program displays a numbered list, and the user inputs the number corresponding to his/her desired choice. Two exceptions are the prompt for character name (which takes straight text input), and the selection of ability scores (which can take input as the number on the list as with other prompts, or use the typed name of the ability score, whether full or abbreviated to the first three letters).

## Code Example
This method handles most of the input/output functionality of the program, the "heavy-lifting" if you will. It prints one of many built-in lists and prompts the user for input, while also handling invalid input and redirecting to the start of the list rather than forcing the user to start from the beginning.
```
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
```

## Tests
Tested with JUnit4.

## Contributors
This is a personal project, though future iterations may be open to collaboration.
