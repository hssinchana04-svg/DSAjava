public class Constructor {
  public static void main(String[] args) {
    Student s1 = new Student();
    // Student s2 = new Student("Sinchana");
    // Student s3 = new Student(101);
    s1.name = "Sinchana";
    s1.roll = 101;
    s1.password = "abc123";
    s1.marks[0] = 90;
    s1.marks[1] = 95;
    s1.marks[2] = 85;


    Student s2 = new Student(s1);
    s2.password = "xyz123";
    s1.marks[2] = 98;
    for(int i=0; i<3; i++){
      System.out.println(s2.marks[i]);
    }
  }
}


class Student {
  String name;
  int roll;
  String password;
  int marks[];

  Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
  }

  Student(){
     System.out.println("Constructor called");
   }

  Student(String name){
     marks = new int[3];
    this.name = name;
  }
  Student (int roll){
     marks = new int[3];
    this.roll = roll;
  }
}