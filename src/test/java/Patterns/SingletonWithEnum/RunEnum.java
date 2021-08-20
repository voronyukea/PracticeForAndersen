package Patterns.SingletonWithEnum;

import Patterns.Singleton.Preconditions;

public class RunEnum {
    public static void main(String[] args) {

        PreconditionsEnum firstStartEnum = PreconditionsEnum.INSTANCE;
        firstStartEnum.Preconditions("Chrome", true, false);
        System.out.println(firstStartEnum);

    }
}
