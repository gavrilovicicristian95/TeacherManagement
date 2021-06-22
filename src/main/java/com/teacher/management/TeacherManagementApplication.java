package com.teacher.management;

import com.teacher.management.models.ArticlesFormulas;
import com.teacher.management.models.ResponsabilityType;
import com.teacher.management.repository.ResponsabilityTypeRepository;
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
				responsabilityTypeService.save(new ResponsabilityType(100, "Rector"));
				responsabilityTypeService.save(new ResponsabilityType(80, "Prorectori"));
			};
		}
		if(articlesFormulasService.findAll().size() == 0) {
			return () -> {
				articlesFormulasService.save(new ArticlesFormulas(0,60,25,2,1
						,"(60 puncte x factor de impact + 25)/max(numar _ autori-2,1)","webScience"));
				articlesFormulasService.save(new ArticlesFormulas(40,0,25,2,1
						,"(40 puncte x SJR+25)/max(numar _ autori-2,1)","indexateScopus"));
				articlesFormulasService.save(new ArticlesFormulas(5,2,1
						,"5 puncte/max(numar _ autori-2,1)","indexateBDI"));
				articlesFormulasService.save(new ArticlesFormulas(1,2,1
						,"1 punct/max(numar _ autori-2,1)","neindexate"));
			};

		}
		return null;
	}


}
