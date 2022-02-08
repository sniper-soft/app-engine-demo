Example Spring Boot project deployment-ready to GCP App Engine.

```
gcloud config set project my-project-id
gcloud auth login
mvn package appengine:deploy
mvn package appengine:deployCron
```
