package Abstraction;

class ShapeFactory {
    void createShape() {
        // Anonymous inner class extending AbstractShape
        AbstractShape shape = new AbstractShape() {
            @Override
            void draw() {
                System.out.println("Drawing a custom shape via anonymous inner class.");
            }
        };
        shape.draw();
    }
}
