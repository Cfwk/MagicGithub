package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator;
import com.openclassrooms.magicgithub.model.User;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class UserRepository implements  ApiService{

    private final ApiService apiService; // TODO: A utiliser
    private List<User> users;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
        this.users = new LinkedList(FakeApiServiceGenerator.FAKE_USERS);
    }

    public List<User> getUsers() {
        return users;
    }

    public void generateRandomUser() {
        int nombreAleatoire = 0 + (int)(Math.random() * ((FakeApiServiceGenerator.FAKE_USERS_RANDOM.size()-1 - 0) + 1));
        System.out.println(nombreAleatoire);
        User RandomUser = FakeApiServiceGenerator.FAKE_USERS_RANDOM.get(nombreAleatoire);

        users.add(RandomUser);
    }

    public void deleteUser(User user) {
        users.remove(user);
    }
}
