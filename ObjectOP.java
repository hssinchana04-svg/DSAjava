public class ObjectOP {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "sinchana";
    s1.rollNo = 101;
    s1.Password = "abc123";
    s1.marks[0] = 95;
    s1.marks[1] = 88; 
    s1.marks[2] = 76;

    
    Student s2 = new Student(s1);
    s2.Password = "xyz789";
    s1.marks[2] = 100;
    for(int i=0; i<3; i++){
      System.out.println(s2.marks[i]);
    }

    
  }
}

class Student {
  String name;
  int rollNo;
  String Password;
  int[] marks;


  //shallow copy constructor
  // Student(Student s1){
  //   marks = new int[3];
  //   this.name = s1.name;
  //   this.rollNo = s1.rollNo;
  //   for(int i=0; i<3; i++){
  //     this.marks[i] = s1.marks[i];
  //   }


    //deep copy constructor
  Student(Student s1){
  marks = new int[3];
  this.name = s1.name;
  this.rollNo = s1.rollNo;
  for(int i=0; i<3; i++){
      this.marks[i] = s1.marks[i];
  }
  

  }

  Student(String name){
    this.name = name;

  }
  Student(int rollNo){
    this.rollNo = rollNo;
  }
}