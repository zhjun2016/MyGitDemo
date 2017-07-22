package com.example.zj.mygitdemo;

/**
 * Created by zj on 2017/7/22.
 */

public class TestHelper {


    private TestHelper() {
    }

    private static class InstanceLoader {
        private static TestHelper instance = new TestHelper();
    }

    public static TestHelper getInstance() {
        return InstanceLoader.instance;
    }

}
