## Start KSQL

##### STEP#1: Clone the Confluent KSQL repository:

```
[1] Create a folder /usr/local/ksql/
[2] Execute: git clone git@github.com:confluentinc/ksql.git
```

##### STEP#2: Maven Build:

```
[1] Navigate: cd /usr/local/ksql/ksql
[2] Execute: mvn clean compile install -DskipTests
```

##### STEP#3: Start KSQL:

```
[1] Navigage: cd /usr/local/ksql/ksql/bin
[2] Execute: ./ksql
```
![image](https://user-images.githubusercontent.com/45539698/66264490-c2ba4f00-e823-11e9-8d81-f1e091e27171.png)

