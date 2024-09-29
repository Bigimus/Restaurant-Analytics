package main;

//Brian Hockenjos, Chris Andrew Bustamante
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Performance {

	public static void main(String[] args) {
		char cont;
		do {
			System.out.println(
					"What group do you wish to output? 1 for drinks, 2 for appetizers, 3 for entrees, 4 for desserts.");
			Scanner k = new Scanner(System.in);
			int i = k.nextInt();
			switch (i) {
			// Calling drinks(); method.
			case 1:
				drinks();
				break;
			// Calling appetizers(); method.
			case 2:
				appetizers();
				break;
			// Calling entrees(); method.
			case 3:
				entrees();
				break;
			// Calling desserts(); method.
			case 4:
				desserts();
				break;
			// For if the input is anything besides the defined cases.
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			System.out.println("Do you wish to continue? y for yes, n for no.");
			cont = k.next().charAt(0);
		} while (cont == 'y' || cont == 'Y');
	}

	// Linked List + Array
	private static void drinks() {
		// Defining Variables.
		int water = 12;
		int orangeSoda = 15;
		int grapeSoda = 9;
		int pepsi = 35;
		int rootBeer = 25;
		int sprite = 45;
		// Defining array named drinkList.
		int drinkList[] = { water, orangeSoda, grapeSoda, pepsi, rootBeer, sprite };
		// Calling bubbleSort(); method to sort our array drinkList.
		bubbleSort(drinkList);
		System.out.println("Array after bubble sort");
		for (int i = 0; i < drinkList.length; i++) {
			// Creating a LinkedList named drinkListNames
			LinkedList<String> drinkListNames = new LinkedList<String>();
			// Populating the Linked List drinkListNames
			switch (drinkList[i]) {
			// When int i is equal to 9, "Grape Soda" will be added to drinkListNames.
			case 9:
				drinkListNames.add("Grape Soda");
				break;
			// When int i is equal to 12, "Water" will be added to drinkListNames.
			case 12:
				drinkListNames.add("Water");
				break;
			// When int i is equal to 15, "Orange Soda" will be added to drinkListNames.
			case 15:
				drinkListNames.add("Orange Soda");
				break;
			// When int i is equal to 25, "Root Beer" will be added to drinkListNames.
			case 25:
				drinkListNames.add("Root Beer");
				break;
			// When int i is equal to 35, "Pepsi" will be added to drinkListNames.
			case 35:
				drinkListNames.add("Pepsi");
				break;
			// When int i is equal to 45, "Sprite" will be added to drinkListNames.
			case 45:
				drinkListNames.add("Sprite");
				break;
			}
			// Printing out the ordered list (from lowest sold to highest sold) of drinks.
			System.out.print("AJ's Bar n Grill sold " + drinkList[i] + " " + drinkListNames + "\n");
		}
	}

	// Queue + Array
	private static void appetizers() {
		// Defining Variables.
		int chickenWings = 50;
		int cheeseSticks = 23;
		int cheeseFries = 20;
		int grilledShrimp = 14;
		int macNCheeseBites = 30;
		int friedCalamari = 4;
		// Defining an array named appetizerList.
		int appetizerList[] = { chickenWings, cheeseFries, friedCalamari, macNCheeseBites, cheeseSticks,
				grilledShrimp };
		// Calling bubbleSort(); method to sort the array appetizerList.
		bubbleSort(appetizerList);
		for (int i = 0; i < appetizerList.length; i++) {
			// Creating a Queue named appetizerListNames.
			Queue<String> appetizerListNames = new LinkedList<String>();
			// Populating the Queue appetizerListNames
			switch (appetizerList[i]) {
			// When int i is equal to 4, "Fried Calamari" will be added to appetizerListNames.
			case 4:
				appetizerListNames.add("Fried Calamari");
				break;
			// When int i is equal to 14, "Grilled Shrimp" will be added to appetizerListNames.
			case 14:
				appetizerListNames.add("Grilled Shrimp");
				break;
			// When int i is equal to 20, "Cheese Fries" will be added to appetizerListNames.
			case 20:
				appetizerListNames.add("Cheese Fries");
				break;
			// When int i is equal to 23, "Cheese Sticks" will be added to appetizerListNames.
			case 23:
				appetizerListNames.add("Cheest Sticks");
				break;
			// When int i is equal to 30, "Mac n Cheese Bites" will be added to appetizerListNames.
			case 30:
				appetizerListNames.add("Mac n Cheese Bites");
				break;
			// When int i is equal to 50, "Chicken Wings" will be added to appetizerListNames.
			case 50:
				appetizerListNames.add("Chicken Wings");
				break;
			}
			// Printing out the ordered list (from lowest sold to highest sold) of appetizers.
			System.out.print("AJ's Bar n Grill sold " + appetizerList[i] + " " + appetizerListNames + "\n");
		}
	}

	// Stack + Array
	private static void entrees() {
		// Defining variables.
		int filetMigon = 19;
		int chickenCutlet = 34;
		int ceasarSalad = 69;
		int crabLegs = 6;
		int babyBackRibs = 8;
		int oxtail = 5;
		// Defining an array named entreeList.
		int entreeList[] = { filetMigon, chickenCutlet, ceasarSalad, crabLegs, babyBackRibs, oxtail };
		// Calling bubbleSort(); method to sort the array entreeList.
		bubbleSort(entreeList);
		for (int i = 0; i < entreeList.length; i++) {
			// Creating a Stack named entreeListNames.
			Stack<String> entreeListNames = new Stack<String>();
			// Populating the Stack entreeListNames.
			switch (entreeList[i]) {
			// When int i is equal to 5, "Oxtail" will be added to entreeListNames.
			case 5:
				entreeListNames.add("Oxtail");
				break;
			// When int i is equal to 6, "Crab Legs" will be added to entreeListNames.
			case 6:
				entreeListNames.add("Crab Legs");
				break;
			// When int i is equal to 8, "Baby Back Ribs" will be added to entreeListNames.
			case 8:
				entreeListNames.add("Baby Back Ribs");
				break;
			// When int i is equal to 19, "Filet Migon" will be added to entreeListNames.
			case 19:
				entreeListNames.add("Filet Migon");
				break;
			// When int i is equal to 34, "Chicken Cutlets" will be added to entreeListNames.
			case 34:
				entreeListNames.add("Chicken Cutlets");
				break;
			// When int i is equal to 69, "Ceasar Salad" will be added to entreeListNames.
			case 69:
				entreeListNames.add("Ceasar Salad");
				break;
			}
			// Printing out the ordered list (from lowest sold to highest sold) of entrees.
			System.out.print("AJ's Bar n Grill sold " + entreeList[i] + " " + entreeListNames + "\n");
		}
	}

	// Binary Tree + Array
	private static void desserts() {
		// Defining Variables.
		int chocolateIceCream = 39;
		int vanillaIceCream = 45;
		int chocolateLavaCake = 20;
		int chocolateChipCookie = 19;
		int cheeseCake = 13;
		int tiramisu = 6;
		// Defining an array named dessertList.
		int dessertList[] = { chocolateIceCream, tiramisu, chocolateChipCookie, vanillaIceCream, cheeseCake,
				chocolateLavaCake };
		// Calling bubbleSort(); method to sort the array dessertList.
		bubbleSort(dessertList);
		for (int i = 0; i < dessertList.length; i++) {
			// Creating a Binary Tree named dessertListNames.
			BT dessertListNames = new BT();
			// Populating the Binary Tree dessertListNames.
			switch (dessertList[i]) {
			// When int i is equal to 6, "[Tiramisu]" will be added to dessertListNames.
			case 6:
				dessertListNames.insert("[Tiramisu]");
				break;
			// When int i is equal to 13, "[Cheese Cake]" will be added to dessertListNames.
			case 13:
				dessertListNames.insert("[Cheese Cake]");
				break;
			// When int i is equal to 19, "[Chocolate Chip Cookie]" will be added to dessertListNames.
			case 19:
				dessertListNames.insert("[Chocolate Chip Cookie]");
				break;
			// When int i is equal to 20, "[Chocolate Lava Cake]" will be added to dessertListNames.
			case 20:
				dessertListNames.insert("[Chocolate Lava Cake]");
				break;
			// When int i is equal to 39, "[Chocolate Ice Cream]" will be added to dessertListNames.
			case 39:
				dessertListNames.insert("[Chocolate Ice Cream]");
				break;
			case 45:
				// When int i is equal to 45, "[Vanillar Ice Cream]" will be added to dessertListNames.
				dessertListNames.insert("[Vanilla Ice Cream]");
				break;
			}
			// Prininting out the ordered list (from lowest sold to highest sold) of desserts.
			System.out.print("AJ's Bar n Grill sold " + dessertList[i] + " ");
			dessertListNames.inorder();
			System.out.print("\n");
		}
	}

	// Bubble Sort
	private static void bubbleSort(int[] list) {
		// Defining Variables.
		int n = list.length;
		int temp;
		// increment i by 1 while i is less than the drinkList length starting at 0
		for (int i = 0; i < n; i++) {
			// increment j by 1 while j is less than n - 1, j starts at 1
			for (int j = 1; j < (n - i); j++) {
				// if the element of drinkList at j is less than the element before it
				if (list[j - 1] > list[j]) {
					// Swap the elements
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}
			}
		}
	}
}
