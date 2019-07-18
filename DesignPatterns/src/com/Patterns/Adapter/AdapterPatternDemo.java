package com.Patterns.Adapter;

public class AdapterPatternDemo
{


  public static void main(String[] args)
  {
    AudioPlayer audioPlayer = new AudioPlayer();

    audioPlayer.play("vlc", "abc.vlc");
    audioPlayer.play("mp4", "cde.mp4");
    audioPlayer.play("mp3", "efg.mp3");
    audioPlayer.play("mkv", "hij.mkv");
  }


}
