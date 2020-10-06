# Your Java code in the Cloud Native era: an experience with live coding

## Concepts

- Quarkus
- RestClient
- Injection
- Health
- Metrics
- Readiness
- Liveness

## Projects

- Started on [Quarkus.io](https://code.quarkus.io/)

## Quarkus extensions

- `mvn quarkus:list-extensions`
- `mvn quarkus:add-extension -Dextensions="quarkus-rest-client, quarkus-smallrye-metrics, quarkus-smallrye-health"`

## URLs

- http://localhost:8080/time
- http://localhost:8081/gateway
- http://localhost:8081/health
- http://localhost:8081/metrics
- http://localhost:8081/metrics/application
- http://localhost:8081/xxx (fake URL to see all URLs available)

## Scripts

- `while true ; do curl http://localhost:8080/time ; sleep 1 ; done`
- `while true ; do curl http://localhost:8081/gateway ; sleep 1 ; done`

## SPECIAL THANKS TO 
- Platform : [SouJava](https://www.youtube.com/channel/UCH0qj1HFZ9jy0w87YfMSA7w) 
- Video : [Seu código Java na era Cloud Native: uma experiência com live coding](https://www.youtube.com/watch?v=1Yqgl582pw8)
- Instructor : [Elder Moraes](https://github.com/eldermoraes/)
