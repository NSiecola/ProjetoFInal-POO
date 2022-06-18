package br.inatel.C206.ProjetoFinal.Ingredientes;

public class IngredienteExtra {

    private double preco;
    private String ingrediente;

    public void criaIngrediente() {

    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getIngrediente() {
        System.out.println("Ingrediente extra: " + ingrediente);
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

}
