package com.github.sportsleaguemanagement.modules.team;

import com.github.sportsleaguemanagement.modules.player.Player;

public class Team {
    public String teamName;
    public int teamSize;

    public Player coach;
    public Player manager;
    public Player captain;

    public Player[] players;

    public Team(String teamName, Player manager, Player coach, Player[] players) {
        this.teamName = teamName;
        this.teamSize = players.length;
        this.coach = coach;
        this.manager = manager;
        this.players = players;
    }
}
