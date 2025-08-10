import java.util.Scanner;

public class AtividadeMedica {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int escolha = Menu(scan);
            if (escolha == 0) break;
            switch (escolha) {
                case 1:
                    ClearStart(scan);
                    Cadastro(scan);
                    break;
                case 2:
                    ClearStart(scan);
                    CalcularIMC(scan);
                    break;
                case 3:
                    ClearStart(scan);
                    AgendamentoConsulta(scan);
                    break;
                case 4:
                    ClearStart(scan);
                    Consulta(scan);
                    break;
                case 5:
                    ClearStart(scan);
                    Funcaodoenca(scan);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            ClearEnd(scan, escolha);
        }
        System.out.println("Obrigado por nos visitar");
    }

    public static void ClearEnd(Scanner scan, int saida) {
        if (saida != 0) {
            System.out.println();
            System.out.println("---Digite qualquer coisa para continuar---");
            scan.next();
            for (int i = 0; i <= 10; i++) {
                System.out.println();
            }
        }
    }

    public static void ClearStart(Scanner scan) {
        for (int i = 0; i <= 10; i++) {
            System.out.println();
        }
    }

    public static int Menu(Scanner scan) {
        System.out.println("Seja bem vindo ao MENU!");
        System.out.println("1 - Cadastro");
        System.out.println("2 - Calcular IMC");
        System.out.println("3 - Agendar consulta");
        System.out.println("4 - Começar consulta");
        System.out.println("5 - Sintomas doença");
        System.out.println("0 - Sair do programa");
        System.out.print("Digite a sua escolha: ");
        return scan.nextInt();

    }

    public static void Cadastro(Scanner scan) {
        System.out.println("---Cadastro---");
        System.out.print("Qual é o seu nome?: ");
        String nomePaciente = scan.next();
        System.out.print("Qual é a sua idade?: ");
        int idadePaciente = scan.nextInt();
        System.out.print("Qual é o seu sexo: ");
        String sexo = scan.next();
        System.out.print("Qual é o seu cpf?: ");
        String cpf = scan.next();
        System.out.print("Toma algum remédio regular?: S para sim e N: ");
        String decisao = scan.next().toLowerCase();
        String remedio = "Nulo";
        if (decisao.equals("s")) {
            System.out.print("Digite o nome do medicamento: ");
            remedio = scan.next();
        }
        if (!remedio.equals("Nulo")) {
            System.out.println("Nome: " + nomePaciente + ". Idade: " + idadePaciente + ". Sexo:" + sexo + ". CPF: " + cpf + ". Remédio: " + remedio);
        } else {
            System.out.println("Nome: " + nomePaciente + ". Idade: " + idadePaciente + ". Sexo:" + sexo + ". CPF: " + cpf);
        }
        System.out.println("Confirmar cadastro?: Digite qualquer coisa na tela");
        scan.next();
        System.out.println("Cadastro confirmado!");
    }

    public static void AgendamentoConsulta(Scanner scan) {
        System.out.println("---Agendamento de Consulta---");
        System.out.println("Escolha a área que precisa:\n" +
                "1 - Psicologia\n" +
                "2 - Fisioterapia \n" +
                "3 - Nutrição\n" +
                "4 - Clínica geral");
        int especialista = scan.nextInt();
        String medico;
        switch (especialista) {
            case 1:
                medico = "Psicóloga(o)";
                break;
            case 2:
                medico = "Fisioterapeuta(o)";
                break;
            case 3:
                medico = "Nutricionista(o)";
                break;
            case 4:
                medico = "Clínico(a) geral";
                break;
            default:
                medico = "Clínico(a) geral";
                break;
        }
        System.out.println("Qual dia e o mês da consulta?: Exemplo: 11/3");
        String data = scan.next();
        System.out.println("Qual horário?: Exemplo:11h30: ");
        String horario = scan.next();
        System.out.print("Para a data " + data + " as " + horario + ". temos três opções de " + medico + ":\n" +
                "Raquel\n" +
                "Thiago\n" +
                "Samin\n" +
                "Digite o nome do médico que gostaria: ");
        String escolhaMedico = scan.next();
        System.out.println("Sua consulta com a(o) " + medico + " " + escolhaMedico + " ficou agendada para " + horario + " na data " + data);

    }

    public static void CalcularIMC(Scanner scan) {
        System.out.println("---Calculadora de IMC---");
        System.out.println("Qual seu peso?");
        double peso = scan.nextDouble();
        System.out.println("Qual sua altura em metros? (Ex: 1,75)");
        double altura = scan.nextDouble();


        double imc = (peso / (altura * altura));
        System.out.println("Seu IMC é: " + String.format("%.1f", imc));

        if (imc < 18.5) {
            System.out.println("Paciente abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Paciente com peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Paciente com sobrepeso.");
        } else System.out.println("Paciente com obesidade.");
    }

    public static void Funcaodoenca(Scanner scan) {
        System.out.println("--- INFORMAÇÕES SOBRE DOENÇAS ---");
        System.out.println("Digite o nome da doença: (Ex: hipertensao, pneumonia, insuficiencia cardiaca descompensada ou inicio de infarto): ");
        String doenca = scan.next();
        mostrarDoenca(doenca);
    }

    public static void mostrarDoenca(String doenca) {
        doenca = doenca.toLowerCase().trim();

        switch (doenca) {
            case "hipertensao":
                System.out.println(">> Doença: Hipertensão");
                System.out.println("Sintomas: Pode ser silenciosa, mas em casos mais graves causa dor de cabeça, tontura, visão embaçada e falta de ar.");
                System.out.println("Tratamento: Uso de medicamentos anti-hipertensivos, redução do sal na alimentação, exercícios físicos e acompanhamento médico.");
                break;

            case "pneumonia":
                System.out.println("Doença: Pneumonia");
                System.out.println("Sintomas: Febre alta, tosse com catarro, dor no peito, calafrios, falta de ar e cansaço.");
                System.out.println("Tratamento: Antibióticos (quando bacteriana), repouso, hidratação e acompanhamento médico.");
                break;

            case "insuficiencia cardiaca descompensada":
                System.out.println("Doença: Insuficiência cardíaca descompensada");
                System.out.println("Sintomas: Falta de ar (principalmente ao deitar), inchaço nas pernas, ganho rápido de peso, fadiga intensa e palpitação.");
                System.out.println("Tratamento: Uso de diuréticos, controle de sal e líquidos, medicamentação e acompanhamento médico contínuo. Internação em casos graves.");
                break;

            case "inicio de infarto":
            case "infarto":
                System.out.println("Doença: Início de infarto");
                System.out.println("Sintomas: Dor intensa no peito, podendo irradiar para o braço esquerdo, mandíbula ou costas. Suor frio, náusea, falta de ar e sensação de morte iminente.");
                System.out.println("Tratamento: Atendimento médico imediato! Uso de aspirina, nitratos, oxigênio e realização de cateterismo ou outros procedimentos de emergência.");
                break;

            default:
                System.out.println("Informações não disponíveis para essa condição.");
        }
    }

    public static void Consulta(Scanner scan) {
        System.out.println("---Consulta---");
        System.out.println("Você fuma?");
        String fumo = scan.next();

        System.out.println("Tem pressão alta?");
        String pressaoAlta = scan.next().toLowerCase();

        System.out.println("Você sente dor ao se movimentar?");
        String dor = scan.next().toLowerCase();

        System.out.println("Teve febre?");
        String febre = scan.next().toLowerCase();

        System.out.println("Está com falta de ar?");
        String ar = scan.next();

        if (fumo.equalsIgnoreCase("sim") && pressaoAlta.equalsIgnoreCase("sim") && dor.equalsIgnoreCase("sim") && febre.equalsIgnoreCase("sim") && ar.equalsIgnoreCase("sim")) {
            System.out.println("EMERGÊNCIA!");
        } else if (fumo.equalsIgnoreCase("sim") && febre.equalsIgnoreCase("sim") && ar.equalsIgnoreCase("sim")) {
            System.out.println("O seu possível diagnóstico é de Pneumonia!");
        } else if (pressaoAlta.equalsIgnoreCase("sim") && febre.equalsIgnoreCase("sim") && ar.equalsIgnoreCase("sim")) {
            System.out.println("O seu possível diagnóstico é:  Insuficiência Cardíaca Descompensada");
        } else if (dor.equalsIgnoreCase("sim") && febre.equalsIgnoreCase("sim") && ar.equalsIgnoreCase("sim")) {
            System.out.println("Seu possível diagnóstico é: Início de Infarto");
        } else if (fumo.equalsIgnoreCase("sim") && pressaoAlta.equalsIgnoreCase("sim") && dor.equalsIgnoreCase("sim")) {
            System.out.println("O seu possível diagnóstico é de Hipertensão!");
        } else {
            System.out.println("Dentro do possível, você está saudável!");
        }
    }
}


