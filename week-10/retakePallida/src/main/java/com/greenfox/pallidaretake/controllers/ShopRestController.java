package com.greenfox.pallidaretake.controllers;

import com.greenfox.pallidaretake.models.ItemDTO;
import com.greenfox.pallidaretake.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopRestController {

  @Autowired
  ItemService itemService;

  @GetMapping("/warehouse/query")
  public ResponseEntity<?> warehouseQuery(@RequestParam (value = "price", required = false)
          double unitPrice, @RequestParam (value = "type", required = false) String type) {
    if (unitPrice == 0 || type == null) {
      return ResponseEntity.badRequest().body("Example query: " +
              "http://localhost:8080/warehouse/query?price=50&type=lower");
    } else if (type.equals("lower")) {
      ItemDTO newItemDTO = new ItemDTO();
      newItemDTO.setResult("ok");
      newItemDTO.setClothes(itemService.getAllByUnitPriceLessThan(unitPrice));
      return ResponseEntity.ok().body(newItemDTO);
    } else if (type.equals("greater")) {
      ItemDTO newItemDTO = new ItemDTO();
      newItemDTO.setResult("ok");
      newItemDTO.setClothes(itemService.getAllByUnitPriceGreaterThan(unitPrice));
      return ResponseEntity.ok().body(newItemDTO);
    } else {
      ItemDTO newItemDTO = new ItemDTO();
      newItemDTO.setResult("ok");
      newItemDTO.setClothes(itemService.getAllByUnitPriceEquals(unitPrice));
      return ResponseEntity.ok().body(newItemDTO);
    }
  }
}
