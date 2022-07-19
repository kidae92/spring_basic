package spring.basic.singleton;

import org.junit.jupiter.api.Test;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); // static 선언을 하면 클래스레벨에 올라가서 하나만 존재함

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출출");
    }
}