package cwiczenia3;


public class Main {
    public static void main(String[] args) {

        MusicLibrary myLibrary = new MusicLibrary("Kolekcja Rockowa", "LukasS33771");
        myLibrary.addSong("Led Zeppelin - Stair to Heaven");
        myLibrary.addSong("Queen - Bohemian Rhapsody");
        myLibrary.addSong("AC/DC - Back in Black");
        myLibrary.addSong("Metallica - Nothing Else Matters");

        PlayList firstPlayList = new PlayList("Party", myLibrary);
        PlayList secondPlayList = new PlayList("Driving", myLibrary);

        System.out.println();
        firstPlayList.addSong("Led Zeppelin - Stair to Heaven");
        firstPlayList.addSong("Queen - Bohemian Rhapsody");
        secondPlayList.addSong("AC/DC - Back in Black");
        secondPlayList.addSong("Metallica - Nothing Else Matters");
        System.out.println();

        myLibrary.showAllPlayLists();
        myLibrary.getSpecificPlayList("Party");
        myLibrary.findSpecificSong("Queen");
        myLibrary.getAmountOfPlayLists();
        myLibrary.removeSongFromPlayList(firstPlayList,"Led Zeppelin - Stair to Heaven");
        firstPlayList.viewSongs();





    }
}
