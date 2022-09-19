package state_pattern_example;

public interface State {
  void pause(MediaPlayer mediaPlayer);
  void play(MediaPlayer mediaPlayer);
}
