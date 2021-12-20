package  ProjetoDoeBahia ;

import  java.util.Scanner ;
//import  java.util.Locale ;

public  class  ProjetoDoacao
{	
	Scanner leia = new  Scanner ( System.in );
	
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
	private double contador= 5300.00;
		
	public ProjetoDoacao ( String nomeCadastro, String idadeCadastro, String telCadastro, String cpfCadastro, String cityCadastro, String estadoCadastro, String ruaCadastro, String numCadastro, String cepCadastro, String doador, String receptor, int opcao, double contador)
	{
		this . numCadastro = nomeCadastro;
		this . idadeCadastro = idadeCadastro;
		this . telCadastro = telCadastro;
		this . cpfCadastro = cpfCadastro;
		this . cityCadastro = cityCadastro;
		this . estadoCadastro = estadoCadastro;
		this . ruaCadastro = ruaCadastro;
		this . numCadastro = numCadastro;
		this . cepCadastro = cepCadastro;
		this . doador = doador;
		this . receptor = receptor;
	}
	
	public  ProjetoDoacao ( String nomeCadastro, String idadeCadastro, String telCadastro )
	{
		this . numCadastro = nomeCadastro;
		this . idadeCadastro = idadeCadastro;
		this . telCadastro = telCadastro;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void doadores () throws InterruptedException
	{
		double soma = 0;
		
		do
		{
			ProjetoDoacao projeto = new ProjetoDoacao (null,null,null,null,null,null,null,null,null,null,null,0,0);
			System.out.println ("\n\n\t ========================================= ================================================================ ");
			System.out.println ("\t %%%%%%%%         %%%%%%     %%%%%%%    %%%%%%%%       %%%%%%      %%%     %%%  %%%      %%%%%%    ");
			System.out.println ("\t %%%%%%%%%%      %%%  %%%    %%%%%%%    %%%%%%%%%     %%%  %%%     %%%     %%%  %%%     %%%  %%%   ");
			System.out.println ("\t %%%     %%%    %%%    %%%   %%%        %%%    %%%    %%%  %%%     %%%     %%%  %%%     %%%  %%%   ");
			System.out.println ("\t %%%      %%%  %%%      %%%  %%%        %%%    %%%   %%%    %%%    %%%     %%%  %%%    %%%    %%%  ");
			System.out.println ("\t %%%      %%%  %%%      %%%  %%%%%%%    %%%%%%%%%    %%%%%%%%%%    %%%%%%%%%%%  %%%    %%%%%%%%%%  ");
			System.out.println ("\t %%%      %%%  %%%      %%%  %%%        %%%    %%%  %%%      %%%   %%%     %%%  %%%   %%%      %%% ");
			System.out.println ("\t %%%     %%%    %%%    %%%   %%%        %%%    %%%  %%%      %%%   %%%     %%%  %%%   %%%      %%% ");
			System.out.println ("\t %%%%%%%%%%      %%%  %%%    %%%%%%%    %%%%%%%%%  %%%        %%%  %%%     %%%  %%%  %%%        %%%");
			System.out.println ("\t %%%%%%%          %%%%%%     %%%%%%%    %%%%%%%%   %%%        %%%  %%%     %%%  %%%  %%%        %%%");
			System.out.println ("\t =============================================== ========================================================== \n\n");
					
			System.out.println("\t OLÁ, ESTAMOS FELIZES EM TE TER POR AQUI! \n");
			System.out.println("\t=============================================");
			System.out.println("\t=============================================");
			System.out.printf("\t||\t TOTAL ARRECADADO R$ %.2f ! ",soma);
			System.out.println("\n\t=============================================");
			System.out.println("\t=============================================");
			System.out.println("\n\t Estes valores seram direcionados as pessoas em situação de vulnerabilidade devido as enchentes no sul da bahia! \n");
		
			System.out.printf("\t Selecione abaixo uma categora em que você se enquadre:");
			System.out.println("\n\t ----------------------------------------------- --------");
			System.out.println("\n\t =============================================== =======");
			System.out.printf("\t ( 1 ) - Para receber uma doação!");
			System.out.printf("\n\t ( 2 ) - Para realizar uma doação!");
			System.out.println("\n\t =============================================== =======");
			opcao = leia . nextInt ();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			switch (opcao)
			{
				case  1 :
					leia . nextLine ();
					System.out.println("\n\t Estamos aqui para te ajudar! faça o cadastro para podermos retornar o contato."); 
					System.out.println("\t ----------------------------------------------- --------------------------------\n");
					System.out.println("\n\t ===================================================== ======================================");
				
					System.out.println("\t Informe o seu nome completo:");
					nomeCadastro = leia . nextLine ();
				
					System.out.println("\t Informe sua a idade:");
					idadeCadastro = leia . nextLine ();
				
					System.out.println("\t Informe um telefone para contato: ");
					telCadastro = leia . nextLine ();
				
					System.out.println("\t Infome o CPF que deseja cadastrar: ");
					cpfCadastro = leia . nextLine ();
				
				    System.out.println("\t Em qual cidade da Bahia você reside? " );
					cityCadastro = leia . nextLine ();
					
					System.out.println("\t Qual o cep da sua rua? " );
					cepCadastro = leia . nextLine ();
			
					System.out.println("\t Qual o nome da Rua que você mora? " );
					ruaCadastro = leia . nextLine ();
				
					System.out.println("\t Qual o número da casa? " );
					numCadastro = leia . nextLine ();
					System.out.println("\t===================================================== ====================================\n");
			     
					System.out.println("\n\t Dados cadastrados:\n\n\t Nome:" + nomeCadastro + "\n\t Idade:" + idadeCadastro + "\n\t Telefone:" + telCadastro + " \n\t CPF:" + cpfCadastro+"\n\n\t "+ nomeCadastro+", Seus dados foram cadastrados com sucesso, AGUARDE!! ENTRAREMOS EM CONTATO COM VOCÊ O MAIS RÁPIDO POSSÍVEL. \n\n" );
					System.out.println("\n\t===================================================== ====================================\n\n\n\n\n\n");
				break;
				
				case  2 :
					leia . nextLine ();
					int op;  
					System.out.println("\t Escolha uma das opções de valore abaixo para a doação! " );
					System.out.println("\t --------------------------------------------------------");	
					
					System.out.println("\n\t =============================================== ========");
					System.out.println("\t ( 1 ) Para doar R$ 20,00");
					System.out.println("\t ( 2 ) Para doar R$ 50,00");
					System.out.println("\t ( 3 ) Para doar R$ 100,00"); 
					System.out.println("\t ( 4 ) Escolher um valor"); 
					System.out.println("\t =============================================== ======== \n");
					System.out.println("\t Digite uma opção:");					
					System.out.println("\t -------------------------------------------------------- \n");
					op = leia . nextInt ();
					
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					
					
					switch (op)
					{
						case  1 :
							leia . nextLine ();
							
							System.out.println("\n\t Você selecionou doar R$ 20,00." );
							System.out.println("\t --------------------------------------------------------\n " );						
							System.out.println("\n\t Escolha um dos métodos de pagamento abaixo:" );
							System.out.println("\t -------------------------------------------------------- " );						
							System.out.println("\n\t =============================================== ======== " );
							System.out.println("\t ( 1 ) Cartão " );
							System.out.println("\t ( 2 ) Pix " );
							System.out.println("\t ( 3 ) Boleto " );
							System.out.println("\t =============================================== ========" );
							System.out.printf( "\n\t Insira uma opção:" );						
							System.out.println("\n\t -------------------------------------------------------- \n" );
							
							int op1 = leia . nextInt ();
					
						
						switch (op1)
						{
							case  1 :
								leia . nextLine ();
								
								System.out.println("\n\t Você Selecionou 'Cartão' como método de pagamento " );
								System.out.println("\t -------------------------------------------------------- \n " );
						    
								System.out.println("\t =============================================== ======== " );   
								System.out.printf("\t Insira o numero do seu Cartão: " );
								String numero = leia . nextLine ();
								System.out.printf("\t insira o código de verificação do verso do cartão: " );
								String codigo = leia . nextLine ();
								System.out.println("\t =============================================== ======== \n\n " );
							   
								soma += 20;
							    
								System.out.println("\t =============================================== =================== " );
								System.out.println("\t VOCÊ ACABOU DE DOAR R$ 20,00 COM O CARTÃO " + numero + " . " );
								System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
								System.out.println("\t =============================================== =================== \n\n" );
								
							break;
								
						case  2 :
							leia . nextLine ();
							
							System.out.println("\t Você Selecionou 'Pix' como método de pagamento ");
							System.out.println("\t -------------------------------------------------------- \n\n");
							System.out.println("\t =============================================== ========");
							System.out.printf("\t Copie e cole a chave pix gerada abaixo: \n " );
							System.out.printf("\t Chave: f123ge325-df3g-41bc-s5de " );
							System.out.println("\n\t =============================================== ========\n");
							
							System.out.printf("\t\t Aguarde Confirmação de pagamento ... \n\n");
							Thread.sleep( 7000 );
							
							soma += 20;
							
							System.out.println("\t =============================================== =================== " );
							System.out.println("\t VOCÊ ACABOU DE DOAR R$ 20,00 ATRAVÉZ DO PIX. \n " );
							System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
							System.out.println("\t =============================================== =================== \n\n" );
							
							break;
								
						case  3 :
							leia . nextLine ();
							
							System.out.println("\t Você Selecionou 'Boleto' como método de pagamento ");
							System.out.println("\t -------------------------------------------------------- \n\n");
							System.out.println("\t =============================================== ========");
							System.out.printf("\t Copie e cole o código de fatura gerado abaixo: \n " );
							System.out.printf("\t Fatura: 1253.7564.7465.7857.6574.86700000 " );
							System.out.println("\n\t =============================================== ========\n");						
							
							soma += 20;
							
							System.out.println("\t =============================================== =================== " );
							System.out.println("\t VOCÊ ACABOU DE GERAR UM BOLETO DE DOAÇÃO DE R$ 20,00.\n " );
							System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
							System.out.println("\t =============================================== =================== \n\n" );
							
							
							
							break;
						
						default :
							leia . nextLine ();
							System.out.println("\t MÉTODO DE PAGAMENTO INVÁLIDO! ");
							System.out.println("\t -------------------------------------------------------- \n\n");
							break;	
						} // Fim do switch op1 método de pagamento caso 20
							
							
				case  2 :
						
					leia . nextLine ();
															
					System.out.println("\n\t Você selecionou doar R$ 50,00." );
					System.out.println("\t --------------------------------------------------------\n " );						
					System.out.println("\n\t Escolha um dos métodos de pagamento abaixo:" );
					System.out.println("\t -------------------------------------------------------- " );						
					System.out.println("\n\t =============================================== ======== " );
					System.out.println("\t ( 1 ) Cartão " );
					System.out.println("\t ( 2 ) Pix " );
					System.out.println("\t ( 3 ) Boleto " );
					System.out.println("\t =============================================== ========" );
					System.out.printf( "\n\t Insira uma opção:" );						
					System.out.println("\n\t -------------------------------------------------------- \n" );
					
					int op2 = leia . nextInt ();
						
						switch (op2)
						{
							case  1 :
								leia . nextLine ();							
								
								System.out.println("\n\t Você Selecionou 'Cartão' como método de pagamento " );
								System.out.println("\t -------------------------------------------------------- \n " );
						    
								System.out.println("\t =============================================== ======== " );   
								System.out.printf("\t Insira o numero do seu Cartão: " );
								String numero = leia . nextLine ();
								System.out.printf("\t insira o código de verificação do verso do cartão: " );
								String codigo = leia . nextLine ();
								System.out.println("\t =============================================== ======== \n\n " );
								
								soma += 50;
								
								System.out.println("\t =============================================== =================== " );
								System.out.println("\t VOCÊ ACABOU DE DOAR R$ 50,00 COM O CARTÃO " + numero + " . " );
								System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
								System.out.println("\t =============================================== =================== \n\n" );
								
								break;
								
							case  2 :
								leia . nextLine ();
								
								System.out.println("\t Você Selecionou 'Pix' como método de pagamento ");
								System.out.println("\t -------------------------------------------------------- \n\n");
								System.out.println("\t =============================================== ========");
								System.out.printf("\t Copie e cole a chave pix gerada abaixo: \n " );
								System.out.printf("\t Chave: f123ge325-df3g-41bc-s5de " );
								System.out.println("\n\t =============================================== ========\n");
								
								System.out.printf("\t\t Aguarde Confirmação de pagamento ... \n\n");
								Thread.sleep( 7000 );
								
								soma += 50;
								
								System.out.println("\t =============================================== =================== " );
								System.out.println("\t VOCÊ ACABOU DE DOAR R$ 50,00 ATRAVÉZ DO PIX. \n " );
								System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
								System.out.println("\t =============================================== =================== \n\n" );
								
								break;
								
							case  3 :
								leia . nextLine ();
															
								System.out.println("\t Você Selecionou 'Boleto' como método de pagamento ");
								System.out.println("\t -------------------------------------------------------- \n\n");
								System.out.println("\t =============================================== ========");
								System.out.printf("\t Copie e cole o código de fatura gerado abaixo: \n " );
								System.out.printf("\t Fatura: 1253.7564.7465.7857.6574.86700000 " );
								System.out.println("\n\t =============================================== ========\n");
								
								soma += 50;
								
								System.out.println("\t =============================================== =================== " );
								System.out.println("\t VOCÊ ACABOU DE GERAR UM BOLETO DE DOAÇÃO DE R$ 50,00.\n " );
								System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
								System.out.println("\t =============================================== =================== \n\n" );	
							
								break;
						
							default :
								leia . nextLine ();
								break;
							} // opção doação 30
							
				case  3 :
						
					leia . nextLine ();
															
					System.out.println("\n\t Você selecionou doar R$ 100,00." );
					System.out.println("\t --------------------------------------------------------\n " );						
					System.out.println("\n\t Escolha um dos métodos de pagamento abaixo:" );
					System.out.println("\t -------------------------------------------------------- " );						
					System.out.println("\n\t =============================================== ======== " );
					System.out.println("\t ( 1 ) Cartão " );
					System.out.println("\t ( 2 ) Pix " );
					System.out.println("\t ( 3 ) Boleto " );
					System.out.println("\t =============================================== ========" );
					System.out.printf( "\n\t Insira uma opção:" );						
					System.out.println("\n\t -------------------------------------------------------- \n" );
					
					int op3 = leia . nextInt ();
						
						switch (op3)
						{
							case  1 :
								leia . nextLine ();
								
								System.out.println("\n\t Você Selecionou 'Cartão' como método de pagamento " );
								System.out.println("\t -------------------------------------------------------- \n " );
						    
								System.out.println("\t =============================================== ======== " );   
								System.out.printf("\t Insira o numero do seu Cartão: " );
								String numero = leia . nextLine ();
								System.out.printf("\t insira o código de verificação do verso do cartão: " );
								String codigo = leia . nextLine ();
								System.out.println("\t =============================================== ======== \n\n " );
								
								soma += 100;
							
								System.out.println("\t =============================================== =================== " );
								System.out.println("\t VOCÊ ACABOU DE DOAR R$ 100,00 COM O CARTÃO " + numero + " . " );
								System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
								System.out.println("\t =============================================== =================== \n\n" );
								
							break;
							
							case  2 :
								leia . nextLine ();
															
								System.out.println("\t Você Selecionou 'Pix' como método de pagamento ");
								System.out.println("\t -------------------------------------------------------- \n\n");
								System.out.println("\t =============================================== ========");
								System.out.printf("\t Copie e cole a chave pix gerada abaixo: \n " );
								System.out.printf("\t Chave: f123ge325-df3g-41bc-s5de " );
								System.out.println("\n\t =============================================== ========\n");
								
								System.out.printf("\t\t Aguarde Confirmação de pagamento ... \n\n");
								Thread.sleep( 7000 );
								
								soma += 100;
								
								System.out.println("\t =============================================== =================== " );
								System.out.println("\t VOCÊ ACABOU DE DOAR R$ 100,00 ATRAVÉZ DO PIX. \n " );
								System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
								System.out.println("\t =============================================== =================== \n\n" );
								
							
								break;
							
							case  3 :
								leia . nextLine ();
															
								System.out.println("\t Você Selecionou 'Boleto' como método de pagamento ");
								System.out.println("\t -------------------------------------------------------- \n\n");
								System.out.println("\t =============================================== ========");
								System.out.printf("\t Copie e cole o código de fatura gerado abaixo: \n " );
								System.out.printf("\t Fatura: 1253.7564.7465.7857.6574.86700000 " );
								System.out.println("\n\t =============================================== ========\n");
								
								soma += 100;
								
								System.out.println("\t =============================================== =================== " );
								System.out.println("\t VOCÊ ACABOU DE GERAR UM BOLETO DE DOAÇÃO DE R$ 100,00.\n " );
								System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
								System.out.println("\t =============================================== =================== \n\n" );	
															
								break;
						
							//default :
							//	leia . nextLine ();
							//	System.out.println("\n\n\t\t MÉTODO DE PAGAMENTO INVÁLIDO " );
							//	break;
						}
						
				case  4 :
					leia . nextLine ();
											
					System.out.println("\n\t Você selecionou doação livre." );
					System.out.println("\t --------------------------------\n " );						
					System.out.println("\n\t Insira o valor que deseja doar: " );
					System.out.println("\t --------------------------------------------- " );
					double numero = leia.nextDouble();
										
							
					System.out.println("\n\t Escolha um dos métodos de pagamento abaixo:" );
					System.out.println("\t --------------------------------------------- " );						
					System.out.println("\n\t =============================================== ===== " );
					System.out.println("\t ( 1 ) Cartão " );
					System.out.println("\t ( 2 ) Pix " );
					System.out.println("\t ( 3 ) Boleto " );
					System.out.println("\t ================================================= =" );
					System.out.printf( "\n\t Insira uma opção:" );						
					System.out.println("\n\t ----------------------------------- \n" );
					
					int op4 = leia . nextInt ();
						
						switch(op4)
						{
							case  1 :
								leia . nextLine ();				
								System.out.println("\n\t Você Selecionou 'Cartão' como método de pagamento " );
								System.out.println("\t -------------------------------------------------------- \n " );
						    
								System.out.println("\t =============================================== ======== " );   
								System.out.printf("\t Insira o numero do seu Cartão: " );
								String numero1 = leia . nextLine ();
								System.out.printf("\t insira o código de verificação do verso do cartão: " );
								String codigo = leia . nextLine ();
								System.out.println("\t =============================================== ======== \n\n " );
								
								soma += numero;
								
								System.out.println("\t =============================================== =================== " );
								System.out.println("\t VOCÊ ACABOU DE DOAR R$"+ numero +" COM O CARTÃO " + numero1 + " . " );
								System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
								System.out.println("\t =============================================== =================== \n\n" );
								
							break;
							
							case  2 :
								leia . nextLine ();
																
								System.out.println("\t Você Selecionou 'Pix' como método de pagamento ");
								System.out.println("\t -------------------------------------------------------- \n\n");
								System.out.println("\t =============================================== ========");
								System.out.printf("\t Copie e cole a chave pix gerada abaixo: \n " );
								System.out.printf("\t Chave: f123ge325-df3g-41bc-s5de " );
								System.out.println("\n\t =============================================== ========\n");
								
								System.out.printf("\t\t Aguarde Confirmação de pagamento ... \n\n");
								Thread.sleep( 7000 );
								
								soma += numero;
								
								System.out.println("\t =============================================== =================== " );
								System.out.println("\t VOCÊ ACABOU DE DOAR R$ "+ numero +" ATRAVÉZ DO PIX. \n " );
								System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
								System.out.println("\t =============================================== =================== \n\n" );
								
								break;
							
							case  3 :
								leia . nextLine ();
																
								System.out.println("\t Você Selecionou 'Boleto' como método de pagamento ");
								System.out.println("\t -------------------------------------------------------- \n\n");
								System.out.println("\t =============================================== ========");
								System.out.printf("\t Copie e cole o código de fatura gerado abaixo: \n " );
								System.out.printf("\t Fatura: 1253.7564.7465.7857.6574.86700000 " );
								System.out.println("\n\t =============================================== ========\n");
								
								soma += numero;
								
								System.out.println("\t =============================================== =================== " );
								System.out.println("\t VOCÊ ACABOU DE GERAR UM BOLETO DE DOAÇÃO DE R$ "+ numero +".\n " );
								System.out.println("\t MUITO OBRIGADO PELA DOAÇÃO, VOCÊ FEZ O DIA DE ALGUEM MELHOR! " );
								System.out.println("\t =============================================== =================== \n\n" );	
								break;
					
							default :
								leia . nextLine ();
								System.out.println("\n\n\t\t\t MÉTODO DE PAGAMENTO INVÁLIDO " );
								break;
						}		
					default :
						//System.out.println("\n\n\t\t VALOR DO PAGAMENTO INVÁLIDO " );
						break;
		
					}   // Fim do switch op valor da doação
									
			default :
				//System.out.println("\n\n\t OPÇÃO INVÁLIDA " );
				break;
				
			}     // switch doador ou contribuinte
		}      // Fim do While que repete o codigo principal
		while (true);
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	 }

	public  Scanner  getLeia ()
	{
		return leia;
	}

	public  void  setLeia ( Scanner  leia )
	{
		this . leia = leia;
	}

	public  String  getNomeCadastro ()
	{
		return nomeCadastro;
	}

	public  void  setNomeCadastro ( String  nomeCadastro )
	{
		this . nomeCadastro = nomeCadastro;
	}

	public  String  getIdadeCadastro ()
	{
		return idadeCadastro;
	}

	public  void  setIdadeCadastro ( String  idadeCadastro )
	{
		this . idadeCadastro = idadeCadastro;
	}

	public  String  getTelCadastro ()
	{
		return telCadastro;
	}

	public  void  setTelCadastro ( String  telCadastro )
	{
		this. telCadastro = telCadastro;
	}

	public  String  getCpfCadastro ()
	{
		return cpfCadastro;
	}

	public  void  setCpfCadastro ( String  cpfCadastro )
	{
		this . cpfCadastro = cpfCadastro;
	}

	public  String  getCityCadastro ()
	{
		return cityCadastro;
	}

	public  void  setCityCadastro ( String  cityCadastro )
	{
		this . cityCadastro = cityCadastro;
	}

	public  String  getEstadoCadastro ()
	{
		return estadoCadastro;
	}

	public  void  setEstadoCadastro ( String  estadoCadastro )
	{
		this . estadoCadastro = estadoCadastro;
	}

	public  String  getRuaCadastro ()
	{
		return ruaCadastro;
	}

	public  void  setRuaCadastro ( String  ruaCadastro )
	{
		this. ruaCadastro = ruaCadastro;
	}

	public  String  getNumCadastro ()
	{
		return numCadastro;
	}

	public  void  setNumCadastro ( String  numCadastro )
	{
		this. numCadastro = numCadastro;
	}

	public  String  getCepCadastro ()
	{
		return cepCadastro;
	}

	public  void  setCepCadastro ( String  cepCadastro )
	{
		this . cepCadastro = cepCadastro;
	}

	public  String  getDoador ()
	{
		return doador;
	}

	public  void  setDoador ( String  doador )
	{
		this . doador = doador;
	}

	public  String  getReceptor ()
	{
		return receptor ;
	}

	public  void  setReceptor (String receptor)
	{
		this.receptor = receptor;
	}

	public  int  getOpcao ()
	{
		return opcao;
	}

	public  void  setOpcao ( int  opcao )
	{
		this . opcao = opcao;
	}
 	
}