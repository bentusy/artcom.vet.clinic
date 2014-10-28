package com.art.develop.java.clinic.model.objects.money;

import com.art.develop.java.clinic.model.interfaces.Describe;
import com.art.develop.java.clinic.model.interfaces.administration.Department;
import com.art.develop.java.clinic.model.interfaces.money.Manufacturer;
import com.art.develop.java.clinic.model.interfaces.money.Price;

import java.util.Calendar;

/**
 * Created by Artem on 1988,20,10.
 */
public class Commodity {
    private Code code;
    private Price priceSale;
    private Price pricePurchase;
    private Manufacturer manufacturer;
    private Calendar dateProduction;
    private Calendar dateExpiry;
    private CommodityGroup commodityGroup;
    private Describe describe;
    private int totalAmount;
    private Department department;



}
