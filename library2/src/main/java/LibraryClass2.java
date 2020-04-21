public class LibraryClass2 {

    public void sayHello() {
        new LibraryClass1().sayHello();
        System.out.println("Hello from library2");
    }

}
