
# Swagger generated API stub sample

This project is only used to test improvements to
[Swagger-codegen](https://github.com/nicusX/swagger-codegen/tree/feature/spring-improve-ci-integration)
project in [https://github.com/nicusX/swagger-codegen/tree/feature/spring-improve-ci-integration]
(at the time of writing, a [PR](https://github.com/nicusX/swagger-codegen/tree/feature/spring-improve-ci-integration)
is pending on the main project).

The fix is meant to solve this issue: https://github.com/swagger-api/swagger-codegen/issues/5542


Modifications involves only `language=spring` and generating with
`interfaceOnly=true`.

It also adds a new `swaggerDocketConfig` boolean parameter, to generate
the SwaggerDocket Spring configuration file.