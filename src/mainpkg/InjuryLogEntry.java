/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author KENKA
 */
class InjuryLogEntry {

    static Object getItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String playerName;
    private String playerId;
    private String injuryType;
    private String injuryLocation;

    public InjuryLogEntry(String playerName, String playerId, String injuryType, String injuryLocation) {
        this.playerName = playerName;
        this.playerId = playerId;
        this.injuryType = injuryType;
        this.injuryLocation = injuryLocation;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getInjuryType() {
        return injuryType;
    }

    public String getInjuryLocation() {
        return injuryLocation;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setInjuryType(String injuryType) {
        this.injuryType = injuryType;
    }

    public void setInjuryLocation(String injuryLocation) {
        this.injuryLocation = injuryLocation;
    }

   
}
