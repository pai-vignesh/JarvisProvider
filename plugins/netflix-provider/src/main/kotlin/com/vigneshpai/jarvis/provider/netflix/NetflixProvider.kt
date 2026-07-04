package com.vigneshpai.jarvis.provider.netflix

import com.vigneshpai.jarvis.provider.api.Provider
import com.vigneshpai.jarvis.provider.api.ProviderPlugin
import com.vigneshpai.jarvis.provider.model.ContentType
import com.vigneshpai.jarvis.provider.model.MediaDetails
import com.vigneshpai.jarvis.provider.model.PluginMetadata
import com.vigneshpai.jarvis.provider.model.SearchResult
import com.vigneshpai.jarvis.provider.model.StreamLink
import com.vigneshpai.jarvis.provider.model.SubtitleTrack

/**
 * Plugin entry-point for the Netflix provider.
 *
 * This class is referenced by the JAR manifest attribute `Plugin-Entry-Point`
 * so the Jarvis runtime can instantiate it via reflection.
 */
class NetflixProviderPlugin : ProviderPlugin {

    override val metadata = PluginMetadata(
        id = "provider.netflix",
        name = "Netflix Provider",
        version = "1.0.0",
        description = "Streams content from Netflix",
        author = "Jarvis Team",
        minApiVersion = 1,
        maxApiVersion = 1,
        minAppVersion = "2.0.0",
        supportedTypes = listOf("movie", "series"),
    )

    override fun createProvider(): Provider = NetflixProvider()
}

/**
 * Concrete Netflix [Provider] implementation.
 *
 * Replace the stub bodies below with real HTTP scraping / API calls.
 */
class NetflixProvider : Provider {

    override suspend fun search(query: String): List<SearchResult> {
        // TODO: implement Netflix search
        return emptyList()
    }

    override suspend fun loadDetails(id: String): MediaDetails? {
        // TODO: implement Netflix detail loading
        return null
    }

    override suspend fun loadLinks(mediaId: String, episodeId: String?): List<StreamLink> {
        // TODO: implement Netflix link extraction
        return emptyList()
    }

    override suspend fun loadSubtitles(mediaId: String, episodeId: String?): List<SubtitleTrack> {
        // TODO: implement Netflix subtitle extraction
        return emptyList()
    }
}
