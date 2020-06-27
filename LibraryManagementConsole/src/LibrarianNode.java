import java.util.*;
import java.text.*;
public class LibrarianNode {
	String name;
	int age;
	String username;
	String password;
	Date contract_start;
	Date contract_end;
	LibrarianNode next;
	LibrarianNode (String n, int a, String un, String pas, String start, String end){
		this.name = n;
		this.age = a;
		this.username = un;
		this.password = pas;
		this.contract_start = this.stringToDate(start);
		this.contract_end = this.stringToDate(end);
		this.next = null;
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
}
