package app.config;

//@Configuration
//public class WebFlowConfig extends AbstractFlowConfiguration {

//    @Bean
//    public FlowDefinitionRegistry flowRegistry(){
//        System.out.println("flowRegistry");
//
//        return getFlowDefinitionRegistryBuilder()
//                .setBasePath("/WEB-INF/templates/lists")
//                .addFlowLocationPattern("*-flow.xml")
//                .build();
//    }
//
//    @Bean
//    public FlowExecutor flowExecutor(){
//        System.out.println("flowExecutor");
//        return getFlowExecutorBuilder(flowRegistry()).build();
//    }
//
//    @Bean
//    public FlowBuilderServices flowBuilderServices(MvcViewFactoryCreator mvcViewFactoryCreator) {
//        return getFlowBuilderServicesBuilder()
//                .setViewFactoryCreator(mvcViewFactoryCreator)
//                .setDevelopmentMode(true).build();
//    }
//
//    @Bean
//    public MvcViewFactoryCreator mvcViewFactoryCreator(MvcWebConfig mvcWebConfig) {
//        MvcViewFactoryCreator factoryCreator = new MvcViewFactoryCreator();
//        factoryCreator.setViewResolvers(
//                Collections.singletonList(mvcWebConfig.thymeleafViewResolver()));
//        return factoryCreator;
//    }
//
//
//}
