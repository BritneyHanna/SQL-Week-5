package Application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Dao.ShoeDao;

public class Menu {
	private ShoeDao shoeDao = new ShoeDao();
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList("Display a shoe", "Add a new Shoe", "Delete Shoe");

	public void start() {

		String selection = "";
		do {
			printMenu();
			selection = scanner.nextLine();

			try {

				if (selection.equals("1")) {
//				displayShoe();
				} else if (selection.equals("2")) {
//				createShoe();
				} else if (selection.equals("3")) {
//				deleteShoe();
				}

			} finally {

			}

			System.out.println("Press Enter to continue");
			scanner.nextLine();

		} while (!selection.equals("-1"));

	}

	private void printMenu() {
		System.out.println("Please Select an Option: \n ___________________________");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + 1 + ")" + options.get(i));

		}
	}

}
