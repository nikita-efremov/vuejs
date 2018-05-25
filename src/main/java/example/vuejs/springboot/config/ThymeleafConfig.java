package example.vuejs.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

/**
 * Additional thymeleaf template resolver, because default template resolver does not work during deployment
 * in IntellijIdea 2018.1.4. It points to the same directory as default template resolver.
 *
 * @author Nikita Efremov
 */
@Configuration
public class ThymeleafConfig {

    /**
     * Method provides additional thymeleaf template resolver.
     *
     * @return thymeleaf template resolver.
     */
    @Bean
    public ITemplateResolver additionalTemplateResolver() {
        FileTemplateResolver resolver = new FileTemplateResolver();
        resolver.setSuffix(".html");
        resolver.setPrefix("src/main/resources/templates/");
        resolver.setTemplateMode("HTML5");
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }

}
