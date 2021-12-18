package ProjetoDoeBahia;

import java.util.Scanner;

public class ProjetoDoador {
	
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
	
	public ProjetoDoador (String nomeCadastro, String idadeCadastro,String telCadastro,
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
	
	public void imprimirInfo()
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
	}
		public void doadores()
		{
			
		
		System.out.println("\n Escolha a opção desejada. ");
		System.out.println("\n 1 - Para receber uma doação! ");
		System.out.println("\n 2 - Para realizar uma doação! ");
		
		opcao=leia.nextInt();
		
		switch(opcao)
		{
		case 1:
			System.out.println("\n Seus dados foram incluídos em nosso sistema e você irá entrar em nossa fila de espera.\n Assim que sua vez chegar o nosso time irá entrar em contato. ");
			System.out.println("\n Os dados cadastrados foram: \n Nome: "+nomeCadastro+"\n Idade: "+idadeCadastro+"\n Telefone: "+telCadastro+"\n CPF: "+cpfCadastro);
			break;
			
		case 2:
			System.out.println("\n Ficamos feliz em saber que você deseja ajudar ao próximo. ");
			break;
		}
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
	