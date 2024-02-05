package OldMaterial.YoutubeMaterial;

/*All Prep



        Micro:

        API gateway:-



        Eureka services discovery-Service registry

        Zule edge servicer- https://netflixtechblog.com/announcing-zuul-edge-service-in-the-cloud-ab3af5be08ee

        Spring cloud gateway

        Eureka server

        Eureka client

        Load balance -> https://www.youtube.com/watch?v=7LMaAVwZE2c

        https://www.youtube.com/watch?v=uNzawf8ip_M





        Netflix+Ribbon -client load balancing - https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-ribbon.html

        https://www.youtube.com/watch?v=yK3Qt8eCrmQ

        https://www.youtube.com/watch?v=lEYC0PT3E2k

        How interceptor works

        consistent hasing



        Fault tolerance library:- Circuit breaker https://www.youtube.com/watch?v=ADHcBxEXvFA





        Hystrix - Works on Circuit breaker design OldMaterial.pattern









        System Design: https://www.youtube.com/watch?v=Dg1U-jwVUrg&list=PLTCrU9sGyburBw9wNOHebv9SjlE4Elv5a&index=4

        1:- Frwd and Revrse proxies

        2:- Caching - https://www.youtube.com/watch?v=Ez1GK2imrsY



        Invalidation and Eviction(FIFO, LRU, LFU)

        Cache aside OldMaterial.pattern

        Cache read through stratergy OldMaterial.pattern

        Cache write through strategy OldMaterial.pattern

        Cache write around strategy OldMaterial.pattern ( Writes directly to DB but read from Cache)

        Cache write back strategy OldMaterial.pattern - Bulk in Cache

        3:- Message queue(Producer and Consumer)

        4:- Pub sub model

        5:- Fault failure

        6: Scalling

        7: Database replication and types of DB



        1:- CAP- https://luminousmen.com/post/cap-and-pacelc-theorems-in-plain-english

        https://www.youtube.com/watch?v=kwCFHLbIhak&list=PLTCrU9sGyburBw9wNOHebv9SjlE4Elv5a&index=20

        https://www.youtube.com/watch?v=8UryASGBiR4







        1: NGINX : Gateway and loan balancer +EUREKA



        2:- Token -> JWT + Redis cache stores +

        3:- Authenticate (WHO)+Authorisation (WHAT)

        4:- OPG-> Pre process+ Post process

        5:- write async api’s-> PUB -SUB model

        6:-



        Java8->

        1:-Concurrent collection - https://www.youtube.com/watch?v=bJT634zMbAM

        2:- https://www.youtube.com/watch?v=J-RTlluJv7E

        Collection Framework   https://www.youtube.com/watch?v=KfoNYoVUBJI



        3:- JAVA8 - https://www.youtube.com/watch?v=oUdENE7ljjw, https://www.youtube.com/playlist?list=PLyHJZXNdCXsdeusn4OM33415DCMQ6sUKy

        4: Delegation principles :-

        5: Path and class path:-

        6: Restriction serialisation child class

7: GC in java

        8:- Lock interface: https://www.youtube.com/watch?v=FgU_wI6fhXA



        9: Race condition and deadlock in java

        10: Reenterant lock

        11: Autoboxing

        12: Abstraction and Ecapsulation

        13: List iterator vs Iterator

        14: Fail fast vs fail safe’

        15: Maker checker

        16: Singleton and prototype problem

        17: @qualifier

18 : How to mock final classes

        19: Store Proccedure vs Function procedure

        20: Truncate vs Delete

        21: Spring bean thread safe-  . Singleton spring beans has no relation with thread safety. spring container only manages life-cycle of objects and guaranteed that only one object in spring container. so If an Non thread safe object is injected then obviously it is not thread safe. To make it thread safe you have to handle it by coding.

        If it is a web-application , Scope("request") can achieve thread-safety  as for each new request it creates a new object or scope("prototype") will do this.(for each  invocation it creates new bean .)





        22: can override private method

        23: Bean scope: https://www.youtube.com/watch?v=Zx9iYwQqaPg



        24: REST Maturity: https://www.youtube.com/watch?v=IL1lPStSTCw



        25:- Deadlock program





        Threading:-

        1:- Executer framework

        2:- Blocking queue -> Thread safe (Always check while retrieve,  removing and adding )

        3:- Callable, Runnable

        4:- Multithreading

        5:- Cyclic barrier and countdown latch

        6:- producer and consumer problem with blocking queue



        Microservices:

        1:- Microservices intercommunication -> https://www.youtube.com/watch?v=uprdxlQ1U5g


        2:- Eureka service discovery-> client and service- https://www.youtube.com/watch?v=z90Dcid2py4

        3:- Transactional:-

        4:- AOP- https://www.youtube.com/watch?v=5qXknPo3ZPk, https://www.youtube.com/watch?v=Og9Fyew8ltQ



        5:- Association composition aggregation - https://www.youtube.com/watch?v=wbvW3w47QRw

        6:- Filter chain-> DelegatingFilterProxy-> FilterChainProxy- https://www.youtube.com/watch?v=b-MbhgPmHjE

        7:- Get vs load - https://www.youtube.com/watch?v=W6vPLnoraqM

        8:- Transient

        9:- Lazy loading - https://www.youtube.com/watch?v=5SgvEbb6DKs

        10:-Immutable in java - Deep cloning https://www.youtube.com/watch?v=sKV1yfERBgA

        11:-Put vs POT- https://www.youtube.com/watch?v=rhTkRK53XdQ

        12:- Cluster vs Non cluster index:- https://www.youtube.com/watch?v=YuRO9-rOgv4, https://www.youtube.com/watch?v=54gUz7QqE4o

        13:- OldMaterial.Exception handling in microservices- https://www.youtube.com/watch?v=hLlGAQ5NfTE

        14:- API gateway spring security- https://www.youtube.com/watch?v=vHQqQBYJtLI

        15:- Session Mgmt- https://www.youtube.com/watch?v=7e5R7FetJnc , https://www.youtube.com/watch?v=soGRyl9ztjI.

        16:- ELK:- https://www.youtube.com/watch?v=5s9pR9UUtAU

        17:- Sql vs No sql

        18: SOLID :- https://www.youtube.com/watch?v=oRA-xnqlB10

        19:- Rehasing

        20: Completable future: https://www.youtube.com/watch?v=ImtZgX1nmr8

        21: Blocking queue  with producer consumer: https://www.youtube.com/watch?v=UOr9kMCCa5g

        22: fork join framework java https://www.youtube.com/watch?v=5wgZYyvIVJk

        23: Reflaxion:- https://www.youtube.com/watch?v=sUED3FDmQNk

        24 Bulk head OldMaterial.pattern: https://www.youtube.com/watch?v=R2FT5edyKOg

        25: Event driven arch: https://www.youtube.com/watch?v=uJ4JFMMbSO8

        26: Generics:

        27 : Disadvatage of index in SQL

        28: Saga OldMaterial.pattern :https://www.youtube.com/watch?v=WnZ7IcaN_JA

        29: NF forms:- https://www.youtube.com/watch?v=EGEwkad_llA

        30: context switching:















        Hibernate:-

        1:- N+1 problem in hibernate - https://www.javacodemonk.com/n-1-problem-in-hibernate-spring-data-jpa-894097b9

        2:- hibernate object states: https://www.youtube.com/watch?v=ZLeTFBvegfY





        DB:

        1: Nth highest salary:- https://www.youtube.com/watch?v=swnRhH5kito

        https://www.youtube.com/watch?v=zvuWEysWoLE

        2: https://www.youtube.com/watch?v=b3drcKdA2zg









        Difference between Strategy and Decorator design patterns



        Write syntax to fill hashmap with only Java 8



        Syntax to create FixedThreadPool of particular thread pool size



        Which design OldMaterial.pattern is used in dispatcher servlet



        Spring vs Springboot. https://www.youtube.com/watch?v=bNFoN956P2A

        https://www.youtube.com/watch?v=zp2tqnpZiAU

        Spring cloud  https://www.youtube.com/watch?v=hgp6dlJJaCI





        Conditional beans in spring



        Design Patterns of Microservices

        Aggregator
        API Gateway
        Chained or Chain of Responsibility
        Asynchronous Messaging
        Database or Shared Data
        Event Sourcing
        Branch
        Command Query Responsibility Segregator
        Circuit Breaker
        Decomposition
        1. find majority element in OldMaterial.array.

        2. String permutation

        3. If aaahhcccddaah is given, then print - a5c3d2h3



        Cvent



        There was one algorithmic question on saving and retrieving a binary OldMaterial.tree
        There were questions on singleton , builder design OldMaterial.pattern, collections framework in java
        Collections question map set list etc
        Find the distance between the furthest identical digrams inside String S
        Two Sum problem

        Rotate an OldMaterial.array of size n by d elements

        Find the frequency of each character in a String S and print the final result based on ascending order of characters
        Design an API to play a multiplayer game and post leaderboard consists of top 100 players with our player rank
        How to maximize revenue in movie ticket bookings i.e Seat freezing logic to allocate seats to genuine users.
        Implement Dependency Injection (@Autowired) in java
        An optimized program to print first 1 billion prime nos

        Validate parenthesis?

        How HashMap works internally?
        Search in sorted but rotated OldMaterial.array?

        Design Facebook messenger chat define Api and Database table.
        what are queues, How to provide security, and how authorization works in Microservice.
        How will you OldMaterial.test if multiple files with millions of words are the same or not.
        Queues in Microservice?
        How will you design a Database system which 100% Consistent for some client, 95% available for some clients and can have a trigger when an update occurs on the database?I suggested AWS dynamo with lambda as it is highly consistent and available and you can use the lambda trigger as well.
*/