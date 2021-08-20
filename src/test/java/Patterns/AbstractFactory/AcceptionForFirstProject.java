package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Acceptance.AcceptanceAPITest;
import Patterns.AbstractFactory.Acceptance.AcceptanceGroupFactory;

public class AcceptionForFirstProject {
    public static void main(String[] args) {
        RunTestFactory runTestFactory = new AcceptanceGroupFactory();
        ApiTestGroup apiTestGroup= runTestFactory.getApiTestGroup();
        MobileTestGroup mobileTestGroup= runTestFactory.getMobileTestGroup();
        UITestGroup uiTestGroup = runTestFactory.getUITestGroup();

        System.out.println("Begining Aception testing...");
        apiTestGroup.runApiTest();
        mobileTestGroup.runMobileTest();
        uiTestGroup.runUITest();
    }
}
