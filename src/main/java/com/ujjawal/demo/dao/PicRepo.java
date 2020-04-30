package com.ujjawal.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.ujjawal.demo.model.pic;

public interface PicRepo extends JpaRepository<pic, Integer>  //class name & type of p.key
{

}
