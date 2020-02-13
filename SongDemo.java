package com.CarlosDegollado;

public class SongDemo {
    public static void main(String[] args)
    {
        FolkSong f1 = new FolkSong("De Colores", "Justo Llamas", "ES", 2007);
        System.out.println(f1.toString());
        FolkSong f2 = new FolkSong("La Bamba", "Los Lobos", "ES", 2007);
        System.out.println(f2.toString());
        FolkSong f3 = new FolkSong("De Colores", "Tish Hinojosa", "ES", 1997);

        System.out.println(f2.equals(f3));
        System.out.println(f2.equals(f1));
    }
}
