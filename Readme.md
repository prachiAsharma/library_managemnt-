# Weeek-17

## @Component
 - Spring application, we initialize the Spring Bean
 - The lifecycle of the Spring bean is managed by the Spring IOC container
 - The Spring bean can be created with the following three approaches
   - XML
     <bean>
   - Annotations
     - Component - Generic
     Stereotype annotations
       - Service - Business layer
       - Controller - Controller layer
       - RestController - Controller layer
       - Repository - Data access layer
       - Configuration - Providing configuration
   - Java configuration
      - @Bean
      
## HTTP Response
 Different types of status codes
 - 200 series - Success
 -  200 - OK
 -  201 - Created - Used when making a POST request
 -  204 - No Content - When making a delete request the server indicates that the server will not send any body in the response 
  300 series - Redirect
  - 301,
  - 302 - Permanently moved
  
  400 series - Client side errors
  - 400 - Bad request
  - 401 - Incorrect Credentials/ Authentication
  - 403 - Access denied/Authorization
  - 404 - Not found
  - 415 - Unsupported media type
  
  500 series - server side error
  - 500 - Internal server error
  - 503 - Tempororily down
  - 502 - Gateway timeout
 
