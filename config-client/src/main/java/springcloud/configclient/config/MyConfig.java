package springcloud.configclient.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@ToString
@RefreshScope
@ConfigurationProperties("toy.config.info")
@Configuration
public class MyConfig {

    private String profile;
    private String region;

}
