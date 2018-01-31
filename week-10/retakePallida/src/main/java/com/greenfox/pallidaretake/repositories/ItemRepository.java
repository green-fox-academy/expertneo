package com.greenfox.pallidaretake.repositories;

import com.greenfox.pallidaretake.models.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
  List<Item> getAllByUnitPriceEquals(double unitPrice);
  List<Item> getAllByUnitPriceGreaterThan(double unitPrice);
  List<Item> getAllByUnitPriceLessThan(double unitPrice);
}
