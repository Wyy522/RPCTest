public class Client {
    public static void main(String[] args) {
        IUserService userService = (IUserService) Stub.getStub(IUserService.class);
        System.out.println(userService.findUserById(16).toString());
    }
}
