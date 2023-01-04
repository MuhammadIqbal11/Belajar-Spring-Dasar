package iqbal.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import iqbal.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "afifpermana.spring.core.repository",
    "afifpermana.spring.core.service",
    "afifpermana.spring.core.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
