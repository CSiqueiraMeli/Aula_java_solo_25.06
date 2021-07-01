public class Teste {

    public static void main(String[] args){
        Pessoa[] pessoas = {
                new Pessoa("Pedo", "156975080"),
                new Pessoa("Afonso", "956545649"),
                new Pessoa("Cleberson", "765805406"),
                new Pessoa("Juliana", "276749760"),
                new Pessoa("Jucemara", "1786876897")
        };

        SortUtil.sort(pessoas);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        Celular[] celulares = {
                new Celular("91 956069759", "Samsung galaxy s9"),
                new Celular("56 97067 5484", "Moto G100"),
                new Celular("34 96470 9765", "Xperia Z"),
                new Celular("11 96534 0756", "Iphone 12"),
                new Celular("89 96754 9876", "Rog phone 5")
        };

        SortUtil.sort(celulares);

        for(Celular celular : celulares){
            System.out.println(celular);
        }



    }
}
