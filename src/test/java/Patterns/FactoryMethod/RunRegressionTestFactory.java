package Patterns.FactoryMethod;

public class RunRegressionTestFactory implements TestFactory {
        @Override
        public TestBuild createTest () {
            return new RunRegressionTest();
        }
    }

