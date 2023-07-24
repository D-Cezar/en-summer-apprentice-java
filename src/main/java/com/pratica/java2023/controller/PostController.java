package com.pratica.java2023.controller;

import com.pratica.java2023.entities.Orders;
import com.pratica.java2023.requestBodyObjects.OrderRequestBody;
import com.pratica.java2023.responseObject.PostResponse;
import com.pratica.java2023.service.interfaces.OrdersServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    OrdersServiceInterface ordersServiceInterface;


    @PostMapping(path="/orders")//, consumes = {MediaType.APPLICATION_JSON_VALUE},produces ={MediaType.APPLICATION_JSON_VALUE} )
    public PostResponse createOrder(@RequestBody OrderRequestBody orderRequest){
        Orders curentOrder= ordersServiceInterface.createOrder(orderRequest.ticketCategoryId,orderRequest.numberOfTickets);
        PostResponse response=new PostResponse(orderRequest.eventId,curentOrder.getOrderedAt(),
                orderRequest.ticketCategoryId,orderRequest.numberOfTickets,curentOrder.getTotalPrice());
        return response;
    }
}
