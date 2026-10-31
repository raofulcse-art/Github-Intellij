//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Car c1 = new Car("Mercedes");

    Car.Machine m1= c1.new Machine();

    try {
        Thread.sleep(2000);
    }catch (InterruptedException e){
        Thread.currentThread().interrupt();
    }

    Number n1= new Number();
    System.out.println(n1.add(10,20,30));

    Multithreading m2 = new Multithreading();
    m2.start();
    System.out.println("Testing");
}
