public class objectoriented {

  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    p1.setColor("yellow");
    System.out.println(p1.getColor());

    BankAccount myAcc = new BankAccount();
    myAcc.username = "sinchana";
    myAcc.setPassword("abc123");

    Student s1 = new Student();
  }
}

class BankAccount{
  public String username;
  private String password;
  public void setPassword(String pwd){
    password = pwd;
  }
}

  class Pen{
    String color;
    int tip;

    String getColor(){
      return this.color;
    }

    void setColor(String newColor){
      this.color = newColor;
    }

    int getTip(){
      return this.tip;
    }

    void setTip(int newTip){
      this.tip = newTip;
    }
  }

  // class Student{
  //   String name;
  //   int age;
  //   float percentage;

  //   void calcPercentage(int phy, int chem, int math){
  //     percentage = (phy+chem+math)/3;


  class Student{
    Student(){
      System.out.println("Constructor called");
    }
  }
  
 
  

