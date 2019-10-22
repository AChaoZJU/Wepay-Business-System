package com.wepay.business.model;

public class Good {
  private Long id;
  private String goodName;
  private Double unitPrice;
  private String imgURL;
  private String goodInfo;
  private int amount;
  private String goodAddress;
  private int soldAmount;
  private Long sellerId;

  public Good(Long id, String goodName, Double unitPrice, String imgURL, String goodInfo, int amount, String goodAddress, Long sellerId) {
    this.id = id;
    this.goodName = goodName;
    this.unitPrice = unitPrice;
    this.imgURL = imgURL;
    this.goodInfo = goodInfo;
    this.amount = amount;
    this.goodAddress = goodAddress;
    this.sellerId = sellerId;
  }
}
