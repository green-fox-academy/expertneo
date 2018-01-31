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

  public List<String> getAllUniqueItemNames() {
    List<Item> allItems = getAllItems();
    List<String> uniqueItemNames = new ArrayList<>();

    for (int i = 0; i < allItems.size() ; i++) {
      if (!uniqueItemNames.contains(allItems.get(i).getItemName())) {
        uniqueItemNames.add(allItems.get(i).getItemName());
      }
    }
    return uniqueItemNames;
  }

  public List<String> getAllUniqueSizes() {
    List<Item> allItems = getAllItems();
    List<String> uniqueItemSizes = new ArrayList<>();

    for (int i = 0; i < allItems.size() ; i++) {
      if (!uniqueItemSizes.contains(allItems.get(i).getSize())) {
        uniqueItemSizes.add(allItems.get(i).getSize());
      }
    }
    return uniqueItemSizes;
  }
}
