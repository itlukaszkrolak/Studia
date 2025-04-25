package cwiczenia3;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String name;
    private List<String> listOfSongs = new ArrayList<>();

    public PlayList(String name, MusicLibrary musicLibrary) {
        this.name = name;
        musicLibrary.addPlayList(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getListOfSongs() {
        return listOfSongs;
    }

    public void addSong(String nameOfSong) {
        if (nameOfSong != null && !nameOfSong.isBlank() && !listOfSongs.contains(nameOfSong)) {
            listOfSongs.add(nameOfSong);

            System.out.println("Song \"" + nameOfSong + "\"" + " was successfully added to your playlist.");
        } else {

            System.out.println("This song already exist in this playlist.");
        }

    }

    public void removeSong(String nameOfSong) {
        listOfSongs.remove(nameOfSong);
        System.out.println("Song " + "\"" + nameOfSong + "\"" + " was successfully removed from this playlist");
    }

    public void viewSongs() {
        System.out.println("Play list: " + name);
        for (int i = 0; i < listOfSongs.size(); i++) {
            System.out.println("Song nr." + i + " " + listOfSongs.get(i));
        }
        System.out.println();
    }

    public void findSong(String song) {
        if (song != null) {

            for (int i = 0; i < listOfSongs.size(); i++) {
                if (listOfSongs.get(i).contains(song)) {
                    System.out.println("Song nr." + i + " was found in playlist: " + listOfSongs.get(i));
                }

            }
            System.out.println();
        }

    }

    @Override
    public String toString() {
        return "PlayList: |" + "name = " + name + ", listOfSongs = " + listOfSongs + '|';
    }
}
