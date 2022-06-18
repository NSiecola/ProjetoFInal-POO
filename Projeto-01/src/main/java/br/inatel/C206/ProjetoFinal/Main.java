package br.inatel.C206.ProjetoFinal;

import br.inatel.C206.ProjetoFinal.Controle.Arquivo;
import br.inatel.C206.ProjetoFinal.Ingredientes.Confete;
import br.inatel.C206.ProjetoFinal.Ingredientes.IngredienteExtra;
import br.inatel.C206.ProjetoFinal.Ingredientes.LeiteNinho;
import br.inatel.C206.ProjetoFinal.Ingredientes.Nutella;
import br.inatel.C206.ProjetoFinal.Sorvetes.SorveteDeBaunilha;
import br.inatel.C206.ProjetoFinal.Sorvetes.SorveteDeChocolate;
import br.inatel.C206.ProjetoFinal.Sorvetes.SorvetePrincipal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean flag = true;
        boolean flag2 = true;
        boolean error;

        Scanner sc = new Scanner(System.in);

        IngredienteExtra ingrediente;

        SorvetePrincipal sorvete = null;

        while (flag2) {

            while (flag) {

                error = false;

                System.out.println("***BEM VINDO A SORVETERIA DO NICKÃO!***");
                System.out.println("-----------------------------------------");
                System.out.println("Escolha o sabor do seu sorvete!");
                System.out.println("1- Sorvete de chocolate");
                System.out.println("2- Sorvete de baunilha");

                int choice1 = 0;

                try {
                    choice1 = sc.nextInt();
                } catch (InputMismatchException e) {
                    error = true;
                    System.out.println("   *****OPÇÃO INVÁLIDA!*****   ");
                    System.out.println("VOLTANDO PARA O MENU PRINCIPAL!");
                    System.out.println();
                    sc.nextLine();
                    break;
                }

                switch (choice1) {
                    case 1: // SORVETE DE CHOCOLATE
                        sc.nextLine();
                        SorveteDeChocolate s1 = new SorveteDeChocolate();

                        System.out.println("Quantas bolas você vai querer?");

                        try {
                            s1.setQuantidadeDeBolas(sc.nextInt());
                        } catch (InputMismatchException e) {
                            error = true;
                            System.out.println("   *****OPÇÃO INVÁLIDA!*****   ");
                            System.out.println("VOLTANDO PARA O MENU PRINCIPAL!");
                            System.out.println();
                            sc.nextLine();
                            break;
                        }

                        sorvete = s1;

                        break;

                    case 2: // SORVETE DE BAUNILHA
                        sc.nextLine();
                        SorveteDeBaunilha s2 = new SorveteDeBaunilha();

                        System.out.println("Quantas bolas você vai querer?");

                        try {
                            s2.setQuantidadeDeBolas(sc.nextInt());
                        } catch (InputMismatchException e) {
                            error = true;
                            System.out.println("   *****OPÇÃO INVÁLIDA!*****   ");
                            System.out.println("VOLTANDO PARA O MENU PRINCIPAL!");
                            System.out.println();
                            sc.nextLine();
                            break;
                        }

                        sorvete = s2;

                        break;

                    default:
                        error = true;
                        System.out.println("   *****OPÇÃO INVÁLIDA!*****   ");
                        System.out.println("VOLTANDO PARA O MENU PRINCIPAL!");
                        System.out.println();
                } // ESCOLHA DO SORVETE

                if(error == true)
                    break;

                System.out.println("Adicionar algum ingrediente extra?");
                System.out.println("1 - Para sim!");
                System.out.println("2 - Para não!");

                int choice2 = 0;

                try {
                    choice2 = sc.nextInt();
                } catch (InputMismatchException e) {
                    error = true;
                    System.out.println("   *****OPÇÃO INVÁLIDA!*****   ");
                    System.out.println("VOLTANDO PARA O MENU PRINCIPAL!");
                    System.out.println();
                    sc.nextLine();
                    break;
                }

                switch (choice2) {
                    case 1:
                        sc.nextLine();
                        System.out.println("Qual ingrediente você quer adicionar?");
                        System.out.println("1 - Para Nutella.");
                        System.out.println("2 - Para Leite Ninho.");
                        System.out.println("3 - Para Confete.");

                        int choice3 = 0;

                        try {
                            choice3 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            error = true;
                            System.out.println("   *****OPÇÃO INVÁLIDA!*****   ");
                            System.out.println("VOLTANDO PARA O MENU PRINCIPAL!");
                            System.out.println();
                            sc.nextLine();
                            break;
                        }

                        switch (choice3) {
                            case 1:
                                sc.nextLine();
                                IngredienteExtra ig1 = new Nutella();
                                ig1.criaIngrediente();

                                sorvete.addIngredienteNoSorvete(ig1);

                                ingrediente = ig1;

                                System.out.println("-----------------------------------------");
                                System.out.println("Obrigado pela compra!");
                                System.out.println("Segue o pedido abaixo: ");
                                sorvete.getSabor();
                                ingrediente.getIngrediente();
                                sorvete.getPreco();

                                flag = false;
                                flag2 = false;

                                break;

                            case 2:
                                sc.nextLine();
                                IngredienteExtra ig2 = new LeiteNinho();
                                ig2.criaIngrediente();

                                sorvete.addIngredienteNoSorvete(ig2);

                                ingrediente = ig2;

                                System.out.println("-----------------------------------------");
                                System.out.println("Obrigado pela compra!");
                                System.out.println("Segue o pedido abaixo: ");
                                sorvete.getSabor();
                                ingrediente.getIngrediente();
                                sorvete.getPreco();

                                flag = false;
                                flag2 = false;

                                break;

                            case 3:
                                sc.nextLine();
                                IngredienteExtra ig3 = new Confete();
                                ig3.criaIngrediente();

                                sorvete.addIngredienteNoSorvete(ig3);

                                ingrediente = ig3;

                                System.out.println("-----------------------------------------");
                                System.out.println("Obrigado pela compra!");
                                System.out.println("Segue o pedido abaixo: ");
                                sorvete.getSabor();
                                ingrediente.getIngrediente();
                                sorvete.getPreco();

                                flag = false;
                                flag2 = false;

                                break;

                            default:
                                error = true;
                                System.out.println("   *****OPÇÃO INVÁLIDA!*****   ");
                                System.out.println("VOLTANDO PARA O MENU PRINCIPAL!");
                                System.out.println();

                        } // ESCOLHA DO INGREDIENTE EXTRA
                        break;

                    case 2:
                        System.out.println("Segue o pedido abaixo: ");
                        sorvete.getSabor();
                        sorvete.getPreco();

                        flag = false;
                        flag2 = false;
                        break;

                    default:
                        error = true;
                        System.out.println("   *****OPÇÃO INVÁLIDA!*****   ");
                        System.out.println("VOLTANDO PARA O MENU PRINCIPAL!");
                        System.out.println();
                } // ESCOLHA SE QUER OU NÃO INGREDIENTE EXTRA

                if(error == true)
                    break;

                Arquivo arquivo = new Arquivo();
                arquivo.escrever(sorvete);

                ArrayList<SorvetePrincipal> sorvetePrincipalArrayList = new ArrayList<>();
                sorvetePrincipalArrayList = arquivo.ler();

            }
        }
    }



}
