import java.io.BufferedReader;
import java.io.FileReader;

public class Process {

	public static void main(String[] args) {
		
		//check if there is an file
		if(args.length !=1) {
			System.err.println("No File Exist!");
			System.exit(0);
		}
		
		//import the buffered reeader to read the file
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(args[0]));
			 
			 while(br.ready()) {
				 System.out.println(br.read());
			 }
		 }catch(Exception e) {
			 
			System.err.println("Exception:" + e);
		 }
	}
	
	//Class of Account
	class Account {
		//Declare variables for account number and balance of the account
		private int _key;
		private double _balance;
		
		//Constructor for the account which holding the key and the balance
		public Account(int key, double balance) {
			_key=key;
			_balance = balance;
		}
		
		//Method that get the key value
		public int getKey() {
			return _key;
		}
		
		//method that retrieve the balance
		public double getBalance() {
			return _balance;
		}
		
		//Method that set the balance
		public double setBalance() {
			return _balance;
		}	
	}
	
	//Class for Bank Binary Search Tree
	class BankBST{
		//Declare the variables for root and the left and right leaves
		Account root;
		BankBST left, right;
		
		//public constructor for BankBST
		public BankBST() {		
		}
		
		//Insert method as BST
		public void insert(Account a) {
			if(root ==null) {
				root = a;
				left = new BankBST();
				right = new BankBST();
			}
			else {
				if(a._key < root._key) {
					left.insert(a);
				}
				else {
					right.insert(a);
				}
			}	
		}
		
		//Create find method 
		public Account find(int key) {
			if(root == null) {
				return null;
			}
			if(key == root._key) {
				return root;
			}
			if(key<root._key) {
				return left.find(key);
			}
			return right.find(key);
		}
		
		//traverse the order and print out the root key
		 void in_order() {
			if(root == null) {
				return;
			}
			left.in_order();
			System.out.println(root._key + root._balance);
			right.in_order();
		}
	}
	
		
}
