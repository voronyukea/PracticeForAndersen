package Patterns.AbstractFactory;

public interface RunTestFactory {
    ApiTestGroup getApiTestGroup();
    UITestGroup getUITestGroup();
    MobileTestGroup getMobileTestGroup();
}
