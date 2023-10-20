package services.imp;

import models.Team;
import repositories.TeamRepository;
import repositories.imp.TeamRepositoryImp;
import services.TeamService;
import java.util.List;


public class TeamServiceImp implements TeamService {

 private final TeamRepository teamRepository;
 public TeamServiceImp(){
   this.teamRepository = new TeamRepositoryImp();
 }
  @Override
  public void addTeam(Team team) {
    teamRepository.addTeam(team);
  }

  @Override
  public List<Team> getAllTeams() {
    return teamRepository.getAllTeams();
  }
}
