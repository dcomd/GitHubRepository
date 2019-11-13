package com.alexandre.apigithub.data.model

data class GitHubModel(val name : String = "",
                       val full_name : String ="",
                       val stargazers_count : Int = 0,
                       val forks_count : Int = 0,
                       var gitHubOwner : GitHubOwner )