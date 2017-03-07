package revisePac;
 class Link {
	int data ;
	public Link next; // next link
	public Link(int dat) {
	data = dat;
	}
	public void  printlink() {
		System.out.println("{ " + data + " }" + next);
    }
}

 class llist{
	 private Link first;
	 public llist() {
		first = null; 
	 } // start with a new link
	 public Boolean islistempty() {
		 return first == null;
	 }// returns true if list is empty..
	 public void insert(int data) {
		 Link lnk = new Link(data) ;
		 lnk.next = first;
		 first = lnk; // add the first link
	 }
	 public Link delete() {
		 Link temp = first;
		 first = first.next;
		 return temp;
		 
	 }
 }


public class linkedlist {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	

}
