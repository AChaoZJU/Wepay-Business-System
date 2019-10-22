package com.wepay.business.resource;

import com.wepay.business.model.Good;
import com.wepay.business.service.GoodHardcodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodResource {
  @Autowired
  private GoodHardcodedService goodHardcodedService;

  @PostMapping("/api/getGood")
  public List<Good> getAllGoods() {
    return goodHardcodedService.findAll();
  }
}
