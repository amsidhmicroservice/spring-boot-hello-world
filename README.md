<img alt="GitHub Workflow Status (branch)" src="https://img.shields.io/github/workflow/status/amsidhmicroservice/spring-boot-hello-world/Gradle_Docker_GKE_Build_And_Deployment/master"><img alt="Docker Automated build" src="https://img.shields.io/docker/automated/amsidhmicroservice/spring-boot-hello-world"><img alt="Docker Image Size (tag)" src="https://img.shields.io/docker/image-size/amsidhmicroservice/spring-boot-hello-world/latest"><img alt="Docker Image Version (tag latest semver)" src="https://img.shields.io/docker/v/amsidhmicroservice/spring-boot-hello-world/latest"><img alt="GitHub contributors" src="https://img.shields.io/github/contributors/amsidhmicroservice/spring-boot-hello-world"><img alt="GitHub commit activity (branch)" src="https://img.shields.io/github/commit-activity/m/amsidhmicroservice/spring-boot-hello-world/master"><img alt="GitHub repo size" src="https://img.shields.io/github/repo-size/amsidhmicroservice/spring-boot-hello-world"><img alt="Gitlab code coverage" src="https://img.shields.io/gitlab/coverage/amsidhmicroservice/spring-boot-hello-world/master">

# What This Is
 This project is a simple hello world application using Java and [Spring Boot] (https://spring.io/projects/spring-boot).

This project contains the following:

- **Tools**
    - Spring Boot Web
    - Github Workflow job for build and push image to docker hub
    - Github Workflow job for deploy github image to Google Kubernetes Cluster(GKE) using helm
    - Kubernetes deployment files
    - Helm Charts

- **API-Endpoints**
    This apllication is exposing following two rest endpoints:
    - http://ipaddress:8181/
    - http://ipaddress:8181/sayHello
