package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joker {
    List<String> jokes;

    public Joker(){
        jokes=new ArrayList<>();
        jokes.add("Please laugh on the joke");
        jokes.add("This is a good one");
        jokes.add("I hope you are laughing");
        jokes.add("This one's gonna crack you up");
    }

    public String getJoke(){
        Random random=new Random();
        int index=random.nextInt(jokes.size());
        return jokes.get(index);
    }
}
