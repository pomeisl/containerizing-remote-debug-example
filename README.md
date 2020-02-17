### build an image
```
docker build -t example-app -f Dockerfile.debug .
```

### run the containerized application
```
docker run -it --rm -p 8080:8080 -p 5005:5005 example-app:latest
```