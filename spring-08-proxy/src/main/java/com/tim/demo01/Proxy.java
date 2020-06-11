package com.tim.demo01;

public class Proxy {
    private Host host;
    public Proxy(){}
    public Proxy(Host host){
        this.host = host;
    }
    public void rent(){
        seeHouse();
        host.rent();
        fee();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void fee(){
        System.out.println("收中介费");
    }
}
