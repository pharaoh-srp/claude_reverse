package defpackage;

import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.api.chat.citation.CitationSource;
import com.anthropic.claude.api.chat.tool.GenericSourceMetadata;
import com.anthropic.claude.api.chat.tool.GoogleDocMetadata;
import com.anthropic.claude.api.chat.tool.RichItem;
import com.anthropic.claude.api.chat.tool.SourceMetadata;
import com.anthropic.claude.api.chat.tool.ToolResultKnowledge;
import com.anthropic.claude.api.chat.tool.UnknownSourceMetadata;
import com.anthropic.claude.api.chat.tool.WebpageMetadata;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.tool.model.SourceImage;
import com.anthropic.claude.tool.model.a;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class wq9 {
    public static KnowledgeSource a(Citation citation) {
        citation.getClass();
        List<CitationSource> sources = citation.getSources();
        String title = null;
        CitationSource citationSource = sources != null ? (CitationSource) w44.N0(sources) : null;
        if (citationSource != null) {
            return b(citationSource, citation.isTrusted());
        }
        String strI = jpi.i(citation.getMetadata());
        String url = citation.getUrl();
        SourceMetadata metadata = citation.getMetadata();
        if ((metadata instanceof GoogleDocMetadata) || (metadata instanceof WebpageMetadata)) {
            title = citation.getTitle();
        } else if (metadata instanceof GenericSourceMetadata) {
            title = ((GenericSourceMetadata) metadata).getPreview_title();
            if (title == null) {
                title = citation.getTitle();
            }
        } else if (metadata instanceof UnknownSourceMetadata) {
            title = citation.getTitle();
        } else if (metadata != null) {
            wg6.i();
            return null;
        }
        String str = title;
        String strG = jpi.g(citation.getSubtitles());
        a aVar = SourceImage.Companion;
        SourceMetadata metadata2 = citation.getMetadata();
        aVar.getClass();
        return new KnowledgeSource(url, str, strG, a.a(metadata2, strI), strI, jpi.h(citation.getMetadata()), null, citation.isTrusted());
    }

    public static KnowledgeSource b(CitationSource citationSource, boolean z) {
        citationSource.getClass();
        String url = citationSource.getUrl();
        String title = citationSource.getTitle();
        String strG = jpi.g(citationSource.getSubtitles());
        SourceImage.Companion.getClass();
        String icon_url = citationSource.getIcon_url();
        return new KnowledgeSource(url, title, strG, icon_url != null ? new SourceImage.Url(icon_url, citationSource.getSource()) : new SourceImage.Text(quk.i(citationSource.getSource())), citationSource.getSource(), citationSource.getResource_type(), citationSource.getContent_body(), z);
    }

    public static KnowledgeSource c(RichItem richItem, boolean z) {
        richItem.getClass();
        String url = richItem.getUrl();
        String title = richItem.getTitle();
        String strG = jpi.g(richItem.getSubtitles());
        SourceImage.Companion.getClass();
        String icon_url = richItem.getIcon_url();
        return new KnowledgeSource(url, title, strG, icon_url != null ? new SourceImage.Url(icon_url, richItem.getSource()) : new SourceImage.Text(quk.i(richItem.getSource())), richItem.getSource(), richItem.getResource_type(), null, z);
    }

    public static KnowledgeSource d(ToolResultKnowledge toolResultKnowledge) {
        toolResultKnowledge.getClass();
        String strI = jpi.i(toolResultKnowledge.getMetadata());
        String url = toolResultKnowledge.getUrl();
        String title = toolResultKnowledge.getTitle();
        a aVar = SourceImage.Companion;
        SourceMetadata metadata = toolResultKnowledge.getMetadata();
        aVar.getClass();
        return new KnowledgeSource(url, title, null, a.a(metadata, strI), strI, jpi.h(toolResultKnowledge.getMetadata()), null, true);
    }

    public final KSerializer serializer() {
        return vq9.a;
    }
}
