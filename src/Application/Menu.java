package Application;

import java.sql.SQLException;
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

			if (selection.equals("1")) {
//				displayShoe();}
			} else if (selection.equals("2")) {
				try {
					createShoe();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			} else if (selection.equals("3")) {
//				deleteShoe();
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

	private void createShoe() throws SQLException {
		System.out.print("Enter shoe ID");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter shoe Name ");
		String shoename = scanner.nextLine();
		shoeDao.createNewShoe(id, shoename);

	}

}
