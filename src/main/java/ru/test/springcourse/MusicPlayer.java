package ru.test.springcourse;

public class MusicPlayer {

    private Music music;

    // зависимость внедряеся из вне IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
    // Больше не создаем объекты
//        music = new ClassicalMusic();
//        // или
//        music = new RockMusic();
        //  код для воспроизведения музыки
        System.out.println("Playing: " + music.getSong());
    }
}
