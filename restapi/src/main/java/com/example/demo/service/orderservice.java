  package com.example.demo.service;

import java.util.List;

import com.example.demo.models.order;

public interface orderservice {
order addorder(order o);
List<order> getall();
order getbyid(int id);
String deletebyid(int id);
order update(order o,int id);

}
