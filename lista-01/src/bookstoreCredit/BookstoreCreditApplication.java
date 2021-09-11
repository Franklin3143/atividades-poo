package bookstoreCredit;

import java.util.Scanner;

public class BookstoreCreditApplication {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        BookstoreCredit bookstoreCredit = new BookstoreCredit();
        MetodoCreditoAluno metodoCreditoAluno = new MetodoCreditoAluno();


        System.out.println("Digite o nome do aluno: ");
        bookstoreCredit.setNomeAluno(leitura.next());
        System.out.println("Digite a média de nota: ");
        bookstoreCredit.setMediaNota(leitura.nextDouble());

        BookstoreCredit creditoAluno = metodoCreditoAluno.calculaCredito(bookstoreCredit.getMediaNota(),
                bookstoreCredit.getNomeAluno(), bookstoreCredit.getValorCredito());

        System.out.println("O aluno " + bookstoreCredit.getNomeAluno() + " possui a média "+
                bookstoreCredit.getMediaNota() + " e possui R$" + creditoAluno.getValorCredito() +
                " em créditos.");




    }
}
