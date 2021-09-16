# Quarkus OpenTelemetry extension

## Guide
[Quarkus OpenTelemetry guide](https://quarkus.io/guides/opentelemetry)

## Scope of the test
1. Testing OpenTelemetry with Jaeger components
 - Extension `quarkus-opentelemetry` - responsible for traces generation in OpenTelemetry format
 - Extension `quarkus-opentelemetry-exporter-jaeger` - responsible for traces export into Jaeger components (jaeger-agent, jaeger-collector)
 - Extension `quarkus-opentelemetry-exporter-otlp` -responsible for traces export into OpenTelemetry components (opentelemetry-agent, opentelemetry-collector)
 
OpenShift scenario that test proper traces export to Jaeger components and context propagation. 
Implementation: two REST services, one Jaeger all-in-one pod (creating jaeger-rest & jaeger-query services).  
Ping Pong application with 3 pods (ping service, pong service, jaeger-all-in-one). Traces are send directly into jaeger-collector (no local jaeger-agent process in Quarkus pods)