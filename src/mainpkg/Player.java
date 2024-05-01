/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author KENKA
 */
public class Player {
    private String playerName;
    private String playerId;
    private String playerAge;
    private String playerContact;
    private String playerAddress;
    private String playerBloodGroup;
    private float playerHeight;
    private float playerWeight;

    public Player(String name, String id, String age, String contact, String address, String bloodGroup, float height, float weight) {
        this.playerName = name;
        this.playerId = id;
        this.playerAge = age;
        this.playerContact = contact;
        this.playerAddress = address;
        this.playerBloodGroup = bloodGroup;
        this.playerHeight = height;
        this.playerWeight = weight;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setPlayerAge(String playerAge) {
        this.playerAge = playerAge;
    }

    public void setPlayerContact(String playerContact) {
        this.playerContact = playerContact;
    }

    public void setPlayerAddress(String playerAddress) {
        this.playerAddress = playerAddress;
    }

    public void setPlayerBloodGroup(String playerBloodGroup) {
        this.playerBloodGroup = playerBloodGroup;
    }

    public void setPlayerHeight(float playerHeight) {
        this.playerHeight = playerHeight;
    }

    public void setPlayerWeight(float playerWeight) {
        this.playerWeight = playerWeight;
    }

    public String getPlayerAge() {
        return playerAge;
    }

    public String getPlayerContact() {
        return playerContact;
    }

    public String getPlayerAddress() {
        return playerAddress;
    }

    public String getPlayerBloodGroup() {
        return playerBloodGroup;
    }

    public float getPlayerHeight() {
        return playerHeight;
    }

    public float getPlayerWeight() {
        return playerWeight;
    }

    
}

