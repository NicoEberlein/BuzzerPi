package de.ontourforjesus.buzzerpi.gamemodes;

import de.ontourforjesus.buzzerpi.gamemodedata.GameModeData;
import de.ontourforjesus.buzzerpi.gamemodedata.GameModeWhoWasFirstData;
import de.ontourforjesus.buzzerpi.io.DigitalInputDetector;
import de.ontourforjesus.buzzerpi.io.DigitalInputListener;

public class GameModeWhoWasFirst extends GameMode implements DigitalInputListener{	
	
	private GameModeWhoWasFirstData data;
	
	private boolean alreadyBuzzered;
	
	public GameModeWhoWasFirst(DigitalInputDetector digitalInputDetector) {
		
		alreadyBuzzered = false;
		data = new GameModeWhoWasFirstData();
		digitalInputDetector.registerListener(this);
		
	}
	
	@Override
	public void inform(int pressedBuzzer) {
		
		if(!alreadyBuzzered) {
			data.setWhoBuzzeredFirst(pressedBuzzer);
			alreadyBuzzered = true;
		}
		
	}
	
	public void reset() {
		alreadyBuzzered = false;
		data = new GameModeWhoWasFirstData();
	}

	public GameModeData getGameModeData() {
		return data;
	}
	
	
}
