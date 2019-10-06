## Start KSQL

1.  Clone the Confluent KSQL repository.

    ```bash
    $ git clone git@github.com:confluentinc/ksql.git
    ```

2.  Change directory to the `ksql` directory and compile the code.

    ```bash
    $ cd ksql
    $ mvn clean compile install -DskipTests
    ```

3.  Start KSQL. The `local` argument starts KSQL in [standalone mode](/docs/concepts.md#modes-of-operation).

    ```bash
    $ ./bin/ksql-cli local
    ```

    After KSQL is started, your terminal should resemble this.

    ```bash
    ksql>
    ```

See the steps below to generate data to the Kafka cluster.
