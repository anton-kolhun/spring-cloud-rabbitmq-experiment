# Spring cloud rabbitmq applicaiton

## Required Prerequisites

* JDK 8
* launched rabbitmq broker instance: 
docker run -d -p 5672:5672 -p 15672:15672 -e RABBITMQ_VM_MEMORY_HIGH_WATERMARK=0.75 -e RABBITMQ_DEFAULT_USER=user -e RABBITMQ_DEFAULT_PASS=password rabbitmq:3.6-management-alpine 