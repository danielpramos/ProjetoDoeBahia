package ProjetoDoeBahia;

import java.util.Scanner;
import java.util.Locale;

public class ProjetoDoacao {
	
	Scanner leia=new Scanner (System.in);
	
	private String nomeCadastro;
	private String idadeCadastro;
	private String telCadastro;
	private String cpfCadastro;
	private String cityCadastro;
	private String estadoCadastro;
	private String ruaCadastro;
	private String numCadastro;
	private String cepCadastro;
	private String doador;
	private String receptor;
	private int opcao;
	
	public ProjetoDoacao (String nomeCadastro, String idadeCadastro,String telCadastro,
	String cpfCadastro,String cityCadastro,String estadoCadastro,String ruaCadastro,
String numCadastro,String cepCadastro,String doador, String receptor, int opcao)
	{
		this.numCadastro=nomeCadastro;
		this.idadeCadastro=idadeCadastro;
		this.telCadastro=telCadastro;
		this.cpfCadastro=cpfCadastro;
		this.cityCadastro=cityCadastro;
		this.estadoCadastro=estadoCadastro;
		this.ruaCadastro=ruaCadastro;
		this.numCadastro=numCadastro;
		this.cepCadastro=cepCadastro;
		this.doador=doador;
		this.receptor=receptor;
		
	}
	public ProjetoDoacao(String nomeCadastro, String idadeCadastro,String telCadastro)
	{
		this.numCadastro=nomeCadastro;
		this.idadeCadastro=idadeCadastro;
		this.telCadastro=telCadastro;
	}
	
/*	public void imprimirInfo()
	{
		System.out.println(" \n Informe seu nome completo: ");
		nomeCadastro=leia.nextLine();
		System.out.println("\n Informe sua idade: ");
		idadeCadastro=leia.nextLine();
		System.out.println("\n Informe um telefone para contato: ");
		telCadastro=leia.nextLine();
		System.out.println("\n Infome o CPF que deseja cadastrar: ");
		cpfCadastro=leia.nextLine();
		System.out.println("\n Em qual cidade você reside? ");
		cityCadastro=leia.nextLine();
		System.out.println("\n Em qual estado você reside? ");
		estadoCadastro=leia.nextLine();
		System.out.println("\n Qual o nome da Rua que você mora? ");
		ruaCadastro=leia.nextLine();
		System.out.println("\n Qual o número da casa? ");
		numCadastro=leia.nextLine();
		System.out.println("\n Qual o cep da sua rua? ");
		cepCadastro=leia.nextLine();
	}*/
	public void doadores() throws InterruptedException
	{
		do
		{
			
			System.out.println("\n\n\t\t===============================================================================================");
			System.out.println("\t\t%%%%%%%%        %%%%%%    %%%%%%%  %%%%%%%         %%%%%%     %%%      %%% %%%     %%%%%%");
			System.out.println("\t\t%%%%%%%%%%     %%%  %%%   %%%%%%%  %%%%%%%%%%     %%%  %%%    %%%      %%% %%%    %%%  %%%");
			System.out.println("\t\t%%%     %%%   %%%    %%%  %%%      %%%     %%%    %%%  %%%    %%%      %%% %%%    %%%  %%%");
			System.out.println("\t\t%%%      %%% %%%      %%% %%%      %%%     %%%   %%%    %%%   %%%      %%% %%%   %%%    %%%");
			System.out.println("\t\t%%%      %%% %%%      %%% %%%%%%%  %%%%%%%%%     %%%%%%%%%%   %%%%%%%%%%%% %%%   %%%%%%%%%%");
			System.out.println("\t\t%%%      %%% %%%      %%% %%%      %%%     %%%  %%%      %%%  %%%      %%% %%%  %%%      %%%");
			System.out.println("\t\t%%%     %%%   %%%    %%%  %%%      %%%     %%%  %%%      %%%  %%%      %%% %%%  %%%      %%%");
			System.out.println("\t\t%%%%%%%%%%     %%%  %%%   %%%%%%%% %%%%%%%%%%  %%%        %%% %%%      %%% %%% %%%        %%%");
			System.out.println("\t\t%%%%%%%         %%%%%%    %%%%%%%% %%%%%%%     %%%        %%% %%%      %%% %%% %%%        %%%");
			System.out.println("\t\t===============================================================================================\n\n");
			
		
		System.out.println("\nOLÁ, ESTAMOS FELIZES EM TE TER POR AQUI!\n ");
		System.out.println("\n\n\t\t============================================");
		System.out.printf("\t\t\t1 - Para receber uma doação! ");
		System.out.printf("\n\t\t\t2 - Para realizar uma doação! ");
		System.out.println("\n\t\t============================================");
		System.out.printf("\n\nSelecione em qual alternativa você se enquadra: ");
		System.out.println("\n----------------------------------------------------");
		opcao=leia.nextInt();
		
			switch(opcao)              //
			{
			case 1:
				leia.nextLine();
				System.out.println("\n\nEstamos aqui pra te ajudar. Crie um cadastro para podermos retornar o contato.");
				System.out.println("-------------------------------------------------------------------------------\n\n\n\n");
				System.out.println(" \n===============================================================================");
				System.out.println(" Informe seu nome completo: ");
				nomeCadastro=leia.nextLine();
				
				System.out.println(" Informe sua idade: ");
				idadeCadastro=leia.nextLine();
				System.out.println(" Informe um telefone para contato: ");
				telCadastro=leia.nextLine();
				
				System.out.println(" Infome o CPF que deseja cadastrar: ");
				cpfCadastro=leia.nextLine();
				
				System.out.println(" Em qual cidade você reside? ");
				cityCadastro=leia.nextLine();
				
				System.out.println(" Em qual estado você reside? ");
				estadoCadastro=leia.nextLine();
			
				System.out.println(" Qual o nome da Rua que você mora? ");
				ruaCadastro=leia.nextLine();
				
				System.out.println(" Qual o número da casa? ");
				numCadastro=leia.nextLine();
				
				System.out.println(" Qual o cep da sua rua? ");
				cepCadastro=leia.nextLine();
				System.out.println(" ===============================================================================\n\n\n\n\n\n");
				
				
				
				System.out.println("\n"+nomeCadastro+" SEUS DADOS FORAM iNCLUÍDOS EM NOSSO SISTEMA E NOSSO TIME ENTRARÁ EM CONTATO COM VOCÊ O MAIS RÁPIDO POSSÍVEL.\n\n Os dados cadastrados foram: \n\n\n Nome: "+nomeCadastro+"\n Idade: "+idadeCadastro+"\n Telefone: "+telCadastro+"\n CPF: "+cpfCadastro);
				break;
				
			case 2:
				leia.nextLine();
				int op;  
					System.out.println("Digite a opção do valor da doação: ");
					System.out.println("-----------------------------------\n");
					
					System.out.println("\n\n\t\t============================================");
					System.out.println("\t\t\t1) Para doar R$ 20,00 ");
					System.out.println("\t\t\t2) Para doar R$ 50,00  ");
					System.out.println("\t\t\t3) Para doar R$ 100,00  ");
					System.out.println("\t\t\t4) Escolher um valor ");
					System.out.println("\t\t=============================================\n\n");
					
					System.out.printf("Digite uma opção: ");
					System.out.println("\n-----------------------------------\n");
					op = leia.nextInt();
					
					
					switch(op)
					{
					case 1:
						leia.nextLine();
						
						System.out.println("\n\nVocê selecionou doar R$ 20,00.");
						System.out.println("--------------------------------\n\n");
						
						System.out.println("\nEscolha o método de pagamento: ");
						System.out.println("--------------------------------\n\n");
						
						System.out.println("\n\n\t\t============================================");
						System.out.println("\t\t\t1) Cartão");
						System.out.println("\t\t\t2) Pix");
						System.out.println("\t\t\t3) Boleto");
						System.out.println("\t\t============================================\n\n");
						System.out.printf("Insira uma opção: ");
						System.out.println("-----------------------------------\n");
						int op1 = leia.nextInt();
						
						switch(op1)
						{
						case 1:
						    leia.nextLine();
						    System.out.println("Voce Selecionou 'Cartão' como método de pagamento");
						    System.out.println("--------------------------------------------------\n\n");
						    
						    System.out.println("============================================");   
							System.out.printf("Insira o numero do seu Cartão: ");
							String numero = leia.nextLine();
							System.out.printf("insira o código de verificação do verso do cartão: ");
							String codigo = leia.nextLine();
							System.out.println("============================================\n\n");
							
							System.out.println("\t\t============================================================");
							System.out.println("\t\tVOCÊ ACABOU DE DOAR R$ 20,00 COM O CARTÃO "+numero+".");
							System.out.println("\t\t\tMUITO OBRIGADO PELA DOAÇÃO, VOCÊ VAI FAZER O DIA DE ALGUEM MELHOR!");
							System.out.println("\t\t============================================================\n\n");
							
							break;
						case 2:
							leia.nextLine();
							System.out.println("Voce Selecionou 'Pix' como método de pagamento");
							System.out.println("--------------------------------------------------\n\n");
							System.out.println("============================================"); 
							System.out.printf("Copie e cole a chave pix gerada: ");
							System.out.printf("Chave: f123ge325-df3g-41bc-s5de");
							System.out.println("============================================\n\n");
							
							System.out.printf("\t\t\t\t\t\tAguarde Confirmação de pagamento...\n\n");
							Thread.sleep(5000);
							System.out.println("\t\t========================================================================================================");
							System.out.println("\nVocê acabou de doar R$ 20,00 pelo pix.");
							System.out.println("Muito Obrigado pela doação, Você vai fazer o dia de alguem melhor!");
							System.out.println("\t\t========================================================================================================\n\n");
							break;
						case 3:
							leia.nextLine();
							System.out.println("Voce Selecionou 'Boleto' como método de pagamento");
							System.out.println("--------------------------------------------------\n\n");
							
							System.out.println("\t\t========================================================================================================");
							System.out.printf("Copie e cole o codigo de fatura gerado ");	
							System.out.printf("Boleto: 1253.7564.7465.7857.6574.86700000");
							System.out.println("============================================\n\n");
							
							System.out.println("\t\t========================================================================================================");
							System.out.println("\nVocê acabou de gerar um boleto de doação  de R$ 20,00.");
							System.out.println("Muito Obrigado pela doação, Você vai fazer o dia de alguem melhor!");
							System.out.println("\t\t========================================================================================================\n\n");
							break;
					
						default:
							leia.nextLine();
							System.out.println("\n\n\t\tMÉTODO DE PAGAMENTO INVÁLIDO");
							break;
						} // Fim do switch op1 metodo de pagamento caso 20
					case 2:
						
						leia.nextLine();
						System.out.println("\n\nVocê selecionou doar R$ 50,00.");
						System.out.println("--------------------------------\n\n");
						
						System.out.println("\nEscolha o método de pagamento: ");
						System.out.println("--------------------------------\n\n");
						
						System.out.println("\n\n\t\t============================================");
						System.out.println("\t\t\t1) Cartão");
						System.out.println("\t\t\t2) Pix");
						System.out.println("\t\t\t3) Boleto");
						System.out.println("\t\t============================================\n\n");
						System.out.printf("Insira uma opção: ");
						System.out.println("-----------------------------------\n");
						int op2 = leia.nextInt();
						
						switch(op2)
						{
						case 1:
						    leia.nextLine();
						    System.out.println("Voce Selecionou 'Cartão' como método de pagamento");
						    System.out.println("--------------------------------------------------\n\n");
						    
						    System.out.println("============================================");   
							System.out.printf("Insira o numero do seu Cartão: ");
							String numero = leia.nextLine();
							System.out.printf("insira o código de verificação do verso do cartão: ");
							String codigo = leia.nextLine();
							System.out.println("============================================\n\n");
							
							System.out.println("\t\t============================================================");
							System.out.println("\t\tVOCÊ ACABOU DE DOAR R$ 50,00 COM O CARTÃO "+numero+".");
							System.out.println("\t\t\tMUITO OBRIGADO PELA DOAÇÃO, VOCÊ VAI FAZER O DIA DE ALGUEM MELHOR!");
							System.out.println("\t\t============================================================\n\n");
							
							break;
						case 2:
							leia.nextLine();
							System.out.println("Voce Selecionou 'Pix' como método de pagamento");
							System.out.println("--------------------------------------------------\n\n");
							System.out.println("============================================"); 
							System.out.printf("Copie e cole a chave pix gerada: ");
							System.out.printf("Chave: f123ge325-df3g-41bc-s5de");
							System.out.println("============================================\n\n");
							
							System.out.printf("\t\t\t\t\t\tAguarde Confirmação de pagamento...\n\n");
							Thread.sleep(7000);
							System.out.println("\t\t========================================================================================================");
							System.out.println("\nVocê acabou de doar R$ 50,00 pelo pix.");
							System.out.println("Muito Obrigado pela doação, Você vai fazer o dia de alguem melhor!");
							System.out.println("\t\t========================================================================================================\n\n");
							break;
						case 3:
							leia.nextLine();
							System.out.println("Voce Selecionou 'Boleto' como método de pagamento");
							System.out.println("--------------------------------------------------\n\n");
							
							System.out.println("\t\t========================================================================================================");
							System.out.printf("Copie e cole o codigo de fatura gerado ");	
							System.out.printf("Boleto: 1253.7564.7465.7857.6574.86700000");
							System.out.println("============================================\n\n");
							
							System.out.println("\t\t========================================================================================================");
							System.out.println("\nVocê acabou de gerar um boleto de doação  de R$ 50,00.");
							System.out.println("Muito Obrigado pela doação, Você vai fazer o dia de alguem melhor!");
							System.out.println("\t\t========================================================================================================\n\n");
							break;
					
						default:
							leia.nextLine();
							break;
						} //opção doação 30
						
					case 3:
						
						leia.nextLine();
						

						System.out.println("\n\nVocê selecionou doar R$ 100,00.");
						System.out.println("--------------------------------\n\n");
						
						System.out.println("\nEscolha o método de pagamento: ");
						System.out.println("--------------------------------\n\n");
						
						System.out.println("\n\n\t\t============================================");
						System.out.println("\t\t\t1) Cartão");
						System.out.println("\t\t\t2) Pix");
						System.out.println("\t\t\t3) Boleto");
						System.out.println("\t\t============================================\n\n");
						System.out.printf("Insira uma opção: ");
						System.out.println("-----------------------------------\n");
						int op3 = leia.nextInt();
						
						switch(op3)
						{
						case 1:
						    leia.nextLine();
						    System.out.println("Voce Selecionou 'Cartão' como método de pagamento");
						    System.out.println("--------------------------------------------------\n\n");
						    
						    System.out.println("============================================");   
							System.out.printf("Insira o numero do seu Cartão: ");
							String numero = leia.nextLine();
							System.out.printf("insira o código de verificação do verso do cartão: ");
							String codigo = leia.nextLine();
							System.out.println("s============================================\n\n");
							
							System.out.println("\t\t============================================================");
							System.out.println("\t\tVOCÊ ACABOU DE DOAR R$ 100,00 COM O CARTÃO "+numero+".");
							System.out.println("\t\t\tMUITO OBRIGADO PELA DOAÇÃO, VOCÊ VAI FAZER O DIA DE ALGUEM MELHOR!");
							System.out.println("\t\t============================================================\n\n");
							
							break;
						case 2:
							leia.nextLine();
							System.out.println("Voce Selecionou 'Pix' como método de pagamento");
							System.out.println("--------------------------------------------------\n\n");
							System.out.println("============================================"); 
							System.out.printf("Copie e cole a chave pix gerada: ");
							System.out.printf("Chave: f123ge325-df3g-41bc-s5de");
							System.out.println("\n============================================\n\n");
							
							System.out.printf("\t\t\t\t\t\tAguarde Confirmação de pagamento...\n\n");
							Thread.sleep(7000);
							System.out.println("\t\t========================================================================================================");
							System.out.println("\nVocê acabou de doar R$ 100,00 pelo pix.");
							System.out.println("Muito Obrigado pela doação, Você vai fazer o dia de alguem melhor!");
							System.out.println("\t\t========================================================================================================\n\n");
							break;
						case 3:
							leia.nextLine();
							System.out.println("Voce Selecionou 'Boleto' como método de pagamento");
							System.out.println("--------------------------------------------------\n\n");
							
							System.out.println("\t\t========================================================================================================");
							System.out.printf("Copie e cole o codigo de fatura gerado ");	
							System.out.printf("Boleto: 1253.7564.7465.7857.6574.86700000");
							System.out.println("\n============================================\n\n");
							
							System.out.println("\t\t========================================================================================================");
							System.out.println("\nVocê acabou de gerar um boleto de doação  de R$ 100,00.");
							System.out.println("Muito Obrigado pela doação, Você vai fazer o dia de alguem melhor!");
							System.out.println("\t\t========================================================================================================\n\n");
							break;
					
						default:
							leia.nextLine();
							System.out.println("\n\n\t\tMÉTODO DE PAGAMENTO INVÁLIDO");
							break;
						}
						
						break;
					case 4:
						leia.nextLine();
						System.out.println("\n\nVocê selecionou doação livre");
						System.out.println("--------------------------------\n\n");
						System.out.printf("\nInsira o valor que deseja doar:");
						System.out.println("--------------------------------------------------");
						String numero = leia.nextLine();
					
						String dinheiro ;
						dinheiro = numero;
						

						
						System.out.println("\nEscolha o método de pagamento: ");
						System.out.println("--------------------------------\n\n");
						
						System.out.println("\n\n\t\t============================================");
						System.out.println("\t\t\t1) Cartão");
						System.out.println("\t\t\t2) Pix");
						System.out.println("\t\t\t3) Boleto");
						System.out.println("\t\t============================================\n\n");
						System.out.printf("Insira uma opção: ");
						System.out.println("-----------------------------------\n");
						int op4 = leia.nextInt();
						
						switch(op4)
						{
						case 1:
						    leia.nextLine();
						    System.out.println("Voce Selecionou 'Cartão' como método de pagamento");
						    System.out.println("--------------------------------------------------\n\n");
						    
						    System.out.println("============================================");   
							System.out.printf("Insira o numero do seu Cartão: ");
							String numero1 = leia.nextLine();
							System.out.printf("insira o código de verificação do verso do cartão: ");
							String codigo = leia.nextLine();
							System.out.println("============================================\n\n");
							leia.nextLine();
							System.out.println("\t\t============================================================");
							System.out.println("\t\tVOCÊ ACABOU DE DOAR R$ "+dinheiro+" COM O CARTÃO "+numero1+".");
							System.out.println("\t\t\tMUITO OBRIGADO PELA DOAÇÃO, VOCÊ VAI FAZER O DIA DE ALGUEM MELHOR!");
							System.out.println("\t\t============================================================\n\n");
							
							break;
						case 2:
							leia.nextLine();
							System.out.println("Voce Selecionou 'Pix' como método de pagamento");
							System.out.println("--------------------------------------------------\n\n");
							System.out.println("============================================"); 
							System.out.printf("Copie e cole a chave pix gerada: ");
							System.out.printf("Chave: f123ge325-df3g-41bc-s5de");
							System.out.println("\n============================================\n\n");
							
							System.out.printf("\t\t\t\t\t\tAguarde Confirmação de pagamento...\n\n");
							Thread.sleep(7000);
							System.out.println("\t\t========================================================================================================");
							System.out.println("\nVocê acabou de doar R$ "+dinheiro+" pelo pix.");
							System.out.println("Muito Obrigado pela doação, Você vai fazer o dia de alguem melhor!");
							System.out.println("\t\t========================================================================================================\n\n");
							break;
						case 3:
							leia.nextLine();
							System.out.println("Voce Selecionou 'Boleto' como método de pagamento");
							System.out.println("--------------------------------------------------\n\n");
							
							System.out.println("\t\t========================================================================================================");
							System.out.printf("Copie e cole o codigo de fatura gerado ");	
							System.out.printf("Boleto: 1253.7564.7465.7857.6574.86700000");
							System.out.println("\n============================================\n\n");
							
							System.out.println("\t\t========================================================================================================");
							System.out.println("\nVocê acabou de gerar um boleto de doação  de R$ "+dinheiro);
							System.out.println("Muito Obrigado pela doação, Você vai fazer o dia de alguem melhor!");
							System.out.println("\t\t========================================================================================================\n\n");
							break;
					
						default:
							leia.nextLine();
							System.out.println("\n\n\t\tMÉTODO DE PAGAMENTO INVÁLIDO");
							break;
						}
						
						break;
				
						
					default:
						
						System.out.println("\n\n\t\tVALOR DO PAGAMENTO INVÁLIDO");
						break;
		
					}                                                     // Fim do switch op valor da doação
									
			default:
			System.out.println("\n\n\tOPÇÃO INVÁLIDA ");
				break;
					
			}                                                         // switch doador ou contribuinte
		}                                                            // Fim do While que repete o codigo principal
		while(true);
	 }

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public String getNomeCadastro() {
		return nomeCadastro;
	}

	public void setNomeCadastro(String nomeCadastro) {
		this.nomeCadastro = nomeCadastro;
	}

	public String getIdadeCadastro() {
		return idadeCadastro;
	}

	public void setIdadeCadastro(String idadeCadastro) {
		this.idadeCadastro = idadeCadastro;
	}

	public String getTelCadastro() {
		return telCadastro;
	}

	public void setTelCadastro(String telCadastro) {
		this.telCadastro = telCadastro;
	}

	public String getCpfCadastro() {
		return cpfCadastro;
	}

	public void setCpfCadastro(String cpfCadastro) {
		this.cpfCadastro = cpfCadastro;
	}

	public String getCityCadastro() {
		return cityCadastro;
	}

	public void setCityCadastro(String cityCadastro) {
		this.cityCadastro = cityCadastro;
	}

	public String getEstadoCadastro() {
		return estadoCadastro;
	}

	public void setEstadoCadastro(String estadoCadastro) {
		this.estadoCadastro = estadoCadastro;
	}

	public String getRuaCadastro() {
		return ruaCadastro;
	}

	public void setRuaCadastro(String ruaCadastro) {
		this.ruaCadastro = ruaCadastro;
	}

	public String getNumCadastro() {
		return numCadastro;
	}

	public void setNumCadastro(String numCadastro) {
		this.numCadastro = numCadastro;
	}

	public String getCepCadastro() {
		return cepCadastro;
	}

	public void setCepCadastro(String cepCadastro) {
		this.cepCadastro = cepCadastro;
	}

	public String getDoador() {
		return doador;
	}

	public void setDoador(String doador) {
		this.doador = doador;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	
		
	}
	