package iqbal.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import iqbal.spring.core.configuration.BarConfiguration;
import iqbal.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
