package models;

import java.util.HashSet;
import java.util.Set;

public class Team {
  private Set<String> players;

  public Team(String ...names){
    players = new HashSet<>();
    for (String name : names){
      players.add(name);
    }
  }

  public Set<String> getPlayers() {
    return players;
  }
}
