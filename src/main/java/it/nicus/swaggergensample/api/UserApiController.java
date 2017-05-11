package it.nicus.swaggergensample.api;

import it.nicus.swaggergensample.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;

@Controller
public class UserApiController implements  UserApi {
    @Override
    public ResponseEntity<Void> createUser(User body, String accept) {
        return null;
    }

    @Override
    public ResponseEntity<Void> createUsersWithArrayInput(List<User> body, String accept) {
        return null;
    }

    @Override
    public ResponseEntity<Void> createUsersWithListInput(List<User> body, String accept) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username, String accept) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserByName(String username, String accept) throws IOException {
        return null;
    }

    @Override
    public ResponseEntity<String> loginUser(String username, String password, String accept) throws IOException {
        return null;
    }

    @Override
    public ResponseEntity<Void> logoutUser(String accept) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(String username, User body, String accept) {
        return null;
    }
}
