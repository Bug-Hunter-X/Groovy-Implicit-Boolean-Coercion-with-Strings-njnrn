```groovy
def myMethod(String str) {
    if (str == null || str.isEmpty()) {
        return "Null or Empty String"
    } else {
        return "Non-empty String: "+ str
    }
}

println myMethod(null) // Output: Null or Empty String
println myMethod("")   // Output: Null or Empty String
println myMethod("hello")// Output: Non-empty String: hello
```