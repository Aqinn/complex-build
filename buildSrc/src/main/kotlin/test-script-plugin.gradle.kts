import java.util.Properties

plugins {
//    id("com.aqinn.demo.agp.plugin.testktplugin")
}

val propFile = File(project.rootProject.rootDir, "local.properties")
val localProperties = Properties()
if (propFile.exists()) {
    localProperties.load(propFile.inputStream())
}
val arg1 = if (propFile.exists()) localProperties["test-script-plugin.arg1"].toString() else ""
val arg2 = if (propFile.exists()) localProperties["test-script-plugin.arg2"].toString() else ""

println("arg1: $arg1")
println("arg2: $arg2")

