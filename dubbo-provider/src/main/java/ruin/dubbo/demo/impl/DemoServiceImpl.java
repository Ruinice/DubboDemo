package ruin.dubbo.demo.impl;

import ruin.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {

    @Override
    public List<String> getPermissions(Long id) {

        List<String> list = new ArrayList<String>();

        list.add(String.format("Permission_%d", id - 1));
        list.add(String.format("Permission_%d", id));
        list.add(String.format("Permission_%d", id + 1));

        return list;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " +name);
    }
}
