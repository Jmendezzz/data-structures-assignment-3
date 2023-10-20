package repositories.imp;

import models.Team;
import repositories.TeamRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TeamRepositoryImp implements TeamRepository {
  private final List<Team> teams= new ArrayList<>();
  @Override
  public void addTeam(Team team) {
    teams.add(team);
  }
  @Override
  public List<Team> getAllTeams() {
    return teams;
  }
}
