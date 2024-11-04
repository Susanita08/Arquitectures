#Conventional Architecture

- First, an example of a conventional architecture for a web application. 
  * The example represents a simple Tennis game, with a persistence model; this contains only information Tenis Set and Tenis Match without business logic. 
  * Domain Model is the core of the application, and it is the most important part of the architecture, this model shouldn't now about specific information of databases
  * but if it knows how it works, this logic. 
  * The Services layer is responsible for the business logic, and it is the only layer that can access the Domain Model.
- Second, a brief explanation of the architecture.