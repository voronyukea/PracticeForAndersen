package Patterns.Singleton;


//в примере рассматривается изменение файла конфигурации для запуска теста
public class Preconditions {

    private static Preconditions Instance;

    private String browser;
    private boolean startMaximized;
    private boolean headless;

    @Override
    public String toString() {
        return "Preconditions{" +
                "browser='" + browser + '\'' +
                ", startMaximized=" + startMaximized +
                ", headless=" + headless +
                '}';
    }

    private Preconditions(String browser, boolean startMaximized, boolean headless ){
        this.browser=browser;
        this.startMaximized=startMaximized;
        this.headless = headless;

    }

    public String getBrowser() {
        return browser;
    }

    public boolean isStartMaximized() {
        return startMaximized;
    }

    public boolean isHeadless() {
        return headless;
    }

    public static Preconditions getInstance(String browser, boolean startMaximized, boolean headless ){
        if (Instance==null) {
            Instance=new Preconditions( browser,  startMaximized, headless );
        }
        return Instance;
    }
}

