(1) Make sure settings.properties has proper user info/port for connecting to MySQL

(2) Start MySQL before running Spring Boot
    
(3) MySQL setup:

    (a) username/pw only created when doing a new install
    (b) can only create new users once (a) is done; then run MySQL Workbench
    
TODO: Need to figure out how to catch initialization exceptions
    
       - Bean initialization failures
       - Errors connecting to DB
       
CONSIDER: For persistence, having App get it's DB connection information from a service

TODO: Add Pre/Post/other annotations to injest behaviour pre/post initialization of beans

