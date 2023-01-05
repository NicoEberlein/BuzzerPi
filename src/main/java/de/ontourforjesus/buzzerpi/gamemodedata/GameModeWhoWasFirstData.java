package de.ontourforjesus.buzzerpi.gamemodedata;

import org.springframework.context.annotation.PropertySource;

public class GameModeWhoWasFirstData extends GameModeData{

	private final GameModeType gameModeType = GameModeType.WhoWasFirst;
	
	//No one has pressed a buzzer yet: firstBuzzer = -1
	private int firstBuzzer;
	
	private String teamBackgroundColor;
	
	private final String[] teamBackgroundColors = new String[] {"#99FF00", "#FFCC00","#CC0000"};
	
	public GameModeWhoWasFirstData() {
		firstBuzzer = -1;
		teamBackgroundColor = null;
	}
	
	public void setWhoBuzzeredFirst(int whoBuzzeredFirst) {
		
		firstBuzzer = whoBuzzeredFirst;
		teamBackgroundColor = teamBackgroundColors[whoBuzzeredFirst];
		
	}
	
	public int getFirstBuzzer() {
		return firstBuzzer;
	}
	
	public GameModeType getGameModeType() {
		return gameModeType;
	}
	
	public String getTeamBackgroundColor() {
		return teamBackgroundColor;
	}
	
	
	
	
	
}
