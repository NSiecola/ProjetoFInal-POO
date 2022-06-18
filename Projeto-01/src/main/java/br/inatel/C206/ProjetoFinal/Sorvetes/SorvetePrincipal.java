package br.inatel.C206.ProjetoFinal.Sorvetes;

import br.inatel.C206.ProjetoFinal.Ingredientes.IngredienteExtra;

public class SorvetePrincipal {

    public double preco;
    public String sabor;
    public int quantidadeDeBolas = 0;

    public SorvetePrincipal() {
    }

    public double getPreco() {
        System.out.println("O seu pedido ficou no valor de R$" + preco);
        return 0;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSabor() {
        System.out.println("Sorvete sabor de " + sabor + ".");
        System.out.println("Quantidade de bolas: " + quantidadeDeBolas);

        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setQuantidadeDeBolas(int quantidadeDeBolas) {
        preco = quantidadeDeBolas * preco;
        this.quantidadeDeBolas = quantidadeDeBolas;
    }

    public void addIngredienteNoSorvete(IngredienteExtra ig){
        double carrega = ig.getPreco();
        preco += carrega;
    }

}
