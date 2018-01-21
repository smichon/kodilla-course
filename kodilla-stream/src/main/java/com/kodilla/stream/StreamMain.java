package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForumUsers = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForumUsers.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().getYear() <= 1998)
                .filter(user -> user.getPostsNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));
        System.out.println("Number of users, who are: Men, 20 or older, with at least 1 post, is: "
                + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
