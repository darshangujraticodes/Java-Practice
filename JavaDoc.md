# To Run Java File

1. In cmd track down files
2. Then convert java file in `.class` file also called binary files which is generated after java code compilation, java compiler code is `javac filename.java` eg. `javac MyApp.java`
3. Then direct run the `.class` file with command `java filename` note only file name no extension eg. `java MyApp`

### Java Class uses PascalCaseNotation "class MyApp{}"

### Java function uses camelCaseNotation "void sendEmail()"

### Java 2 types of data type

1.  Primitive : It is simple basic to use and store direct value

    - byte
    - int
    - long
    - float
    - char
    - boolean

    - Tabular data with memeory storage

Primary data types consist of 4 types only but is segrgated more in subtypes

|        Type        | Memory Bytes |         Purpose          |        SubTypes        |
| :----------------: | :----------: | :----------------------: | :--------------------: |
|      Integer       |      4       |    store numeric data    | byte, long, short, int |
|       float        |      4       |    store decimal data    |     float, double      |
| Charachters (char) |      4       | store single letter data |          char          |
|      Boolean       |      4       |  store true/false data   |        boolean         |

|    Type     | Memory Bytes |                          Purpose                          |    Range     |           Example           |
| :---------: | :----------: | :-------------------------------------------------------: | :----------: | :-------------------------: |
|    byte     |      1       |                    store numeric data                     | [-128 , 127] |       `byte num = 1;`       |
|    short    |      2       |                    store numeric data                     |  [-32K,32K]  |          `short `           |
|     int     |      4       |                    store integer data                     |  [-2B, 2B]   |       `int num = 454`       |
|    long     |      8       |  store numeric data with bigger range capacity than int   |              | `long num = 5656565265222L` |
|    float    |      4       |                    store decimal data                     |              |   `float num = 544.543F`    |
|   double    |      8       |            store larger decimal data (default)            |              |    `double = 5435.5454`     |
| charachters |      2       | store single letter data (only single inverted comma ' ') |              |     `char letter = 'D'`     |
|   string    |      8       |            store collections of harachter data            |              |  `String name = "Darshan"`  |
|   boolean   |      1       |                 store true or false data                  |              |  `boolean isVerify= true`   |

2.  Non Primitive Also called reference types
