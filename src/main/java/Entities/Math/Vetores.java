/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities.Math;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 04/05/2024
 * @brief Class Vetores
 */
public class Vetores {

    private Double x;
    private Double y;
    
    private List<Vetores> vetors = new ArrayList<>();

    public Vetores() {
    }

    public Vetores(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
    
    public void addVetores(Vetores vetor){
        vetors.add(vetor);
    }
    
    public void addRemove(Vetores vetor){
        vetors.remove(vetor);
    }
    
    public void VetoresNoPlano(Double x1, Double y1, Double x2, Double y2){
        Double modulo = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    }
    public void ProdutoEscalar(Double x1, Double y1, Double x2, Double y2){
        Double escalar = (x1*x2) + (y1*y2);
    }
    public void AnguloEntreVetores(Double x1, Double y1, Double x2, Double y2){
        Double angulo = ((x1*x2)+(y1*y2)) / ( (Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)) ) *
                (Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)) ));
    }
    public void Ortogonalidade(Double x1, Double y1, Double x2, Double y2){
        Double ortogonal = x1*x2 + y1*y2;
        if(ortogonal == 0 ){
            //é ortogonal
        }
    }
    public void ProdutoVetorial(Double x1, Double y1, Double x2, Double y2){
        
    }
    
    public void SepararVetor(Integer primeiro, Integer segundo){
        Vetores vetor1 = vetors.get(primeiro);
        Vetores vetor2 = vetors.get(segundo);
        
        Double x1 = vetor1.getX();
        Double y1 = vetor1.getY();
        Double x2 = vetor1.getX();
        Double y2 = vetor1.getY();
        
        VetoresNoPlano(x1, y1, x2, y2);
        ProdutoEscalar(x1, y1, x2, y2);
        AnguloEntreVetores(x1, y1, x2, y2);
        Ortogonalidade(x1, y1, x2, y2);
        ProdutoVetorial(x1, y1, x2, y2);
        
        
    }
}
