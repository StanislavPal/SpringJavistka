package stas.paliutin.beans.list;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanWithInterface {

    private final List<MyInterface> myInterfaces;

    private final Map<String, MyInterface> myInterfaceMap;

    private final MyInterface myInterface;

    public BeanWithInterface(List<MyInterface> myInterfaces, Map<String, MyInterface> myInterfaceMap,
                             @Qualifier("firstImpl") MyInterface myInterface) {
        this.myInterfaces = myInterfaces;
        this.myInterfaceMap = myInterfaceMap;
        this.myInterface = myInterface;
    }

    public List<MyInterface> getMyInterfaces() {
        return myInterfaces;
    }

    public Map<String, MyInterface> getMyInterfaceMap() {
        return myInterfaceMap;
    }

    public MyInterface getMyInterface() {
        return myInterface;
    }
}
