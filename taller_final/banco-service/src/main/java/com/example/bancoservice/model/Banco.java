package com.example.bancoservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("bancos")
public class Banco {
  @Id
  private Long id;
  private String name;
  private String description;
  private String country;

  public Banco() {
  }

  public Banco(Long id, String name, String description, String country) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.country = country;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
