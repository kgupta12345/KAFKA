rahul@rahul:~$ hdfs dfs -ls file:///home/rahul/JustFolder/
Found 1 items
-rw-r--r--   1 root root         10 2019-09-29 08:57 file:///home/rahul/JustFolder/justFile.txt
rahul@rahul:~$ hdfs dfs -ls /home/rahul/JustFolder/
ls: `/home/rahul/JustFolder/': No such file or directory
rahul@rahul:~$




rahul@rahul:~$ hdfs dfs -put /home/rahul/JustFolder/justFile.txt /hdfsfolder
rahul@rahul:~$ hdfs dfs -cp /home/rahul/JustFolder/justFile.txt /hdfsfolder
cp: `/home/rahul/JustFolder/justFile.txt': No such file or directory
rahul@rahul:~$ hdfs dfs -cp file:///home/rahul/JustFolder/justFile.txt /hdfsfolder
cp: `/hdfsfolder/justFile.txt': File exists
rahul@rahul:~$ 



rahul@rahul:~$ hdfs dfs -appendToFile file:///home/rahul/JustFolder/justFile.txt /hdfsfolder/justFile.txt
rahul@rahul:~$ hdfs dfs -cat  /hdfsfolder/justFile.txt
Just Text
Just Text-0

Just Text-1

Just Text-2
rahul@rahul:~$ 

rahul@rahul:~/JustFolder$ cat justFile.txt 
Just Text-0

Just Text-1

Just Text-2
