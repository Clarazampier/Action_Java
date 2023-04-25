import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Colaborador> colaboradores = new ArrayList<>();

        Colaborador colaborador1 = new Colaborador("Atlas", "123.456.789-00", "(11) 99999-9999", "01/01/1990", "26/04/2023", "manhã");
        Colaborador colaborador2 = new Colaborador("Rhys", "987.654.321-00", "(11) 88888-8888", "02/02/1990", "27/04/2023", "tarde");
        Colaborador colaborador3 = new Colaborador("Azriel", "111.222.333-44", "(11) 77777-7777", "03/03/1990", "28/04/2023", "noite");

        colaboradores.add(colaborador1);
        colaboradores.add(colaborador2);
        colaboradores.add(colaborador3);

        for (Colaborador colaborador : colaboradores) {
            System.out.println("Nome: " + colaborador.getNome());
            System.out.println("CPF: " + colaborador.getCpf());
            System.out.println("Telefone: " + colaborador.getTelefone());
            System.out.println("Data de Nascimento: " + colaborador.getDataNascimento());
            System.out.println("Data de Agendamento: " + colaborador.getDataAgendamento());
            System.out.println("Período: " + colaborador.getPeriodo());
            System.out.println();
        }
    }
}