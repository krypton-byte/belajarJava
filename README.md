```
ecj *.java
dx --dex --output=*.dex *.class
dalvikvm -cp *.class class_name
```
