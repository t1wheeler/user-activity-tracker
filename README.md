# user-activity-tracker
API that retrieves user activities around photo and track objects

# PHOTO - curl GET endpoints 

## Satisfies the First Acceptance Criteria, "I should be able to make a GET request with no query parameters
                                              to an endpoint and have the endpoint return all results.")
### find all photos (Satisfies the First Acceptance Criteria, "I should be able to make a GET request with no query parameters to an endpoint and
                                                              have the endpoint return all results.")
curl "http://localhost:8080/user-activity-tracker/photo/"

### find all activities for all photos (Satisfies the First Acceptance Criteria, "I should be able to make a GET request with no query parameters to an endpoint and
                                                                                                    have the endpoint return all results.")
curl "http://localhost:8080/user-activity-tracker/photo/activity"

### find all activities for a specific photo
curl "ocalhost:8080/user-activity-tracker/photo/activity/photo?photoId=31"

## Satisfies the Second Acceptance Criteria, "I should be able to make a GET request with a " type=like" query string
                                              to the endpointand have it return only likes (or comments, shares).
### find all "Like" actions for a specific photo
curl "http://localhost:8080/user-activity-tracker/photo/activity/type?action=1&photo=31"

### find all "Share" actions for a specific photo
curl "http://localhost:8080/user-activity-tracker/photo/activity/type?action=2&photo=31"

### find all "Comment" actions for a specific photo
curl "http://localhost:8080/user-activity-tracker/photo/activity/type?action=3&photo=31"


## Satisfies the Third Acceptance Criteria, "I should be able to make a GET reque st with a " since=<integer>" query
                                              string and have it return only results since that integer (unix timestamp).
### find all "Like" actions for a specific photo since a specific date
curl "http://localhost:8080/user-activity-tracker/photo/activity/type/since?actionId=1&photoId=31&date=01/17/2017"

### find all "Share" actions for a specific photo since a specific date
curl "http://localhost:8080/user-activity-tracker/photo/activity/type/since?actionId=2&photoId=31&date=01/17/2017"

### find all "Comment" actions for a specific photo since a specific date
curl "http://localhost:8080/user-activity-tracker/photo/activity/type/since?actionId=3&photoId=31&date=01/17/2017"



# TRACK - curl GET endpoints

## Satisfies the First Acceptance Criteria, "I should be able to make a GET request with no query parameters
                                              to an endpoint and have the endpoint return all results.")
### find all tracks 
curl "http://localhost:8080/user-activity-tracker/track/"

### find all activities for all tracks
curl "http://localhost:8080/user-activity-tracker/track/activity"

### find all activities for a specific track
curl "http://localhost:8080/user-activity-tracker/track/activity/track?trackId=5"


## Satisfies the Second Acceptance Criteria, "I should be able to make a GET request with a " type=like" query string
                                              to the endpointand have it return only likes (or comments, shares).
### find all "Like" actions for a specific track
curl "http://localhost:8080/user-activity-tracker/track/activity/type?action=1&trackId=5"

### find all "Share" actions for a specific track
curl "http://localhost:8080/user-activity-tracker/track/activity/type?action=2&trackId=5"

### find all "Comment" actions for a specific track
curl "http://localhost:8080/user-activity-tracker/track/activity/type?action=3&trackId=5"


## Satisfies the Third Acceptance Criteria, "I should be able to make a GET reque st with a " since=<integer>" query
                                              string and have it return only results since that integer (unix timestamp).
### find all "Like" actions for a specific track since a specific date
curl "http://localhost:8080/user-activity-tracker/track/activity/type/since?action=1&trackId=5"&date=01/17/2017"

### find all "Share" actions for a specific track since a specific date
curl "http://localhost:8080/user-activity-tracker/track/activity/type/since?actionId=2&trackId=5&date=02/11/2017"

### find all "Comment" actions for a specific track since a specific date
curl "http://localhost:8080/user-activity-tracker/track/activity/type/since?actionId=3&trackId=5&date=02/11/2016"