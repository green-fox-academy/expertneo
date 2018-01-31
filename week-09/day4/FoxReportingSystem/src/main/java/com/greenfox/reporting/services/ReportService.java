package com.greenfox.reporting.services;

import com.greenfox.reporting.models.entities.Report;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {

  List<Report> getAllReports();
  Report getReport(Integer id);
  void createReport(Report report);
  void deleteReport(Integer id);
  void setIsActive(Integer id, boolean input);
  void setCategory(Integer id, String category);
  void setTitle(Integer id, String title);
  void setBody(Integer id, String body);
  void setActionItem(Integer id, String actionItem);
  void setEventDate(Integer id, String eventDate);
  void setDueDate(Integer id, String dueDate);
}
