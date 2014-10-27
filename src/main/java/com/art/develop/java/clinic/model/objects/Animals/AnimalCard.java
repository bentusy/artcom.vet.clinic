package com.art.develop.java.clinic.model.objects.Animals;

import com.art.develop.java.clinic.model.interfaces.Journal.Event;
import com.art.develop.java.clinic.model.interfaces.animal.Animalcard;
import com.art.develop.java.clinic.model.interfaces.animal.Breed;
import com.art.develop.java.clinic.model.interfaces.animal.Colour;
import com.art.develop.java.clinic.model.interfaces.animal.Species;
import com.art.develop.java.clinic.model.interfaces.human.Owners;

import java.util.ArrayList;

/**
 * Created by Artem on 1988,20,10.
 */
public class AnimalCard implements Animalcard {
    Integer age;
    boolean sex;
    private Owners owners;
    private String name;
    private Species species;
    private String specificDescribe;
    ArrayList<Event> events;



}
