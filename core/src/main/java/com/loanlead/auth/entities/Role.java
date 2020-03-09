package com.loanlead.auth.entities;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Id
  private String name;

  @Column(name = "display_name")
  private String displayName;

  public Role() {

  }

  public Role(String name, String displayName) {
    this.name = name;
    this.displayName = displayName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @Override
  public String getAuthority() {
    return name;
  }
}
