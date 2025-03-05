package com.example.second

import kotlinx.serialization.Serializable

@Serializable
data class YouTubeResponse(
    val items: List<PlaylistItem>
)

@Serializable
data class PlaylistItem(
    val snippet: Snippet
)

@Serializable
data class Snippet(
    val title: String,
    val thumbnails: Thumbnails,
    val resourceId: ResourceId
)

@Serializable
data class Thumbnails(
    val default: Thumbnail
)

@Serializable
data class Thumbnail(
    val url: String
)

@Serializable
data class ResourceId(
    val videoId: String
)
