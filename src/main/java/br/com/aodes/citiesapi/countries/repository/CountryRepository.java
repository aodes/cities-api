package br.com.aodes.citiesapi.countries.repository;

import br.com.aodes.citiesapi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
