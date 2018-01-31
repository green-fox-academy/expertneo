package com.greenfox.reporting.models.DTOs;

import com.greenfox.reporting.models.entities.FoxUser;

import java.util.ArrayList;
import java.util.List;

public class FoxUserDTO {
  List<FoxUser> foxUsers = new ArrayList<>();

  public FoxUserDTO() {
  }

  public FoxUserDTO(List<FoxUser> foxUsers) {
    this.foxUsers = foxUsers;
  }

  public List<FoxUser> getFoxUsers() {
    return foxUsers;
  }

  public void setFoxUsers(List<FoxUser> foxUsers) {
    this.foxUsers = foxUsers;
  }
}
