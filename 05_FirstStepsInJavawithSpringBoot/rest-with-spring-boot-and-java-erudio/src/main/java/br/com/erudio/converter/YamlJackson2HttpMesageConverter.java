package br.com.erudio.converter;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class YamlJackson2HttpMesageConverter extends AbstractJackson2HttpMessageConverter {

	protected YamlJackson2HttpMesageConverter() {
		super(
				new YAMLMapper()
				.setSerializationInclusion(Include.NON_NULL),
				MediaType.parseMediaType("application/x-yaml"));
	}
}
