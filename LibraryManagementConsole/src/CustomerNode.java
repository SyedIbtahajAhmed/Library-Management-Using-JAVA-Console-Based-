
public class CustomerNode {
	String name;
	int customer_id;
	String customer_phone;
	CustomerNode next;
	CustomerNode(String n, int ci, String cp){
		this.name = n;
		this.customer_id = ci;
		this.customer_phone = cp;
	}
}
