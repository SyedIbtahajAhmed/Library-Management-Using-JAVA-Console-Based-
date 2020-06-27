import java.util.*;

public class HashNode {
	String key;	//Name Of the Category Of The Book
	String name; //Name Of The Book
	int count;	//How Many Books In The Stock
	int price;	//Price Of The Book If Purchased
	HashNode next;
	
	HashNode(String data_key, String name, int data_count, int data_price){
		this.key = data_key;
		this.name = name;
		this.count = data_count;
		this.price = data_price;
		this.next = null;
	}
}
