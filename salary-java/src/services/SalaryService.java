package services;

import entities.Employee;

public class SalaryService {
	/*
	 * FORMA ERRADA: Se um componente A depende de B, A NÃO DEVE ter o CONTROLE de
	 * quem será essa dependência: SalaryService é o "motor" e depende de taxService
	 * e pensionService (bateria+outro), que não devem estar dentro do "motor"
	 * Estando aqui, se for preciso trocar o taxService ou PensionService, seria
	 * necessário abrir o SalaryService
	 * 
	 * TaxService taxService = new TaxService(); PensionService pensionService = new
	 * PensionService();
	 * 
	 */
	/*
	 * FORMA CORRETA: Declarado assim, o SalaryService não tem mais controle sobre
	 * as outras duas classes / dependências
	 */
	private TaxService taxService;
	private PensionService pensionService;

	/*
	 * FAZER A INJEÇÃO DE DEPENDÊNCIA USANDO UM CONSTRUTOR:
	 */
	public SalaryService(TaxService taxService, PensionService pensionService) {
		this.taxService = taxService;
		this.pensionService = pensionService;
	}

	public double netSalary(Employee employee) {
		return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary())
				- pensionService.discount(employee.getGrossSalary());
	}

}
