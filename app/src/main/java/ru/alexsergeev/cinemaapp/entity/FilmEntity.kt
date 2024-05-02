//package ru.alexsergeev.cinemaapp.entity
//
//import androidx.room.Entity
//import androidx.room.PrimaryKey
//
//@Entity
//data class FilmEntity (
//    @PrimaryKey(autoGenerate = true)
//    val id: Long,
//    val author: String,
//    val authorAvatar: String = "",
//    val content: String,
//    val published: String,
//    val likes: Int = 0,
//    val likedByMe: Boolean = false,
//    val shares: Int = 0,
//    val video: String? = null,
//    var attachment: Attachment? = null,
//    ) {
//    fun toDto() = Post(id, author, authorAvatar, content, published, likes, likedByMe, shares, video, attachment)
//
//    companion object {
//    fun fromDto(post: Post) = PostEntity(
//        id = post.id,
//        author = post.author,
//        content = post.content,
//        published = post.published,
//        likes = post.likes,
//        likedByMe = post.likedByMe,
//        shares = post.shares,
//        video = post.video
//    )
//
//    }
//}