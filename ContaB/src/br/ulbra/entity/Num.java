package br.ulbra.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Num {

    public ArrayList<Integer> numero;

    public Num() {
        numero = new ArrayList<Integer>();
    }

    public void salvar(int valor) {
        numero.add(valor);
        JOptionPane.showMessageDialog(null,
                valor + ", Salvo com sucesso!");
    }

    public String getNum() {
        String lista = "Lista dos número\n";
        if (!numero.isEmpty()) {
            for (int i = 0; i < numero.size(); i++) {
                lista += (i + 1) + "-" + numero.get(i) + "\n";
            }
        } else {
            lista = "Lista de numeros vazia!";
        }
        return lista;
    }

    public void excluir(int i) {
        i = i - 1;
        if (!numero.isEmpty()) {
            if (i >= 0 && i < numero.size()) {
                numero.remove(i);
                JOptionPane.showMessageDialog(
                        null, "Registro removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(
                        null, "Registro não existe!");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Lista vazia, impossivel excluir");
        }
    }

    public void alterar(int indice, int numNovo) {
        indice = indice - 1;
        if (!numero.isEmpty()) {
            if (indice >= 0 && indice < numero.size()) {
                numero.set(indice, numNovo);
                JOptionPane.showMessageDialog(
                        null, "Registro removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(
                        null, "Registro não existe!");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Lista vazia, impossivel excluir");
        }
    }

  public int buscar(int elemento) {
        boolean achou = false; 
        int i = 0;
        int n = 0;
        if (!numero.isEmpty()) {
            while (i < numero.size() && !achou) {
                if (elemento == numero.get(i)) {
                    n = elemento;
                   achou=true;
                }else{
                    i++;
                }
            }//fim loop
        }
            if (!achou) {
                JOptionPane.showMessageDialog(null, " Valor não existe na lista!");
            }
            return n;
    }

    public String listarPares() {
        String lista = "Lista dos número pares\n";
        if (!numero.isEmpty()) {
            for (int num = 0; num < numero.size(); num++) {
                if(numero.get(num)%2==0){
                lista += (num + 2) + "-" + numero.get(num) + "\n";
                }
         
        }} else {
            lista = "Lista de numeros vazia!";
        }
        return lista;
    } 
    public String listarImpares() {
        String lista = "Lista dos número impares\n";
        if (!numero.isEmpty()) {
            for (int num = 0; num < numero.size(); num++) {
                if(numero.get(num)%2!=0){
                lista += (num + 2) + "-" + numero.get(num) + "\n";
                }
         
        }} else {
            lista = "Lista de numeros vazia!";
        }
        return lista;
}

    public String buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    /**
     *
     */
    public void ordenarLista() {
    if (!numero.isEmpty()) {
        Collections.sort(numero);
        JOptionPane.showMessageDialog(null, "Lista ordenada com sucesso!");
    } else {
        JOptionPane.showMessageDialog(null, "Lista vazia, impossível ordenar!");
    }
}public double calcularMedia() {
    double soma = 0;
    if (!numero.isEmpty()) {
        for (int i = 0; i < numero.size(); i++) {
            soma += numero.get(i);
        }
        return soma / numero.size();
    } else {
        JOptionPane.showMessageDialog(null, "Lista vazia, impossível calcular a média!");
        return 0;
    }
}

public int getNumeroMaximo() {
    if (!numero.isEmpty()) {
        int maximo= numero.get(0);
        for (int i = 1; i < numero.size(); i++) {
            if (numero.get(i) > maximo) {
                maximo = numero.get(i);
            }
        }
        return maximo;
    } else {
        JOptionPane.showMessageDialog(null, "Lista vazia, impossível encontrar o número máximo!");
        return 0;
    }
}

public int getNumeroMinimo() {
    if (!numero.isEmpty()) {
        int minimo = numero.get(0);
        for (int i = 1; i < numero.size(); i++) {
            if (numero.get(i) < minimo) {
               minimo= numero.get(i);
            }
        }
        return minimo;
    } else {
        JOptionPane.showMessageDialog(null, "Lista vazia, impossível encontrar o número mínimo!");
        return 0;
    }
}}