package Patterns.AbstractFactory.Acceptance;

import Patterns.AbstractFactory.ApiTestGroup;
import Patterns.AbstractFactory.MobileTestGroup;
import Patterns.AbstractFactory.RunTestFactory;
import Patterns.AbstractFactory.UITestGroup;

public class AcceptanceGroupFactory implements RunTestFactory {

    @Override
    public ApiTestGroup getApiTestGroup() {
        return new AcceptanceAPITest();
    }

    @Override
    public UITestGroup getUITestGroup() {
        return new AcceptanceUITest();
    }

    @Override
    public MobileTestGroup getMobileTestGroup() {
        return new AcceptanceMobileTest();
    }
}
