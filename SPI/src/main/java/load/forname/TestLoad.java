package load.forname;

import sun.reflect.Reflection;

public class TestLoad {
    public static void main(String[] args) {
        //loadByClassLoader();
        //System.out.println(Reflection.getCallerClass());
        loadByForName();
    }

    public static void  loadByForName(){
        try {
            Class.forName("load.forname.ClassToLoad");

            //使用系统ClassLoader，即系统的入口点所使用的ClassLoader
            System.out.println(ClassLoader.getSystemClassLoader());
            //使用当前线程的ClassLoader
            System.out.println(Thread.currentThread().getContextClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("class.forName()加载失败");
        }
    }

    public static void loadByClassLoader(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try {
            Class cls = classLoader.loadClass("load.forname.ClassToLoad");
            cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
