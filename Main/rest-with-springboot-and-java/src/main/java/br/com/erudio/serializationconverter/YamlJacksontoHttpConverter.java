package br.com.erudio.serializationconverter;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class YamlJacksontoHttpConverter extends AbstractJackson2HttpMessageConverter {

	public YamlJacksontoHttpConverter(ObjectMapper objectMapper) {
		super(new YAMLMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL),MediaType.parseMediaType("application/x-yaml"));
	}

	public YamlJacksontoHttpConverter() {
		// TODO Auto-generated constructor stub
	}

}
