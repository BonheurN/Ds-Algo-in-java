// queue is an interface so it is not instanciated but it can be implemented using forexample here we using LinkedList 
// It is a FIFO data structure 
Queue<String> queue = new LinkedList<String> ();

queue.offer("Karen");
queue.offer("Chad"); // offer method is used to add element in the list 
queue.offer("Steven");
queue.offer("Harlod");
queue.poll(); // poll method removes the first element that was added to the list 
System.out.println(queue.isEmpty()); //this checks if the structure is empty or has elements
System.out.println(queue.size()); // this is to display the size of the structure how many elements it contains
System.out.println(queue.peek()) // his will peek the first element which is the first element that was added to the list 
