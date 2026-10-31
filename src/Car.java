public class Car {
    String name;
    public Car(String name){
        this.name = name;
        System.out.println("The name of the car is:"+name);
    }
    class Machine{
        public Machine(){
            System.out.println("This is "+name+"'s machine");
        }
    }
}
