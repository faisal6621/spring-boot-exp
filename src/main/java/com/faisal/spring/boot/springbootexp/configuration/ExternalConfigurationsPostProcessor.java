package com.faisal.spring.boot.springbootexp.configuration;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.env.PropertiesPropertySourceLoader;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.FileSystemResource;

public class ExternalConfigurationsPostProcessor implements EnvironmentPostProcessor {
    private final PropertiesPropertySourceLoader loader = new PropertiesPropertySourceLoader();

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        var externalConfigFile = new File(System.getProperty("user.home"), ".spring-boot/config");
        if (externalConfigFile.exists()) {
            var propertySources = environment.getPropertySources();
            var listPropertySources = loadPropertySource(externalConfigFile);
            if (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) {
                listPropertySources.forEach(propertySource -> propertySources
                        .addAfter(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME, propertySource));
            } else {
                listPropertySources.forEach(propertySouce -> propertySources.addFirst(propertySouce));
            }
        }
    }

    private List<PropertySource<?>> loadPropertySource(File externalConfigFile) {
        var fileSystemResource = new FileSystemResource(externalConfigFile);
        try {
            return loader.load("external-config", fileSystemResource);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Collections.emptyList();
    }

}
