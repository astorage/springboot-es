package com.java.springbootes.repository;

import com.java.springbootes.model.*;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Boris
 * @date 2020/2/18 13:46
 */
@Repository
public interface CityRepository extends ElasticsearchRepository<City, Long> {

}
