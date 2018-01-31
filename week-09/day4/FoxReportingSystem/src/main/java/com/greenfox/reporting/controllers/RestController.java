package com.greenfox.reporting.controllers;

import com.greenfox.reporting.models.DTOs.FoxUserDTO;
import com.greenfox.reporting.models.DTOs.ReportDTO;
import com.greenfox.reporting.models.DTOs.ResultMessage;
import com.greenfox.reporting.models.entities.FollowUp;
import com.greenfox.reporting.models.entities.FoxUser;
import com.greenfox.reporting.models.entities.Report;
import com.greenfox.reporting.repositories.ReportRepository;
import com.greenfox.reporting.services.FollowUpService;
import com.greenfox.reporting.services.FoxUserService;
import com.greenfox.reporting.services.FoxUserServiceDBImplement;
import com.greenfox.reporting.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  FoxUserService foxUserService;

  @Autowired
  ReportService reportService;

  @Autowired
  FollowUpService followUpService;

  @GetMapping("/reports")
  public Object getReports() {
    ReportDTO reportDTO = new ReportDTO(reportService.getAllReports());
    return reportDTO;
  }

  @PostMapping("/report/{username}")
  public Object createReports(@RequestBody (required = false) Report report,
                              @PathVariable(required = false) String
                                      username) {
    if (report == null) {
      return new ResultMessage("Error occurred! Please add category, title, body, actionItem, " +
              "eventDate, dueDate");
    } else {
      Report newReport = new Report();
      newReport.setCategory(report.getCategory());
      newReport.setTitle(report.getTitle());
      newReport.setBody(report.getBody());
      newReport.setActionItem(report.getActionItem());
      newReport.setDueDate(report.getDueDate());
      newReport.setEventDate(report.getEventDate());
      newReport.setFoxuser(foxUserService.findByName(username));
      reportService.createReport(newReport);
      return new ResultMessage("success: Report created");
    }
  }

  @GetMapping("/users")
  public Object getUsers() {
    FoxUserDTO foxUserDTO = new FoxUserDTO(foxUserService.getAllFoxUsers());
    return foxUserDTO;
  }

  @PostMapping("/user")
  public Object createUser(@RequestBody (required = false) FoxUser foxUser) {
    if (foxUser == null) {
      return new ResultMessage("Error occurred! Please add name + email + age");
    } else {
      FoxUser newFoxUser = new FoxUser();
      newFoxUser.setName(foxUser.getName());
      newFoxUser.setAge(foxUser.getAge());
      newFoxUser.setEmail(foxUser.getEmail());
      foxUserService.createFoxUser(newFoxUser);
      return new ResultMessage("success: User created");
    }
  }
}
