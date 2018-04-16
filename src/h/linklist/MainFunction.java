package h.linklist;

public class MainFunction {

	public static void main(String[] args) {
		
		IntLinkList list=new IntLinkList(5);
		list.addItemToLinkList(4);
		list.addItemToLinkList(2);
		list.addItemToLinkList(21);
		list.showAllElements();
		list.deleteItem(21);
		list.showAllElements();
	}
}
