package com.codecademy.goldmedal.repositories;

import java.util.Optional;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.codecademy.goldmedal.model.Country;


public interface CountryRepository extends CrudRepository<Country, Integer> {
    Optional<Country>  findByName(String name);
    List<Country> getAllByOrderByNameAsc();
    List<Country> getAllByOrderByNameDesc();
    List<Country> getAllByOrderByGdpAsc();
    List<Country> getAllByOrderByGdpDesc();
    List<Country> getAllByOrderByPopulationAsc();
    List<Country> getAllByOrderByPopulationDesc();
/*
    List<Country> findAllByAndOrderByNameAsc(); // List all countries by name asc
    List<Country> findAllByAndOrderByNameDesc(); // List all countries by name desc
    List<Country> findAllByAndOrderByGdpAsc(); // List all countries by gdp asc
    List<Country> findAllByAndOrderByGdpDesc(); // List all countries by gdp desc
    List<Country> findAllByAndOrderByPopulationAsc(); // List all countries by pop asc
    List<Country> findAllByAndOrderByPopulationDesc(); // List all countries by pop desc
    List<Country> findAllByAndOrderByMedalsAsc(); // List all countries by medals asc
    List<Country> findAllByAndOrderByMedalsDesc(); // List all countries by medals desc
*/



}
