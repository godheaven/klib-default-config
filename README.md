# klib-default-config

Maven library that centralizes shared configuration resources for Kanopus projects.

It currently publishes configuration artifacts (for example, Java formatting style) so other repositories can reuse a single source of truth.

## Contents

- `pom.xml`: Maven artifact metadata.
- `src/main/resources/kanopus-style.xml`: Java formatting profile `Kanopus Style`.

## Maven Coordinates

```xml
<dependency>
    <groupId>cl.kanopus.util</groupId>
    <artifactId>klib-default-config</artifactId>
    <version>4.06.3</version>
</dependency>
```

> If your organization publishes a different version, replace `4.05.2` with the version available in your Maven repository.

## Recommended Usage

- Use this artifact as a dependency to share configurations across modules.
- Reference `classpath` files according to the tool that consumes the resource (for example, formatter/linter).
- Avoid duplicating style files in each repository.

## Local Development

Build the project:

```bash
mvn clean verify
```

Publish to a Maven repository (according to your `settings.xml` and pipeline):

```bash
mvn clean deploy
```
