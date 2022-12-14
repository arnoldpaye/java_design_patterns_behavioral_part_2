package state_pattern_example;

public class PausedState implements State {
  @Override
  public void pause(MediaPlayer mediaPlayer) {

  }

  @Override
  public void play(MediaPlayer mediaPlayer) {
    mediaPlayer.setState(new PlayingState());
    mediaPlayer.setIcon("pause button");
    System.out.println("Video playing, icon set to " + mediaPlayer.getIcon());
  }
}
