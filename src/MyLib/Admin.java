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
    private ArrayList<Agent> agents = new ArrayList<>();
    
    public Admin(int adminID, String name, String password) {
        super(name, password);
        this.adminID = adminID;
    }
    
    public boolean login(int adminID, String password) {
        return this.adminID == adminID &&
                this.getPassword().equals(password);
    }
    
    public int getAdmin() {
        return adminID;
    }
    
    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }
    
    public boolean addAgent(Agent agent) {
        if (agentExists(agent.getAgentID())) {
            return false;
        }
        return agents.add(agent);
    }
    
    public boolean removeAgent(int agentID) {
        for (Agent agent : agents) {
            if (agent.getAgentID() == agentID) {
                return agents.remove(agent);
            }
        }
        return false;
    }
    
    public boolean removeAgent(Agent agent) {
        return agents.remove(agent);
    }
    
    public boolean agentExists(int agentID) {
        for (Agent agent : agents) {
            if (agent.getAgentID() == agentID)
                return true;
        }
        return false;
    }
    
    public Agent findAgent(int agentID) {
        for (Agent agent : agents) {
            if (agent.getAgentID() == agentID) {
                return agent;
            } 
        }
        return null;
    }
    
    public ArrayList<Agent> getAgents() {
        return agents;
    }

    public int getAgentCount() {
        return agents.size();
    }
    
    public void clearAgents() {
        agents.clear();
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
