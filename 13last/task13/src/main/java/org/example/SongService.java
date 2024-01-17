package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class SongService {
    static List<Song> songs = new ArrayList<>();

    @PostConstruct
    public void init(){
        songs.add(new Song(1, "Трек 1", "Исполнитель 1", 1));
        songs.add(new Song(2, "Трек 2", "Исполнитель 2", 2));
        songs.add(new Song(3, "Трек 3", "Исполнитель 3", 3));
        songs.add(new Song(4, "Трек 4", "Исполнитель 4", 4));
        songs.add(new Song(5, "Трек 5", "Исполнитель 5", 5));
    }
    public void printAll(){
        System.out.println("Список песен");
        for (Song s : songs){
            System.out.println(s.getInfo());
        }
    }
    public static Song findByName(String name){
        for(Song s : songs){
            if (s.getSongName().equals(name)){
                return s;
            }
        }
        return null;
    }
    public static Song findBySingerSong(String name, String singer){
        for(Song s : songs){
            if (s.getSongName().equals(name) && s.getSingerName().equals(singer)){
                return s;
            }
        }
        return null;
    }

    public List<Song> getAllSongs() {
        return songs;
    }
}
