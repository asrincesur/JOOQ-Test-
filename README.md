Adjust the database connection string in the jOOQ plugin located at the bottom of the pom.xml file. 
Nextly, Run "mvn clean install" command. 

The code snippet bellow tells to where the generated source will be located

<target>
<packageName>org.jooq.generated</packageName>
<directory>target/generated-sources/jooq</directory>
</target>

jooq generates for all of necessary dto class and entity class designated package. 
