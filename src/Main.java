//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.print("Enter your name:");
    Scanner scanner = new Scanner(System.in);
    String fullname = scanner.nextLine();
    System.out.println("Full name:"+fullname);
    System.out.print("Enter Nickname:");
    String name = scanner.next();
    System.out.println("Nickname:"+name);


    try {
        FileWriter writer = new FileWriter("data.txt");

        writer.write("Hello"+name);

        writer.close();

    } catch (IOException e) {
        System.out.println("An error occurred");
    }
}
