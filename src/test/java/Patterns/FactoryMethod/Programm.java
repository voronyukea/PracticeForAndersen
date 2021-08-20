package Patterns.FactoryMethod;

//В примере реализован паттерн factory method, который запускает нужную коллекцию test run

public class Programm {
    public static void main(String[] args) {
        TestFactory testFactory = new RunSmokeTestFactory();
        TestBuild testBuild = testFactory.createTest();

        testBuild.runTest();
    }

}
