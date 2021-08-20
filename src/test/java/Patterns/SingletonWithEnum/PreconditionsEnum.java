package Patterns.SingletonWithEnum;

public enum PreconditionsEnum {
    INSTANCE;

    private String browser;
    private boolean startMaximized;
    private boolean headless;

    public String getBrowser() {
        return browser;
    }

    public boolean isStartMaximized() {
        return startMaximized;
    }

    public boolean isHeadless() {
        return headless;
    }

    @Override
    public String toString() {
        return "PreconditionsEnum{" +
                "browser='" + browser + '\'' +
                ", startMaximized=" + startMaximized +
                ", headless=" + headless +
                '}';
    }

    public void Preconditions(String browser, boolean startMaximized, boolean headless ){
        this.browser=browser;
        this.startMaximized=startMaximized;
        this.headless = headless;

        }

}
