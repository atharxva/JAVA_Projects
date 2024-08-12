import java.util.HashMap;
import java.util.Scanner;

public class Etracker {
    int id;
    String name;
    HashMap<String, Integer> expenses = new HashMap<String, Integer>();

    Etracker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void add() {
        System.out.println("Enter the expense and the description");
        Scanner input = new Scanner(System.in);
        id = input.nextInt();
        input.nextLine(); 
        name = input.nextLine();
        expenses.put(name, id);
        input.close();
    }

    public void del() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the expense you want to remove");
        name = input.nextLine();
        expenses.remove(name);
        input.close();
    }

    public void allClear() {
        expenses.clear();
        System.out.println("The history was cleared");
    }

    public void display() {
        for (String i : expenses.keySet()) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Etracker obj = new Etracker(0, "");
        boolean running = true;

        while (running) {
            System.out.println("Enter the choice:");
            System.out.println("1) List The expenses");
            System.out.println("2) Add a New Expense");
            System.out.println("3) Remove an Expense");
            System.out.println("4) All Clear");
            System.out.println("5) Exit");

            int choice = inp.nextInt();
            switch (choice) {
                case 1:
                    obj.display();
                    break;
                case 2:
                    obj.add();
                    break;
                case 3:
                    obj.del();
                    break;
                case 4:
                    obj.allClear();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("The option is not available");
                    break;
            }
        }
        inp.close();
    }
}
