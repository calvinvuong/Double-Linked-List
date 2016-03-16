// Calvin Vuong
// APCS2 pd10
// HW12a -- We Got a Big Ol' Convoy...
// 2016-03-14

public class LLNode{

    private String value;
    private LLNode pointer;

    // default constructor
    public LLNode(){
	value = "default";
	pointer = null;
    }
    
    // overloaded constructor, sets value to val and pointer to next
    public LLNode(String val, LLNode next){
	value = val;
	pointer = next;
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
	return pointer;
    }

    // sets the value of the next node to next
    // returns the old node
    public LLNode setNext(LLNode next){
	LLNode old = pointer;
	pointer = next;
	return old;
    }

}
