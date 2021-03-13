package com.demo.retrofitexampleapp.repository

import com.demo.retrofitexampleapp.api.RetrofitInstance
import com.demo.retrofitexampleapp.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost(): Response<Post> {
       return RetrofitInstance.api.getPost()
    }


    suspend fun getPost2(postNumber: Int):Response<Post>{
        return RetrofitInstance.api.getPost2(postNumber)
    }

    suspend fun getCustomPosts(userId :Int,sort:String,order:String):Response<List<Post>> {
        return RetrofitInstance.api.getCustomPost(userId,sort,order)
    }

    suspend fun getCustomPosts2(userId :Int,options:Map<String,String>):Response<List<Post>>{
        return RetrofitInstance.api.getCustomPost2(userId, options)
    }

    suspend fun pushPost(post: Post):Response<Post> {
        return RetrofitInstance.api.pushPost(post)
    }

    suspend fun pushPost2(userId :Int,id :Int,title :String,body:String):Response<Post>
    {
        return RetrofitInstance.api.pushPost2(userId, id, title, body)
    }
}