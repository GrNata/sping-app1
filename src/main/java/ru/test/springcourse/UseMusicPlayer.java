package ru.test.springcourse;

import java.util.ArrayList;
import java.util.List;

public class UseMusicPlayer {

    public static void main(String[] args) {

//        List<Music> musicList = new ArrayList<>(new ClassicalMusic(), new RockMusic(), new JazzMusic());
        MusicPlayer musicPlayer = new MusicPlayer(new ClassicalMusic());
//        MusicPlayer musicPlayer = new MusicPlayer(musicList);
    }
}
