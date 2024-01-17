package org.example;


import java.util.List;
import java.util.Set;
import java.util.SimpleTimeZone;

public class MileService{

    private FavoritesService favoritesService;

    public void setFavoritesService(FavoritesService favoritesService) {
        this.favoritesService = favoritesService;
    }

    public void sendEmail(Set<Song> songs) {
        String email = "test@mail.ru";
        if (!songs.isEmpty()) {
            StringBuilder message = new StringBuilder();
            for (Song song : songs) {
                message.append(song.getInfo()).append("\n");
            }
            System.out.println("Сообщение: \nВаши избранные композиции: \n" + message + "отправлены на " + email);
            System.out.println("Количество: " + songs.size());
        } else {
            System.out.println("В вашем списке нет избранных композиций");
        }
    }
}