class Person{
    String name;
    int age;
    public Person(String name ,int age){
        this.name =name;
        this.age = age;
    }
    public void show(){
        System.out.print("姓名"+name+",年龄"+age);
    }
}
class Student extends Person{
    String id;
    public Student(String name,int age,String id){
        super(name, age);
        this.id=id;
    }
    @Override
    public void show(){
        System.out.print("姓名"+name+",年龄"+age+",学号"+id);
    }
}
public class yue {
    public static void main(String[] arges){
        Student myStudent = new Student("韩振鑫",19,"2501120032");
        myStudent.show();
    }
}
