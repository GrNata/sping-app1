package ru.test.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();

        Music music3 = context.getBean("jazzMusic", JazzMusic.class);
        MusicPlayer musicPlayer3 = new MusicPlayer(music3);
        musicPlayer3.playMusic();
//        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic1.getSong());
//        System.out.println(classicalMusic2.getSong());

        // создаем зависимости вручную
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        firstMusicPlayer.playMusic();
//        secondMusicPlayer.playMusic();
//
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());
//
//        firstMusicPlayer.setVolume(100);
//
//        System.out.println(secondMusicPlayer.getName());
//        System.out.println(secondMusicPlayer.getVolume());
//
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());

        context.close();

    }
}
