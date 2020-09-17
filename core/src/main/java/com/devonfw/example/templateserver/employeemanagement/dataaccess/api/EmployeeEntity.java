package com.devonfw.example.templateserver.employeemanagement.dataaccess.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.devonfw.example.templateserver.employeemanagement.common.api.Employee;
import com.devonfw.example.templateserver.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author jgunther
 */
@Entity
@javax.persistence.Table(name = "EMPLOYEE")
public class EmployeeEntity extends ApplicationPersistenceEntity implements Employee {

  @Column(name = "EMPLOYEEID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long employeeId;

  @Column(name = "NAME")
  private String name;

  @Column(name = "SURNAME")
  private String surname;

  @Column(name = "EMAIL")
  private String email;

  private static final long serialVersionUID = 1L;

  /**
   * @return employeeId
   */
  @Override
  public Long getEmployeeId() {

    return this.employeeId;
  }

  /**
   * @param employeeId new value of {@link #getemployeeId}.
   */
  @Override
  public void setEmployeeId(Long employeeId) {

    this.employeeId = employeeId;
  }

  /**
   * @return name
   */
  @Override
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return surname
   */
  @Override
  public String getSurname() {

    return this.surname;
  }

  /**
   * @param surname new value of {@link #getsurname}.
   */
  @Override
  public void setSurname(String surname) {

    this.surname = surname;
  }

  /**
   * @return email
   */
  @Override
  public String getEmail() {

    return this.email;
  }

  /**
   * @param email new value of {@link #getemail}.
   */
  @Override
  public void setEmail(String email) {

    this.email = email;
  }

}
