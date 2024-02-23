package com.codecademy.goldmedal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.codecademy.goldmedal.model.GoldMedal;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {

    List<GoldMedal> findByCountryOrderByYearAsc(String country); //Method that sorts country by year in ascending order based on boolean ascOrder == true
    List<GoldMedal> findByCountryOrderByYearDesc(String country); //Method that sorts country by year in desc order based on boolean ascOrder == false
    List<GoldMedal> findByCountryOrderBySeasonAsc(String country); //Method that sorts country by season in ascending based on boolean ascOrder == true
    List<GoldMedal> findByCountryOrderBySeasonDesc(String country); //Method that sorts country by season in desc order based on boolean ascOrder == false
    List<GoldMedal> findByCountryOrderByCityAsc(String country); //Method that sorts country by city in asc order based on boolean ascOrder == true
    List<GoldMedal> findByCountryOrderByCityDesc(String country); //Method that sorts country by city in desc order based on boolean ascOrder == false
    List<GoldMedal> findByCountryOrderByNameAsc(String country); //Method that sorts country by name in asc order based on boolean ascOrder == true
    List<GoldMedal> findByCountryOrderByNameDesc(String country); //Method that sorts country by name in desc order based on boolean ascOrder == false
    List<GoldMedal> findByCountryOrderByEventAsc(String country); //Method that sorts country by event in asc order based on boolean ascOrder == true
    List<GoldMedal> findByCountryOrderByEventDesc(String country); //Method that sorts country by event in desc order based on boolean ascOrder == false

    List<GoldMedal> findByCountryAndSeasonOrderByYearAsc(String country, String season); //Method that returns list of gold medals that a country with season as a String filter


    int countByCountry(String country); //Method that returns the amount of gold medals a country has

    int countBySeason(String season); //Method that return int of events for a given season

    int countByGender(String gender);









}
