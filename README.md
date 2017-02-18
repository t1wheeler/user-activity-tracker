# README #

Welcome to the User Activity Action tracker!

This Rest API tracks provides endpoints for a client to track the social actions of its users viewing other users photos or tracks (mapped adventures).  
It retrieves how many "Likes", "Shares", and "Comments" a specific photo or track has recieved.  The resultset also shows the user that performed the action
and will return actions after a specified date.

It is currently in a dev state and needs a few improvements before it should go live.



## How do I get set up? ##
Clone the user-activity-tracker a single folder and import into your favorite IDE.  
Choose a Maven Profile that suites your development needs.

Set up your database schema:  The database for this project has been created using MySQL and is designed to easily add more action types.
Included is sql script to create and populate a test database.

## Preconditions ##
  - Curl is installed locally: 
    [Link to Curl install instructions](http://www.oracle.com/webfolder/technetwork/tutorials/obe/cloud/objectstorage/restrict_rw_accs_cntainers_REST_API/files/installing_curl_command_line_tool_on_windows.html#summary - automatic)
    
  - MySQL Command Line Client or MySQL Workbench must be installed locally and the "LocalHost" Connection is created.
   ```
        HostName: localhost        Port:  3306
        Username: root             Password: password
   ```
        
   For easier configuration, the schema may be created using the script, install-mysql-schema.sql, included in the project.
   This will also populate the data.
   ```
    From MySQL (MYSQL Command Line Client)    
    mysql> source {install path}/user-activity-tracker/install-mysql-schema.sql;  
    ```

## Alternate ##
   Import or run install-mysql-schema from MySQL Workbench.    
 ```
    Connect to your local connection(localhost:3306) in MySQL WorkBench.
    Click on the "Management tab" at the bottom of the "Navigotor" panel.
    Click on "Data Import/Restore".
    Choose "Import from Self-Contained File" and browse to you location of install-mysql-schema.sql
    Click on the "Start Import" button.
    Go back to the "Schema" tab in the "Navigator" panel, right-click, and select "Refresh All".
    activity-manager will now be included in your SCHEMAS list      
```

## Clone or Download project form GitHub ##
Import project into your IDE.  Some IDE's require you select "Import existing project"
or "Import existing MAVEN project".


## Build and Run ##
Run the project from you IDE or enter the below commands from the commandLine.
```
    mvn clean install
    mvn spring-boot:run
```
## Verify ##
```
http://localhost:8080/user-activity-tracker/photo
http://localhost:8080/user-activity-tracker/track/activity/type?actionId=1&trackId=5
 ``` 

## Curl *Get* endpoints ##
### **Photo** ###
- Photo Endpoints that satisfy the First Acceptance Criteria, "I should be able to make a GET request with no query parameters to an endpoint and have the endpoint return all results.
```    
    Find all photos:                    curl "http://localhost:8080/user-activity-tracker/photo/"
    Find all activities for all photos: curl "http://localhost:8080/user-activity-tracker/photo/activity"
    
    Go one level deeper to Find all activities for a SPECIFIC photo: curl "http://localhost:8080/user-activity-tracker/photo/activity/photo?photoId=31"
```
    
    
- Photo Endpoints that satisfy the Second Acceptance Criteria, "I should be able to make a GET request with a " type=like" query string to the endpointand have it return only likes (or comments, shares).
```
    Find all activities for a specific photo:           curl "http://localhost:8080/user-activity-tracker/photo/activity/photo?photoId=31"
    Find all "Like" actions for a specific photo:       curl "http://localhost:8080/user-activity-tracker/photo/activity/type?actionId=1&photoId=31"
    Find all "Share" actions for a specific photo:      curl "http://localhost:8080/user-activity-tracker/photo/activity/type?actionId=2&photoId=31"
    Find all "Comment" actions for a specific photo:    curl "http://localhost:8080/user-activity-tracker/photo/activity/type?actionId=3&photoId=31"
```


- Photo Endpoints that satisfy the Third Acceptance Criteria, "I should be able to make a GET reque st with a " since=<integer>" query string and have it return only results since that integer (unix timestamp).
```
    Find all "Like" actions for a specific photo since a specific date:     curl "http://localhost:8080/user-activity-tracker/photo/activity/type/since?actionId=1&photoId=31&unixDate=1484636400"
    Find all "Share" actions for a specific photo since a specific date:    curl "http://localhost:8080/user-activity-tracker/photo/activity/type/since?actionId=2&photoId=31&unixDate=1484636400"
    Find all "Comment" actions for a specific photo since a specific date:  curl "http://localhost:8080/user-activity-tracker/photo/activity/type/since?actionId=3&photoId=31&unixDate=1484636400"
    *note - unixDate 1484636400 = 01/17/2017.  validation for date still needs to be completed
```



### **Track** ###
- Track Endpoints that satisfy the First Acceptance Criteria, "I should be able to make a GET request with no query parameters to an endpoint and have the endpoint return all results.
```
    Find all tracks:                                                    curl "http://localhost:8080/user-activity-tracker/track/"
    Find all activities for all tracks:                                 curl "http://localhost:8080/user-activity-tracker/track/activity"
    
    Go one level deeper to find all activities for a specific track:    curl "http://localhost:8080/user-activity-tracker/track/activity/track?trackId=5"
```
    
    
- Track Endpoints that satisfy the Second Acceptance Criteria, "I should be able to make a GET request with a " type=like" query string to the endpointand have it return only likes (or comments, shares).
```
    
    Find all "Like" actions for a specific track:       curl "http://localhost:8080/user-activity-tracker/track/activity/type?actionId=1&trackId=5"
    Find all "Share" actions for a specific track:      curl "http://localhost:8080/user-activity-tracker/track/activity/type?actionId=2&trackId=5"
    Find all "Comment" actions for a specific track:    curl "http://localhost:8080/user-activity-tracker/track/activity/type?actionId=3&trackId=5"
```


- Track Endpoints that satisfy the Third Acceptance Criteria, "I should be able to make a GET reque st with a " since=<integer>" query string and have it return only results since that integer (unix timestamp).
```
    Find all "Like" actions for a specific track since a specific date:     curl "http://localhost:8080/user-activity-tracker/track/activity/type/since?actionId=1&trackId=5&unixDate=1484636400"
    Find all "Share" actions for a specific track since a specific date:    curl "http://localhost:8080/user-activity-tracker/track/activity/type/since?actionId=2&trackId=5&unixDate=1486796400"
    Find all "Comment" actions for a specific track since a specific date:  curl "http://localhost:8080/user-activity-tracker/track/activity/type/since?actionId=3&trackId=5&unixDate=1486796400"
     *note - unixDate 1484636400 = 01/17/2017 and 1486796400 = 02/11/2017.  validation for date still needs to be completed
```