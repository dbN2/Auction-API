Includes

- Maven - [pom.xml](pom.xml)
- Application properties - [application.yml](src/main/resources/application.yml)
- Runnable Spring Boot Application - [BackendTechAssessmentApplication](src/main/java/com/intuit/cg/backendtechassessment/BackendTechAssessmentApplication.java)
- REST endpoints - [RequestMappings.java](src/main/java/com/intuit/cg/backendtechassessment/controller/requestmappings/RequestMappings.java)










How to create entities

Entities that aren't tied to other entities upon creation time, i.e. buyers and sellers, can be posted like so:  
//New buyer  
```curl -X POST http://localhost:8080/buyers -H 'Content-type:application/json' -d '{"firstName":"jim", "lastName":"jones", "email":"jimjones@gmail.com"}'``` 

Entities that are tied to other entities upon creation time, i.e. bids and projects, require the href link in the request body like so:  
//New bid  
```curl -X POST http://localhost:8080/projects/1/bids -H 'Content-type:application/json' -d '{"amount":"100", "buyer":"http://localhost:8080/buyers/1"}'```  
//New project  
```curl -X POST http://localhost:8080/projects -H 'Content-type:application/json' -d '{"name":"dummyProj","description":"test project", "seller":"http://localhost:8080/sellers/1", "budget":"10000"}'```  

