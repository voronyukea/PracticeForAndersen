package Patterns.Builder;

public class BuilderAPP {
    public static void main(String[] args) {
        User user = new userBuilder()
                .buildLogin("TestUser1")
                .buildPass("PassForUser")
                .buildStatus(StatusAccount.UNLOCKED)
                .build();
        System.out.println(user);
    }
}


class User{
    String loginUser;
    String passUser;
    StatusAccount StatusAccount;

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginUser='" + loginUser + '\'' +
                ", passUser='" + passUser + '\'' +
                ", StatusAccount=" + StatusAccount +
                '}';
    }

    public void setStatusAccount(Patterns.Builder.StatusAccount StatusAccount) {
        this.StatusAccount = StatusAccount;

    }
}

enum StatusAccount{
    LOCKED, UNLOCKED
}

class userBuilder{
    String l="AnyUser";
    String p="MyPassword";
    StatusAccount s = StatusAccount.UNLOCKED;

    userBuilder buildLogin(String l){
        this.l=l;
        return this;
    }


    userBuilder buildPass(String p){
        this.p=p;
        return this;
    }

    userBuilder buildStatus(StatusAccount s){
        this.s=s;
        return this;
    }

    User build() {
        User user=new User();
        user.setLoginUser(l);
        user.setPassUser(p);
        user.setStatusAccount(s);
        return user;
    }
}

