package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringValueResolver;

@Configuration(proxyBeanMethods = false)
public class MyConfig implements ImportAware, EmbeddedValueResolverAware {

	private static final Logger log = LoggerFactory.getLogger(MyConfig.class);

	private StringValueResolver resolver;

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		log.info("Setting resolver " + resolver);
		this.resolver = resolver;
	}

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		log.info("Setting import metadata " + this.resolver);
	}

}
