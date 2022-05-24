package Day19;

public class _02_MethodsParameters {

    public static void main(String[] args) {
        greetUser("John");
        greetUser("Emily");
    }


    // (String name) -> is parameter in the method signature
    public static void greetUser(String name) {
        System.out.println("Hello " + name);
    }

}
