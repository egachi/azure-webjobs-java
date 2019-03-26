# azure-webjobs-java
### Quick sample to configure a java webjob with parameters
------

In this example you can create a **run.bat** with the following syntax and use pass the java parameters you prefer:

```batch
set PATH=%PATH%;%JAVA_HOME%/bin
java -Xmx1024m -jar helloworld.jar 
```

> Zip all run.bat with your jar and upload it to azure webjob...

Web Job Reference: [https://docs.microsoft.com/en-us/azure/app-service/webjobs-create](https://docs.microsoft.com/en-us/azure/app-service/webjobs-create) 
