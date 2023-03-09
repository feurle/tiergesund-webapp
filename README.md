# Tiergesund Webapp is a distributed microservices application based on Spring Cloud

[![Build Status](https://github.com/feurle/tiergesund-webapp/actions/workflows/maven-build.yml/badge.svg)](https://github.com/feurle/tiergesund-webapp/actions/workflows/maven-build.yml)

## API Resources

The following table lists the resources of the microservices:

| Microservice      | Resource      | Method                | Description                  |
|-------------------|---------------|-----------------------|------------------------------| 
| blog-service      | PostResource  | GET /posts            | Get a list of all posts      |
| vets-service      | VetResource   | GET /vets             | Get an array of all vets     |
| customers-service | OwnerResource | GET /owners           | Get an array of all owners   |
| customers-service | OwnerResource | GET /owners/{ownerId} | Get an owners by id          |
| customers-service | OwnerResource | PUT /owners/{ownerId} | Update an owner by id        |
| customers-service | OwnerResource | POST /owners          | Create a new owner           |
| customers-service | PetResource   | GET /petTypes         | Get an array of all petTypes | 
| customers-service | PetResource   |                       |                              |
| customers-service | PetResource   |                       |                              |
| customers-service | PetResource   |                       |                              |
