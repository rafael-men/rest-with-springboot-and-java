package br.com.erudio.serializationconverter;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public final class YamlJacksontoHttpMessageConverter extends AbstractJackson2HttpMessageConverter{

	public YamlJacksontoHttpMessageConverter() {
		super(new YAMLMapper(), MediaType.parseMediaType("application/x-yaml"));
	}

}