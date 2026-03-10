/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Christian Aranza
 */
public class Client extends SystemUser {
    private String email;

    public Client(String email, String password) {
        super(password);
        this.email = email;
    }

    @Override
    public boolean login() {
        return "client@gmail.com".equals(email) && "client123#".equals(getPassword());
    }
}
