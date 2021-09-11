package bookstoreCredit;

public class MetodoCreditoAluno {

    public BookstoreCredit calculaCredito(double mediaNota, String nomeAluno, double valorCredito) {
        BookstoreCredit bookstoreCredit = new BookstoreCredit();
        bookstoreCredit.setMediaNota(mediaNota);
        bookstoreCredit.setNomeAluno(nomeAluno);
        bookstoreCredit.setValorCredito(mediaNota * 10);

        return bookstoreCredit;

    }

}
