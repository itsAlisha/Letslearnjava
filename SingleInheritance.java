//public class SingleInheritance {}
    class Parent{
        int x=67;
        void func()
        {
            System.out.println("Practicing Java");
        }
        void display()
        {
            System.out.println("This is Parent Class's display function");
        }
    }
    class Child extends Parent {
        void display() {
            System.out.println("The value of x is : " + x);
        }

        public static void main(String[] args) {
            Child obj = new Child();
            obj.display();
            obj.func();
        }
    }

