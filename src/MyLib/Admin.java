/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

import java.util.ArrayList;

/**
 *
 * @author Christian Aranza
 */
public class Admin extends SystemUser {
    private int adminID;
    private EstateProperties properties;
    private ArrayList<Agent> agents = new ArrayList<>();
    
    public Admin(int adminID, String name, String password) {
        super(name, password);
        this.adminID = adminID;
    }
    
    public boolean login(int adminID, String password) {
        return this.adminID == adminID &&
                this.getPassword().equals(password);
    }
    
    public int getAdminID() {
        return adminID;
    }
   
    public void addAgent(int agentID, String name, String password) {
        agents.add(new Agent(agentID, name, password));
    }

    public boolean removeAgent(int agentID) {
        for (Agent agent : agents) {
            if (agent.getAgentID() == agentID) {
                return agents.remove(agent);
            }
        }
        return false;
    }
    
    public boolean agentExists(int agentID) {
        for (Agent agent : agents) {
            if (agent.getAgentID() == agentID)
                return true;
        }
        return false;
    }
    
    public ArrayList<Agent> getAgents() {
        return agents;
    }

    public int getAgentCount() {
        return agents.size();
    }

    public boolean updateAgent(int agentID, String newName, String newPassword) {
        for (Agent agent : agents) {
            if (agent.getAgentID() == agentID) {
                agent.setName(newName);
                agent.setPassword(newPassword);
                return true;
            }
        }
        return false;
    }
}
