package repositories;

import models.Team;

import java.util.List;
import java.util.Set;

public interface TeamRepository {
  void addTeam(Team team);
  List<Team> getAllTeams();
}
