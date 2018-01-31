package com.greenfox.pallidaretake.services;

import com.greenfox.pallidaretake.models.Item;
import com.greenfox.pallidaretake.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

  @Autowired
  ItemRepository itemRepository;

  public List<Item> getAllItems() {
    List<Item> items = new ArrayList<>();
    itemRepository.findAll().forEach(items :: add);
    return items;
  }

  public List<Item> getAllByUnitPriceEquals(double unitPrice) {
    return itemRepository.getAllByUnitPriceEquals(unitPrice);
  }

  public List<Item> getAllByUnitPriceGreaterThan(double unitPrice) {
    return itemRepository.getAllByUnitPriceGreaterThan(unitPrice);
  }

  public List<Item> getAllByUnitPriceLessThan(double unitPrice) {
    return itemRepository.getAllByUnitPriceLessThan(unitPrice);
  }
}
