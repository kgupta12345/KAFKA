HPA-FOR MY NOTES

https://medium.com/google-cloud/kubernetes-running-background-tasks-with-batch-jobs-56482fbc853



git clone https://github.com/kubernetes-incubator/metrics-server.git

cd metrics-server/
cd deploy
cd 1.8+
vi metrics-server-deployment.yaml
Here introduce command section

name: metrics-server
        image: k8s.gcr.io/metrics-server-amd64:v0.3.5
        command:
          - /metrics-server
          - --kubelet-insecure-tls
        imagePullPolicy: Always
        volumeMounts:


To check metric is up and running:
 kubectl -n kube-system get pods


kubectl run application --image=rahulvaish/springbootdocker --port=8080

kubectl edit deployment application 


…
…
…
 containers:
      - image: rahulvaish/springbootdocker
        imagePullPolicy: Always
        name: application
        ports:
        - containerPort: 8080
          protocol: TCP
        resources:
          limits:
            cpu: 100m
          requests:
            cpu: 100m
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
      dnsPolicy: ClusterFirst
      restartPolicy: Always
…
…
…
…

kubectl expose deployment/application --type="NodePort" --port 8080
export NODE_PORT=$(kubectl get services/application -o go-template='{{(index .spec.ports 0).nodePort}}')
echo NODE_PORT=$NODE_PORT
http://localhost:31635
kubectl autoscale deployment application --min=1 --max=10 --cpu-percent=20


siege -q -c 10 -t 2m http://localhost:31635/


Now kubectl get hpa


_________________

IF MEMORY AUTOSCALING:


        resources:
          limits:
            memory: 500Mi
          requests:
            memory: 50Mi


And HPA YML

  metrics:
  - type: Resource
    resource:
      name: memory
      targetAverageUtilization: 50



brew install stress




