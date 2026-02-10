class LL{
  Node head;
  private int size;

  LL(){
    this.size = 0;
  }

  class Node{
    String data;
    Node next;

    Node(String data){
      this.data = data;
      this.next = null;
      size++;
    }
  }

  //addFirst
  public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  // addLast
  public void addLast(String data){ 
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }

    Node currNode = head;
    while(currNode.next != null){
      currNode = currNode.next;
    }

    currNode.next = newNode;
  }

  public void printList(){
    if(head == null){
      System.out.println("list is empty");
    }
    Node currNode = head;
    while(currNode != null){
      System.out.print(currNode.data + "->");
      currNode = currNode.next;
    }

    System.out.println("NULL");
  }

  //deleteFirst
  public void deleteFirst(){
    if(head == null){
      System.out.println("this list is empty");
      return;
    }
    size--;
    head = head.next;
  }

  //deleteLast
  public void deleteLast(){
    if(head == null){
      System.out.println("this list is empty");
      return;
    }
    size--;
    if(head.next == null){
      head = null;
      return;
    }

    Node secondLast = head;
    Node lastNode = head.next;
    while(lastNode.next != null){
      lastNode = lastNode.next;
      secondLast = secondLast.next;
    }

    secondLast.next = null;
  }

  public int getSize(){
    return size;
  }

  public void reverseIterate(){
      if(head == null || head.next == null){
        return;
      }
  
      Node prevNode = head;
      Node currNode = head.next;
      while(currNode != null){
        Node nextNode = currNode.next;
        currNode.next = prev;
  
  
        //update
        prevNode = currNode;
        currNode = nextNode;
      }
      head.next = null;
      head = prevNode;
    }


  public static void main(String[] args) {
    LL list = new LL();
  //   list.addFirst("a");
  //   list.addFirst("is");
  //   list.addFirst("this");
  //   list.printList();
    
  //   list.addLast("list");
  //   list.printList();

  //   list.deleteFirst();
  //   list.printList();

  //   list.deleteLast();
  //   list.printList();

  //   System.out.println(list.getSize());
  //   list.addFirst("this");
  //   System.out.println(list.getSize());
  // }
  list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.printList();
    
    list.reverseIterate();
    list.printList();
  }
}

// import java.util.*;

// class LL{
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<String>();

//     list.addFirst("a");
//     list.addFirst("is");
//     System.out.println(list);
//     list.addFirst("this");
//     list.addLast("list");
//     System.out.println(list);

//     System.out.println(list.size());

//     for(int i=0; i<list.size(); i++){
//       System.out.println(list.get(i)+ " ");
//     }
//     System.out.println("null");



//     list.removeFirst();
//     System.out.println(list);

//     list.removeLast();
//     System.out.println(list);

//     list.remove(3);
//     System.out.println(list);
//   }
// }