* DI (Dependency Injection) 의존성 주입/ 종속성 주입

인턴 처음 들어왔을 때 차장님이 DI가 뭐냐고 물으셨는데 대답 못했었다ㅎ..

의존 : A 클래스에서 B 클래스에 있는 기능을 사용하는 것
(B 클래스 = 의존하는 객체)

의존하는 객체를 직접 생성(new)하지 않고, 스프링 컨테이너에서 의존하는 객체를 전달(주입) 받는 것.
쉽게 생각하면 객체 생성할 때 new 안쓰는 거

스프링 컨테이너 : 객체의 라이프사이클(생성부터 소멸까지)을 관리하는 역할
(= IoC컨테이너, BeanFactory)

스프링 컨테이너가 관리하는 객체 : 빈(Bean)
Bean을 관리한다고 해서 BeanFactory라고도 함.
BeanFactory에 기능들을 추가한 것 중 애플리케이션컨텍스트(applicationContext)가 있다.


* ORM (Object-Relational Mapper)
= 객체-관계 매퍼 (객체와 RDBMS의 데이터를 자동으로 매핑해주는 것)


객체(객체지향)와 RDBMS의 데이터(관계지향)를 매핑한다
RDB의 관계를 객체에 반영
객체를 통해서 간접적으로 DB데이터를 다룬다.
객체와 DB데이터를 자동으로 매핑해줌.
-> 어떻게? ORM이 객체와 관계 사이에서 SQL을 자동으로 생성해줌.
메소드로 DB데이터 조작 = 객체지향
-> OOP의 언어를 그대로 쓰면서 객체와 RDBMS의 데이터를 매핑
(OOP를 OOP답게)
ex) JPA, Hibernate

*Filter, Interceptor, AOP 설명
  https://velog.io/@miot2j/Spring-Filter-Interceptor-AOP-%EC%B0%A8%EC%9D%B4-%EB%B0%8F-AOP%EB%A5%BC-%EC%82%AC%EC%9A%A9%ED%95%98%EC%97%AC-Logging%EC%9D%84-%EA%B5%AC%ED%98%84%ED%95%9C-%EC%9D%B4%EC%9C%A0
  https://baek-kim-dev.site/61

*취업 관련
  https://velog.io/@whdgnszz1/%EC%83%9D%EA%B0%81-%EC%A0%80%EC%9E%A5%EC%86%8C-%EB%B9%84%EC%A0%84%EA%B3%B5%EC%9E%90-%EC%8B%A0%EC%9E%85-%EA%B0%9C%EB%B0%9C%EC%9E%90%EA%B0%80-%EC%A0%84%EA%B3%B5%EC%9E%90%EC%99%80-%EA%B2%BD%EC%9F%81%ED%95%98%EB%8A%94%EB%B2%95
