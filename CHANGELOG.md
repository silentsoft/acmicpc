# 1.1.2 (8 Sep 2021)

## Enhancements
- Update `leetcode.com` code template.
- Add stopwatch dependency.

# 1.1.1 (6 Sep 2021)

## Enhancements
- Add JUnit dependency.

# 1.1.0 (5 Sep 2021)

## New Features
- Add `site` property.

## Usages
```
$ ./mvnw -N acmicpc:create -Dproblem=two-sum -Dsite=leetcode.com
```

# 1.0.0 (19 May 2021)

## Usages
- Creating a problem
  ```
  $ ./mvnw -N acmicpc:create -Dproblem=1234 
  ```
- Creating a problem with specific template
  ```
  $ ./mvnw -N acmicpc:create -Dproblem=1234 -Dtemplate=specific
  ```
- Revalidating project
  ```
  $ ./mvnw -N acmicpc:revalidate
  ```