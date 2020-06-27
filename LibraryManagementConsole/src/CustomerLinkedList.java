
public class CustomerLinkedList {
	CustomerNode head;
	CustomerLinkedList(){
		this.head = null;
	}
	
	//Displaying Customers
	void display() {
		int count = 1;
		CustomerNode temp = this.head;
		System.out.println("\n||\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t||");
		System.out.println("||\t  SERIAL NUMBER\t\t||\t     CUSTOMER IDs\t\t||\t     CUSTOMER NAMES\t\t\t\t||\t   CUSTOMERS PHONE\t||");
		System.out.println("||\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t||");
		System.out.println("||\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t||");
		while(temp != null) {
			System.out.printf("||\t\t%-16d||\t     %-27s||\t\t%-40s||\t    %-20s||\n", count, temp.customer_id, temp.name, temp.customer_phone);
			temp = temp.next;
			count++;
		}
		System.out.println("||\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t||");
		System.out.println("||\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t||");
	}
	
	//Adding Customer
	String add(String name, String ph) {
		int id = ph.hashCode();
		//If Already Present
		if (this.isPresent(name, id))
			return name + " Is Already Present. Try To Update The Librarian!";
			
		//Adding At Start
		//Making new Node
		CustomerNode new_node = new CustomerNode(name, id, ph);
		if (this.head == null) {
			this.head = new_node;
			return name + " Has Been Added!";
		}
		new_node.next = this.head;
		this.head = new_node;
		return name + " Has Been Added!";
		
	}
	
	//Removing Librarian
	String remove(String name) {
		//Getting The Customer Node
		CustomerNode customer = this.getCustomer(name);
		CustomerNode temporary = this.head;
		CustomerNode temp_prev = null;
		while(temporary != null) {
			//Checking Customer Id
			if (name.equals(temporary.name) && temporary.customer_id == customer.customer_id) {
				break;
			}
			temp_prev = temporary;
			temporary = temporary.next;
		}
		//If name was not found
		if (temporary == null)
			return customer.name + " Was Not Found!";
		//If name was found was only entry in the linked list
		if (temp_prev == null) {
			this.head = temporary.next;
			return customer.name + " Deleted Successfully";
		}else {
			temp_prev.next = temporary.next;
			return customer.name + " Deleted Successfully";
		}
	}
	
	//Checking If Librarian Is Already Present Or Not
	boolean isPresent(String n, int id) {
		CustomerNode temp = this.head;
		while(temp != null) {
			if (temp.name.equals(n) && temp.customer_id == id) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	//Getting The Customer From The Id
	CustomerNode getCustomer(String s) {
		CustomerNode temp = this.head;
		CustomerNode prev = null;
		while(temp != null) {
			if (s.equals(temp.name))
				break;
			prev = temp;
			temp = temp.next;
		}
		//Temp Contain The Customer
		return temp;
	}
	
}
