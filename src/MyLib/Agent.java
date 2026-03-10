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

    @Override
    public boolean login() {
        return 100314 == agentID && "agent321$".equals(getPassword());
    }
}
