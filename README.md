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
You can pass some optional parameters to the constructor:<br>
 * @param `listOfItems` is the list of elements that we want to display in the recycler. By default, an empty list is passed to the constructor.
 * @param `onClick` is lambda that specifies the action when clicked. By default is Unit.
 * @param `item` is view of single element in recycler. By default it is simple TextView.

And then just adjust recycler, for example like this:
```kotlin
 binding.recycler_view_id.apply {
    layoutManager = LinearLayoutManager(this)
    adapter = customAdapter
}
```
