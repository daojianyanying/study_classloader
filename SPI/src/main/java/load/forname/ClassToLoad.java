package load.forname;

public class ClassToLoad {
    private static String value="类的静态变量";
    static {
        System.out.println("静态代码块");
    }

    public ClassToLoad(){
        System.out.println("构造方法的静态变量");
    }
}
