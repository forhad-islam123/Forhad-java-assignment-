public class Student {
    String name;
    int id;
    float cgpa;

    Student(String name,int id,float cgpa){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
   void display(){
        this.show();
    }
      void show() {
       System.out.println("name: " + this.name);
       System.out.println("id: " + this.id);
       System.out.println("cgpa: " + this.cgpa);
      }
      Student(){
        this("Shawon", 48, 3.53f);
      }
public static void main(String[] args) {
    Student  Shawon = new Student();       
    Shawon.display();
}
}