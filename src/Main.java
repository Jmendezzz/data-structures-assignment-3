import models.Team;
import services.TeamService;
import services.imp.TeamServiceImp;

import java.util.Set;

public class Main {
  public static void main(String[] args) {
    TeamService teamService = new TeamServiceImp();
    //Team 1:
    Team team1 = new Team("Zurdo", "Arango", "Perez", "Gallo");
    Set<String> playersTeam1 = team1.getPlayers();
    teamService.addTeam(team1);
    //Show players' names.
    playersTeam1.forEach(System.out::println);
    //Does Celestino exist in team 1?
    boolean isCelestinoInTeam = playersTeam1.contains("Celestino");
    if(isCelestinoInTeam){
      System.out.println("Celestino está en el equipo");
    }else {
      System.out.println("Celestino no está en el equipo");
    }

    //Team 2:
    Team team2 = new Team("Riquelme", "Asprilla ");
    Set<String> playersTeam2 = team2.getPlayers();
    teamService.addTeam(team2);

    //Are playersTeam2 contained in playersTeam1?
     long numberOfPlayersInTeam1 = playersTeam2.stream()
                                                .filter(p->playersTeam1.contains(p))
                                                .count();

     if(playersTeam2.size() > numberOfPlayersInTeam1){
       System.out.println("El equipo 1 no contiene a todos los jugadores del equipo 2.");
     }else{
       System.out.println("El equipo 1 contiene a todos los jugadores del equipo 2.");
     }

     //Union
     playersTeam1.addAll(playersTeam2);
     //Deleting all players from team2
     playersTeam2.clear();
     System.out.println(playersTeam2.size());
  }
}