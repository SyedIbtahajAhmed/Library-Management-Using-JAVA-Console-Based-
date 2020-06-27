import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BooksHashNode {
	String key;	//Name Of the Category Of The Book
	String customer_name;
	String name; //Name Of The Book
	int count;	//How Many Books In The Stock
	int price;	//Price Of The Book If Purchased
	Date issue_date;
	Date return_date;
	BooksHashNode next;
	
	BooksHashNode(String data_key, String cus, String name, int data_count, int data_price, Date issue, Date ret){
		this.key = data_key;
		this.customer_name = cus;
		this.name = name;
		this.count = data_count;
		this.price = data_price;
		this.issue_date = issue;
		this.return_date = ret;
		this.next = null;
	}
}
