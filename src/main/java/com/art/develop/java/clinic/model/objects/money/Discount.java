package com.art.develop.java.clinic.model.objects.money;

import com.art.develop.java.clinic.model.interfaces.Describe;
import com.art.develop.java.clinic.model.interfaces.Journal.Manipulation;
import com.art.develop.java.clinic.model.interfaces.human.Employee;
import com.art.develop.java.clinic.model.objects.Percent;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Artem on 1988,20,10.
 */
public class Discount {
    private String name;
    private Calendar dateCreate;
    private Describe describe;
    private Percent percent;
    private ArrayList<Commodity> commodityList;
    private ArrayList<Manipulation> manipulationList;
    private Employee employee;

}
