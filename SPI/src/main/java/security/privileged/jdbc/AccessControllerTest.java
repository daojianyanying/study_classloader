package security.privileged.jdbc;

public class AccessControllerTest {
    public static void main(String[] args) {
        //默认情况下SecurityManager是关闭的，如果需要开启的话，可以通过api和命令行开启
        testDefaulStatus();
        initSecurityManagerByAPI();
        //命令行开启:
        //java -Djava.security.manager <class_name>
    }
    //证明默认情况下是不开启SecurityManager
    public static void testDefaulStatus(){
        SecurityManager securityManager = System.getSecurityManager();
        if(securityManager ==  null){
            System.out.println("java默认不开启SecurityManager");
        }else{
            System.out.println("java默认开启SecurityManager");
        }
    }

    public static void initSecurityManagerByAPI(){
        SecurityManager securityManager = new SecurityManager();
        System.setSecurityManager(securityManager);
        SecurityManager securityManagerIsAbsent = System.getSecurityManager();
        if(securityManagerIsAbsent ==  null){
            System.out.println("未开启SecurityManager");
        }else{
            System.out.println("已开启SecurityManager");
        }
    }
}
