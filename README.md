# CustomRecyclerModule
[![](https://jitpack.io/v/AndreiGrek/CustomRecyclerModule.svg)](https://jitpack.io/#AndreiGrek/CustomRecyclerModule)

### Dependencies
In `build.gradle` module level add dependency:
```groovy
implementation: 'com.github.AndreiGrek:CustomRecyclerModule:x.y.z'
```
In `settings.gradle` add `mavenCentral()` repository:
``` groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
```
### Activity
In Activity/Fragment it is necessary to create instanse of `customAdapter`:
``` kotlin
private val customAdapter = CustomRecyclerAdapter()
```
You can pass a `List` of strings (an optional parameter) to the constructor, as well as a lambda with a function that will be called when the element is clicked (an optional parameter).<br>

And then just adjust recycler, for example like this:
```kotlin
 binding.recycler_view_id.apply {
    layoutManager = LinearLayoutManager(this)
    adapter = customAdapter
}
```
