package cwiczenia3;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {

    private String Collection;
    private String ownerName;
    private List<PlayList> playLists = new ArrayList<>();
    private List<String> songs = new ArrayList<>();

    public String getCollection() {
        return Collection;
    }

    public void setCollection(String collection) {
        Collection = collection;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addSong(String element) {
        songs.add(element);
    }

    public MusicLibrary(String collection, String ownerName) {
        Collection = collection;
        this.ownerName = ownerName;
    }

    public void addPlayList(PlayList playList) {
        playLists.add(playList);
    }

    public void showAllPlayLists() {
        for (PlayList playList : playLists) {
            System.out.println(playList);
        }
        System.out.println();
    }

    public void getSpecificPlayList(String name) {
        for (PlayList playList : playLists) {
            if (playList.getName().equals(name)) {
                playList.viewSongs();
            }
        }
    }

    public void findSpecificSong(String element) {
        for (PlayList playList : playLists) {
            playList.findSong(element);
        }
    }

    public void getAmountOfPlayLists() {
        System.out.println("Total number of PlayLists: " + playLists.size());
    }

    public void removeSongFromPlayList(PlayList playList, String nameOfSong) {
        for (PlayList element : playLists) {
            if (element.getName().equals(playList.getName())) {
                playList.removeSong(nameOfSong);
            }

        }
    }
}
