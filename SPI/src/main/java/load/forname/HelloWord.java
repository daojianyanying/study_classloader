package load.forname;

public class HelloWord {
    public static void main(String[] args) {
        while(true){
            System.out.println("后台进程仍然在执行中！！！！！！！");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
