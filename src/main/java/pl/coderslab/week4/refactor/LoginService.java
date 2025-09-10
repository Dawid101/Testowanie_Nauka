package pl.coderslab.week4.refactor;

public class LoginService {
    private UserRepository userRepository;
    private EncryptionService encryptionService;

    public LoginService(UserRepository userRepository, EncryptionService encryptionService) {
        this.userRepository = userRepository;
        this.encryptionService = encryptionService;
    }

    public boolean login(String username, String password) {
        User user = getUser(username);
        String encryptedPassword = encodePassword(password);
        return user.getPassword().equals(encryptedPassword);
    }

    public User getUser(String username){
        User user = userRepository.findByUsername(username);
        if(user == null){
            return null;
        }
        return user;
    }

    public String encodePassword(String password){
        return encryptionService.encrypt(password);
    }
}
