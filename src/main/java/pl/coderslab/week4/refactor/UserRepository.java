package pl.coderslab.week4.refactor;

public interface UserRepository {
    User findByUsername(String username);
}
