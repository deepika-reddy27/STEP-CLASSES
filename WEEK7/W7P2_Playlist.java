import java.util.Scanner;

class Playlist {

    private String[] songs;

    private int songCount;

    public Playlist(int maxSize) {
        songs = new String[maxSize];
        songCount = 0;
    }

    public void addSong(String song) {

        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        } else {
            System.out.println("Playlist is full.");
        }
    }

    public String[] getSongs() {

        String[] copy = new String[songCount];

        for (int i = 0; i < songCount; i++) {
            copy[i] = songs[i];
        }

        return copy;
    }

    public int getSongCount() {
        return songCount;
    }
}

public class W7P2_Playlist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum playlist size: ");
        int maxSize = sc.nextInt();

        sc.nextLine();

        Playlist p = new Playlist(maxSize);

        System.out.print("Enter number of songs to add: ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter song " + (i + 1) + ": ");
            String song = sc.nextLine();

            p.addSong(song);
        }

        System.out.println("\nSongs in playlist:");

        String[] copy = p.getSongs();

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

        System.out.println("Song count: " + p.getSongCount());

        // Modify the returned copy
        if (copy.length > 0) {
            copy[0] = "Hacked";
        }

        System.out.println("\nAfter modifying returned array:");

        String[] actualSongs = p.getSongs();

        for (int i = 0; i < actualSongs.length; i++) {
            System.out.println(actualSongs[i]);
        }

        sc.close();
    }
}