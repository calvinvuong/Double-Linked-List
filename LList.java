// Calvin Vuong
// APCS2 pd10
// HW13 -- LoList, LoLit
// 2016-03-15

public class LList implements List{

    private DLLNode list;
    private int size;
    
    // default constructor
    public LList(){
	list = null;
	size = 0;
    }
    
    // returns string representation of the linked list
    public String toString(){
	String retStr = "";
	DLLNode currentDLLNode = list;
	while ( currentDLLNode != null ){
	    retStr += currentDLLNode.getValue() + ", ";
	    currentDLLNode = currentDLLNode.getNext();
	}
	return retStr;
    }

    // returns size of list
    public int size(){
	return size;
    }
    
    // adds String x to the beginning of the list
    // returns true
    public boolean add(String x){
	list = new DLLNode(x, list); // make a new list by creating a new node that points to the old list
	size += 1;
	return true;
    }

    // adds String x at position i
    public void add( int i, String s ){
	if ( i < 0 || i > size() )
	    throw new IndexOutOfBoundsException();
	
	if ( i == 0 )
	    add(s);
	else {
	    DLLNode alterNode = getNode(i-1); // node whose pointer you are altering
	    DLLNode oldPointer = alterNode.getNext(); // old pointer to assign to new node
	    alterNode.setNext( new DLLNode( s, oldPointer ) ); // link old pointer to new node, and then link new pointer to element before
	}
	size += 1;
    }

    // removes the node at position i and returns its value
    public String remove( int i ){
	if ( i < 0 || i >= size() )
	    throw new IndexOutOfBoundsException();

	DLLNode removed = getNode(i);

	if ( i == 0 ) // special case for index 0
	    list = getNode(1);        
	else {
	    DLLNode before = getNode(i-1);
	    DLLNode after = getNode(i+1);
	    
	    before.setNext( after ); // connect node at index i-1 to node at index i+1
	    // node at index i gets destroyed
	}
	size -= 1;
	return removed.getValue();
    }

    // returns the Node at index i
    public DLLNode getNode(int i){
	if ( i < 0 || i >= size() )
	    throw new IndexOutOfBoundsException();
	
	DLLNode currentDLLNode = list;
	for ( int k = 0; k < i; k++ ){
	    currentDLLNode = currentDLLNode.getNext(); // keep cdr-ing unitl necessary element becomes the car
	}
	return currentDLLNode;
    }

    // returns the String at index i
    public String get(int i){
	return getNode(i).getValue();
    }

    // sets element at index i to String x
    // returns old String at index i
    public String set(int i, String x){
	String ret = get(i); // val to return
	getNode(i).setValue(x);
	return ret;
    }

    // testing purposes
    public static void main(String[] args){
	LList l = new LList();
	System.out.println(l);
	System.out.println(l.size());

	l.add("Sue did the president call?");
	System.out.println(l);
	System.out.println(l.size());
	
	l.add("it's me");
	System.out.println(l);
	System.out.println(l.size());

	l.add("hello");
	System.out.println(l);
	System.out.println(l.size());

	System.out.println("Element at index 0: " + l.get(0));
	System.out.println("Element at index 1: " + l.get(1));
	System.out.println("Element at index 2: " + l.get(2));

	System.out.println("Setting element at index 0 to \"goodbye\"...");
	l.set(0, "goodbye");
	
	System.out.println("Setting element at index 2 to \"Selina Meyer for President: Continuity with Change\"...");
	l.set(2, "Selina Meyer for President: Continuity with Change");
	System.out.println(l);

	System.out.println("Inserting \"Armando\" at index 0 ...");
	l.add(0, "Armando");
	System.out.println(l);

	System.out.println("Inserting \"Iannuci\" at index 1 ...");
	l.add(1, "Iannuci");
	System.out.println(l);

	System.out.println("Inserting \"Electoral Vote: 269\" at index 5 ...");
	l.add(5, "Electoral Vote: 269");
	System.out.println(l);

	System.out.println("Removing \"Iannuci\" at index 1 ...");
	l.remove(1);
	System.out.println(l);

	System.out.println("Removing \"Armando\" at index 0 ...");
	l.remove(0);
	System.out.println(l);

	System.out.println("Removing \"Electoral Vote: 269\" at index 3 ...");
	l.remove(3);
	System.out.println(l);
    }
}
	
	    

    
    