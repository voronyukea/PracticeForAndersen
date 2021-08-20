package Patterns.FactoryMethod;

public class RunApiTestFactory implements TestFactory {
    @Override
    public TestBuild createTest () {
        return new RunRegressionTest();
    }
}
