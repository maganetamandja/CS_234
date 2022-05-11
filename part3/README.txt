Compiling instruction

1-

javac FinalProjectApp.java

this will generate class files
Please make sure that anonymous inner classes are generated and match the one in the jar package.

2-
jar cmf MANIFEST.MF myApp.jar *
this will put all the files into the jar package

3-
java -jar myApp.jar

this will run the app

