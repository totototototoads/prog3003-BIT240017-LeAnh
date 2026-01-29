package com.mycompany.bai3;

public class HomeTheaterFacade {

    private TV tv;
    private SoundSystem sound;
    private DVDPlayer dvd;
    private Light light;

    public HomeTheaterFacade() {
        tv = new TV();
        sound = new SoundSystem();
        dvd = new DVDPlayer();
        light = new Light();
    }

    public void watchMovie() {
        System.out.println("Chuẩn bị xem phim...");
        light.dim();
        tv.on();
        sound.on();
        dvd.on();
        System.out.println("Đang xem phim 🎬");
    }
}
