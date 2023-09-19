package com.mdemel.ksrestapi.manesrestapi_kotlinspringboot.controllers

import com.mdemel.ksrestapi.manesrestapi_kotlinspringboot.models.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.ConcurrentHashMap

@RestController
class ExampleCustomerController {

    @Autowired
    lateinit var customers : ConcurrentHashMap<Int, Customer>

    @RequestMapping(value = arrayOf("/customer/{id}"), method = arrayOf(RequestMethod.GET))
    fun getCustomer(@PathVariable id : Int) = customers[id]
}