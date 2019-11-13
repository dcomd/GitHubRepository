package com.alexandre.apigithub.data.repository


import com.alexandre.apigithub.data.model.GitHubModel
import com.alexandre.apigithub.data.model.GitHubModelDb

class FactoryModel {

    fun factory(gitHubModel: List<GitHubModel>): List<GitHubModelDb> {
        val list: MutableList<GitHubModelDb> = mutableListOf()

        for (item in gitHubModel) {

            val gitHubModelDb = GitHubModelDb(

                name = item.name,
                full_name = item.full_name,
                stargazers_count = item.stargazers_count,
                forks_count = item.forks_count,
                login = item.gitHubOwner.login,
                avatar_url = item.gitHubOwner.avatar_url

            )

            list.add(gitHubModelDb)
        }
        return list
    }
}