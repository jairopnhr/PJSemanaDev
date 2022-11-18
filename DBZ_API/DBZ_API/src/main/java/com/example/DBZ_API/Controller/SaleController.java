package com.example.DBZ_API.Controller;

import com.example.DBZ_API.Model.Sale;
import com.example.DBZ_API.Service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
@Autowired
private SalesService service;
 @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value = "minDate",defaultValue = "") String mimDate ,
            @RequestParam(value = "maxDate",defaultValue = "") String maxDate,
            Pageable pageable)
{
    return service.findAllSales(mimDate,maxDate,pageable);
}

}
