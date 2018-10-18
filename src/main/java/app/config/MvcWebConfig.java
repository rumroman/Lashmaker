//package app.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.thymeleaf.spring5.SpringTemplateEngine;
//import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring5.view.ThymeleafViewResolver;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan("app.controller")
//public class MvcWebConfig implements WebMvcConfigurer {
//
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    /*
//     * STEP 1 - Create SpringResourceTemplateResolver
//     * */
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/resources/", "classpath:/static/","classpath:/public/");
//    }
//
//
//    @Bean
//    public SpringResourceTemplateResolver templateResolver() {
//
//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setApplicationContext(applicationContext);
//        templateResolver.setPrefix("/WEB-INF/templates/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode("HTML5");
//
//        return templateResolver;
//    }
//
//    /*
//     * STEP 2 - Create SpringTemplateEngine
//     * */
//    @Bean
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        templateEngine.setEnableSpringELCompiler(true);
//        return templateEngine;
//    }
//
//
//    /*
//     * STEP 3 - Register ThymeleafViewResolver
//     * */
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine());
//        registry.viewResolver(resolver);
//
//
//    }
//
//    /**
//     * Web Flow
//     *
//     * @return
//     */
////    @Bean
////    public FlowHandlerAdapter flowHandlerAdapter(FlowExecutor flowExecutor){
////        FlowHandlerAdapter handlerAdapter = new FlowHandlerAdapter();
////        handlerAdapter.setFlowExecutor(flowExecutor);
//////        handlerAdapter.setSaveOutputToFlashScopeOnRedirect(true);
////        System.out.println("new Adapter");
////        return handlerAdapter;
////    }
//
//    /**
//     * Настройка этого маппинга позволит Dispatcher'у сопоставить пути ресурсов приложения к потокам из реестра потоков.
//     * К примеру, доступ по пути /hotels/booking приведет к регистрации запроса для потока с id hotels/booking.
//     *
//     * @return
//     */
////    @Bean
////    public FlowHandlerMapping handlerMapping(FlowDefinitionRegistry flowRegistry){
////        FlowHandlerMapping flowHandlerMapping = new FlowHandlerMapping();
////        flowHandlerMapping.setFlowRegistry(flowRegistry);
////        flowHandlerMapping.setOrder(0);
////        return flowHandlerMapping;
////    }
//
//    @Bean
//    public ThymeleafViewResolver thymeleafViewResolver() {
//        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
////        thymeleafViewResolver.setViewClass();
//        thymeleafViewResolver.setViewNames(new String[]{"*.html","*.xhml"});
//        thymeleafViewResolver.setTemplateEngine(templateEngine());
//        thymeleafViewResolver.setOrder(1);
//        return thymeleafViewResolver;
//    }
//}