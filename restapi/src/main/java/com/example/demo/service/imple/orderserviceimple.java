package com.example.demo.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.models.order;
import com.example.demo.repository.ordersrepository;
import com.example.demo.service.orderservice;
@Service
public class orderserviceimple implements orderservice {
@Autowired
ordersrepository repo;
	@Override
	public order addorder(order o) {
		// TODO Auto-generated method stub
		
		return repo.save(o);
	}

	@Override
	public List<order> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

	@Override
	public order getbyid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("user not found"+id));
	}

	

	@Override
	public String deletebyid(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "deleted successfully:" +id;
	}

	@Override
	public order update(order o, int id) {
		// TODO Auto-generated method stub
		order o1=getbyid(id);
		o1.setOrdername(o.getOrdername());
		o1.setOrderadddress(o.getOrderadddress());
		o1.setOrderpincode(o.getOrderpincode());
		o1.setOrderstate(o.getOrderstate());
		o1.setOrdercountry(o.getOrdercountry());
		return repo.save(o1);
	}

}
