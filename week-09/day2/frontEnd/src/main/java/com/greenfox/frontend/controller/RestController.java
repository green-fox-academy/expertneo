package com.greenfox.frontend.controller;

import com.greenfox.frontend.models.*;
import com.greenfox.frontend.models.Array.ArrayDouble;
import com.greenfox.frontend.models.Array.ArrayInput;
import com.greenfox.frontend.models.Array.ArrayMultiply;
import com.greenfox.frontend.models.Array.ArraySum;
import com.greenfox.frontend.models.DoUntil.DoUntilFactor;
import com.greenfox.frontend.models.DoUntil.DoUntilGetter;
import com.greenfox.frontend.models.DoUntil.DoUntilSum;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (!(input == null)) {
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
      return new WelcomeMessage(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable(value = "appendable") String appendable) {
    return new Appended(appendable);
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable(value = "what") String whatToDo,
                        @RequestBody (required = false) DoUntilGetter doUntilGetter) {
    if (doUntilGetter == null) {
      return new ErrorMessage("Please provide a number!");
    } else {
      switch (whatToDo) {
        case "sum":
          return new DoUntilSum(doUntilGetter.getUntil());
        case "factor":
          return new DoUntilFactor(doUntilGetter.getUntil());
        default:
          return new ErrorMessage("Please provide a number!");
      }
    }
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody (required = false) ArrayInput arrayInput) {
    Integer[] array = arrayInput.getNumbers();
    String whatToDo = arrayInput.getWhat();
    if (arrayInput == null) {
      return new ErrorMessage("asd");
    } else if (whatToDo.equals("sum")) {
      return new ArraySum(array);
    } else if (whatToDo.equals("multiply")) {
      return new ArrayMultiply(array);
    } else if (whatToDo.equals("double")) {
      return new ArrayDouble(array);
    } else {
      return null;
    }
  }
}
