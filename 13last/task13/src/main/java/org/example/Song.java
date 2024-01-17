package org.example;

public class Song {
    private int id;
    private String songName;
    private String singerName;
    private int time;
    public Song(int id, String songName, String singerName, int time){
        this.id = id;
        this.songName = songName;
        this.singerName = singerName;
        this.time = time;
    }
    public String getInfo(){
        return "id трека: " + id + "; Название трека: " + songName + "; Имя исполнителя: " + singerName + "; продолжительность: " + time + " мин";
    }

    public String getSongName() {
        return songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public int getTime() {
        return time;
    }
}
