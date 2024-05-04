package solicitaCep;

import java.util.Scanner;

public class SolicitaCep {
    private String guardaCep;

    public String getGuardaCep() {
        return guardaCep;
    }

    public void setGuardaCep(String guardaCep) {
        this.guardaCep = guardaCep;
    }

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        SolicitaCep inseriCep = new SolicitaCep();
        System.out.println("Digite um CEP, com oito digitos: ");
        inseriCep.setGuardaCep(leitura.nextLine());


    }
}
