This repository is a autoconfiguration demo

A library is created in this project (autoconfig-lib). It's necessary to execute .`/gradlew publishToMavenLocal`
to upload in mavenLocal.

Four types of configuration are implemented in this project:

- Annotation configuration: 
- Auto configuration:
- Conditional configuration:
- Manual configuration: For manual configuration, it's needed to add this annotation `@Import(ManualMessageConfiguration.class)` in the Application class 

How to configure a library:
1. Add plugins
   ` id 'java-library'
    id 'maven-publish'`
2. ` publishing {
    publications {
    mavenJava(MavenPublication) {
    artifact jar
    }}}`

3. Add `src.main.java `and put it as a source directory
4. Add dependencies of context
  ` compileOnly 'org.springframework:spring-context:5.3.20' 
compileOnly 'org.springframework.boot:spring-boot-autoconfigure:2.7.0'`

References:

https://medium.com/empathyco/how-spring-boot-autoconfiguration-works-6e09f911c5ce