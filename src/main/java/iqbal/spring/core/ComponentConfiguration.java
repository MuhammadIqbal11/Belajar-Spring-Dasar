package iqbal.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import iqbal.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "muhammadiqbal.spring.core.repository",
    "muhammadiqbal.spring.core.service",
    "muhammadiqbal.spring.core.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
