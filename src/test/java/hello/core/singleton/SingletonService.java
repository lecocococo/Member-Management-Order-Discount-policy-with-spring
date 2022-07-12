package hello.core.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonService {
    
    //1. static 영역에 객체를 닥 1개만 생성해둔다
    private static final SingletonService instance = new SingletonService();
    
    //2. public으로 열러서 객체인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록한다
    public static SingletonService getInstance(){
        return instance;
    }
    
    //3. 생성자를 private로 선언해 new를 이용한 객체 생성 막는다.
    private SingletonService(){
        
    }
    
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }



}
