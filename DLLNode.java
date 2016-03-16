// Calvin Vuong
// APCS2 pd10
// HW12a -- We Got a Big Ol' Convoy...
// 2016-03-14

public class DLLNode{

    private String value;
    private DLLNode pointerb; // points to node before
    private DLLNode pointern; // points to node next

    // default constructor
    public LLNode(){
	value = "default";
	pointerb = null;
	pointern = null;
    }
    
    // overloaded constructor, sets value to val and pointern to next
    public LLNode(String val, LLNode before, LLNode next){
	this();
	value = val;
	pointerb = before;
	pointern = next;
    }

    // returns the value as a String
    public String getValue(){
	return value;
    }

    // sets the value of node to String s
    // returns old value
    public String setValue(String s){
	String old = value;
	value = s;
	return old;
    }

    // returns the pointer to the next node
    public LLNode getNext(){
	return pointern;
    }

    // sets the value of the next node to next
    // returns the old node
    public LLNode setNext(LLNode next){
	LLNode old = pointern;
	pointern = next;
	return old;
    }

    // returns the pointer to the before node
    public LLNode getBefore(){
	return pointerb;
    }

    // sets the value of the next node to next
    // returns the old node
    public LLNode setBefore(LLNode next){
	LLNode old = pointerb;
	pointerb = next;
	return old;
    }

}
