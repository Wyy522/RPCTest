public class UserServiceImpl implements IUserService {
    private  int id;
    @Override
    public User findUserById(int id) {
        return new User(id,"wyy");
    }
}
