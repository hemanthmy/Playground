package com.htnameh.kata;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class Dubstep {

    public static void main(String[] args) {
        System.out.println(songDecoder("RWUBWUBWUBLWUB"));
        System.out.println(songDecoder("WUBWUBIWUBAMWUBWUBX"));
        System.out.println(songDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }

    private static String songDecoder(String song) {
        return song.replaceAll("(WUB)+", " ").trim();
    }
}
