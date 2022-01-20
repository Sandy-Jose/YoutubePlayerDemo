package com.sandy.YoutubePlayerDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        YoutubePlayer myPlayer = new YoutubePlayer();
        myPlayer.setup();
        myPlayer.search("NF-Search");
        myPlayer.play();
    }
}
