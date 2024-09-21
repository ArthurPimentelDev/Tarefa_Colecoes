import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa_Colecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes: ");
        String inputNomes = scanner.nextLine();

        String[] nomes = inputNomes.split(",");
        List<String> listaNomes = new ArrayList<>();
        for (String nome : nomes) {
            listaNomes.add(nome.trim());
        }

        Collections.sort(listaNomes);

        System.out.println("Nomes ordenados: " + listaNomes);

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome e o sexo (ex: Ana-F ou João-M), ou 'sair' para finalizar: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = entrada.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    grupoMasculino.add(nome);
                } else if (sexo.equals("F")) {
                    grupoFeminino.add(nome);
                } else {
                    System.out.println("Sexo inválido! Use 'M' para masculino e 'F' para feminino.");
                }
            } else {
                System.out.println("Formato inválido! Use o formato Nome-Sexo.");
            }
        }

        System.out.println("Grupo Masculino: " + grupoMasculino);
        System.out.println("Grupo Feminino: " + grupoFeminino);

        scanner.close();
    }
}
