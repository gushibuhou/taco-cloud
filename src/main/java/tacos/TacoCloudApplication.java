package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication的主要作用:
 * 1.声明该类为配置类
 * 2.自动配置
 * 3.组件扫描
 */
@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        //SpringApplication的run方法执行应用的引导过程
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}
