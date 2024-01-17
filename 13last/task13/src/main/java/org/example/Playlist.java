package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Playlist {
    List<Song> playlist = new ArrayList<>();

    @Autowired
    Request request;

    public boolean addToPlaylist() {
        if (!request.songList.isEmpty()) {
            for (Song song : request.songList) {
                Song foundSong = SongService.findByName(song.getSongName());
                if (foundSong != null) {
                    playlist.add(foundSong);
                    System.out.println("Песня " + song.getSongName() + " добавлена в плейлист.");
                } else {
                    System.out.println("Песня " + song.getSongName() + " не найдена.");
                }
            }
            System.out.println("Общее количество песен в плейлисте: " + playlist.size());
        } else {
            System.out.println("В заявке нет песен.");
        }
        return false;
    }
    public void printTotalTime() {
        int totalTime = 0;
        for (Song song : playlist) {
            totalTime += song.getTime();
        }
        int hours = totalTime / 60;
        int minutes = totalTime % 60;
        System.out.println("Общая продолжительность плейлиста: " + hours + " часов " + minutes + " минут");
    }
}