// USERNAME OF ADMINISTRATOR	:	admin
// PASSWORD OF ADMINISTRATOR	:	admin



import java.util.*;

import javafx.scene.input.InputEvent;
public class Program {
	//Making Object Of LibrarianLinkedList
	//Librarian Information For The Administrator
	static LibrarianLinkedList librarian_list = new LibrarianLinkedList();
	//Librarian Management (Stocks And Everything)
	static Map librarian_map = new Map();
	//Issued Books Record
	static BooksMap books_record_map = new BooksMap();
	//Returned Books Record
	static BooksMap returned_books_map = new BooksMap();
	//Customers Record
	static CustomerLinkedList customer_record = new CustomerLinkedList();
	
	public static void main(String[] args) {
		//Taking Input From The User For Interaction
		Scanner input = new Scanner(System.in);
		System.out.print("Press Any Key To Start Program:\t");
		char interact = input.next().charAt(0);
		while (interact != 'q' && interact != 'Q') {
			//Printing User name And Password
			System.out.println("\nDefault Username For Administrator Login:\t\tadmin");
			System.out.println("Default Password For Administrator Login:\t\tadmin");
			
			//Taking User Input To Check If It Is Administrator Or Librarian
			System.out.print("\nPress 1 For Admin Login\nPress 2 For Librarian Login\nPress 3 To Quit The Login Block:\t");
			int ad_or_lib = input.nextInt();
			
			//Login Block While
			while(ad_or_lib != 3) {
				//If Administrator Logs In
				if (ad_or_lib == 1) {
					try {
						
						//Checking Which Administrator Wants To Log In
						//Taking User Name
						System.out.print("\n\nEnter Your UserName:\t");
						String admin_uname = input.next();
						//Taking Password
						System.out.print("\nEnter Your Password:\t");
						String admin_password = input.next();
						
						//User name of Administrator
						String admin_name_display = "Administrator";
						String admin_username_setting = "admin";
						String admin_password_setting = "admin";
						
						
						//Checking If User Name And Passwords Are Matching
						if(admin_uname.equals(admin_username_setting) && admin_password.equals(admin_password_setting)) {
							System.out.println("\n\n|********|\tLOGGED IN SUCCESSFULLY!" + "\t\t\t\t\t\t|********|");
							System.out.println("|********|\tWELCOME " + admin_name_display + "\t\t\t\t\t\t|********|");
							System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
							System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
							//Taking Input From Administrator
							System.out.println("|********|\tPress 1 To Display The Librarians\t\t\t\t|********|");
							System.out.println("|********|\tPress 2 To Add A Librarian\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 3 To Update A Librarian\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 4 To Remove A Librarian\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 5 To Display A Librarian Information\t\t\t|********|");
							System.out.println("|********|\tPress 6 To Display Stock\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 7 To Display Issued Books Record\t\t\t\t|********|");
							System.out.println("|********|\tPress 8 To Display Returned Books Record\t\t\t|********|");
							System.out.println("|********|\tPress 9 To Quit The Admin Block\t\t\t\t\t|********|");
							System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
							System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
							System.out.print("\t\tWaiting For The Input:\t\t");
							int admin_input = input.nextInt();
							//Checking Input Of The Administrator
							while(admin_input != 9) {
								//If Administrator wants to see the librarians
								if (admin_input == 1) {
									try {
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tSHOWING LIBRARIANS LIST\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										librarian_list.displayLibrarians();
										
										//Again Taking Input From Administrator
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 1 To Display The Librarians\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Update A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Remove A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display A Librarian Information\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Display Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Issued Books Record\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Display Returned Books Record\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Quit The Admin Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										admin_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Displaying Librarians!");
										break;
									}
								}//If Administrator chooses 1 (IF BLock Ends Here)
								
								//If Administrator want to add a librarian
								if (admin_input == 2) {
									try {
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tADDING A LIBRARIRAN...IN PROCESS\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Name
										input.nextLine();
										System.out.print("\n\nEnter The Name Of The Librarian:\t\t\t\t\t");
										String librarian_name = input.nextLine();
										//Taking Age
										System.out.print("Enter The Age of The Librarian:\t\t\t\t\t\t");
										int librarian_age = input.nextInt();
										//Taking User name Input
										input.nextLine();
										System.out.print("Enter The UserName Of The Librarian:\t\t\t\t\t");
										String librarian_username = input.nextLine();
										//Taking Password Input
										System.out.print("Enter The Password Of The Librarian:\t\t\t\t\t");
										String librarian_password = input.nextLine();
										//Taking Starting Date
										System.out.print("Enter The Contract Starting Date And Time (dd-MM-yyyy HH:mm:ss):\t");
										String librarian_con_start = input.nextLine();
										//Taking Ending Date
										System.out.print("Enter The Contract Ending Date And Time (dd-MM-yyyy HH:mm:ss):\t\t");
										String librarian_con_end = input.nextLine();
										//Adding The Librarian In the List
										System.out.println("\n" + librarian_list.add(librarian_name, librarian_age, librarian_username, librarian_password, librarian_con_start, librarian_con_end));
										
										//Again Taking Input From Administrator
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 1 To Display The Librarians\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Update A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Remove A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display A Librarian Information\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Display Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Issued Books Record\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Display Returned Books Record\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Quit The Admin Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										admin_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Adding Librarian!");
										break;
									}
								}//If Administrator choose 2 (IF Block Ends Here)
								
								
								
								//If Administrator wants to update a Librarian
								if (admin_input == 3) {
									try {
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tUPDATING A LIBRARIRAN...IN PROCESS\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Name
										input.nextLine();
										System.out.print("\n\nEnter The Name Of The Librarian To Update:\t\t\t\t\t");
										String librarian_name = input.nextLine();
										//Passing Name To The Method
										librarian_list.update(librarian_name);
										
										
										//Again Taking Input From Administrator
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 1 To Display The Librarians\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Update A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Remove A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display A Librarian Information\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Display Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Issued Books Record\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Display Returned Books Record\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Quit The Admin Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										admin_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Updating Librarian");
										break;
									}
								}//If Administrator choose 3 (IF Block Ends Here)
								
								
								
								//If Administrator want to remove a librarian
								if (admin_input == 4) {
									try {
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tREMOVING A LIBRARIRAN...IN PROCESS\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Name
										input.nextLine();
										System.out.print("\n\nEnter The Name Of The Librarian:\t\t\t\t\t");
										String librarian_name = input.nextLine();
										
										//Passing Name To The Linked List
										System.out.println("\n" + librarian_list.remove(librarian_name));
										
										//Again Taking Input From Administrator
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 1 To Display The Librarians\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Update A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Remove A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display A Librarian Information\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Display Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Issued Books Record\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Display Returned Books Record\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Quit The Admin Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										admin_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Removing A Librarian!");
										break;
									}
								}//If Administrator choose 4 (IF Block Ends Here)
								
								//If Administrator want to See Information Of A Librarian
								if (admin_input == 5) {
									try {
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tDISPLAYING A LIBRARIRAN...IN PROCESS\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Name
										input.nextLine();
										System.out.print("\n\nEnter The Name Of The Librarian:\t\t\t\t\t");
										String librarian_name = input.nextLine();
										
										//Passing name to the method
										librarian_list.displayLibrarianInfo(librarian_name);
										
										//Again Taking Input From Administrator
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 1 To Display The Librarians\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Update A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Remove A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display A Librarian Information\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Display Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Issued Books Record\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Display Returned Books Record\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Quit The Admin Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										admin_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("n\nProblem Occurred In Displaying Information Of Librarian!");
										break;
									}
								}//If Administrator choose 5 (IF Block Ends Here)
								
								//If Administrator Wants To See Stock
								if (admin_input == 6) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tDISPLAYING BOOKS STOCK\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										librarian_map.displayMap();
										
										//Again Taking Input From Administrator
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 1 To Display The Librarians\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Update A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Remove A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display A Librarian Information\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Display Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Issued Books Record\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Display Returned Books Record\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Quit The Admin Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										admin_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("n\nProblem Occurred In Displaying Stock In Administrator Block!");
										break;
									}
								}//If Administrator Chooses 6 (If Block Ends Here)
								
								//If Administrator Wants To See Issued Books Record
								if (admin_input == 7) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tDISPLAYING ISSUED BOOKS FROM STOCK\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										books_record_map.displayBooks();
										
										//Again Taking Input From Administrator
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 1 To Display The Librarians\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Update A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Remove A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display A Librarian Information\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Display Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Issued Books Record\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Display Returned Books Record\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Quit The Admin Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										admin_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("n\nProblem Occurred In Displaying Issued Books Record In Administrator Block!");
										break;
									}
								}//If Administrator Chooses 7 (If Block Ends Here)
								
								//If Administrator Wants To See Returned Books Record
								if (admin_input == 8) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tDISPLAYING RETURNED BOOKS STOCK\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										returned_books_map.displayBooks();
										
										//Again Taking Input From Administrator
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 1 To Display The Librarians\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Update A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Remove A Librarian\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display A Librarian Information\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Display Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Issued Books Record\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Display Returned Books Record\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Quit The Admin Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										admin_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("n\nProblem Occurred In Displaying Returned Books Record In Administrator Block!");
										break;
									}
								}//If Administrator Chooses 8 (If Block Ends Here)
								
								
								
							}//While Block Ends Here For Administrator Input
							System.out.println("\nNow Out Of The Administrator Block. Thanks For Logging In!");
						}else {
							System.out.println("\nLogin Failed! Username or Password Was Not Correct");
						}
						//Again Taking User Input To Check If It Is Administrator Or Librarian
						System.out.print("\nPress 1 For Admin Login Again\nPress 2 For Librarian Login\nPress 3 To Quit The Login Block:\t");
						ad_or_lib = input.nextInt();
					}catch (Exception e){
						System.out.println("\n\nProgram Failed In Administrator Block.");
						break;
					}
				}//If Block Ends Here If User Choose 1 (Administrator for Login)
				
				//If Librarian Logs In
				if (ad_or_lib == 2) {
					try {
						//Checking which Librarian wants to login
						//Taking user name Of Librarian And comparing with the stored librarians in the linked list
						System.out.print("\n\nEnter Your Username:\t\t");
						String librarian_username = input.next();
						
						//Taking password Of Librarian And comparing with the stored librarians in the linked list
						System.out.print("\nEnter Your Password:\t\t");
						String librarian_password = input.next();
						
						//Now Checking And Logging in Librarian
						if (librarian_list.checkLibrarian(librarian_username, librarian_password)) {
							System.out.println("\n\n|********|\tLOGGED IN SUCCESSFULLY!" + "\t\t\t\t\t\t\t|********|");
							System.out.println("|********|\tWELCOME " + librarian_list.return_name_username(librarian_username) + "\t\t\t\t\t\t\t|********|");
							System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
							System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
							//Taking Input From Administrator
							System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
							System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
							System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
							System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
							System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
							System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
							System.out.print("\t\tWaiting For The Input:\t\t");
							int librarian_input = input.nextInt();
							//Checking The Input Of The Librarian
							while (librarian_input != 12) {
								//If Librarian  Chooses To Display The Stock Of The Library
								if (librarian_input == 1) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tDISPLAYING BOOKS STOCK\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										librarian_map.displayMap();
										
										System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
										//Again Taking Input From Administrator
										System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										librarian_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Displaying Book Record (Stock)!");
										break;
									}
								}//If Block If Librarian Chooses 1 (Display Books) Ends Here
								
								//If Librarian Chooses To Add A Book In the Stock Of The Library
								if (librarian_input == 2) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tADDING A BOOK IN STOCK\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Input For Category Of The Book
										input.nextLine();
										System.out.print("\n\nEnter The Category Of The Book To Add/Update:\t\t\t\t\t");
										String book_category = input.nextLine();
										//Taking Input For Name Of The Book
										System.out.print("Enter The Name Of The Book To Add/Update:\t\t\t\t\t");
										String book_name = input.nextLine();
										//Taking Input For Quantity Of The Book To Be Added In The Stock
										System.out.print("Enter The Quantity Of The Book To Add/Uppdate:\t\t\t\t\t");
										int book_quantity = input.nextInt();
										//Taking Input For The Price Of the Book
										System.out.print("Enter the Price Of The Book To Add/Update:\t\t\t\t\t");
										int book_price = input.nextInt();
										//passing The Values To The Method
										librarian_map.addOrUpdate(book_category, book_name, book_quantity, book_price);
										
										System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
										//Again Taking Input From Administrator
										System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										librarian_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Adding A Book In The Stock!");
										break;
									}
								}//If BLock If Librarian Chooses 2 (Add Book) Ends Here
								
								//If Librarian Chooses To Remove A Book
								if (librarian_input == 3) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tREMOVING A BOOK IN STOCK\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Input For Category Of The Book
										input.nextLine();
										System.out.print("\n\nEnter The Category Of The Book To Remove:\t\t\t\t\t");
										String book_category = input.nextLine();
										//Taking Input For Name Of The Book
										System.out.print("Enter The Name Of The Book To Remove:\t\t\t\t\t");
										String book_name = input.nextLine();
										//Passing the values to the Method
										System.out.println("\n" + librarian_map.remove(book_category, book_name));
										
										System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
										//Again Taking Input From Administrator
										System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										librarian_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Removing A Book From The Stock!");
									}
								}//If Block If Librarian Chooses 3 (remove Book) Ends Here
								
								
								//If Librarian Chooses To Display Information Of A Book
								if (librarian_input == 4) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tDISPLAYING INFORMATION OF A BOOK IN STOCK\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Input For Category Of The Book
										input.nextLine();
										System.out.print("\n\nEnter The Category Of The Book To See Information:\t\t\t\t");
										String book_category = input.nextLine();
										//Taking Input For Name Of The Book
										System.out.print("Enter The Name Of The Book To See Information:\t\t\t\t\t");
										String book_name = input.nextLine();
										
										//Passing Values To The Method
										librarian_map.displayBook(book_category, book_name);
										
										System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
										//Again Taking Input From Administrator
										System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										librarian_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Displaying Information Of A Book!");
									}
								}//If Block If Librarian Chooses 4 (Display Info) Ends Here
								
								//If Librarian Chooses To Display Issued Books From The Stock
								if (librarian_input == 5) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tDISPLAYING ISSUED BOOKS FROM STOCK\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										books_record_map.displayBooks();
										
										System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
										//Again Taking Input From Administrator
										System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										librarian_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Displaying Issued Books From The Stock!");
									}
								}//If Block If Librarian Chooses 5 (Display Issued Books) Ends Here
								
								//If Librarian Chooses To Issue A Book From The Store To A Customer
								if (librarian_input == 6) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tISSUING BOOKS FROM STOCK\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Input For Category Of The Book
										input.nextLine();
										System.out.print("\n\nEnter The Category Of The Book To Issue:\t\t\t\t\t");
										String book_category = input.nextLine();
										//Taking Customer Name
										System.out.print("Enter The Customer Name For The Book:\t\t\t\t\t\t");
										String customer_name = input.nextLine();
										//Taking Input For the Id Of The Customer
										System.out.print("Enter The Customer Id For The Book:\t\t\t\t\t\t");
										int customer_id = input.nextInt();
										
										
										//Checking If Customer Is In The Record
										if (customer_record.isPresent(customer_name, customer_id)) {
											input.nextLine();
											//Taking Input For Name Of The Book
											System.out.print("Enter The Name Of The Book To Issue:\t\t\t\t\t\t");
											String book_name = input.nextLine();
											//Taking Input For Quantity Of The Book To Be Added In The Stock
											System.out.print("Enter The Quantity Of The Book To Issue:\t\t\t\t\t");
											int book_quantity = input.nextInt();
											//Taking Input For Issue Date
											input.nextLine();
											System.out.print("Enter The Issue Date Of The Book:\t\t\t\t\t\t");
											String issue_date = input.nextLine();
											//Taking Input For Return Date
											System.out.print("Enter The Returning Date Of The Book:\t\t\t\t\t\t");
											String return_date = input.nextLine();
											//Adding Books In The Issued Books Map
											books_record_map.add(book_category, customer_name, book_name, book_quantity, librarian_map.getBook(book_category, book_name).price, books_record_map.stringToDate(issue_date), books_record_map.stringToDate(return_date));
											//Now Updating the Books Stock
											librarian_map.addOrUpdate(book_category, book_name, (librarian_map.getBook(book_category, book_name)).count-(books_record_map.getBook(book_category, book_name).count), librarian_map.getBook(book_category, book_name).price);
											
											System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
											//Again Taking Input From Administrator
											System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
											System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
											System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
											System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.print("\t\tWaiting For The Input:\t\t");
											librarian_input = input.nextInt();
										}else {
											System.out.println("\n\nCustomer Not Found! Please Register or Add Customer.");
											System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
											//Again Taking Input From Administrator
											System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
											System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
											System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
											System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.print("\t\tWaiting For The Input:\t\t");
											librarian_input = input.nextInt();
										}
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Issuing Book!");
										break;
									}
								}//If Block If Librarian Chooses 6 (Issue Book) Ends Here
								
								
								//If Librarian Chooses To Display Returned Books
								if (librarian_input == 7) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tDISPLAYING RETURNED BOOKS STOCK\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										returned_books_map.displayBooks();
										
										
										System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
										//Again Taking Input From Administrator
										System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										librarian_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Displaying Returned Books!");
										break;
									}
								}//If Block If Librarian Chooses 7 (Display Returned) Ends Here
								
								//If Librarian Chooses To Return A Book From A Customer
								if (librarian_input == 8) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tRETURNING BOOKS FROM STOCK\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Input For Category Of The Book
										input.nextLine();
										System.out.print("\n\nEnter The Category Of The Book To Return:\t\t\t\t\t");
										String book_category = input.nextLine();
										//Taking Customer Name
										System.out.print("Enter The Customer Name For The Return:\t\t\t\t\t\t");
										String customer_name = input.nextLine();
										//Taking Input For the Id Of The Customer
										System.out.print("Enter The Customer Id For The Book:\t\t\t\t\t\t");
										int customer_id = input.nextInt();
										
										//Checking If the Customer Is In the Record
										if (customer_record.isPresent(customer_name, customer_id)) {
											input.nextLine();
											//Taking Input For Name Of The Book
											System.out.print("Enter The Name Of The Book To Return:\t\t\t\t\t\t");
											String book_name = input.nextLine();
											//Taking Input For Quantity Of The Book To Be Added In The Stock
											System.out.print("Enter The Quantity Of The Book To Return:\t\t\t\t\t");
											int book_quantity = input.nextInt();
											//checking if the returned book is included in the issued books and quantity and everything
											if (books_record_map.getBook(book_category, book_name) != null) {
												//Checking If The Returned Books Quantity Is Same As The Issued One , Book Name, And Customer Name As Well From Issued Books
												if (book_name.equals(books_record_map.getBook(book_category, book_name).name) && books_record_map.getBook(book_category, book_name).count == book_quantity && customer_name.equals(books_record_map.getBook(book_category, book_name).customer_name)) {
													//Node Of The Book that Is Returned
													BooksHashNode book_from_issued = books_record_map.getBook(book_category, book_name);
													//Removing Book From The Issue Record
													System.out.println(books_record_map.remove(book_category, book_name));
													//Updating The Books Record In Stock
													librarian_map.addOrUpdate(book_category, book_name, (librarian_map.getBook(book_category, book_name).count) + book_from_issued.count, librarian_map.getBook(book_category, book_name).price);
													//Adding The Returned Book In The Returned Stock
													returned_books_map.add(book_category, customer_name, book_name, book_quantity, librarian_map.getBook(book_category, book_name).price, book_from_issued.issue_date, book_from_issued.return_date);
													System.out.println("Book Have Been Returned Successfully!");
												}else {
													System.out.println("The Returned Quantity Is Not The Same As Issued.");
												}
												System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
												System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
												System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
												//Again Taking Input From Administrator
												System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
												System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
												System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
												System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
												System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
												System.out.print("\t\tWaiting For The Input:\t\t");
												librarian_input = input.nextInt();
											}//If Returned Book Is In The Issued Books Record Or Not If Block Ends Here
											else {
												System.out.println("\n\nThe Returned Book Is Not In The Issued Books Record!");
												System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
												System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
												System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
												//Again Taking Input From Administrator
												System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
												System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
												System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
												System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
												System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
												System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
												System.out.print("\t\tWaiting For The Input:\t\t");
												librarian_input = input.nextInt();
											}
										}else {
											System.out.println("\n\nCustomer Is Not In The Record! Please Add Customer.");
											System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
											//Again Taking Input From Administrator
											System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
											System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
											System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
											System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
											System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
											System.out.print("\t\tWaiting For The Input:\t\t");
											librarian_input = input.nextInt();
										}
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Returning Book!");
										break;
									}
								}//If Block If Librarian Chooses 8 (Return Book) Ends Here
								
								//If Librarian Chooses To Display Customers
								if (librarian_input == 9) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tDISPLAYING CUSTOMERS\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										customer_record.display();
										
										System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
										//Again Taking Input From Administrator
										System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										librarian_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Displaying Customers!");
										break;
									}
								}//If Block If Librarian Chooses 9 (Display Customers) Ends Here
								
								
								//If Librarian Chooses To Add A Customer
								if (librarian_input == 10) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tADDING CUSTOMER....\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Customer Name
										input.nextLine();
										System.out.println("\n\nEnter The Name Of The Customer:\t\t\t\t");
										String customer_name = input.nextLine();
										//Taking Customer Phone
										System.out.println("Enter The Phone Number Of The Customer:\t\t\t");
										String customer_phone = input.nextLine();
										//Passing Values To The Method
										System.out.println(customer_record.add(customer_name, customer_phone));
										
										System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
										//Again Taking Input From Administrator
										System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										librarian_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Adding A Customer!");
										break;
									}
								}//If Block If Librarian chooses 10 (Add Customer) Ends Here
								
								
								//If Librarian Chooses To Remove The Customer
								if (librarian_input == 11) {
									try {
										System.out.println("\n\n|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tREMOVING CUSTOMER....\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t|********|");
										//Taking Customer Name
										input.nextLine();
										System.out.println("\n\nEnter The Name Of The Customer:\t\t\t\t");
										String customer_name = input.nextLine();
										//Passing Value To The Method
										System.out.println(customer_record.remove(customer_name));
										
										System.out.println("\n|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tAgain Taking Input\t\t\t\t\t\t\t|********|");
										//Again Taking Input From Administrator
										System.out.println("|********|\tPress 1 To Display All The Books In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 2 To Add Or Update A Book In The Stock\t\t\t\t|********|");
										System.out.println("|********|\tPress 3 To Remove A Book From The Stock\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 4 To Display A Book Information\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 5 To Display Issued Books\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 6 To Issue A Book\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 7 To Display Returned Books\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 8 To Return A Book\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 9 To Display Customers\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 10 To Add A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 11 To Remove A Customer\t\t\t\t\t\t|********|");
										System.out.println("|********|\tPress 12 To Quit The Librarian Block\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.println("|********|\t\t\t\t\t\t\t\t\t\t|********|");
										System.out.print("\t\tWaiting For The Input:\t\t");
										librarian_input = input.nextInt();
									}catch (Exception e) {
										System.out.println("\n\nProblem Occurred In Removing A Customer!");
										break;
									}
								}//If Block If Librarian Chooses 11 (Remove Customer) Ends Here
								
								
								
							}//while Block Ends Here Of Librarian Block
							//Librarian Block Ends Here
							System.out.println("\nNow Out Of The Librarian Block. Thanks For Logging In!");
						}//Librarian User name And Password Checking If Blocks ENDS Here
						else {
							System.out.println("\n\nInvalid Username or Password! Please Try To Login Again.");
						}
						//Again Taking User Input To Check If It Is Administrator Or Librarian
						System.out.print("\nPress 1 For Admin Login\nPress 2 For Librarian Login Again\nPress 3 To Quit The Login Block:\t");
						ad_or_lib = input.nextInt();
					}catch (Exception e) {
						System.out.println("Program Failed In Librarian Block.");
						break;
					}
				}//If Block Ends Here If User Choose 2 (Librarian for Login)
			}//Login While Block Ends Here
			
			
			System.out.println("\n\nNow Out Of The Login Block.");
			
			//Again Taking User Input To Check If User Wants To Restart The Program
			System.out.print("\nEnter Any Key To Start The Program Again or Press q To Quit:\t");
			interact = input.next().charAt(0);
		}
		System.out.println("\nThanks For Using Our Software!");
	}
}
