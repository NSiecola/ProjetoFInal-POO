package br.inatel.C206.ProjetoFinal.Ingredientes;

public class Nutella extends IngredienteExtra{

    @Override
    public void criaIngrediente() {
        super.criaIngrediente();
        setPreco(2.00);
        setIngrediente("Nutella.");
    }

}
