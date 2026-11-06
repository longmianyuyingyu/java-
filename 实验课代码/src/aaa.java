class Animal{
    String name;
    public Animal(String name){
        this.name=name;
    }
    public void sayHello(){
        System.out.print("动物名字"+name);
    }
}
class Dog extends Animal{
    String breed;
    public Dog(String name,String breed){
        super(name);
        this.breed = breed;
    }
    public void sayHello(){
        System.out.print("动物名字："+name + "，品种："+breed);
    }
}
public  class aaa{
    public static void main(String[] args){
        Dog myDog = new Dog("韩振鑫","金毛");
        myDog.sayHello();
    }
}

