package ru.test.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    List<Music> musicList = new ArrayList<>();

    private String name;    //  Название плеера
    private int volume;      //  Уровень громкости

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // зависимость внедряеся из вне IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    // зависимость внедряеся из вне IoC через set
    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
    // Больше не создаем объекты
//        music = new ClassicalMusic();
//        // или
//        music = new RockMusic();
        //  код для воспроизведения музыки
        System.out.println("Playing: " + music);
//        for (Music m : musicList) System.out.println(m.getSong());
    }

}
