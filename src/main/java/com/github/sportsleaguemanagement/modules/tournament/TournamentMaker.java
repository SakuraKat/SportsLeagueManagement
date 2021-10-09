package com.github.sportsleaguemanagement.modules.tournament;

import java.util.ArrayList;

@FunctionalInterface
public interface TournamentMaker {
    ArrayList<Match> CreateMatch();
}
