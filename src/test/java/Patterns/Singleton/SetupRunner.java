package Patterns.Singleton;

public class SetupRunner {

    public static void main(String[] args) {
        Preconditions firstRunSetup = Preconditions.getInstance("Firefox", true, false);
        Preconditions secondRunSetup = Preconditions.getInstance("Chrome", false, false);
        System.out.println(firstRunSetup);
        System.out.println(secondRunSetup);
    }
}
