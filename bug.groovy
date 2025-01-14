```groovy
def myMethod(String str) {
    if (str == null) {
        return "Null String"
    } else if (str.isEmpty()) {
        return "Empty String"
    } else {
        return "Non-empty String: "+ str
    }
}

println myMethod(null) // Output: Null String
println myMethod("")   //Output: Empty String
println myMethod("hello")//Output: Non-empty String: hello

// The unexpected behavior happens when we use a different method to check for null or empty string:

def myMethod2(String str) {
    if (!str) {
        return "Null or Empty String"
    } else {
        return "Non-empty String: "+ str
    }
}

println myMethod2(null) // Output: Null or Empty String
println myMethod2("")   // Output: Non-empty String: 
println myMethod2("hello")//Output: Non-empty String: hello
```