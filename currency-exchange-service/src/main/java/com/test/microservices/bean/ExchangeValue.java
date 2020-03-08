package com.test.microservices.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	
	@Column(name = "currency_from")
	private String from;
	
	@Column(name = "currency_to")
	private String to;
	
	private BigDecimal conversionMultiple;
	
	private Integer port;

	public ExchangeValue() {
		super();
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}

	public ExchangeValue setId(Long id) {
		this.id = id;
		return this;
	}

	public String getFrom() {
		return from;
	}

	public ExchangeValue setFrom(String from) {
		this.from = from;
		return this;
	}

	public String getTo() {
		return to;
	}

	public ExchangeValue setTo(String to) {
		this.to = to;
		return this;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public ExchangeValue setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
		return this;
	}

	public Integer getPort() {
		return port;
	}

	public ExchangeValue setPort(Integer port) {
		this.port = port;
		return this;
	}

}
