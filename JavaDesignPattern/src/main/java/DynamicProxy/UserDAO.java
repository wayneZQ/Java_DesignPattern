package DynamicProxy;

/**
 * @ClassName UserDAO
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/16 16:17
 **/
public class UserDAO implements AbstractUserDAO {
    @Override
    public Boolean findUserById(String userId) {
        if(userId.equalsIgnoreCase("zwj")){
            System.out.println("check "+userId+" success!");
            return true;
        }else {
            System.out.println("check "+userId+" failed");
            return false;
        }
    }
}
