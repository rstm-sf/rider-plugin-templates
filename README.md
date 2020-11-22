# rider-plugin-templates
.NET templates for Rider plugin

## About

This repository contains the templates for Rider plugin. Based on repositories: [resharper-rider-plugin](https://github.com/JetBrains/resharper-rider-plugin) and [AvaloniaRider](https://github.com/ForNeVeR/AvaloniaRider).

## How use it?

An easy way to pack from source code is to use the [Git](https://git-scm.com/downloads) and the [.NET Core SDK 3.1](https://dotnet.microsoft.com/download/dotnet-core/3.1) as follows:

```sh
$ git clone https://github.com/rstm-sf/rider-plugin-templates.git && cd rider-plugin-templates

$ dotnet pack
$ dotnet new -i ./bin/Rider.Plugin.Templates.0.0.1.nupkg

$ mkdir temp && cd temp
$ dotnet new rider-plugin --sdk3

$ ./gradlew buildPlugin

$ dotnet new -u Rider.Plugin.Templates
```
