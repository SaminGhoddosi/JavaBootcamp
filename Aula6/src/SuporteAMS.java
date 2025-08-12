import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuporteAMS {
    static ArrayList<String> nomeUsuario = new ArrayList<>();
    static ArrayList<String> emailUsuario = new ArrayList<>();
    static ArrayList<String> setorCadastroUsuario = new ArrayList<>();
    static ArrayList<String> codigoServico = new ArrayList<>();
    static ArrayList<String> nomeServico = new ArrayList<>();
    static ArrayList<String> descricaoServico = new ArrayList<>();
    static ArrayList<String> usuarioServico = new ArrayList<>();
    static ArrayList<String> Encaminhamento = new ArrayList<>();
    static ArrayList<Double> Faturamentos = new ArrayList<>();
    static ArrayList<String> Status = new ArrayList<>();
    static ArrayList<Integer> prioridades = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> usuarios = new ArrayList<>();
    static ArrayList<String> senhas = new ArrayList<>();
    static ArrayList<String> niveis = new ArrayList<>();
    static String usuarioLogado = null;
    static String nivelLogado = null;
    static ArrayList<String> servicos = new ArrayList<>();
    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<String> problemas = new ArrayList<>();
    static ArrayList<String> encaminhamentos = new ArrayList<>();
    static ArrayList<String> status = new ArrayList<>();



    public static void main(String[] args) {
        inicializarServicosExemplo();
        inicializarUsuarios();
        if (!login()) return;
        while (true) {



            System.out.println("\n===MENU===");
            System.out.println("(1) - Cadastrar cliente");
            System.out.println("(2) - Listar clientes");
            System.out.println("(3) - Atualizar cliente");
            System.out.println("(4) - Remover cliente");
            System.out.println("(5) - Buscar cliente por nome");
            System.out.println("(6) - Cadastrar serviços");
            System.out.println("(7) - Listar serviços");
            System.out.println("(8) - Filtrar serviços por tipo");
            System.out.println("(9) - Ordenar chamados por prioridade");
            System.out.println("(10) - Relatório de faturamento");
            System.out.println("(0) - Sair");
            System.out.print("Opção: ");
            int menu = scan.nextInt();

            if (menu == 0) break;

            switch (menu) {
                case 1: if (temPermissao("admin")) CadastrarCliente(); else acessoNegado(); break;
                case 2: if (temPermissao("admin")) listarCliente(); else acessoNegado(); break;
                case 4: if (temPermissao("admin")) RemoverCliente(); else acessoNegado(); break;
                case 3 : if (temPermissao("operador")) AtualizarCliente(); else acessoNegado(); break;
                case 5 : if (temPermissao("operador")) BuscaDeCliente(); else acessoNegado(); break;
                case 6 : if (temPermissao("operador")) cadastrarServicos(); else acessoNegado(); break;
                case 7 : if (temPermissao("operador")) listarServicos(); else acessoNegado(); break;
                case 8 : if (temPermissao("operador")) filtrarServicosPorTipo(); else acessoNegado(); break;
                case 9 : if (temPermissao("operador")) ordenarChamadosPorPrioridade(); else acessoNegado(); break;
                case 10 : if (temPermissao("operador")) relatorioFaturamento(); else acessoNegado(); break;
                default : System.out.println("Entrada Inválida");
            }
            if (menu != 0) {
                System.out.println("");
                System.out.println("---Digite qualquer coisa para continuar---");
                scan.next();
            }
        }
        System.out.println("Até logo");

    }

    public static boolean temPermissao(String nivelMinimo) {
        if (nivelMinimo.equals("visual")) return true;
        if (nivelMinimo.equals("operador") && (nivelLogado.equals("operador") || nivelLogado.equals("admin"))) return true;
        if (nivelMinimo.equals("admin") && nivelLogado.equals("admin")) return true;
        return false;
    }

    public static void acessoNegado() {
        System.out.println("⚠ Acesso negado. Você não tem permissão para essa operação.");
    }
    public static void CadastrarCliente() {
        System.out.println("---Cadastro de usuário---");
        System.out.print("Digite o nome do usuário: ");
        nomeUsuario.add(scan.next());
        System.out.print("\nDigite o seu email: ");
        emailUsuario.add((scan.next()));
        System.out.print("\nDigite o setor que cadastrou o usuário: ");
        setorCadastroUsuario.add(scan.next());
        System.out.println("Usuário cadastrado!");
    }

    public static void listarCliente() {
        System.out.println("---Listagem de clientes---");
        if (nomeUsuario.size() == 0) {
            System.out.println("Não tem usuários cadastrados!");
        } else {
            for (int i = 0; i < nomeUsuario.size(); i++) {
                System.out.println((i + 1) + " - Usuário: " + nomeUsuario.get(i) + ". Email: " + emailUsuario.get(i) + ". Setor que cadastrou o usuário: " + setorCadastroUsuario.get(i));
            }
        }
    }

    public static void AtualizarCliente() {
        System.out.println("---Atualização de cliente---");
        if (nomeUsuario.isEmpty()) {
            System.out.println("Não tem usuários cadastrados! Logo, não tem como atualizar");
            return;//ver como usar e break também
        } else {
            for (int i = 0; i < nomeUsuario.size(); i++) {
                System.out.println((i + 1) + " - Usuário: " + nomeUsuario.get(i) + ". Email: " + emailUsuario.get(i) + ". Setor que cadastrou o usuário: " + setorCadastroUsuario.get(i));
            }
            System.out.print("Qual usuário deseja atualizar?: ");
            int escolha = scan.nextInt() - 1;
            boolean fala = true;
            while (fala) {
                System.out.println("Escolha o campo para atualizar:");
                System.out.println("1 - Nome | 2 - Email | 3 - Setor que cadastrou usuário 0 - Sair da atualização!");
                int opcao = scan.nextInt();
                switch (opcao) {
                    case 0:
                        fala = false;
                        break;
                    case 1:
                        System.out.print("Novo nome: ");
                        nomeUsuario.set(escolha, scan.next());// ver nextLine().tri();
                        break;
                    case 2:
                        System.out.print("Nova descrição do problema: ");
                        emailUsuario.set(escolha, scan.next());
                        break;
                    case 3:
                        System.out.print("Novo encaminhamento (setor): ");
                        setorCadastroUsuario.set(escolha, scan.next());
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                System.out.println("");
            }
            System.out.println("Mudanças concluídas!");
        }
    }

    public static void RemoverCliente() {
        System.out.println("Clientes cadastrados: ");
        for (int i = 0; i < nomeUsuario.size(); i++) {
            System.out.println((i + 1) + " - Usuário: " + nomeUsuario.get(i) + ". Email: " + emailUsuario.get(i) + ". Setor que cadastrou o usuário: " + setorCadastroUsuario.get(i));
        }
        System.out.print("Qual usuário deseja remover?: ");
        int escolha = scan.nextInt() - 1;
        nomeUsuario.remove(escolha);
        emailUsuario.remove(escolha);
        setorCadastroUsuario.remove(escolha);
        System.out.println("Usuário removido!");
    }

    public static void BuscaDeCliente() {
        System.out.println("Insira o nome do cliente que você busca:");
        String nomeProcurado = scan.next();
        if (nomeUsuario.contains(nomeProcurado)) {
            System.out.println("Usuário está no sistema!");
        } else {
            System.out.println("Usuário não cadastrado");
        }
    }

    public static void cadastrarServicos() {
        if (nomeUsuario.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado, logo não é possível cadastrar serviço ");
        } else {
            System.out.println("Digite o código do Serviço:");
            codigoServico.add(scan.next());
            System.out.println("Digite o nome do serviço:");
            nomeServico.add(scan.next());
            System.out.println("Digite a descrição do serviço:");
            descricaoServico.add(scan.next());
            System.out.println("Clientes cadastrados: ");
            for (int i = 0; i < nomeUsuario.size(); i++) {
                System.out.println((i + 1) + " - Usuário: " + nomeUsuario.get(i) + ". Email: " + emailUsuario.get(i) + ". Setor que cadastrou o usuário: " + setorCadastroUsuario.get(i));
            }
            System.out.print("O serviço seria para qual cliente?: ");
            int escolha = scan.nextInt() - 1;
            usuarioServico.add("Id: " + escolha);
            System.out.println("Serviço cadastrado com sucesso!");
        }


    }

    public static void listarServicos() {
        if (codigoServico.isEmpty()) {
            System.out.println("Nenhum serviço cadastrado.");
            return;
        }
        System.out.println("\n--- Lista de Serviços ---");
        for (int i = 0; i < nomeServico.size(); i++) {
            System.out.println("Código: " + codigoServico.get(i) + " | Nome: " + nomeServico.get(i) + " | Serviço : " + descricaoServico.get(i) + " | " + usuarioServico);
        }
    }


    public static void filtrarServicosPorTipo() {


        Scanner scan = new Scanner(System.in);
        System.out.println("Digite parte do nome do serviço para procurar:");
        String termo = scan.nextLine();
        boolean achou = false;
        for (String s : servicos) {
            if (s.toLowerCase().contains(termo)) {
                System.out.println(s);
                achou = true;
            }
        }
        if (!achou) System.out.println("Nenhum serviço encontrado");
    }


        public static void ordenarChamadosPorPrioridade() {
        if (nomeUsuario.isEmpty()) {
            System.out.println("Nenhum chamado cadastrado para ordenar.");
            return;
        }
        // Bubble sort simples para ordenação por prioridade crescente
        for (int i = 0; i < prioridades.size() - 1; i++) {
            for (int j = 0; j < prioridades.size() - i - 1; j++) {
                if (prioridades.get(j) > prioridades.get(j + 1)) {
                    trocarIndices(j, j + 1);
                }
            }
        }
        System.out.println("Chamados ordenados por prioridade.");
        listarServicos();
    }


    public static void trocarIndices(int i, int j) {

        String tempNome = nomeUsuario.get(i);
        nomeUsuario.set(i, nomeUsuario.get(j));
        nomeUsuario.set(j, tempNome);

        String tempProblema = nomeServico.get(i);
        nomeServico.set(i, nomeServico.get(j));
        nomeServico.set(j, tempProblema);

        String tempEnc = Encaminhamento.get(i);
        Encaminhamento.set(i, Encaminhamento.get(j));
        Encaminhamento.set(j, tempEnc);

        String tempStatus = Status.get(i);
        Status.set(i, Status.get(j));
        Status.set(j, tempStatus);

        int tempPrio = prioridades.get(i);
        prioridades.set(i, prioridades.get(j));
        prioridades.set(j, tempPrio);

        double tempFat = Faturamentos.get(i);
        Faturamentos.set(i, Faturamentos.get(j));
        Faturamentos.set(j, tempFat);
    }




    public static void relatorioFaturamento() {
        if (Faturamentos.isEmpty()) {
            System.out.println("Nenhum faturamento registrado.");
            return;
        }

        double total = 0;
        System.out.println("\n--- Relatório de Faturamento ---");
        int limite = Math.min(Faturamentos.size(), nomeUsuario.size());
        for (int i = 0; i < limite; i++) {
            System.out.printf("%d) %s | Faturamento: R$ %.2f%n", i+1, nomeUsuario.get(i), Faturamentos.get(i));
            total += Faturamentos.get(i);
        }
        System.out.printf("Faturamento total: R$ %.2f%n", total);
    }
    public static void inicializarUsuarios() {
        usuarios.add("admin");
        senhas.add("1234");
        niveis.add("admin");

        usuarios.add("operador");
        senhas.add("abcd");
        niveis.add("operador");

        usuarios.add("visual");
        senhas.add("123");
        niveis.add("visual");
    }


    public static boolean login() {
        System.out.println("=== LOGIN ===");
        System.out.print("Usuário: ");
        String user = scan.nextLine();
        System.out.print("Senha: ");
        String pass = scan.nextLine();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).equals(user) && senhas.get(i).equals(pass)) {
                usuarioLogado = user;
                nivelLogado = niveis.get(i);
                System.out.println("Login bem-sucedido! Nível: " + nivelLogado);
                return true;
            }
        }

        System.out.println("Credenciais inválidas!");
        return false;
    }
    private static void inicializarServicosExemplo() {
        servicos.add("Rede");
        servicos.add("Telefonia");
        servicos.add("Provedor");
        servicos.add("Instalação");

        nomes.add("CHAMADO-1001");
        problemas.add("Queda de link intermitente");
        encaminhamentos.add("Provedor");
        status.add("Pendente");
        prioridades.add(1);
        Faturamentos.add(250.75);

        nomes.add("CHAMADO-1002");
        problemas.add("Ramal sem áudio");
        encaminhamentos.add("Telefonia");
        status.add("Em Andamento");
        prioridades.add(2);
        Faturamentos.add(150.00);
    }

}
