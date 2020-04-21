public class Main {

    public static void main(String[] args) {
        new LibraryClass1().sayHello();
        new LibraryClass2().sayHello();
        new HelloFromMain().hello();
    }

    private static class HelloFromMain implements LibraryIntefrace {

        @Override
        public void hello() {
            System.out.println("Hello from main");
        }

    }

}
