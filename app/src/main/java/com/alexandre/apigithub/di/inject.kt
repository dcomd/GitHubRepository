package com.alexandre.apigithub.di

import com.alexandre.apigithub.data.RetrofitInstanceGit
import com.alexandre.apigithub.data.repository.GitHubRepository
import com.alexandre.apigithub.ui.viewMocel.ViewModelGitHubAp
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    single { GitHubRepository() }
    viewModel { ViewModelGitHubAp(get()) }
    single { RetrofitInstanceGit }
}
