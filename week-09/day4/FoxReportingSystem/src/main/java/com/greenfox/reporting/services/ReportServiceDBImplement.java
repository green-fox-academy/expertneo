package com.greenfox.reporting.services;

import com.greenfox.reporting.models.entities.Report;
import com.greenfox.reporting.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportServiceDBImplement implements ReportService {

  @Autowired
  ReportRepository reportRepository;

  @Override
  public List<Report> getAllReports() {
    List<Report> reports = new ArrayList<>();
    reportRepository.findAll().forEach(reports::add);
    return reports;
  }

  @Override
  public Report getReport(Integer id) {
    return reportRepository.findOne(id);
  }

  @Override
  public void createReport(Report report) {
    reportRepository.save(report);
  }

  @Override
  public void deleteReport(Integer id) {
    reportRepository.delete(id);
  }

  @Override
  public void setIsActive(Integer id, boolean input) {
    Report report = reportRepository.findOne(id);
    report.setActive(input);
    reportRepository.save(report);
  }


  @Override
  public void setCategory(Integer id, String category) {
    Report report = reportRepository.findOne(id);
    report.setCategory(category);
    reportRepository.save(report);
  }

  @Override
  public void setTitle(Integer id, String title) {
    Report report = reportRepository.findOne(id);
    report.setTitle(title);
    reportRepository.save(report);
  }

  @Override
  public void setBody(Integer id, String body) {
    Report report = reportRepository.findOne(id);
    report.setBody(body);
    reportRepository.save(report);
  }

  @Override
  public void setActionItem(Integer id, String actionItem) {
    Report report = reportRepository.findOne(id);
    report.setActionItem(actionItem);
    reportRepository.save(report);
  }

  @Override
  public void setEventDate(Integer id, String eventDate) {
    Report report = reportRepository.findOne(id);
    report.setEventDate(eventDate);
    reportRepository.save(report);
  }

  @Override
  public void setDueDate(Integer id, String dueDate) {
    Report report = reportRepository.findOne(id);
    report.setDueDate(dueDate);
    reportRepository.save(report);
  }
}
