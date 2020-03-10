# sorter

## Description

This Program reads a list on name from a external file and sorts them on the basis of last name and given name respectively.

## Prerequisite
 - java 8

## Setup
make the `setup` and `name-sorter` executable
 ```shell script
$ chmod +x setup
$ chmod +x name-sorter
```
 - run setup to tests and generate an executable jar `source ./setup` 
 - run name-sorter to execute the program `name-sorter ./unsorted-names-list.txt`

## Test
```shell script
$ ./gradlew clean test
```

## Build
```shell script
$ ./gradlew build
```

## Execute
```shell script
$ java -jar ./build/libs/sorter.jar ./unsorted-names-list.txt
```

