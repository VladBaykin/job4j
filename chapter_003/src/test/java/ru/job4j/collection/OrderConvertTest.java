package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class OrderConvertTest {

    @Test
    public void process() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertEquals(new Order("3sfe", "Dress"), map.get("3sfe"));
    }

    @Test
    public void whenNoDuplicates() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("3sfe", "Name"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertEquals(new Order("3sfe", "Name"), map.get("3sfe"));
    }
}