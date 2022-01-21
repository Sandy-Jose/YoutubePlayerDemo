package com.sandy.YoutubePlayerDemo;


public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        YoutubePlayer myPlayer = new YoutubePlayer();
        myPlayer.setup();
        myPlayer.search("NF-Search");
        myPlayer.play();
    }
}
