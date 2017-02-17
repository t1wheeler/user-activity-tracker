# user-activity-tracker
API that retrieves user activities around photo and track objects

# curl PHOTO endpoints

## find all photos
curl "http://localhost:8080/user-activity-tracker/photo/"

## find all activities for all photos
curl "http://localhost:8080/user-activity-tracker/photo/activity"

## find all activities for a specific photo
curl "ocalhost:8080/user-activity-tracker/photo/activity/photo?photoId=31"

## find all "Like" actions for a specific photo
curl "http://localhost:8080/user-activity-tracker/photo/activity/type?action=1&photo=31"

## find all "Share" actions for a specific photo
curl "http://localhost:8080/user-activity-tracker/photo/activity/type?action=2&photo=31"

## find all "Comment" actions for a specific photo
curl "http://localhost:8080/user-activity-tracker/photo/activity/type?action=3&photo=31"

## find all "Like" actions for a specific photo since a specific date
curl "http://localhost:8080/user-activity-tracker/photo/activity/type/since?actionId=1&photoId=31&date=01/17/2017"

## find all "Share" actions for a specific photo since a specific date
curl "http://localhost:8080/user-activity-tracker/photo/activity/type/since?actionId=2&photoId=31&date=01/17/2017"

## find all "Comment" actions for a specific photo since a specific date
curl "http://localhost:8080/user-activity-tracker/photo/activity/type/since?actionId=3&photoId=31&date=01/17/2017"



# curl TRACK endpoints

## find all tracks
curl "http://localhost:8080/user-activity-tracker/track/"

## find all activities for all tracks
curl "http://localhost:8080/user-activity-tracker/track/activity"

## find all activities for a specific track
curl "http://localhost:8080/user-activity-tracker/track/activity/track?trackId=5"

## find all "Like" actions for a specific track
curl "http://localhost:8080/user-activity-tracker/track/activity/type?action=1&trackId=5"

## find all "Share" actions for a specific track
curl "http://localhost:8080/user-activity-tracker/track/activity/type?action=2&trackId=5"

## find all "Comment" actions for a specific track
curl "http://localhost:8080/user-activity-tracker/track/activity/type?action=3&trackId=5"

## find all "Like" actions for a specific track since a specific date
curl "http://localhost:8080/user-activity-tracker/track/activity/type/since?action=1&trackId=5"&date=01/17/2017"

## find all "Share" actions for a specific track since a specific date
curl "http://localhost:8080/user-activity-tracker/track/activity/type/since?actionId=2&trackId=5&date=02/11/2017"

## find all "Comment" actions for a specific track since a specific date
curl "http://localhost:8080/user-activity-tracker/track/activity/type/since?actionId=3&trackId=5&date=02/11/2016"