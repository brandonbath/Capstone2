package co.grandcircus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strListTasks = "List tasks";
		String strAddTask = "Add task";
		String strDeleteTask = "Delete task";
		String strTaskCompleted = "Mark task completed";
		String strQuit = "Quit";
		String userName = "";
		String userTask = "";
		String userDueDate = "";
		// String userComplete = "";
		int userIntSelect = 0;
		String backToMain = "yes";
		int userTaskToComplete = 0;
		boolean userFinished = false;
		List<String> menuOptions = new ArrayList<>();
		menuOptions.add(strListTasks);
		menuOptions.add(strAddTask);
		menuOptions.add(strDeleteTask);
		menuOptions.add(strTaskCompleted);
		menuOptions.add(strQuit);

		LinkedList<Tasks> taskList = new LinkedList<>();
		// List<String> taskArrList = new ArrayList<String>(3);
		do {

			for (int i = 0; i < menuOptions.size(); i++) {
				System.out.println((i + 1) + ". " + menuOptions.get(i));
			}

//while (backToMain == "yes");
			// gets user input to run the task, and runs through validator to confirm they
			// enter a number
			// sets userIntSelect to the # they enter for the selection
			userIntSelect = Validator.getInt(scan, "Please choose a number below to execute the task: \n");
			// Test to confirm userIntSelect assignment is working - use -1 to get the
			// actual index, not the length
			//System.out.println(menuOptions.get(userIntSelect - 1));
			if (userIntSelect == 1) {

				int i = 0;
				for (i = 0; i < taskList.size(); i++) {
				System.out.println((i + 1) + ". " + "\n" + taskList.get(i));}
				System.out.println("Here's the current task list: ");
				//System.out.println(taskList);
				System.out.println();

			}

			// }
			if (userIntSelect == 2) {
				System.out.println("Input team member's name: ");
				userName = scan.nextLine();
				System.out.println("Input task description: ");
				userTask = scan.nextLine();
				System.out.println("Input due date: ");
				userDueDate = scan.nextLine();

				Tasks addNewTask = new Tasks(userName, userTask, userDueDate, userFinished);
				taskList.add(addNewTask);

				backToMain = "yes";
			}

			if (userIntSelect == 3) {
				try {
					int j = 0;
					for (j = 0; j < taskList.size(); j++) {
						System.out.println((j + 1) + ". " + "\n" + taskList.get(j));
					}
					int userDeleteSelect = Validator.getInt(scan, "What task would you like to delete?", 0, 1000);
					System.out.println("Are you sure you want to delete? (Y/N) " + taskList.get(userDeleteSelect - 1));
					String userCont = scan.next();
					if (userCont.equalsIgnoreCase("Y")) {
						taskList.remove(userDeleteSelect - 1);
					} else if (userCont.equalsIgnoreCase("N")) {
						System.out.println("\n Returning to main menu.");
					}
				} catch (Exception e) {
					System.out.println();
					System.out.println("Invalid selection, returning to main menu.");
				}

				System.out.println();

				backToMain = "yes";
			}

			if (userIntSelect == 4) {
				userTaskToComplete = Validator.getInt(scan, "What task do you want to mark complete? ", 0, 1000);
				System.out.println("Are you sure you want to mark this task complete? (Y/N)"
						+ taskList.get(userTaskToComplete - 1));
				String userCont = scan.next();
				if (userCont.equalsIgnoreCase("Y")) {
//switch?
					// use isFinished boolean to change to true
				} else if (userCont.equalsIgnoreCase("N")) {
					System.out.println("\n Returning to main menu.");
				}
			}

			if (userIntSelect == 5) {
				System.out.println("You sure? (Y/N)");
				String userCont = scan.next();
				if (userCont.equalsIgnoreCase("Y")) {
					System.out.println("Byeeeeeee");
					backToMain = "no";
				} else
					backToMain = "yes";
			}

		} while (backToMain.equalsIgnoreCase("yes"));

		scan.close();
		}
}
