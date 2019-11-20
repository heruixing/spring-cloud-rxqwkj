package com.rxqwkj.main.provider.config;





import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/11/3.
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    public static final String SWAGGER_SCAN_BASE_PACKAGE = "com.rxqwkj.main.provider.controller";
    public static final String VERSION = "1.0.0";


    @Bean
    public Docket createRestApi() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name("Authorization").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(tokenPar.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars)
                .apiInfo(apiInfo());
    }




    private ApiInfo apiInfo() {
               return new ApiInfoBuilder()
                         .title("瑞星黔威接口调用测试构建RESTful APIs")
                         .description("瑞星黔威接口调用测试")
                         .termsOfServiceUrl("http://www.rxqwkj.com/")
                         .contact("何瑞星777")
                         .version(VERSION)
                         .build();
    }
}