import java.util.*;

public class Map{
	//The Main Array List
	private ArrayList<HashNode> bucketArray = new ArrayList<>();
	//The Capacity Of The Array List
	private int numBuckets;
	//Size Of The Array List
	private int size;
	
	Map(){
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
	void addOrUpdate(String key, String name, int count, int price) {
		//Getting Bucket Index
		int bucketIndex = this.getBucketIndex(key);
		//Getting Head Of The Bucket
		HashNode head = this.bucketArray.get(bucketIndex);
		//If Key Is Already Present
		while(head != null) {
			if (head.key.equals(key) && head.name.equals(name)) {
				head.count = count;
				head.price = price;
				System.out.println("\n\n" + name + " has Been Updated!");
				return;
			}
			head = head.next;
		}
		this.size++;
		//Getting Head Of The Bucket
		head = this.bucketArray.get(bucketIndex);
		HashNode new_node = new HashNode(key, name, count, price);
		new_node.next = head;
		this.bucketArray.set(bucketIndex, new_node);
		System.out.println("\n\n" + name + " Has Been Added Successfully!");
		//If Load Factor Exceeds Then Double The Capacity
		if (((1.0 * this.size) / this.numBuckets) >= 0.7) {
			System.out.println("\n\nHashMap Is Almost Full..Please Wait Updating The Hashmap Size.");
			ArrayList<HashNode> temporary = this.bucketArray;
			this.bucketArray = new ArrayList<>();
			this.numBuckets = 2 * this.numBuckets;
			this.size = 0;
			//Adding Null Value In Whole New Array
			for (int i = 0; i < this.numBuckets; i++) {
				this.bucketArray.add(null);
			}
			//Copying Previous Array
			for (HashNode nodes: temporary) {
				while(!nodes.equals(null)) {
					this.addOrUpdate((String)nodes.key, (String)nodes.name, (int)nodes.count, (int)nodes.price);
					nodes = nodes.next;
				}
			}
			System.out.println("\n\nHashMap Size Updated!");
		}
		return;
	}
	
	//Removing Value
	String remove(String key, String name) {
		//Getting Index Of The Key
		int bucketIndex = this.getBucketIndex(key);
		//Getting Head
		HashNode head = this.bucketArray.get(bucketIndex);
		HashNode prev = null;
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
	
	//Returning Node Or Book
	HashNode getBook(String key, String name) {
		//Getting Bucket Index
		int bucketIndex = this.getBucketIndex(key);
		//Getting Head Of the Bucket
		HashNode head = this.bucketArray.get(bucketIndex);
		//Getting Pointer
		while(!head.equals(null)) {
			if (key.equals(head.key) && name.equals(head.name))
				break;
			head = head.next;
			}
		return head;
	}
	
	
	//Display Function
	void displayMap() {
		System.out.println("\n\n||\tSerial No.\t||\t\tCategories\t\t\t\t||\t\tNames\t\t\t\t\t\t\t||\t\tQuantities\t\t||\t\tPrices\t\t\t||");
		System.out.println("||\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t||");
		System.out.println("||\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t||");
		int serial = 0;
		for (HashNode node: this.bucketArray) {
			if (node != null) {
				while (node != null) {
					serial+=1;
					System.out.printf("||\t    %-12d||\t\t%-40s||\t\t%-56s||\t\t    %-20d||\t\t%-24d||", serial, node.key, node.name, node.count, node.price);
					node = node.next;
					System.out.print("\n");
				}
			}
		}
		System.out.println("||\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t||");
		System.out.println("||\t\t\t||\t\t\t\t\t\t\t||\t\t\t\t\t\t\t\t\t||\t\t\t\t\t||\t\t\t\t\t||\n\n");
	}
	
	//Displaying Information
	void displayBook(String key, String name) {
		//Getting Bucket Index
		int bucketIndex = this.getBucketIndex(key);
		//Getting Head Of the Bucket
		HashNode head = this.bucketArray.get(bucketIndex);
		//Getting Pointer
		while(!head.equals(null)) {
			if (key.equals(head.key) && name.equals(head.name))
				break;
			head = head.next;
		}
		//Now Head Contain The Book To Display Information
		System.out.println("\n\nInformation Of " + head.name);
		System.out.println("\nCategory Of The Book:\t\t\t\t\t" + head.key);
		System.out.println("Name Of The Book:\t\t\t\t\t" + head.name);
		System.out.println("Quantity Of The Book In the Stock:\t\t\t" + head.count);
		System.out.println("Price Of The Book:\t\t\t\t\t" + head.price);
		return;
	}
	
	
}
