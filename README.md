# Jenkins with DSL plugin 

## Folder structure
- **build: resource:** Build jenkins docker image  
- **jobs-dsl-files:** Files to create jobs when dsl job (dsl-builder) is triggered
- **jobs-dsl-scripts:** Pipeline files

## Usage
### run container
```bash
docker run -d \
      --restart always \
      --name jenkins-dsl \
      -v jenkins_home:/var/jenkins_home \
      -p 8080:8080 \
      -p 50000:50000 \
      carlosgaro/jenkins-dsl:latest
```
### build image 
```bash
cd build && docker build -t jenkins-dsl .
docker run -d \
      --restart always \
      --name jenkins-dsl \
      -v jenkins_home:/var/jenkins_home \
      -p 8080:8080 \
      -p 50000:50000 \
      jenkins-dsl 
```

