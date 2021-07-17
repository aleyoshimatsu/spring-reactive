package dev.alexandreyoshimatsu.springreactive.model

data class Response(
    val postId: Int,
    val userId: Int,
    val title: String,
    val comments: List<LightComment>
)