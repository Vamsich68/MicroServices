#To run image
1. docker run -p 8080:8080 in28min/hello-world-rest-api:0.0.1.RELEASE

#Create instance

2. kubectl create deployment hello-world-rest-api --image=in28min/hello-world-rest-api:0.0.1.RELEASE

#To run instances

3. kubectl expose deployment {deployment name} --type=LoadBalancer --port=8080

4. kubectl scale deployment {deployment name} --replicas=3

5. kubectl delete pod {pod id}

#To get events
6. Kubectl get events
#can use singular or plural ex: pod or pods both will work
7. Kubectl ged pods

#To show detailed info of particular pod

9. kubectl describe pod {pod id}
10. Kubectl ged relicaset // or rs
11. kubectl get pods -o wide
12. kubectl delete pods {pod id}
#Creates no.of.instances
13. kubectl scale deployment {cluster name} --replicas=3
14. kubectl explain replicaset
15. kubectl get events --sort-by= .metadata.creationTimestamp



