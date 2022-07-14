Add this to your maven `~/.m2/settings.xml` file.

```XML
<servers>
    <server>
        <id>github</id>
        <username>USERNAME</username>
        <password>TOKEN</password>
    </server>
</servers>
```

Next, add this to your repositories

```XML
<repositories>
    ...
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/beanbeanjuice/Java-Kawaii-API-Wrapper</url>
    </repository>
    ...
</repositories>
```

Then click on the "packages" icon and install from there!
