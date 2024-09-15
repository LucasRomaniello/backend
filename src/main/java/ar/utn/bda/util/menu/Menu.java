package ar.utn.bda.util.menu;

import ar.utn.bda.semana03.menuItems.MenuItemNPrimos;

import java.util.Scanner;

public class Menu {

    private Scanner sc;

    private String question;

    private MenuItem[] items;

    private String exitKey, exitTitle;

    public Menu(Scanner sc, String question, MenuItem[] items, String exitKey, String exitTitle) {
        this.sc = sc;
        this.question = question;
        this.items = items;
        this.exitKey = exitKey;
        this.exitTitle = exitTitle;
    }

    public Menu(Scanner sc, String question, MenuItem[] items) {
        this(sc, question, items, "q", "Quit / Go Back");
    }

    public Menu(Scanner sc, MenuItem[] items) {
        this(sc, "Please select an option:", items);
    }

    private void printQuestion(){
        System.out.println(question);
    }

    private void printOption(){
        for (MenuItem item : items) {
            System.out.println(item.getKey() + ": " + item.getTitle());
        }

        System.out.println(exitKey + ": " + exitTitle);
    }

    private String getSelection(){
        return sc.nextLine();
    }

    private MenuItem getItem(String key){
        for (MenuItem item : items) {
            if (key.equals(item.getKey())) {
                return item;
            }
        }
        return null;
    }

    public void run(){
        while (true){
            printQuestion();    // Imprime título del menú

            printOption();      // Imprime opciones.

            String op = getSelection();  // Capturar selección

            if (op.equals(exitKey)) {
                break;
            }

            MenuItem task = getItem(op);

            if (task != null) {
                task.ejecutar();
            } else {
                System.out.println("Option not valid.");
            }
        }
    }

   private static void opA(Scanner sc){
    MenuItem[] ops = {
            new MenuItem("1", "Option 1"){
                @Override
                public void ejecutar(){
                    System.out.println("You chose 1");
                }
            },
            new MenuItem("2", "Option 2"){
                @Override
                public void ejecutar(){
                    System.out.println("You chose 2");
                }
            },
    };

    Menu m = new Menu(sc, ops);
    m.run();
   }

   private static void opB(Scanner sc){
    MenuItem[] ops = {
               new MenuItem("3", "Option 3"){
                   @Override
                   public void ejecutar(){
                       System.out.println("You chose 1");
                   }
               },
               new MenuItem("4", "Option 4"){
                   @Override
                   public void ejecutar(){
                       System.out.println("You chose 2");
                   }
               },
       };

       Menu m = new Menu(sc, ops);
       m.run();
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MenuItem[] ops = {
                new MenuItemNPrimos("p", "Nros Primos!"),
                new MenuItem("a", "Option a"){
                    @Override
                    public void ejecutar(){ opA(sc);}
                },
                new MenuItem("b", "Option b"){
                    @Override
                    public void ejecutar(){ opB(sc);}
                },
        };

        Menu m = new Menu(sc, ops);
        m.run();

        sc.close();

    }

}
