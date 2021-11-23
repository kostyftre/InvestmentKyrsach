package com.airtickets.airtickets.controlers;


import com.airtickets.airtickets.controlers.domain.Tickets;
import com.airtickets.airtickets.repos.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PeopleController {

    @Autowired
    SellerRepo sellerRepo;

    @GetMapping("/people")
    public String people(Map<String, Object> model){
        Iterable<Tickets> tickets = sellerRepo.findAll();
        model.put("Tickets", tickets);
        return "participant";
    }



}
