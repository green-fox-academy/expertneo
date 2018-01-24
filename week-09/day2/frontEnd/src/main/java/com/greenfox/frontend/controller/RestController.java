package com.greenfox.frontend.controller;

import com.greenfox.frontend.models.*;
import com.greenfox.frontend.models.Array.ArrayDouble;
import com.greenfox.frontend.models.Array.ArrayInput;
import com.greenfox.frontend.models.Array.ArrayMultiply;
import com.greenfox.frontend.models.Array.ArraySum;
import com.greenfox.frontend.models.DoUntil.DoUntilFactor;
import com.greenfox.frontend.models.DoUntil.DoUntilGetter;
import com.greenfox.frontend.models.DoUntil.DoUntilSum;
import com.greenfox.frontend.models.LogEntries.Log;
import com.greenfox.frontend.models.LogEntries.LogOutput;
import com.greenfox.frontend.repositories.LogRepository;
import com.greenfox.frontend.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  LogService logService;

  @Autowired
  LogRepository logRepository;

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (!(input == null)) {
      Log logCreated = new Log();
      logCreated.setEndpoint("/doubling");
      logCreated.setDataInput("input:" + input);
      logService.createLog(logCreated);
      return new Doubling(input);
    } else {
      return new ErrorMessage("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greeter (@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorMessage("Please provide a name!");
    } else if (title == null) {
      return new ErrorMessage("Please provide a title!");
    } else {
      Log logCreated = new Log();
      logCreated.setEndpoint("/greeter");
      logCreated.setDataInput("input(Name & Title):" + name + " & " + title);
      logService.createLog(logCreated);
      return new WelcomeMessage(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable(value = "appendable") String appendable) {
    Log logCreated = new Log();
    logCreated.setEndpoint("/appenda/" + appendable);
    logCreated.setDataInput("input: " + appendable);
    logService.createLog(logCreated);
    return new Appended(appendable);
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable(value = "what") String whatToDo,
                        @RequestBody (required = false) DoUntilGetter doUntilGetter) {
    if (doUntilGetter == null) {
      return new ErrorMessage("Please provide a number!");
    } else {
      Log logCreated = new Log();
      switch (whatToDo) {
        case "sum":
          logCreated.setEndpoint("/dountil/sum");
          logCreated.setDataInput("input: " + doUntilGetter.getUntil());
          logService.createLog(logCreated);
          return new DoUntilSum(doUntilGetter.getUntil());
        case "factor":
          logCreated.setEndpoint("/dountil/factor");
          logCreated.setDataInput("input: " + doUntilGetter.getUntil());
          logService.createLog(logCreated);
          return new DoUntilFactor(doUntilGetter.getUntil());
        default:
          return new ErrorMessage("Please provide a number!");
      }
    }
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody (required = false) ArrayInput arrayInput) {
    if (arrayInput.getNumbers() == null || arrayInput.getWhat() == null) {
      return new ErrorMessage("Please provide what to do with the numbers!");
    } else if (arrayInput.getWhat().equals("sum")) {
      Log logCreated = new Log();
      logCreated.setEndpoint("/arrays");
      logCreated.setDataInput("input: sum " + arrayInput.getNumbers());
      logService.createLog(logCreated);
      return new ArraySum(arrayInput.getNumbers());
    } else if (arrayInput.getWhat().equals("multiply")) {
      Log logCreated = new Log();
      logCreated.setEndpoint("/arrays");
      logCreated.setDataInput("input: multiply " + arrayInput.getNumbers());
      logService.createLog(logCreated);
      return new ArrayMultiply(arrayInput.getNumbers());
    } else if (arrayInput.getWhat().equals("double")) {
      Log logCreated = new Log();
      logCreated.setEndpoint("/arrays");
      logCreated.setDataInput("input: double " + String.valueOf(Arrays.asList(arrayInput.getNumbers())));
      logService.createLog(logCreated);
      return new ArrayDouble(arrayInput.getNumbers());
    } else {
      return new ErrorMessage("Please provide what to do with the numbers!");
    }
  }

  @PostMapping("/sith")
  public Object sith(@RequestBody (required = false) SithInput sithInput) {
    if (sithInput.getText() == null) {
      return new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm.");
    } else {
      Log logCreated = new Log();
      logCreated.setEndpoint("/sith");
      logCreated.setDataInput("input:" + sithInput.getText());
      logService.createLog(logCreated);
      return new ReverserOfTheSith(sithInput.getText());
    }
  }

  @GetMapping("/log")
  public Object log() {
    Log logCreated = new Log();
    logCreated.setEndpoint("/log");
    logCreated.setDataInput("input: no input (get)");
    logService.createLog(logCreated);

    LogOutput logOutput = new LogOutput(logService.getAllLogs(), logService.getAllLogs().size());
    return logOutput;
  }
}
