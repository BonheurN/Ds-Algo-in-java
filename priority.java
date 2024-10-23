public class Priority{
  public static void main(String[]args){

// Priority Queue = A FIFO data structure that serves 
//					elements with the highest priorities first 
//					before element with lower priority
Queue<Double> priority = new PriorityQueue<String>(Collections.reverseOrder); // when you use collection comparator it will 
                                                                              // put elements from big to small when in the first it 
                                                                              // would display small to big in general it will reverse the order

      priority.offer(4.0)
      priority.offer(4.5)
      priority.offer(3.8)
      priority.offer(3.0)
      priority.offer(1.5)
      priority.offer(2.0)
      priority.offer(2.5)
      priority.offer(1.0)
      while(!priority.isEmpty){
        System.out.println(priority.poll());
        }

        

  }
}
