import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta classe implementa um sistema de gerenciamento de chamados de suporte técnico.
 * Ela utiliza ArrayLists para armazenar os dados de cada chamado (nome, problema, etc.)
 * e oferece um menu interativo para o usuário realizar operações como cadastrar,
 * listar, atualizar, remover, buscar e gerar relatórios.
 */
public class AD {

    // --- Estruturas de Dados Estáticas ---
    // São ArrayLists estáticas para armazenar os dados dos chamados. O uso de 'static'
    // faz com que essas listas pertençam à classe, e não a uma instância, permitindo
    // que todos os métodos as acessem diretamente.
    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<String> problemas = new ArrayList<>();
    static ArrayList<String> encaminhamentos = new ArrayList<>();
    static ArrayList<String> status = new ArrayList<>();
    static ArrayList<Integer> prioridades = new ArrayList<>();
    static ArrayList<Double> faturamentos = new ArrayList<>();

    // ArrayList para armazenar os tipos de serviço disponíveis.
    static ArrayList<String> servicos = new ArrayList<>();
    // Objeto Scanner estático para ler a entrada do usuário.
    static Scanner scan = new Scanner(System.in);

    // --- Método Principal ---
    public static void main(String[] args) {
        // Inicializa o sistema com alguns dados de exemplo para facilitar o teste.
        inicializarDadosExemplo();

        int opcao;
        // O laço 'do-while' garante que o menu seja exibido e o programa continue
        // executando até que o usuário escolha a opção '0' para sair.
        do {
            mostrarMenu();
            // Validação de entrada: Garante que o usuário digite um número inteiro.
            while (!scan.hasNextInt()) {
                System.out.print("Entrada inválida. Digite um número válido: ");
                scan.next(); // Descarta a entrada inválida.
            }
            opcao = scan.nextInt();
            scan.nextLine(); // Consome a quebra de linha deixada pelo nextInt().

            // A estrutura 'switch' direciona a execução para o método correspondente
            // à opção escolhida pelo usuário.
            switch (opcao) {
                case 1: cadastrarChamado(); break;
                case 2: listarChamados(); break;
                case 3: atualizarChamado(); break;
                case 4: removerChamado(); break;
                case 5: buscarChamadoPorNome(); break;
                case 6: cadastrarServico(); break;
                case 7: listarServicos(); break;
                case 8: filtrarServicosPorTipo(); break;
                case 9: ordenarChamadosPorPrioridade(); break;
                case 10: relatorioPendencias(); break;
                case 11: relatorioFaturamento(); break;
                case 12: ordenarChamadosPorFaturamento(); break;
                case 0: System.out.println("Saindo do sistema. Até mais!"); break;
                default: System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
    }

    // --- Métodos de Menu e Interface ---

    /**
     * Exibe o menu de opções para o usuário.
     */
    public static void mostrarMenu() {
        System.out.println("\n====== SISTEMA DE SUPORTE AMS DE TI ======");
        System.out.println("1  - Cadastrar novo chamado");
        System.out.println("2  - Listar todos os chamados");
        System.out.println("3  - Atualizar um chamado existente");
        System.out.println("4  - Remover um chamado");
        System.out.println("5  - Buscar chamado por nome do cliente");
        System.out.println("6  - Cadastrar um novo tipo de serviço");
        System.out.println("7  - Listar tipos de serviço");
        System.out.println("8  - Filtrar tipos de serviço");
        System.out.println("9  - Ordenar chamados por prioridade");
        System.out.println("10 - Gerar relatório de pendências");
        System.out.println("11 - Gerar relatório de faturamento");
        System.out.println("12 - Ordenar chamados por faturamento");
        System.out.println("0  - Sair");
        System.out.print("Escolha uma opção: ");
    }

    // --- Métodos de Gerenciamento de Chamados ---

    /**
     * Coleta informações do usuário e cadastra um novo chamado nas listas.
     */
    public static void cadastrarChamado() {
        System.out.println("\n--- Cadastro de Novo Chamado ---");
        System.out.print("Nome do cliente: ");
        nomes.add(scan.nextLine());

        System.out.print("Descrição do problema: ");
        problemas.add(scan.nextLine());

        System.out.print("Para onde encaminhar (setor): ");
        encaminhamentos.add(scan.nextLine());

        // O status inicial de um novo chamado é sempre "Pendente".
        status.add("Pendente");

        // Lê a prioridade com validação.
        prioridades.add(lerPrioridade());

        // Lê o faturamento com validação.
        faturamentos.add(lerDouble("Valor do faturamento para este chamado (ex: 150.50): "));

        System.out.println("Chamado cadastrado com sucesso!");
    }

    /**
     * Exibe todos os chamados cadastrados.
     */
    public static void listarChamados() {
        if (nomes.isEmpty()) {
            System.out.println("Nenhum chamado cadastrado.");
            return;
        }
        System.out.println("\n--- Lista de Chamados ---");
        // O laço 'for' percorre as listas e exibe os dados de cada chamado.
        // O índice 'i' é usado para acessar o item correspondente em cada lista.
        for (int i = 0; i < nomes.size(); i++) {
            System.out.printf("%d) %s | Problema: %s | Encaminhar: %s | Status: %s | Prioridade: %d | Faturamento: R$ %.2f%n",
                    (i + 1), nomes.get(i), problemas.get(i), encaminhamentos.get(i), status.get(i), prioridades.get(i), faturamentos.get(i));
        }
    }

    /**
     * Permite ao usuário atualizar um campo específico de um chamado.
     */
    public static void atualizarChamado() {
        listarChamados(); // Exibe a lista para que o usuário escolha qual item atualizar.
        if (nomes.isEmpty()) return;

        System.out.print("Digite o número do chamado que deseja atualizar: ");
        int idx = leIndiceParaLista(nomes.size());
        if (idx == -1) return;

        System.out.println("Escolha o campo para atualizar:");
        System.out.println("1 - Nome | 2 - Problema | 3 - Encaminhar | 4 - Status | 5 - Prioridade | 6 - Faturamento");
        int op = lerInt("Digite a opção: ");

        // O 'switch' atualiza o campo escolhido usando o método set(índice, novo_valor).
        switch (op) {
            case 1:
                System.out.print("Novo nome: ");
                nomes.set(idx, scan.nextLine());
                break;
            case 2:
                System.out.print("Nova descrição do problema: ");
                problemas.set(idx, scan.nextLine());
                break;
            case 3:
                System.out.print("Novo encaminhamento (setor): ");
                encaminhamentos.set(idx, scan.nextLine());
                break;
            case 4:
                System.out.print("Novo status (Pendente / Em Andamento / Concluído): ");
                status.set(idx, scan.nextLine());
                break;
            case 5:
                prioridades.set(idx, lerPrioridade());
                break;
            case 6:
                faturamentos.set(idx, lerDouble("Novo valor de faturamento: "));
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }
        System.out.println("Chamado atualizado com sucesso!");
    }

    /**
     * Remove um chamado por completo de todas as listas.
     */
    public static void removerChamado() {
        listarChamados(); // Exibe a lista para que o usuário escolha qual item remover.
        if (nomes.isEmpty()) return;

        System.out.print("Digite o número do chamado para remover: ");
        int idx = leIndiceParaLista(nomes.size());
        if (idx == -1) return;

        // O método 'remove(índice)' é chamado em todas as listas para garantir
        // que os dados do chamado sejam completamente removidos.
        nomes.remove(idx);
        problemas.remove(idx);
        encaminhamentos.remove(idx);
        status.remove(idx);
        prioridades.remove(idx);
        faturamentos.remove(idx);

        System.out.println("Chamado removido com sucesso.");
    }

    /**
     * Busca chamados por uma parte do nome do cliente.
     */
    public static void buscarChamadoPorNome() {
        System.out.print("Digite o nome (ou parte do nome) para buscar: ");
        String termo = scan.nextLine().toLowerCase();
        boolean achou = false;

        // O laço percorre a lista de nomes e usa 'contains' para encontrar
        // correspondências, ignorando a caixa das letras com 'toLowerCase()'.
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).toLowerCase().contains(termo)) {
                System.out.printf("%d) %s | Status: %s | Enc: %s | Prioridade: %d | Faturamento: R$ %.2f%n",
                        i + 1, nomes.get(i), status.get(i), encaminhamentos.get(i), prioridades.get(i), faturamentos.get(i));
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhum chamado encontrado com este nome.");
        }
    }

    // --- Métodos de Gerenciamento de Serviços ---

    /**
     * Permite cadastrar um novo tipo de serviço.
     */
    public static void cadastrarServico() {
        System.out.print("Nome do tipo de serviço (ex: Rede, Telefonia): ");
        servicos.add(scan.nextLine());
        System.out.println("Serviço cadastrado.");
    }

    /**
     * Lista todos os tipos de serviço cadastrados.
     */
    public static void listarServicos() {
        if (servicos.isEmpty()) {
            System.out.println("Nenhum serviço cadastrado.");
            return;
        }
        System.out.println("\n--- Serviços / Tipos ---");
        for (int i = 0; i < servicos.size(); i++) {
            System.out.println((i + 1) + " - " + servicos.get(i));
        }
    }

    /**
     * Filtra e exibe serviços por uma parte do nome.
     */
    public static void filtrarServicosPorTipo() {
        System.out.print("Digite parte do nome do serviço para filtrar: ");
        String termo = scan.nextLine().toLowerCase();
        boolean achou = false;

        // O laço 'for-each' percorre a lista de serviços.
        for (String s : servicos) {
            if (s.toLowerCase().contains(termo)) {
                System.out.println(s);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhum serviço corresponde ao filtro.");
        }
    }

    // --- Métodos de Ordenação ---

    /**
     * Ordena os chamados por prioridade (do menor para o maior) usando Selection Sort.
     */
    public static void ordenarChamadosPorPrioridade() {
        // O Selection Sort percorre a lista, encontra o menor valor na sub-lista
        // não ordenada e o troca para a posição correta.
        for (int i = 0; i < prioridades.size() - 1; i++) {
            int idxMenor = i;
            for (int j = i + 1; j < prioridades.size(); j++) {
                if (prioridades.get(j) < prioridades.get(idxMenor)) {
                    idxMenor = j;
                }
            }
            if (idxMenor != i) {
                swapTickets(i, idxMenor); // Troca o chamado completo.
            }
        }
        System.out.println("Chamados ordenados por prioridade (1 = alta ... 5 = baixa).");
        listarChamados();
    }

    /**
     * Ordena os chamados por faturamento (do maior para o menor) usando Selection Sort.
     */
    public static void ordenarChamadosPorFaturamento() {
        for (int i = 0; i < faturamentos.size() - 1; i++) {
            int idxMaior = i;
            for (int j = i + 1; j < faturamentos.size(); j++) {
                if (faturamentos.get(j) > faturamentos.get(idxMaior)) {
                    idxMaior = j;
                }
            }
            if (idxMaior != i) {
                swapTickets(i, idxMaior); // Troca o chamado completo.
            }
        }
        System.out.println("Chamados ordenados por faturamento (do maior para o menor).");
        listarChamados();
    }

    /**
     * Método auxiliar para trocar todos os dados de dois chamados entre si.
     * @param a Índice do primeiro chamado.
     * @param b Índice do segundo chamado.
     */
    private static void swapTickets(int a, int b) {
        // Usa variáveis temporárias para realizar a troca em cada uma das listas.
        // Isso garante que todos os campos do chamado (nome, problema, etc.)
        // se movam juntos, mantendo a integridade dos dados.
        String tNome = nomes.get(a); nomes.set(a, nomes.get(b)); nomes.set(b, tNome);
        String tProb = problemas.get(a); problemas.set(a, problemas.get(b)); problemas.set(b, tProb);
        String tEnc = encaminhamentos.get(a); encaminhamentos.set(a, encaminhamentos.get(b)); encaminhamentos.set(b, tEnc);
        String tStat = status.get(a); status.set(a, status.get(b)); status.set(b, tStat);
        int tPrio = prioridades.get(a); prioridades.set(a, prioridades.get(b)); prioridades.set(b, tPrio);
        double tFat = faturamentos.get(a); faturamentos.set(a, faturamentos.get(b)); faturamentos.set(b, tFat);
    }

    // --- Métodos de Relatório ---

    /**
     * Gera um relatório de chamados que não estão concluídos.
     */
    public static void relatorioPendencias() {
        int pendentes = 0;
        System.out.println("\n--- Relatório de Pendências ---");
        for (int i = 0; i < status.size(); i++) {
            if (!status.get(i).equalsIgnoreCase("Concluído")) {
                pendentes++;
                System.out.printf("%d) %s | Status: %s | Prioridade: %d | Enc: %s%n",
                        i + 1, nomes.get(i), status.get(i), prioridades.get(i), encaminhamentos.get(i));
            }
        }
        System.out.println("Total de pendências: " + pendentes);
        alertaSLA(); // Chama o método para verificar alertas de SLA.
    }

    /**
     * Exibe um alerta se houver chamados de Prioridade 1 pendentes.
     */
    public static void alertaSLA() {
        boolean temAlerta = false;
        System.out.println(); // Adiciona uma linha em branco para melhor formatação.
        for (int i = 0; i < prioridades.size(); i++) {
            if (prioridades.get(i) == 1 && !status.get(i).equalsIgnoreCase("Concluído")) {
                if (!temAlerta) System.out.println("⚠ ALERTA: Chamados de PRIORIDADE 1 pendentes:");
                System.out.printf("- %s | Problema: %s | Enc: %s%n", nomes.get(i), problemas.get(i), encaminhamentos.get(i));
                temAlerta = true;
            }
        }
        if (!temAlerta) {
            System.out.println("Nenhum SLA crítico pendente.");
        }
    }

    /**
     * Calcula e exibe o faturamento total de todos os chamados.
     */
    public static void relatorioFaturamento() {
        if (faturamentos.isEmpty()) {
            System.out.println("Nenhum faturamento registrado.");
            return;
        }

        double total = 0;
        System.out.println("\n--- Relatório de Faturamento ---");
        for (int i = 0; i < faturamentos.size(); i++) {
            System.out.printf("%d) %s | Faturamento: R$ %.2f%n", i + 1, nomes.get(i), faturamentos.get(i));
            total += faturamentos.get(i);
        }
        System.out.printf("Faturamento total: R$ %.2f%n", total);
    }

    // --- Métodos de Validação de Entrada (Privados) ---
    // Métodos privados são acessíveis apenas dentro desta classe.

    /**
     * Lê uma prioridade de 1 a 5, garantindo que a entrada seja um número inteiro.
     * @return O número da prioridade validado.
     */
    private static int lerPrioridade() {
        System.out.print("Prioridade (1 = alta ... 5 = baixa): ");
        int p = lerInt("");
        if (p < 1) p = 1;
        if (p > 5) p = 5;
        return p;
    }

    /**
     * Lê um número decimal, garantindo que a entrada seja um 'double'.
     * @param mensagem A mensagem a ser exibida para o usuário.
     * @return O valor 'double' validado.
     */
    private static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        while (!scan.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite um valor numérico válido: ");
            scan.next();
        }
        double val = scan.nextDouble();
        scan.nextLine();
        return val;
    }

    /**
     * Lê um número inteiro, garantindo que a entrada seja um 'int'.
     * @param mensagem A mensagem a ser exibida para o usuário.
     * @return O valor 'int' validado.
     */
    private static int lerInt(String mensagem) {
        System.out.print(mensagem);
        while (!scan.hasNextInt()) {
            System.out.print("Entrada inválida. Digite um número válido: ");
            scan.next();
        }
        int val = scan.nextInt();
        scan.nextLine();
        return val;
    }

    /**
     * Lê um número de um índice da lista e valida se ele é válido (dentro dos limites).
     * @param tamanho O tamanho máximo da lista.
     * @return O índice ajustado (número do usuário - 1) ou -1 se for inválido.
     */
    private static int leIndiceParaLista(int tamanho) {
        int num = lerInt("");
        int idx = num - 1;
        if (idx < 0 || idx >= tamanho) {
            System.out.println("Índice inválido.");
            return -1;
        }
        return idx;
    }

    // --- Método de Inicialização (Privado) ---

    /**
     * Método auxiliar para preencher o sistema com dados de exemplo ao iniciar.
     */
    private static void inicializarDadosExemplo() {
        servicos.add("Rede");
        servicos.add("Telefonia");
        servicos.add("Provedor");
        servicos.add("Instalação");

        nomes.add("CHAMADO-1001");
        problemas.add("Queda de link intermitente");
        encaminhamentos.add("Provedor");
        status.add("Pendente");
        prioridades.add(1);
        faturamentos.add(250.75);

        nomes.add("CHAMADO-1002");
        problemas.add("Ramal sem áudio");
        encaminhamentos.add("Telefonia");
        status.add("Em Andamento");
        prioridades.add(2);
        faturamentos.add(150.00);

        nomes.add("CHAMADO-1003");
        problemas.add("Troca de senha do Wi-Fi");
        encaminhamentos.add("Rede");
        status.add("Concluído");
        prioridades.add(5);
        faturamentos.add(80.00);
    }
}