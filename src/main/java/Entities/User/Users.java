/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities.User;

import java.util.ArrayList;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com>
 * @date 03/05/2024
 * @brief class Users
 */
public class Users {

    private ArrayList<RegistrationUser> users;

    public Users() {
        users = new ArrayList<>();
    }

    public ArrayList<RegistrationUser> getUsers() {
        return users;
    }

    public void addUser(RegistrationUser user) {
        users.add(user);
    }

    public void removeUser(RegistrationUser user) {
        users.remove(user);
    }

    public boolean loginemail(String email, String senha) {
        for (RegistrationUser a : users) {
            if (a.getEmail().equals(email)) {
               if(a.getSenha().equals(senha)){
                   //o email e senha da certo
               }else{
                   //email ta certo e senha errada
               }
            }else{
                //email errado ou não existe
            }
        }
        return true;
    }

    public boolean loginCPF(long CPF, String senha) {
        for (RegistrationUser a : users) {
            if (a.getCPF() == CPF) {
               if(a.getSenha().equals(senha)){
                   //o CPF e senha da certo
               }else{
                   //CPF ta certo e senha errada
               }
            }else{
                //CPF errado ou não existe
            }
        }
        
        return true;
    }

}
