# Jaskell Core

Jaskell Core is a utils library made used scala. It includes a parsec combinators 
library, a SQL helper library and a arithmetic expressions parser.

[Jaskell java8](http://github.com/MarchLiu/jaskell-java8) is a transplant edition for java8 projects.

[![Maven Central](https://img.shields.io/maven-central/v/io.github.marchliu/jaskell-core_2.13.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.marchliu%22%20AND%20a:%22jaskell-core_2.13%22)

# INSTALLATION

## Maven

```xml
<dependency>
  <groupId>io.github.marchliu</groupId>
  <artifactId>jaskell-core_2.13</artifactId>
  <version>0.5.4</version>
</dependency>
```

## Gradle

```groovy
implementation 'io.github.marchliu:jaskell-core_2.13:0.5.4'
```

## Gradle Kotlin

```
implementation("io.github.marchliu:jaskell-core_2.13:0.5.4")
```

## SBT

```sbtshell
libraryDependencies += "io.github.marchliu" % "jaskell-core_2.13" % "0.5.4"
```

## Apache Ivy

```xml
<dependency org="io.github.marchliu" name="jaskell-core_2.13" rev="0.5.4" />
```

## Groovy Grap

```groovy
@Grapes(
  @Grab(group='io.github.marchliu', module='jaskell-core_2.13', version='0.5.4')
)
```

## Leiningen

```clojure
[io.github.marchliu/jaskell-core_2.13 "0.5.4"]
```

## Apache Bluildr

```
'io.github.marchliu:jaskell-core_2.13:jar:0.5.4'
```

## Maven Central Badge

```
[![Maven Central](https://img.shields.io/maven-central/v/io.github.marchliu/jaskell-core_2.13.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.marchliu%22%20AND%20a:%22jaskell-core_2.13%22)
```

## PURL

```
pkg:maven/io.github.marchliu/jaskell-core_2.13@0.5.4
```

### Bazel

```
maven_jar(
    name = "jaskell-core_2.13",
    artifact = "io.github.marchliu:jaskell-core_2.13:0.5.4",
    sha1 = "b58ed93199e445d043949561fdc1fea710d60442",
)
```


# 更新日志

## 0.1

 - 重新实现了 parsec 组件，对有序列表（Seq）和文本提供更有针对性的支持
 
## 0.2

 - 提供了支持位置查询的 txt state
 - State apply string 生成 txt state。
 
## 0.3

 - upgrade to scala 2.13
 - finish sql specs

## 0.4
 
 - add documents for parsec parser
 - bug fixed about statement write action 
 - add <|> adn <?> operator
 - add opt, endBy and sepEndBy
 - fixed int parser bug
 - fixed skipWhitespaces function error
 - add ? operator
 
### 0.4.1

 - add expression parser

### 0.4.2
 
 - fixed a binary bug.
 
### 0.5

 - rewrite all parsec as functional

### 0.5.1
 
 - add ! operator
 
### 0.5.2

 - add parameter expression

### 0.5.3

 - add distinct
 
### 0.5.4

 - bug in not char fixed
 - add injection check spec 
 