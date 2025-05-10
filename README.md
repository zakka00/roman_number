

### Build & Coverage Report
Log finale Maven (ultime 20 righe):
```
[INFO] 
[INFO] --- jacoco:0.8.8:report (report) @ roman-number ---
[INFO] Loading execution data file /home/runner/work/roman_number/roman_number/target/jacoco.exec
[INFO] Analyzed bundle 'roman-number' with 2 classes
[INFO] 
[INFO] --- jacoco:0.8.8:report (default-cli) @ roman-number ---
[INFO] Loading execution data file /home/runner/work/roman_number/roman_number/target/jacoco.exec
[INFO] Analyzed bundle 'roman-number' with 2 classes
[INFO] 
[INFO] --- checkstyle:3.1.2:checkstyle (default-cli) @ roman-number ---
[WARNING] Old version of checkstyle detected. Consider updating to >= v8.30
[WARNING] For more information see: https://maven.apache.org/plugins/maven-checkstyle-plugin/examples/upgrading-checkstyle.html
[INFO] Starting audit...
Audit done.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.209 s
[INFO] Finished at: 2025-05-10T16:26:16Z
[INFO] ------------------------------------------------------------------------
```
Formato CSV della build coverage di JaCoCo:
```
GROUP,PACKAGE,CLASS,INSTRUCTION_MISSED,INSTRUCTION_COVERED,BRANCH_MISSED,BRANCH_COVERED,LINE_MISSED,LINE_COVERED,COMPLEXITY_MISSED,COMPLEXITY_COVERED,METHOD_MISSED,METHOD_COVERED
roman-number,it.unipd.mtss,IntegerToRoman,0,187,1,3,0,8,1,3,0,2
roman-number,it.unipd.mtss,RomanPrinter,3,269,1,7,1,15,2,5,1,2
```
Violazioni Checkstyle:
Errori rilevati: 0

