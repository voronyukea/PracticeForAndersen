package Patterns.FactoryMethod;

public class RunSmokeTestFactory implements TestFactory{
    @Override
    public TestBuild createTest() {
        return new RunSmokeTest();
    }
}
