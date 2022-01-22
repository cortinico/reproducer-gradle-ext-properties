rootProject.name = "reproducer-gradle-ext-properties"

val foo: String? by extra

// Prints null
println(foo)

// Crashes with: Cannot get property 'foo' on extra properties extension as it does not exist
println(extra["foo"])
