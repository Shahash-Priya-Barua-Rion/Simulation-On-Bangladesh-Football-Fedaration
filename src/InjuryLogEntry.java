import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InjuryLogEntry {

    private final StringProperty playerName;
    private final StringProperty playerId;
    private final StringProperty injuryType;
    private final StringProperty injuryLocation;

    public InjuryLogEntry(String playerName, String playerId, String injuryType, String injuryLocation) {
        this.playerName = new SimpleStringProperty(playerName);
        this.playerId = new SimpleStringProperty(playerId);
        this.injuryType = new SimpleStringProperty(injuryType);
        this.injuryLocation = new SimpleStringProperty(injuryLocation);
    }

    public String getPlayerName() {
        return playerName.get();
    }

    public String getPlayerId() {
        return playerId.get();
    }

    public String getInjuryType() {
        return injuryType.get();
    }

    public String getInjuryLocation() {
        return injuryLocation.get();
    }

    public StringProperty playerNameProperty() {
        return playerName;
    }

    public StringProperty playerIdProperty() {
        return playerId;
    }

    public StringProperty injuryTypeProperty() {
        return injuryType;
    }

    public StringProperty injuryLocationProperty() {
        return injuryLocation;
    }
}
