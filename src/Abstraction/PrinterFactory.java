package Abstraction;

public class PrinterFactory {
    void createPrinter() {
        // Anonymous inner class extending Printer (overrides printMessage)
        Printer customPrinter = new Printer() {
            @Override
            void printMessage() {
                System.out.println("Printing from an anonymous inner class — custom printer!");
            }
        };
        customPrinter.printMessage();
    }
}
