package pl.coderslab.week5.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MockitoExtension.class)
class UserRepositoryTest {

    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    void testCreateUser() {
        User user = new User("John Doe", "john.doe@example.com");
        userRepository.createUser(user);
        assertEquals(1, userRepository.getUsers().size());
        assertEquals(user, userRepository.getUsers().get(0));
    }


    @Test
    void testEditUser() {
        User user = new User("John Doe", "john.doe@example.com");
        userRepository.createUser(user);
        user.setName("Jane Doe");
        userRepository.editUser(user);
        assertEquals("Jane Doe", userRepository.getUsers().get(0).getName());
    }


    @Test
    void testDeleteUser() {
        User user = new User("John Doe", "john.doe@example.com");
        userRepository.createUser(user);
        userRepository.deleteUser(user);
        assertTrue(userRepository.getUsers().isEmpty());
    }

}
