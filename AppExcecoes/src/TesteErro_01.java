public class TesteErro_01 {
    public static void main(String[] args) {
        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Início do método 1");
        try {
            metodo2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
        }

        System.out.println("Fim do método 1");
    }

    public static void metodo2() {
        System.out.println("Início do metodo 2");
        int[] array = new int[10];

        //try {
        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);
        }
        //} catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println("Erro: " + e);
        //}

        System.out.println("Fim do método 2");
    }
}
