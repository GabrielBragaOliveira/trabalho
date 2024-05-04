/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entities.User;

import java.util.Date;

/**
 *
 * @author Felipe Borges Carvalho <felipeborgesmelo80@gmail.com>
 * @date 03/05/2024
 * @brief class User
 */
public class RegistrationUser {
    
    private String nome;
    private long CPF;
    private Date nacimento;
    private Integer idade;
    private String email;
    private long telefone;
    private String senha;

    public RegistrationUser() {
    }

    public RegistrationUser(String nome, long CPF, Date nacimento, Integer idade, String email, long telefone, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.nacimento = nacimento;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        
    }

    public String getNome() {
        return nome;
    }

    public long getCPF() {
        return CPF;
    }

    public Date getNacimento() {
        return nacimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }

    
    
    public static void validarCPF(long CPF){
        	
    }
}
