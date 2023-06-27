# what is ArrayList ?
The ArrayList class is a resizable array, which can be found in the java.util package. The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one).

In Java, we use the `ArrayList` class to implement the functionality of resizable-arrays.

It implements the `List` interface of the collections framework.


![Untitled Diagram drawio](https://github.com/sawwalakhepallavi/bootcoding_java/assets/101243878/bda8e8ef-ed66-4d11-819f-9e7ecf64f22d)

## creating a ArrayList

Before using ArrayList, we need to import the `java.util.ArrayList` package first. Here is how we can create arraylists in Java:

```ArrayList<Type> arrayList= new ArrayList<>();```

Here, `Type` indicates the type of an arraylist. For example,

```
// create Integer type arraylist
ArrayList<Integer> arrayList = new ArrayList<>();

// create String type arraylist
ArrayList<String> arrayList = new ArrayList<>()
```
In the above program, we have used `Integer `not int. It is because we cannot use primitive types while creating an arraylist. Instead, we have to use the corresponding wrapper classes.

Here, `Integer` is the corresponding wrapper class of `int`. To learn more, visit the Java wrapper class.

### Create ArrayList in Java

```
import java.util.ArrayList;

class Main {
  public static void main(String[] args){
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("Python");
    languages.add("Swift");
    System.out.println("ArrayList: " + languages);
  }
}
```
### Output
```
ArrayList: [Java, Python, Swift]
```




