package dev.alexandreyoshimatsu.springreactive.service

import dev.alexandreyoshimatsu.springreactive.model.Comment
import dev.alexandreyoshimatsu.springreactive.model.Post
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux

@Service
class APIService {

    fun fetchComments(postId: Int): Flux<Comment> = fetch("posts/$postId/comments").bodyToFlux(Comment::class.java)

    fun fetchPosts(): Flux<Post> = fetch("/posts").bodyToFlux(Post::class.java)

    private fun fetch(path: String): WebClient.ResponseSpec {
        val client = WebClient.create("http://jsonplaceholder.typicode.com/")
        return client.get().uri(path).retrieve()
    }
}