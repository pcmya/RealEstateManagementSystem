/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Christian Aranza
 */
public class Agent extends SystemUser {
    private int agentID;

    public Agent(int agentID, String password) {
        super(password);
        this.agentID = agentID;
    }

    public boolean login(int agentID, String password) {
        return this.agentID == agentID &&
                this.getPassword().equals(password);
    }
    
    public int getAgentID(){
        return agentID;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
