package com.pratica.java2023.service;

import com.pratica.java2023.entities.Customer;
import com.pratica.java2023.entities.Orders;
import com.pratica.java2023.entities.TicketCategory;
import com.pratica.java2023.repository.OrdersRepository;
import com.pratica.java2023.repository.TicketCategoryRepository;
import com.pratica.java2023.responseObject.SecondGetDTO;
import com.pratica.java2023.service.interfaces.CustomerServiceInterface;
import com.pratica.java2023.service.interfaces.OrdersServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class OrdersService implements OrdersServiceInterface {
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;
    @Autowired
    private CustomerServiceInterface customerServiceInterface;

    private final long customerId=1;

    @Override
    public void saveOrder(Orders order){
        ordersRepository.save(order);
    }

    @Override
    public void deleteOrder(Orders order){
        ordersRepository.delete(order);
    }

    @Override
    public void deleteOrderById(long id){
        ordersRepository.deleteById(id);
    }

    @Override
    public Optional<Orders> findOrder(long id){
        return ordersRepository.findById(id);
    }

    @Override
    public List<Orders> findAllOrders() {
        return (List<Orders>) ordersRepository.findAll();
    }

    @Override
    public List<Orders> findAllOrdersByCustomer_Id(long id) {
        return ordersRepository.findAllOrdersByCustomer_Id(id);
    }

    @Override
    public long findTicketCategoryIdById(long id){
        return  ordersRepository.findOrdersByTicketCategoryId(id);
    }

    @Override
    public List<SecondGetDTO> OrderInfo(long id) {
        List<SecondGetDTO> response=new ArrayList<>();
        List<Orders> ordersDB=ordersRepository.findAllOrdersByCustomer_Id(id);
        SecondGetDTO secondGetDTO=new SecondGetDTO();

        for(Orders order :ordersDB){
            secondGetDTO=new SecondGetDTO();
            secondGetDTO.setDate(order.getOrderedAt());
            secondGetDTO.setTotalPrice(order.getTotalPrice());
            //ticketCategoryId=ordersRepository.findOrdersByTicketCategoryId(order.getId());
            secondGetDTO.setTicketCategoryId(order.getTicketCategory().getId());
            secondGetDTO.setNumberOfTickets(order.getNumberOfTickets());
            secondGetDTO.setEventId(order.getTicketCategory().getEvent().getId());
            response.add(secondGetDTO);
        }
        return response;
    }

    @Override
    public Orders createOrder(long ticketCategoryId, int numberOfTickets) {
       Optional<Customer> customer= customerServiceInterface.findCustomer(customerId);
       Optional<TicketCategory> ticketCategory=ticketCategoryRepository.findById(ticketCategoryId);
       double totalPrice=numberOfTickets*ticketCategory.get().getPrice();
    Orders createdOrder =new Orders(customer.get(),ticketCategory.get(),
            Calendar.getInstance().getTime(),numberOfTickets,totalPrice);
    ordersRepository.save(createdOrder);
    return createdOrder;
    }
}
