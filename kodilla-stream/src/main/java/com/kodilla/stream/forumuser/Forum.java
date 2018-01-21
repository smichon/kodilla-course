package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"John Doe", 'M', 1987,6, 15,
                24));
        userList.add(new ForumUser(2,"Jane Doe", 'F', 1984,10, 18,
                2));
        userList.add(new ForumUser(3,"Robert Greenfield", 'M', 1998,4,
                3,34));
        userList.add(new ForumUser(4,"Monica Smith", 'F', 1988,2, 28,
                0));
        userList.add(new ForumUser(5,"Jennifer Novak", 'F', 2000,4, 1,
                28));
        userList.add(new ForumUser(6,"Steven Nemack", 'M', 2001,6,
                30,14));
        userList.add(new ForumUser(7,"Giancarlo Guerrero", 'M', 2002,3,
                24,0));
        userList.add(new ForumUser(8,"Nicholas Ganini", 'M', 1990,10,
                2,1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
