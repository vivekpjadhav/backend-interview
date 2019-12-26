### Mystery Duplicates

`EmployeeProcessor` reads in a list of names and social security numbers.

It is supposed to count duplicates, but this code doesn't work.

```
$ javac -cp . EmployeeProcessor.java

$ java EmployeeProcessor employees.csv
JOHN Q PUBLIC: 1
LARS X ULRICH: 1
STEPHANIE L NICKS: 1
JOHN Q PUBLIC: 1
```

Why does John Q Public appear twice?

The expected output is something like this (i.e. not necessarily in the same order, it is the duplicate count that matters):
```
JOHN Q PUBLIC: 2
LARS X ULRICH: 1
STEPHANIE L NICKS: 1
```

Fix the code.