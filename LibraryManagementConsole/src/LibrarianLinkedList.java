import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class LibrarianLinkedList {
	LibrarianNode head;
	LibrarianLinkedList(){
		this.head = null;
	}
	
	//Displaying Librarians
	void displayLibrarians() {
		int count = 1;
		LibrarianNode temp = this.head;
		System.out.println("\n||\t\t\t\t||\t\t\t\t\t\t\t\t||\t\t\t\t||");
		System.out.println("||\t  SERIAL NUMBER\t\t||\t     LIBRARIAN NAMES\t\t\t\t\t||\t   LIBRARIAN AGES\t||");
		System.out.println("||\t\t\t\t||\t\t\t\t\t\t\t\t||\t\t\t\t||");
		System.out.println("||\t\t\t\t||\t\t\t\t\t\t\t\t||\t\t\t\t||");
		while(temp != null) {
			System.out.printf("||\t\t%-16d||\t     %-51s||\t\t%-16d||\n", count, temp.name, temp.age);
			temp = temp.next;
			count++;
		}
		System.out.println("||\t\t\t\t||\t\t\t\t\t\t\t\t||\t\t\t\t||");
		System.out.println("||\t\t\t\t||\t\t\t\t\t\t\t\t||\t\t\t\t||");
	}
	
	//Printing The Information Of A Librarian
	void displayLibrarianInfo(String name) {
		//Checking If Librarian is Present or not
		LibrarianNode temporary = this.head;
		while (temporary != null) {
			if (temporary.name.equals(name))
				break;
			temporary = temporary.next;
		}
		//If Librarian Not Found
		if (temporary == null) {
			System.out.println(name + " Not Found!");
			}
		//If Librarian Found
		//temporary contain the librarian
		else {
			System.out.println("\nName Of The Librarian:\t\t\t" + temporary.name);
			System.out.println("Age Of Librarian:\t\t\t" + temporary.age);
			System.out.println("Username Of Librarian:\t\t\t" + temporary.username);
			System.out.println("Password Of Librarian:\t\t\t" + temporary.password);
			System.out.println("Contract Start Date And Time:\t\t" + temporary.contract_start);
			System.out.println("Contract End Date And Time:\t\t" + temporary.contract_end);
		}
	}
	
	//Adding Librarian
	String add(String name, int age, String un, String pas, String con_start, String con_end) {
		//If Already Present
		if (this.isPresent(name))
			return name + " Is Already Present. Try To Update The Librarian!";
		
		//Adding At Start
		//Making new Node
		LibrarianNode new_node = new LibrarianNode(name, age, un, pas, con_start, con_end);
		if (this.head == null) {
			this.head = new_node;
			return name + " Has Been Added!";
		}
		new_node.next = this.head;
		this.head = new_node;
		return name + " Has Been Added!";
	
	}
	
	//Removing Librarian
	String remove(String data) {
		LibrarianNode temporary = this.head;
		LibrarianNode temp_prev = null;
		while(temporary != null) {
			if (temporary.name.equals(data)) {
				break;
			}
			temp_prev = temporary;
			temporary = temporary.next;
		}
		//If name was not found
		if (temporary == null)
			return data + " Was Not Found!";
		//If name was found was only entry in the linked list
		if (temp_prev == null) {
			this.head = temporary.next;
			return data + " Deleted Successfully";
		}else {
			temp_prev.next = temporary.next;
			return data + " Deleted Successfully";
		}
	}
	
	//Checking If Librarian Is Already Present Or Not
	boolean isPresent(String n) {
		LibrarianNode temp = this.head;
		while(temp != null) {
			if (temp.name.equals(n)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	//String To Date
		Date stringToDate(String s) {
			Date result = null;
		    try{
		        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		        result  = dateFormat.parse(s);
		    }

		    catch(ParseException e){
		        e.printStackTrace();

		    }
		    return result;
		}
	
	//Updating A Librarian
	void update(String name_to_up) {
		//IF Librarian is present
		if(this.isPresent(name_to_up)) {
			LibrarianNode temp = this.head;
			while(temp != null) {
				//When Node Is Found To Update
				if (temp.name.equals(name_to_up)) {
					//Input object
					Scanner input = new Scanner(System.in);
					//Taking Age Input
					System.out.print("Enter Age To Update:\t\t\t\t\t\t\t\t");
					temp.age = input.nextInt();
					//Taking User name Input
					input.nextLine();
					System.out.print("Enter Username To Update:\t\t\t\t\t\t\t");
					temp.username = input.nextLine();
					//Taking Password Input
					System.out.print("Enter Password To Update:\t\t\t\t\t\t\t");
					temp.password = input.nextLine();
					//Taking Start Date
					System.out.print("Enter The Contract Starting Date And Time (dd-MM-yyyy HH:mm:ss) to Update:\t");
					String con_start = input.nextLine();
					temp.contract_start = this.stringToDate(con_start);
					//Taking End Date
					System.out.print("Enter The Contract Ending Date And Time (dd-MM-yyyy HH:mm:ss) to Update:\t");
					String con_end = input.nextLine();
					temp.contract_end = this.stringToDate(con_end);
					System.out.println("\n" + name_to_up + " Has Been Updated Successfully!");
					temp = temp.next;
				}else {
					temp = temp.next;
				}
			}
		}else {
			System.out.println("\n" + name_to_up + " Is Not In The Librarians List. Try To Add New!");
		}
	}
	
	//Checking user name and password if matches with one of the present
	boolean checkLibrarian(String un, String pass) {
		//Getting Head
		LibrarianNode temp = this.head;
		//Traversing
		while(temp != null) {
			if (temp.username.equals(un) && temp.password.equals(pass)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	//Getting name of the Librarian From User Name For Printing After Login
	String return_name_username(String un) {
		//Getting Head
		LibrarianNode temp = this.head;
		//Traversing
		while(temp != null) {
			if (temp.username.equals(un)) {
				return temp.name;
			}
			temp = temp.next;
		}
		return null;
	}
}
