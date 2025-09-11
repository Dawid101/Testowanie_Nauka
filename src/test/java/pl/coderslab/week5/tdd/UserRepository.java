package pl.coderslab.week5.tdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private Map<Integer, User> users;
    private int nextId = 1;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public void createUser(User user) {
        users.put(nextId++, user);
    }

    public void editUser(User user) {
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            if (entry.getValue().equals(user)) {
                users.put(entry.getKey(), user);
                break;
            }
        }
    }

    public void deleteUser(User user) {
        users.values().remove(user);
    }

    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }
}
