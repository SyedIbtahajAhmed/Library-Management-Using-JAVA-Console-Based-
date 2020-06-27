import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BooksMap {
	//The Main Array List
		private ArrayList<BooksHashNode> bucketArray = new ArrayList<>();
		//The Capacity Of The Array List
		private int numBuckets;
		//Size Of The Array List
		private int size;
		
		BooksMap(){
			this.bucketArray = new ArrayList<>();
			this.numBuckets = 20;
			this.size = 0;
			//Setting Null Value In Whole Array
			for (int i = 0; i < this.numBuckets; i++)
				this.bucketArray.add(null);
		}
		
		//Getting The Bucket Index
		private int getBucketIndex(String key) {
			int hashcode = key.hashCode();
			int index = hashcode % this.numBuckets;
			return index;
		}
		
		//Adding Hash Node
		String add(String key, String customer, String name, int count, int price, Date issue, Date ret) {
			//Getting Bucket Index
			int bucketIndex = this.getBucketIndex(key);
			//Getting Head Of The Bucket
			BooksHashNode head = this.bucketArray.get(bucketIndex);
			//If Key Is Already Present
			while(head != null) {
				if (head.key.equals(key) && head.name.equals(name)) {
					head.customer_name = customer;
					head.count = count;
					head.price = price;
					head.issue_date = issue;
					head.return_date = ret;
					return "\n\n" + name + " has Been Updated!";
				}
				head = head.next;
			}
			this.size++;
			//Getting Head Of The Bucket
			head = this.bucketArray.get(bucketIndex);
			BooksHashNode new_node = new BooksHashNode(key, customer, name, count, price, issue, ret);
			new_node.next = head;
			this.bucketArray.set(bucketIndex, new_node);
			//If Load Factor Exceeds Then Double The Capacity
			if (((1.0 * this.size) / this.numBuckets) >= 0.7) {
				System.out.println("\n\nHashMap Is Almost Full..Please Wait Updating The Hashmap Size.");
				ArrayList<BooksHashNode> temporary = this.bucketArray;
				this.bucketArray = new ArrayList<>();
				this.numBuckets = 2 * this.numBuckets;
				this.size = 0;
				//Adding Null Value In Whole New Array
				for (int i = 0; i < this.numBuckets; i++) {
					this.bucketArray.add(null);
				}
				//Copying Previous Array
				for (BooksHashNode nodes: temporary) {
					while(!nodes.equals(null)) {
						this.add((String)nodes.key, (String)nodes.customer_name, (String)nodes.name, (int)nodes.count, (int)nodes.price, (Date)nodes.issue_date, (Date)nodes.return_date);
						nodes = nodes.next;
					}
				}
				return "\n\nHashMap Size Updated!";
			}else {
				return "\n\n" + name + " Has Been Issued Successfully!";
			}
			
		}
		
		//Removing Value
		String remove(String key, String name) {
			//Getting Index Of The Key
			int bucketIndex = this.getBucketIndex(key);
			//Getting Head
			BooksHashNode head = this.bucketArray.get(bucketIndex);
			BooksHashNode prev = null;
			//Getting The Key pointer
			while (!head.equals(null)) {
				if (key.equals(head.key) && name.equals(head.name)) {
					break;
				}
				prev = head;
				head = head.next;
			}
			//If Key Was Not Present
			if (head.equals(null)) {
				return "Book Was Not Found!";
			}
			this.size--;
			//Removing Key
			if (prev != null) {
				String temp = (String) head.name;
				prev.next = head.next;
				return temp + " Has Been Removed From The Stock";
			}else {
				try {
				String temp = (String) head.name;
				this.bucketArray.set(bucketIndex, head.next);
				return temp + " Has Been Removed From The Stock";
				}catch (Exception e) {
					return "Problem In Removing!";
				}
			}
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
		
		//Display Function
		void displayBooks() {
			
			System.out.println("\n\n||\tSerial No.\t||\t\tCategories\t\t\t\t||\t\tCustomer Names\t\t\t\t||\t\tBook Names\t\t\t\t||\t\tQuantities\t\t||\t\tPrices\t\t\t||\t\tIssue Dates\t\t\t\t||\t\tReturn Dates\t\t\t\t||");
			System.out.println("||\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||");
			System.out.println("||\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||");
			int serial = 0;
			for (BooksHashNode node: this.bucketArray) {
				if (node != null) {
					while (node != null) {
						serial+=1;
						System.out.printf("||\t    %-12d||\t\t%-40s||\t\t%-40s||\t\t%-40s||\t\t    %-20d||\t\t%-24d||\t\t%-40s||\t\t%-40s||", serial, node.key, node.customer_name, node.name, node.count, node.price, node.issue_date, node.return_date);
						node = node.next;
						System.out.print("\n");
					}
				}
			}
			System.out.println("||\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||");
			System.out.println("||\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t||\n\n");
		}
		
		//Displaying Information
		void displayBookInfo(String key, String name) {
			//Getting Bucket Index
			int bucketIndex = this.getBucketIndex(key);
			//Getting Head Of the Bucket
			BooksHashNode head = this.bucketArray.get(bucketIndex);
			//Getting Pointer
			while(!head.equals(null)) {
				if (key.equals(head.key) && name.equals(head.name))
					break;
				head = head.next;
			}
			//Now Head Contain The Book To Display Information
			System.out.println("\n\nInformation Of " + head.name);
			System.out.println("\nCategory Of The Book:\t\t\t\t\t" + head.key);
			System.out.println("Customer Name Of The Book:\t\t\t\t" + head.customer_name);
			System.out.println("Name Of The Book:\t\t\t\t\t" + head.name);
			System.out.println("Quantity Of The Book Issued:\t\t\t\t" + head.count);
			System.out.println("Price Of The Book:\t\t\t\t\t" + head.price);
			System.out.println("Issued Date Of The Book:\t\t\t\t" + head.issue_date);
			System.out.println("Returning Date Of The Book:\t\t\t\t" + head.return_date);
			return;
		}
		
		
		//Returning Node Or Book
		BooksHashNode getBook(String key, String name) {
			//Getting Bucket Index
			int bucketIndex = this.getBucketIndex(key);
			//Getting Head Of the Bucket
			BooksHashNode head = this.bucketArray.get(bucketIndex);
			//Getting Pointer
			while(!head.equals(null)) {
				if (key.equals(head.key) && name.equals(head.name))
					break;
				head = head.next;
				}
			return head;
		}
		
}
