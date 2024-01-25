package springcloud.configclient.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Setter
@Getter
@ConfigurationProperties("toy.config.info")
@RefreshScope
@ToString
public class MyConfig {

    private String profile;
    private String region;

}
