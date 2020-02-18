package com.java.springbootes.controller;

import com.java.springbootes.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.java.springbootes.service.CityService;

import java.util.List;

/**
 * @author Boris
 * @date 2020/2/18 14:03
 */
@RestController
public class CityRestController {


    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public Long createCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city/search", method = RequestMethod.GET)
    public List<City> searchCity(@RequestParam(value = "pageNumber") Integer pageNumber,
                                 @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                 @RequestParam(value = "searchContent") String searchContent) {
        return cityService.searchCity(pageNumber,pageSize,searchContent);
    }


    @RequestMapping(value = "/api/city/search/multimatch", method = RequestMethod.GET)
    public List<City> searchCityMultimatch(@RequestParam(value = "pageNumber") Integer pageNumber,
                                 @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                 @RequestParam(value = "searchContent") String searchContent) {
        return cityService.searchCityMultiMatch(pageNumber,pageSize,searchContent);
    }
}
