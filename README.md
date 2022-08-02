Running the application in the JVM causes the `MyConfig#setEmbeddedValueResolver` to be called first and `MyConfig#setImportMetadata` second.

If using `./gradlew nativeCompile` and running the native-compiled binary, the order of the invocations switch. 
