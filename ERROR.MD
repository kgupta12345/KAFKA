```
spark-submit   --class org.apache.spark.examples.SparkPi  --master yarn  /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar 100
 ```
 
 
 
```

rahul@rahul:~$ spark-submit   --class org.apache.spark.examples.SparkPi   --master yarn  /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar 100
2019-11-15 17:44:01 WARN  NativeCodeLoader:62 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
2019-11-15 17:44:01 INFO  SparkContext:54 - Running Spark version 2.3.4
2019-11-15 17:44:01 INFO  SparkContext:54 - Submitted application: Spark Pi
2019-11-15 17:44:01 INFO  SecurityManager:54 - Changing view acls to: rahul
2019-11-15 17:44:01 INFO  SecurityManager:54 - Changing modify acls to: rahul
2019-11-15 17:44:01 INFO  SecurityManager:54 - Changing view acls groups to: 
2019-11-15 17:44:01 INFO  SecurityManager:54 - Changing modify acls groups to: 
2019-11-15 17:44:01 INFO  SecurityManager:54 - SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(rahul); groups with view permissions: Set(); users  with modify permissions: Set(rahul); groups with modify permissions: Set()
2019-11-15 17:44:01 INFO  Utils:54 - Successfully started service 'sparkDriver' on port 41609.
2019-11-15 17:44:01 INFO  SparkEnv:54 - Registering MapOutputTracker
2019-11-15 17:44:01 INFO  SparkEnv:54 - Registering BlockManagerMaster
2019-11-15 17:44:01 INFO  BlockManagerMasterEndpoint:54 - Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
2019-11-15 17:44:01 INFO  BlockManagerMasterEndpoint:54 - BlockManagerMasterEndpoint up
2019-11-15 17:44:01 INFO  DiskBlockManager:54 - Created local directory at /tmp/blockmgr-5cb63c7d-2871-4266-9167-9edf3ad9c562
2019-11-15 17:44:01 INFO  MemoryStore:54 - MemoryStore started with capacity 366.3 MB
2019-11-15 17:44:02 INFO  SparkEnv:54 - Registering OutputCommitCoordinator
2019-11-15 17:44:02 INFO  log:192 - Logging initialized @3019ms
2019-11-15 17:44:02 INFO  Server:351 - jetty-9.3.z-SNAPSHOT, build timestamp: unknown, git hash: unknown
2019-11-15 17:44:02 INFO  Server:419 - Started @3132ms
2019-11-15 17:44:02 INFO  AbstractConnector:278 - Started ServerConnector@d816dde{HTTP/1.1,[http/1.1]}{0.0.0.0:4040}
2019-11-15 17:44:02 INFO  Utils:54 - Successfully started service 'SparkUI' on port 4040.
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@433ffad1{/jobs,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@547e29a4{/jobs/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@1c807b1d{/jobs/job,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@1b39fd82{/jobs/job/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@3e2fc448{/stages,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@21680803{/stages/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@588ab592{/stages/stage,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@2d8f2f3a{/stages/stage/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@2024293c{/stages/pool,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@7048f722{/stages/pool/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@c074c0c{/storage,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@58a55449{/storage/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@5949eba8{/storage/rdd,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@6e0ff644{/storage/rdd/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@58dea0a5{/environment,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@2a2bb0eb{/environment/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@3c291aad{/executors,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@2d0566ba{/executors/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@733037{/executors/threadDump,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@7728643a{/executors/threadDump/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@320e400{/static,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@58783f6c{/,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@3a7b503d{/api,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@1bc53649{/jobs/job/kill,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@88d6f9b{/stages/stage/kill,null,AVAILABLE,@Spark}
2019-11-15 17:44:02 INFO  SparkUI:54 - Bound SparkUI to 0.0.0.0, and started at http://rahul:4040
2019-11-15 17:44:02 INFO  SparkContext:54 - Added JAR file:/usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar at spark://rahul:41609/jars/spark-examples_2.11-2.3.4.jar with timestamp 1573820042646
2019-11-15 17:44:03 INFO  RMProxy:98 - Connecting to ResourceManager at /0.0.0.0:8032
2019-11-15 17:44:03 INFO  Client:54 - Requesting a new application from cluster with 1 NodeManagers
2019-11-15 17:44:04 INFO  Client:54 - Verifying our application has not requested more than the maximum memory capability of the cluster (8192 MB per container)
2019-11-15 17:44:04 INFO  Client:54 - Will allocate AM container, with 896 MB memory including 384 MB overhead
2019-11-15 17:44:04 INFO  Client:54 - Setting up container launch context for our AM
2019-11-15 17:44:04 INFO  Client:54 - Setting up the launch environment for our AM container
2019-11-15 17:44:04 INFO  Client:54 - Preparing resources for our AM container
2019-11-15 17:44:06 WARN  Client:66 - Neither spark.yarn.jars nor spark.yarn.archive is set, falling back to uploading libraries under SPARK_HOME.
2019-11-15 17:44:15 INFO  Client:54 - Uploading resource file:/tmp/spark-711df588-24f9-4ba7-a142-eefe342a55ad/__spark_libs__461054075007907814.zip -> hdfs://localhost:9000/user/rahul/.sparkStaging/application_1573819794242_0002/__spark_libs__461054075007907814.zip
2019-11-15 17:44:19 INFO  Client:54 - Uploading resource file:/tmp/spark-711df588-24f9-4ba7-a142-eefe342a55ad/__spark_conf__6553515433374474853.zip -> hdfs://localhost:9000/user/rahul/.sparkStaging/application_1573819794242_0002/__spark_conf__.zip
2019-11-15 17:44:19 INFO  SecurityManager:54 - Changing view acls to: rahul
2019-11-15 17:44:19 INFO  SecurityManager:54 - Changing modify acls to: rahul
2019-11-15 17:44:19 INFO  SecurityManager:54 - Changing view acls groups to: 
2019-11-15 17:44:19 INFO  SecurityManager:54 - Changing modify acls groups to: 
2019-11-15 17:44:19 INFO  SecurityManager:54 - SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(rahul); groups with view permissions: Set(); users  with modify permissions: Set(rahul); groups with modify permissions: Set()
2019-11-15 17:44:19 INFO  Client:54 - Submitting application application_1573819794242_0002 to ResourceManager
2019-11-15 17:44:19 INFO  YarnClientImpl:273 - Submitted application application_1573819794242_0002
2019-11-15 17:44:19 INFO  SchedulerExtensionServices:54 - Starting Yarn extension services with app application_1573819794242_0002 and attemptId None
2019-11-15 17:44:20 INFO  Client:54 - Application report for application_1573819794242_0002 (state: ACCEPTED)
2019-11-15 17:44:20 INFO  Client:54 - 
	 client token: N/A
	 diagnostics: [Fri Nov 15 17:44:20 +0530 2019] Scheduler has assigned a container for AM, waiting for AM container to be launched
	 ApplicationMaster host: N/A
	 ApplicationMaster RPC port: -1
	 queue: default
	 start time: 1573820059470
	 final status: UNDEFINED
	 tracking URL: http://rahul:8088/proxy/application_1573819794242_0002/
	 user: rahul
2019-11-15 17:44:21 INFO  Client:54 - Application report for application_1573819794242_0002 (state: ACCEPTED)
2019-11-15 17:44:22 INFO  Client:54 - Application report for application_1573819794242_0002 (state: ACCEPTED)
2019-11-15 17:44:23 INFO  Client:54 - Application report for application_1573819794242_0002 (state: ACCEPTED)
2019-11-15 17:44:24 INFO  Client:54 - Application report for application_1573819794242_0002 (state: ACCEPTED)
2019-11-15 17:44:25 INFO  Client:54 - Application report for application_1573819794242_0002 (state: ACCEPTED)
2019-11-15 17:44:26 INFO  Client:54 - Application report for application_1573819794242_0002 (state: ACCEPTED)
2019-11-15 17:44:27 INFO  Client:54 - Application report for application_1573819794242_0002 (state: ACCEPTED)
2019-11-15 17:44:28 INFO  Client:54 - Application report for application_1573819794242_0002 (state: ACCEPTED)
2019-11-15 17:44:29 INFO  Client:54 - Application report for application_1573819794242_0002 (state: ACCEPTED)
2019-11-15 17:44:30 INFO  YarnClientSchedulerBackend:54 - Add WebUI Filter. org.apache.hadoop.yarn.server.webproxy.amfilter.AmIpFilter, Map(PROXY_HOSTS -> rahul, PROXY_URI_BASES -> http://rahul:8088/proxy/application_1573819794242_0002), /proxy/application_1573819794242_0002
2019-11-15 17:44:30 INFO  JettyUtils:54 - Adding filter org.apache.hadoop.yarn.server.webproxy.amfilter.AmIpFilter to /jobs, /jobs/json, /jobs/job, /jobs/job/json, /stages, /stages/json, /stages/stage, /stages/stage/json, /stages/pool, /stages/pool/json, /storage, /storage/json, /storage/rdd, /storage/rdd/json, /environment, /environment/json, /executors, /executors/json, /executors/threadDump, /executors/threadDump/json, /static, /, /api, /jobs/job/kill, /stages/stage/kill.
2019-11-15 17:44:30 INFO  YarnSchedulerBackend$YarnSchedulerEndpoint:54 - ApplicationMaster registered as NettyRpcEndpointRef(spark-client://YarnAM)
2019-11-15 17:44:30 INFO  Client:54 - Application report for application_1573819794242_0002 (state: RUNNING)
2019-11-15 17:44:30 INFO  Client:54 - 
	 client token: N/A
	 diagnostics: N/A
	 ApplicationMaster host: 10.0.2.15
	 ApplicationMaster RPC port: 0
	 queue: default
	 start time: 1573820059470
	 final status: UNDEFINED
	 tracking URL: http://rahul:8088/proxy/application_1573819794242_0002/
	 user: rahul
2019-11-15 17:44:30 INFO  YarnClientSchedulerBackend:54 - Application application_1573819794242_0002 has started running.
2019-11-15 17:44:30 INFO  Utils:54 - Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 44117.
2019-11-15 17:44:30 INFO  NettyBlockTransferService:54 - Server created on rahul:44117
2019-11-15 17:44:30 INFO  BlockManager:54 - Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
2019-11-15 17:44:30 INFO  BlockManagerMaster:54 - Registering BlockManager BlockManagerId(driver, rahul, 44117, None)
2019-11-15 17:44:30 INFO  BlockManagerMasterEndpoint:54 - Registering block manager rahul:44117 with 366.3 MB RAM, BlockManagerId(driver, rahul, 44117, None)
2019-11-15 17:44:30 INFO  BlockManagerMaster:54 - Registered BlockManager BlockManagerId(driver, rahul, 44117, None)
2019-11-15 17:44:30 INFO  BlockManager:54 - Initialized BlockManager: BlockManagerId(driver, rahul, 44117, None)
2019-11-15 17:44:31 INFO  JettyUtils:54 - Adding filter org.apache.hadoop.yarn.server.webproxy.amfilter.AmIpFilter to /metrics/json.
2019-11-15 17:44:31 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@1edccfd4{/metrics/json,null,AVAILABLE,@Spark}
2019-11-15 17:44:32 INFO  YarnClientSchedulerBackend:54 - SchedulerBackend is ready for scheduling beginning after waiting maxRegisteredResourcesWaitingTime: 30000(ms)
2019-11-15 17:44:33 INFO  SparkContext:54 - Starting job: reduce at SparkPi.scala:38
2019-11-15 17:44:33 INFO  DAGScheduler:54 - Got job 0 (reduce at SparkPi.scala:38) with 100 output partitions
2019-11-15 17:44:33 INFO  DAGScheduler:54 - Final stage: ResultStage 0 (reduce at SparkPi.scala:38)
2019-11-15 17:44:33 INFO  DAGScheduler:54 - Parents of final stage: List()
2019-11-15 17:44:33 INFO  DAGScheduler:54 - Missing parents: List()
2019-11-15 17:44:33 INFO  DAGScheduler:54 - Submitting ResultStage 0 (MapPartitionsRDD[1] at map at SparkPi.scala:34), which has no missing parents
2019-11-15 17:44:34 INFO  MemoryStore:54 - Block broadcast_0 stored as values in memory (estimated size 1920.0 B, free 366.3 MB)
2019-11-15 17:44:34 INFO  MemoryStore:54 - Block broadcast_0_piece0 stored as bytes in memory (estimated size 1243.0 B, free 366.3 MB)
2019-11-15 17:44:34 INFO  BlockManagerInfo:54 - Added broadcast_0_piece0 in memory on rahul:44117 (size: 1243.0 B, free: 366.3 MB)
2019-11-15 17:44:34 INFO  SparkContext:54 - Created broadcast 0 from broadcast at DAGScheduler.scala:1039
2019-11-15 17:44:34 INFO  DAGScheduler:54 - Submitting 100 missing tasks from ResultStage 0 (MapPartitionsRDD[1] at map at SparkPi.scala:34) (first 15 tasks are for partitions Vector(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14))
2019-11-15 17:44:34 INFO  YarnScheduler:54 - Adding task set 0.0 with 100 tasks
2019-11-15 17:44:38 INFO  YarnSchedulerBackend$YarnDriverEndpoint:54 - Registered executor NettyRpcEndpointRef(spark-client://Executor) (10.0.2.15:35246) with ID 1
2019-11-15 17:44:38 INFO  TaskSetManager:54 - Starting task 0.0 in stage 0.0 (TID 0, rahul, executor 1, partition 0, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:38 INFO  BlockManagerMasterEndpoint:54 - Registering block manager rahul:36285 with 366.3 MB RAM, BlockManagerId(1, rahul, 36285, None)
2019-11-15 17:44:39 INFO  BlockManagerInfo:54 - Added broadcast_0_piece0 in memory on rahul:36285 (size: 1243.0 B, free: 366.3 MB)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Starting task 1.0 in stage 0.0 (TID 1, rahul, executor 1, partition 1, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Finished task 0.0 in stage 0.0 (TID 0) in 1865 ms on rahul (executor 1) (1/100)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Starting task 2.0 in stage 0.0 (TID 2, rahul, executor 1, partition 2, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Finished task 1.0 in stage 0.0 (TID 1) in 109 ms on rahul (executor 1) (2/100)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Starting task 3.0 in stage 0.0 (TID 3, rahul, executor 1, partition 3, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Finished task 2.0 in stage 0.0 (TID 2) in 130 ms on rahul (executor 1) (3/100)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Starting task 4.0 in stage 0.0 (TID 4, rahul, executor 1, partition 4, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Finished task 3.0 in stage 0.0 (TID 3) in 298 ms on rahul (executor 1) (4/100)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Starting task 5.0 in stage 0.0 (TID 5, rahul, executor 1, partition 5, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Finished task 4.0 in stage 0.0 (TID 4) in 126 ms on rahul (executor 1) (5/100)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Starting task 6.0 in stage 0.0 (TID 6, rahul, executor 1, partition 6, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Finished task 5.0 in stage 0.0 (TID 5) in 111 ms on rahul (executor 1) (6/100)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Starting task 7.0 in stage 0.0 (TID 7, rahul, executor 1, partition 7, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:40 INFO  TaskSetManager:54 - Finished task 6.0 in stage 0.0 (TID 6) in 98 ms on rahul (executor 1) (7/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 8.0 in stage 0.0 (TID 8, rahul, executor 1, partition 8, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 7.0 in stage 0.0 (TID 7) in 82 ms on rahul (executor 1) (8/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 9.0 in stage 0.0 (TID 9, rahul, executor 1, partition 9, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 8.0 in stage 0.0 (TID 8) in 65 ms on rahul (executor 1) (9/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 10.0 in stage 0.0 (TID 10, rahul, executor 1, partition 10, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 9.0 in stage 0.0 (TID 9) in 64 ms on rahul (executor 1) (10/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 11.0 in stage 0.0 (TID 11, rahul, executor 1, partition 11, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 10.0 in stage 0.0 (TID 10) in 50 ms on rahul (executor 1) (11/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 12.0 in stage 0.0 (TID 12, rahul, executor 1, partition 12, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 11.0 in stage 0.0 (TID 11) in 59 ms on rahul (executor 1) (12/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 13.0 in stage 0.0 (TID 13, rahul, executor 1, partition 13, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 12.0 in stage 0.0 (TID 12) in 56 ms on rahul (executor 1) (13/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 14.0 in stage 0.0 (TID 14, rahul, executor 1, partition 14, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 13.0 in stage 0.0 (TID 13) in 62 ms on rahul (executor 1) (14/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 15.0 in stage 0.0 (TID 15, rahul, executor 1, partition 15, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 14.0 in stage 0.0 (TID 14) in 58 ms on rahul (executor 1) (15/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 16.0 in stage 0.0 (TID 16, rahul, executor 1, partition 16, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 15.0 in stage 0.0 (TID 15) in 89 ms on rahul (executor 1) (16/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 17.0 in stage 0.0 (TID 17, rahul, executor 1, partition 17, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 16.0 in stage 0.0 (TID 16) in 64 ms on rahul (executor 1) (17/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 18.0 in stage 0.0 (TID 18, rahul, executor 1, partition 18, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 17.0 in stage 0.0 (TID 17) in 39 ms on rahul (executor 1) (18/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 19.0 in stage 0.0 (TID 19, rahul, executor 1, partition 19, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 18.0 in stage 0.0 (TID 18) in 65 ms on rahul (executor 1) (19/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 20.0 in stage 0.0 (TID 20, rahul, executor 1, partition 20, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 19.0 in stage 0.0 (TID 19) in 23 ms on rahul (executor 1) (20/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 21.0 in stage 0.0 (TID 21, rahul, executor 1, partition 21, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 20.0 in stage 0.0 (TID 20) in 36 ms on rahul (executor 1) (21/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 22.0 in stage 0.0 (TID 22, rahul, executor 1, partition 22, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 21.0 in stage 0.0 (TID 21) in 36 ms on rahul (executor 1) (22/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 23.0 in stage 0.0 (TID 23, rahul, executor 1, partition 23, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 22.0 in stage 0.0 (TID 22) in 37 ms on rahul (executor 1) (23/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 24.0 in stage 0.0 (TID 24, rahul, executor 1, partition 24, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 23.0 in stage 0.0 (TID 23) in 48 ms on rahul (executor 1) (24/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 25.0 in stage 0.0 (TID 25, rahul, executor 1, partition 25, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 24.0 in stage 0.0 (TID 24) in 57 ms on rahul (executor 1) (25/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 26.0 in stage 0.0 (TID 26, rahul, executor 1, partition 26, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 25.0 in stage 0.0 (TID 25) in 36 ms on rahul (executor 1) (26/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 27.0 in stage 0.0 (TID 27, rahul, executor 1, partition 27, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 26.0 in stage 0.0 (TID 26) in 35 ms on rahul (executor 1) (27/100)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 28.0 in stage 0.0 (TID 28, rahul, executor 1, partition 28, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Finished task 27.0 in stage 0.0 (TID 27) in 30 ms on rahul (executor 1) (28/100)
2019-11-15 17:44:41 INFO  YarnSchedulerBackend$YarnDriverEndpoint:54 - Registered executor NettyRpcEndpointRef(spark-client://Executor) (10.0.2.15:35254) with ID 2
2019-11-15 17:44:41 INFO  TaskSetManager:54 - Starting task 29.0 in stage 0.0 (TID 29, rahul, executor 2, partition 29, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 30.0 in stage 0.0 (TID 30, rahul, executor 1, partition 30, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 28.0 in stage 0.0 (TID 28) in 64 ms on rahul (executor 1) (29/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 31.0 in stage 0.0 (TID 31, rahul, executor 1, partition 31, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 30.0 in stage 0.0 (TID 30) in 36 ms on rahul (executor 1) (30/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 32.0 in stage 0.0 (TID 32, rahul, executor 1, partition 32, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 31.0 in stage 0.0 (TID 31) in 34 ms on rahul (executor 1) (31/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 33.0 in stage 0.0 (TID 33, rahul, executor 1, partition 33, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 32.0 in stage 0.0 (TID 32) in 30 ms on rahul (executor 1) (32/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 34.0 in stage 0.0 (TID 34, rahul, executor 1, partition 34, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 33.0 in stage 0.0 (TID 33) in 72 ms on rahul (executor 1) (33/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 35.0 in stage 0.0 (TID 35, rahul, executor 1, partition 35, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 34.0 in stage 0.0 (TID 34) in 39 ms on rahul (executor 1) (34/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 36.0 in stage 0.0 (TID 36, rahul, executor 1, partition 36, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 35.0 in stage 0.0 (TID 35) in 27 ms on rahul (executor 1) (35/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 37.0 in stage 0.0 (TID 37, rahul, executor 1, partition 37, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 36.0 in stage 0.0 (TID 36) in 36 ms on rahul (executor 1) (36/100)
2019-11-15 17:44:42 INFO  BlockManagerMasterEndpoint:54 - Registering block manager rahul:37023 with 366.3 MB RAM, BlockManagerId(2, rahul, 37023, None)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 38.0 in stage 0.0 (TID 38, rahul, executor 1, partition 38, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 37.0 in stage 0.0 (TID 37) in 46 ms on rahul (executor 1) (37/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 39.0 in stage 0.0 (TID 39, rahul, executor 1, partition 39, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 38.0 in stage 0.0 (TID 38) in 38 ms on rahul (executor 1) (38/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 40.0 in stage 0.0 (TID 40, rahul, executor 1, partition 40, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 39.0 in stage 0.0 (TID 39) in 52 ms on rahul (executor 1) (39/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 41.0 in stage 0.0 (TID 41, rahul, executor 1, partition 41, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 40.0 in stage 0.0 (TID 40) in 54 ms on rahul (executor 1) (40/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 42.0 in stage 0.0 (TID 42, rahul, executor 1, partition 42, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 41.0 in stage 0.0 (TID 41) in 44 ms on rahul (executor 1) (41/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 43.0 in stage 0.0 (TID 43, rahul, executor 1, partition 43, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 42.0 in stage 0.0 (TID 42) in 49 ms on rahul (executor 1) (42/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 44.0 in stage 0.0 (TID 44, rahul, executor 1, partition 44, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 43.0 in stage 0.0 (TID 43) in 50 ms on rahul (executor 1) (43/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 45.0 in stage 0.0 (TID 45, rahul, executor 1, partition 45, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 44.0 in stage 0.0 (TID 44) in 58 ms on rahul (executor 1) (44/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 46.0 in stage 0.0 (TID 46, rahul, executor 1, partition 46, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 45.0 in stage 0.0 (TID 45) in 37 ms on rahul (executor 1) (45/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 47.0 in stage 0.0 (TID 47, rahul, executor 1, partition 47, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 46.0 in stage 0.0 (TID 46) in 46 ms on rahul (executor 1) (46/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 48.0 in stage 0.0 (TID 48, rahul, executor 1, partition 48, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 47.0 in stage 0.0 (TID 47) in 50 ms on rahul (executor 1) (47/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 49.0 in stage 0.0 (TID 49, rahul, executor 1, partition 49, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 48.0 in stage 0.0 (TID 48) in 44 ms on rahul (executor 1) (48/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 50.0 in stage 0.0 (TID 50, rahul, executor 1, partition 50, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 49.0 in stage 0.0 (TID 49) in 56 ms on rahul (executor 1) (49/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 51.0 in stage 0.0 (TID 51, rahul, executor 1, partition 51, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 50.0 in stage 0.0 (TID 50) in 20 ms on rahul (executor 1) (50/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 52.0 in stage 0.0 (TID 52, rahul, executor 1, partition 52, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 51.0 in stage 0.0 (TID 51) in 28 ms on rahul (executor 1) (51/100)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Starting task 53.0 in stage 0.0 (TID 53, rahul, executor 1, partition 53, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:42 INFO  TaskSetManager:54 - Finished task 52.0 in stage 0.0 (TID 52) in 35 ms on rahul (executor 1) (52/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 54.0 in stage 0.0 (TID 54, rahul, executor 1, partition 54, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 53.0 in stage 0.0 (TID 53) in 37 ms on rahul (executor 1) (53/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 55.0 in stage 0.0 (TID 55, rahul, executor 1, partition 55, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 54.0 in stage 0.0 (TID 54) in 38 ms on rahul (executor 1) (54/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 56.0 in stage 0.0 (TID 56, rahul, executor 1, partition 56, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 55.0 in stage 0.0 (TID 55) in 38 ms on rahul (executor 1) (55/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 57.0 in stage 0.0 (TID 57, rahul, executor 1, partition 57, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 56.0 in stage 0.0 (TID 56) in 49 ms on rahul (executor 1) (56/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 58.0 in stage 0.0 (TID 58, rahul, executor 1, partition 58, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 57.0 in stage 0.0 (TID 57) in 49 ms on rahul (executor 1) (57/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 59.0 in stage 0.0 (TID 59, rahul, executor 1, partition 59, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 58.0 in stage 0.0 (TID 58) in 63 ms on rahul (executor 1) (58/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 60.0 in stage 0.0 (TID 60, rahul, executor 1, partition 60, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 59.0 in stage 0.0 (TID 59) in 76 ms on rahul (executor 1) (59/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 61.0 in stage 0.0 (TID 61, rahul, executor 1, partition 61, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 60.0 in stage 0.0 (TID 60) in 63 ms on rahul (executor 1) (60/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 62.0 in stage 0.0 (TID 62, rahul, executor 1, partition 62, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 61.0 in stage 0.0 (TID 61) in 64 ms on rahul (executor 1) (61/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 63.0 in stage 0.0 (TID 63, rahul, executor 1, partition 63, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 62.0 in stage 0.0 (TID 62) in 43 ms on rahul (executor 1) (62/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 64.0 in stage 0.0 (TID 64, rahul, executor 1, partition 64, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 63.0 in stage 0.0 (TID 63) in 56 ms on rahul (executor 1) (63/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 65.0 in stage 0.0 (TID 65, rahul, executor 1, partition 65, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 64.0 in stage 0.0 (TID 64) in 52 ms on rahul (executor 1) (64/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 66.0 in stage 0.0 (TID 66, rahul, executor 1, partition 66, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 65.0 in stage 0.0 (TID 65) in 55 ms on rahul (executor 1) (65/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 67.0 in stage 0.0 (TID 67, rahul, executor 1, partition 67, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 66.0 in stage 0.0 (TID 66) in 55 ms on rahul (executor 1) (66/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 68.0 in stage 0.0 (TID 68, rahul, executor 1, partition 68, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 67.0 in stage 0.0 (TID 67) in 60 ms on rahul (executor 1) (67/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 69.0 in stage 0.0 (TID 69, rahul, executor 1, partition 69, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 68.0 in stage 0.0 (TID 68) in 57 ms on rahul (executor 1) (68/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 70.0 in stage 0.0 (TID 70, rahul, executor 1, partition 70, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 69.0 in stage 0.0 (TID 69) in 61 ms on rahul (executor 1) (69/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 71.0 in stage 0.0 (TID 71, rahul, executor 1, partition 71, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 70.0 in stage 0.0 (TID 70) in 47 ms on rahul (executor 1) (70/100)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Starting task 72.0 in stage 0.0 (TID 72, rahul, executor 1, partition 72, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:43 INFO  TaskSetManager:54 - Finished task 71.0 in stage 0.0 (TID 71) in 66 ms on rahul (executor 1) (71/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 73.0 in stage 0.0 (TID 73, rahul, executor 1, partition 73, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 72.0 in stage 0.0 (TID 72) in 65 ms on rahul (executor 1) (72/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 74.0 in stage 0.0 (TID 74, rahul, executor 1, partition 74, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 73.0 in stage 0.0 (TID 73) in 59 ms on rahul (executor 1) (73/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 75.0 in stage 0.0 (TID 75, rahul, executor 1, partition 75, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 74.0 in stage 0.0 (TID 74) in 86 ms on rahul (executor 1) (74/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 76.0 in stage 0.0 (TID 76, rahul, executor 1, partition 76, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 75.0 in stage 0.0 (TID 75) in 122 ms on rahul (executor 1) (75/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 77.0 in stage 0.0 (TID 77, rahul, executor 1, partition 77, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 76.0 in stage 0.0 (TID 76) in 61 ms on rahul (executor 1) (76/100)
2019-11-15 17:44:44 INFO  BlockManagerInfo:54 - Added broadcast_0_piece0 in memory on rahul:37023 (size: 1243.0 B, free: 366.3 MB)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 78.0 in stage 0.0 (TID 78, rahul, executor 1, partition 78, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 77.0 in stage 0.0 (TID 77) in 95 ms on rahul (executor 1) (77/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 79.0 in stage 0.0 (TID 79, rahul, executor 1, partition 79, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 78.0 in stage 0.0 (TID 78) in 53 ms on rahul (executor 1) (78/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 80.0 in stage 0.0 (TID 80, rahul, executor 1, partition 80, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 79.0 in stage 0.0 (TID 79) in 56 ms on rahul (executor 1) (79/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 81.0 in stage 0.0 (TID 81, rahul, executor 1, partition 81, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 80.0 in stage 0.0 (TID 80) in 39 ms on rahul (executor 1) (80/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 82.0 in stage 0.0 (TID 82, rahul, executor 1, partition 82, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 81.0 in stage 0.0 (TID 81) in 59 ms on rahul (executor 1) (81/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 83.0 in stage 0.0 (TID 83, rahul, executor 1, partition 83, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 82.0 in stage 0.0 (TID 82) in 74 ms on rahul (executor 1) (82/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 84.0 in stage 0.0 (TID 84, rahul, executor 1, partition 84, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 83.0 in stage 0.0 (TID 83) in 50 ms on rahul (executor 1) (83/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 85.0 in stage 0.0 (TID 85, rahul, executor 1, partition 85, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 84.0 in stage 0.0 (TID 84) in 49 ms on rahul (executor 1) (84/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 86.0 in stage 0.0 (TID 86, rahul, executor 1, partition 86, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 85.0 in stage 0.0 (TID 85) in 68 ms on rahul (executor 1) (85/100)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Starting task 87.0 in stage 0.0 (TID 87, rahul, executor 1, partition 87, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:44 INFO  TaskSetManager:54 - Finished task 86.0 in stage 0.0 (TID 86) in 92 ms on rahul (executor 1) (86/100)
2019-11-15 17:44:45 INFO  TaskSetManager:54 - Starting task 88.0 in stage 0.0 (TID 88, rahul, executor 1, partition 88, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:45 INFO  TaskSetManager:54 - Finished task 87.0 in stage 0.0 (TID 87) in 106 ms on rahul (executor 1) (87/100)
2019-11-15 17:44:45 INFO  TaskSetManager:54 - Starting task 89.0 in stage 0.0 (TID 89, rahul, executor 1, partition 89, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:45 INFO  TaskSetManager:54 - Finished task 88.0 in stage 0.0 (TID 88) in 53 ms on rahul (executor 1) (88/100)
^C2019-11-15 17:44:45 INFO  SparkContext:54 - Invoking stop() from shutdown hook
2019-11-15 17:44:45 INFO  AbstractConnector:318 - Stopped Spark@d816dde{HTTP/1.1,[http/1.1]}{0.0.0.0:4040}
2019-11-15 17:44:45 INFO  SparkUI:54 - Stopped Spark web UI at http://rahul:4040
2019-11-15 17:44:45 INFO  DAGScheduler:54 - Job 0 failed: reduce at SparkPi.scala:38, took 11.674416 s
Exception in thread "main" org.apache.spark.SparkException: Job 0 cancelled because SparkContext was shut down
	at org.apache.spark.scheduler.DAGScheduler$$anonfun$cleanUpAfterSchedulerStop$1.apply(DAGScheduler.scala:837)
	at org.apache.spark.scheduler.DAGScheduler$$anonfun$cleanUpAfterSchedulerStop$1.apply(DAGScheduler.scala:835)
	at scala.collection.mutable.HashSet.foreach(HashSet.scala:78)
	at org.apache.spark.scheduler.DAGScheduler.cleanUpAfterSchedulerStop(DAGScheduler.scala:835)
	at org.apache.spark.scheduler.DAGSchedulerEventProcessLoop.onStop(DAGScheduler.scala:1900)
	at org.apache.spark.util.EventLoop.stop(EventLoop.scala:83)
	at org.apache.spark.scheduler.DAGScheduler.stop(DAGScheduler.scala:1813)
	at org.apache.spark.SparkContext$$anonfun$stop$8.apply$mcV$sp(SparkContext.scala:1931)
	at org.apache.spark.util.Utils$.tryLogNonFatalError(Utils.scala:1361)
	at org.apache.spark.SparkContext.stop(SparkContext.scala:1930)
	at org.apache.spark.SparkContext$$anonfun$2.apply$mcV$sp(SparkContext.scala:573)
	at org.apache.spark.util.SparkShutdownHook.run(ShutdownHookManager.scala:216)
	at org.apache.spark.util.SparkShutdownHookManager$$anonfun$runAll$1$$anonfun$apply$mcV$sp$1.apply$mcV$sp(ShutdownHookManager.scala:188)
	at org.apache.spark.util.SparkShutdownHookManager$$anonfun$runAll$1$$anonfun$apply$mcV$sp$1.apply(ShutdownHookManager.scala:188)
	at org.apache.spark.util.SparkShutdownHookManager$$anonfun$runAll$1$$anonfun$apply$mcV$sp$1.apply(ShutdownHookManager.scala:188)
	at org.apache.spark.util.Utils$.logUncaughtExceptions(Utils.scala:1992)
	at org.apache.spark.util.SparkShutdownHookManager$$anonfun$runAll$1.apply$mcV$sp(ShutdownHookManager.scala:188)
	at org.apache.spark.util.SparkShutdownHookManager$$anonfun$runAll$1.apply(ShutdownHookManager.scala:188)
	at org.apache.spark.util.SparkShutdownHookManager$$anonfun$runAll$1.apply(ShutdownHookManager.scala:188)
	at scala.util.Try$.apply(Try.scala:192)
	at org.apache.spark.util.SparkShutdownHookManager.runAll(ShutdownHookManager.scala:188)
	at org.apache.spark.util.SparkShutdownHookManager$$anon$2.run(ShutdownHookManager.scala:178)
	at org.apache.hadoop.util.ShutdownHookManager$1.run(ShutdownHookManager.java:54)
	at org.apache.spark.scheduler.DAGScheduler.runJob(DAGScheduler.scala:642)
	at org.apache.spark.SparkContext.runJob(SparkContext.scala:2034)
	at org.apache.spark.SparkContext.runJob(SparkContext.scala:2131)
	at org.apache.spark.rdd.RDD$$anonfun$reduce$1.apply(RDD.scala:1035)
	at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:151)
	at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:112)
	at org.apache.spark.rdd.RDD.withScope(RDD.scala:363)
	at org.apache.spark.rdd.RDD.reduce(RDD.scala:1017)
	at org.apache.spark.examples.SparkPi$.main(SparkPi.scala:38)
	at org.apache.spark.examples.SparkPi.main(SparkPi.scala)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.apache.spark.deploy.JavaMainApplication.start(SparkApplication.scala:52)
	at org.apache.spark.deploy.SparkSubmit$.org$apache$spark$deploy$SparkSubmit$$runMain(SparkSubmit.scala:890)
	at org.apache.spark.deploy.SparkSubmit$.doRunMain$1(SparkSubmit.scala:192)
	at org.apache.spark.deploy.SparkSubmit$.submit(SparkSubmit.scala:217)
	at org.apache.spark.deploy.SparkSubmit$.main(SparkSubmit.scala:137)
	at org.apache.spark.deploy.SparkSubmit.main(SparkSubmit.scala)
2019-11-15 17:44:45 INFO  DAGScheduler:54 - ResultStage 0 (reduce at SparkPi.scala:38) failed in 11.541 s due to Stage cancelled because SparkContext was shut down
2019-11-15 17:44:45 INFO  YarnClientSchedulerBackend:54 - Interrupting monitor thread
2019-11-15 17:44:45 INFO  TaskSetManager:54 - Starting task 90.0 in stage 0.0 (TID 90, rahul, executor 1, partition 90, PROCESS_LOCAL, 7864 bytes)
2019-11-15 17:44:45 INFO  TaskSetManager:54 - Finished task 89.0 in stage 0.0 (TID 89) in 256 ms on rahul (executor 1) (89/100)
2019-11-15 17:44:45 INFO  YarnClientSchedulerBackend:54 - Shutting down all executors
2019-11-15 17:44:45 INFO  YarnSchedulerBackend$YarnDriverEndpoint:54 - Asking each executor to shut down
2019-11-15 17:44:45 INFO  SchedulerExtensionServices:54 - Stopping SchedulerExtensionServices
(serviceOption=None,
 services=List(),
 started=false)
2019-11-15 17:44:45 INFO  YarnClientSchedulerBackend:54 - Stopped
2019-11-15 17:44:45 ERROR TransportRequestHandler:209 - Error while invoking RpcHandler#receive() for one-way message.
org.apache.spark.SparkException: Could not find CoarseGrainedScheduler.
	at org.apache.spark.rpc.netty.Dispatcher.postMessage(Dispatcher.scala:160)
	at org.apache.spark.rpc.netty.Dispatcher.postOneWayMessage(Dispatcher.scala:140)
	at org.apache.spark.rpc.netty.NettyRpcHandler.receive(NettyRpcEnv.scala:655)
	at org.apache.spark.network.server.TransportRequestHandler.processOneWayMessage(TransportRequestHandler.java:207)
	at org.apache.spark.network.server.TransportRequestHandler.handle(TransportRequestHandler.java:113)
	at org.apache.spark.network.server.TransportChannelHandler.channelRead(TransportChannelHandler.java:118)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at io.netty.handler.timeout.IdleStateHandler.channelRead(IdleStateHandler.java:286)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:102)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at org.apache.spark.network.util.TransportFrameDecoder.channelRead(TransportFrameDecoder.java:85)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1359)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:935)
	at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:138)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:645)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:580)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:497)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:459)
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:858)
	at io.netty.util.concurrent.DefaultThreadFactory$DefaultRunnableDecorator.run(DefaultThreadFactory.java:138)
	at java.lang.Thread.run(Thread.java:748)
2019-11-15 17:44:45 INFO  MapOutputTrackerMasterEndpoint:54 - MapOutputTrackerMasterEndpoint stopped!
2019-11-15 17:44:45 INFO  MemoryStore:54 - MemoryStore cleared
2019-11-15 17:44:45 INFO  BlockManager:54 - BlockManager stopped
2019-11-15 17:44:45 INFO  BlockManagerMaster:54 - BlockManagerMaster stopped
2019-11-15 17:44:45 INFO  OutputCommitCoordinator$OutputCommitCoordinatorEndpoint:54 - OutputCommitCoordinator stopped!
2019-11-15 17:44:45 ERROR TransportRequestHandler:209 - Error while invoking RpcHandler#receive() for one-way message.
org.apache.spark.rpc.RpcEnvStoppedException: RpcEnv already stopped.
	at org.apache.spark.rpc.netty.Dispatcher.postMessage(Dispatcher.scala:158)
	at org.apache.spark.rpc.netty.Dispatcher.postOneWayMessage(Dispatcher.scala:140)
	at org.apache.spark.rpc.netty.NettyRpcHandler.receive(NettyRpcEnv.scala:655)
	at org.apache.spark.network.server.TransportRequestHandler.processOneWayMessage(TransportRequestHandler.java:207)
	at org.apache.spark.network.server.TransportRequestHandler.handle(TransportRequestHandler.java:113)
	at org.apache.spark.network.server.TransportChannelHandler.channelRead(TransportChannelHandler.java:118)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at io.netty.handler.timeout.IdleStateHandler.channelRead(IdleStateHandler.java:286)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:102)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at org.apache.spark.network.util.TransportFrameDecoder.channelRead(TransportFrameDecoder.java:85)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1359)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:935)
	at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:138)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:645)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:580)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:497)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:459)
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:858)
	at io.netty.util.concurrent.DefaultThreadFactory$DefaultRunnableDecorator.run(DefaultThreadFactory.java:138)
	at java.lang.Thread.run(Thread.java:748)
2019-11-15 17:44:45 INFO  SparkContext:54 - Successfully stopped SparkContext
2019-11-15 17:44:45 INFO  ShutdownHookManager:54 - Shutdown hook called
2019-11-15 17:44:45 INFO  ShutdownHookManager:54 - Deleting directory /tmp/spark-b92a9ea0-926d-410c-99ee-2857ec8e8676
2019-11-15 17:44:45 INFO  ShutdownHookManager:54 - Deleting directory /tmp/spark-711df588-24f9-4ba7-a142-eefe342a55ad
```
