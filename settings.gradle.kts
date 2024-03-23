pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        //jitpack
        maven { url=uri("https://www.jitpack.io")}
        //配置国内的仓库
        maven { url=uri("https://maven.aliyun.com/repository/public")}
        maven { url=uri("https://maven.aliyun.com/repository/gradle-plugin")}
        maven { url=uri("https://maven.aliyun.com/repository/central")}
        //maven { url=uri("https://maven.aliyun.com/repository/google")}

    }
}

rootProject.name = "android_mvp_kotlin"
include(":app")
include(":library:verticaltablayout")
