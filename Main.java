package com.krushna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import javax.security.auth.PrivateCredentialPermission;

public class Main {
    private static ArrayList<Album> albums=new ArrayList<>();
    
   public static void Main(String[] args){
        
     Album album=new Album("album1","AC/DC");

     album.addSong("TNT", 4.5);
     album.addSong("Highway to hell", 3.5);
     album.addSong("ThunderStruck", 5.0);

     album=new Album("Album2","Eminem");

     album.addSong("Rap God", 4.5);
     album.addSong("Not Afraid", 4.5);
     album.addSong("LOse Yourself", 4.5);

     albums.add(album);

     LinkedList<Song> playList_1=new LinkedList<>();

     albums.get(0).addToPlayList("TNT",playList_1);
     albums.get(0).addToPlayList("Highway to hell",playList_1);
     albums.get(0).addToPlayList("rap God",playList_1);
     albums.get(0).addToPlayList("Lose yourself",playList_1);

     play(playList_1);
   }

   private static void play(LinkedList<Song> playList){
  
   }

   private static void printMenu(){
            System.out.println("Available option\n press");
            System.out.println("0 - to quit\n" +
                                 "1 - to play next song\n" +
                                 "2 - to play previous song\n" +
                                 "3 - to play replay the current song\n "+
                                 "4 - list of all song\n" +
                                 "5 - print all available options\n"+
                                 "6 - delete cirrent song");
   }

   private static void printList(LinkedList<Song> playList){
    Iterator<Song> iterator = playList.iterator();
    System.out.println("----------------");

    while(iterator.hasNext());
    {
        System.out.println(iterator.next());
   }
   System.out.println("-------------------");
}

}

