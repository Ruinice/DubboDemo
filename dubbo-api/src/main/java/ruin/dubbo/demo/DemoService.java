package ruin.dubbo.demo;

import java.util.List;

public interface DemoService {

    List<String> getPermissions(Long id);

    void sayHello(String name);

}
