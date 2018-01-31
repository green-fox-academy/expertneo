package com.greenfox.reporting.models.DTOs;

import com.greenfox.reporting.models.entities.Report;

import java.util.ArrayList;
import java.util.List;

public class ReportDTO {
  List<Report> reports = new ArrayList<>();

  public ReportDTO() {
  }

  public ReportDTO(List<Report> reports) {
    this.reports = reports;
  }

  public List<Report> getReports() {
    return reports;
  }

  public void setReports(List<Report> reports) {
    this.reports = reports;
  }
}
