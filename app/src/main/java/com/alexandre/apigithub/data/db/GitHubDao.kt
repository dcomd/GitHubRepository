package com.alexandre.apigithub.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.alexandre.apigithub.data.model.GitHubModelDb

@Dao
interface GitHubDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg gitHubModelDb: GitHubModelDb)

    @Query("SELECT * from TbGitHubb")
    fun selectAll(): MutableList<GitHubModelDb>

    @Query("DELETE FROM TbGitHubb")
    fun deleteAll()
}