package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
        public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            FavoritesService favoritesService = context.getBean("favoritesService", FavoritesService.class);
            favoritesService.addtofavor("Трек 1", "Трек 2");

            favoritesService.removeFromFavorites("Трек 4");
            favoritesService.addtoplaylist("Трек 1");
        }
}
