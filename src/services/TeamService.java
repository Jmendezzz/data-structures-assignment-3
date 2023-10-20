package services;

import models.Team;

import java.util.List;
import java.util.Set;

public interface TeamService {
  void addTeam(Team team);
  List<Team> getAllTeams();
}
