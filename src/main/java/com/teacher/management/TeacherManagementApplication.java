package com.teacher.management;

import com.teacher.management.models.ArticlesFormulas;
import com.teacher.management.models.ResponsabilityType;
import com.teacher.management.service.ArticlesFormulasService;
import com.teacher.management.service.ResponsabilityTypeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TeacherManagementApplication {
	@Autowired
	ResponsabilityTypeService responsabilityTypeService;
	@Autowired
	ArticlesFormulasService articlesFormulasService;

	public static void main(String[] args) {
		SpringApplication.run(TeacherManagementApplication.class, args);
	}
	@Bean
	InitializingBean sendDatabase() {
		if(responsabilityTypeService.findAll().size() == 0) {
			return () -> {
				responsabilityTypeService.save(new ResponsabilityType(100, "Rector","responsabilitatiUniversitate"));
				responsabilityTypeService.save(new ResponsabilityType(80, "Director CSUD","responsabilitatiUniversitate"));
				responsabilityTypeService.save(new ResponsabilityType(80, "Director FC/ID/IFR ","responsabilitatiUniversitate"));
				responsabilityTypeService.save(new ResponsabilityType(60, "Decani","responsabilitatiUniversitate"));
				responsabilityTypeService.save(new ResponsabilityType(40, "Prodecani","responsabilitatiUniversitate"));
				responsabilityTypeService.save(new ResponsabilityType(40, "irector Departamente Interdisciplinare","responsabilitatiUniversitate"));
				responsabilityTypeService.save(new ResponsabilityType(40, "Director Scoala Doctorala ","responsabilitatiUniversitate"));
				responsabilityTypeService.save(new ResponsabilityType(40, "Director ID","responsabilitatiUniversitate"));
				responsabilityTypeService.save(new ResponsabilityType(40, "Director Centrul de Studii Europene","responsabilitatiUniversitate"));
				responsabilityTypeService.save(new ResponsabilityType(40, "Director Grădina Botanică ","responsabilitatiUniversitate"));
				responsabilityTypeService.save(new ResponsabilityType(40, "Director Muzee","responsabilitatiUniversitate"));

				responsabilityTypeService.save(new ResponsabilityType(80, "Senatul Universităţii - PRESEDINTE ","responsabilitatiSenat"));
				responsabilityTypeService.save(new ResponsabilityType(50, "Senatul Universităţii - VICEPRESEDINTE ","responsabilitatiSenat"));
				responsabilityTypeService.save(new ResponsabilityType(30, "Presedinte al unei comisii de specialitate ","responsabilitatiSenat"));
				responsabilityTypeService.save(new ResponsabilityType(15, "Senatul Universităţii- MEMBRU  ","responsabilitatiSenat"));
				responsabilityTypeService.save(new ResponsabilityType(10, "Consiliul Facultăţii ","responsabilitatiSenat"));
				responsabilityTypeService.save(new ResponsabilityType(5, "Consiliul Departamentului ","responsabilitatiSenat"));


			};
		}
		if(articlesFormulasService.findAll().size() == 0) {
			return () -> {
				articlesFormulasService.save(new ArticlesFormulas("(60 puncte x factor de impact + 25)/max(numar _ autori-2,1)","webScience","ArticlesScores"));
				articlesFormulasService.save(new ArticlesFormulas("(40 puncte x SJR+25)/max(numar _ autori-2,1)","indexateScopus","ArticlesScores"));
				articlesFormulasService.save(new ArticlesFormulas("5 puncte/max(numar _ autori-2,1)","indexateBDI","ArticlesScores"));
				articlesFormulasService.save(new ArticlesFormulas("1 punct/max(numar _ autori-2,1)","neindexate","ArticlesScores"));
				articlesFormulasService.save(new ArticlesFormulas("100 puncte la 100 pagini/max(numar _ autori-2,1)","strainatate","BooksScores"));
				articlesFormulasService.save(new ArticlesFormulas("40 puncte la 100 pagini/max(numar _ autori-2,1)","taraAcreditatCNCS","BooksScores"));
				articlesFormulasService.save(new ArticlesFormulas("20 puncte la 100 pagini/max(numar _ autori-2,1)","alteEdituri","BooksScores"));
				articlesFormulasService.save(new ArticlesFormulas("30 puncte la 100 pagini/numar de coordonatori sau editori","coordStrainatate","BooksScores"));
				articlesFormulasService.save(new ArticlesFormulas(" 15 puncte la 100 pagini/numar de coordonatori sau editori","coordTaraAcreditatCNCS","BooksScores"));
				articlesFormulasService.save(new ArticlesFormulas(" valoare lei contract UAIC anual/1000lei","finantareInternationalaDirector","ContractScores"));
				articlesFormulasService.save(new ArticlesFormulas(" valoare lei contract UAIC anual/1000lei/nr membrilor echipei de cercetare","finantareInternationalaMembru","ContractScores"));
				articlesFormulasService.save(new ArticlesFormulas(" valoare lei contract UAIC anual/2000lei","finantareNationalaDirector","ContractScores"));
				articlesFormulasService.save(new ArticlesFormulas(" :valoare lei contract UAIC anual/2000lei/nr membrilor echipei de cercetare","finantareNationalaMembru","ContractScores"));
			};

		}
		return null;
	}


}
