package com.anthropic.claude.artifact.model;

import com.anthropic.claude.artifact.model.ArtifactType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static ArtifactType a(String str) {
        ArtifactType.Text text = ArtifactType.Text.INSTANCE;
        if (str.equals(text.getMimeType())) {
            return text;
        }
        ArtifactType.Markdown markdown = ArtifactType.Markdown.INSTANCE;
        if (str.equals(markdown.getMimeType())) {
            return markdown;
        }
        ArtifactType.Html html = ArtifactType.Html.INSTANCE;
        if (str.equals(html.getMimeType())) {
            return html;
        }
        ArtifactType.Svg svg = ArtifactType.Svg.INSTANCE;
        if (str.equals(svg.getMimeType())) {
            return svg;
        }
        ArtifactType.Code code = ArtifactType.Code.INSTANCE;
        if (str.equals(code.getMimeType())) {
            return code;
        }
        ArtifactType.Mermaid mermaid = ArtifactType.Mermaid.INSTANCE;
        if (str.equals(mermaid.getMimeType())) {
            return mermaid;
        }
        ArtifactType.React react = ArtifactType.React.INSTANCE;
        if (str.equals(react.getMimeType())) {
            return react;
        }
        ArtifactType.Repl repl = ArtifactType.Repl.INSTANCE;
        return str.equals(repl.getMimeType()) ? repl : new ArtifactType.BinaryDocument(str);
    }

    public final KSerializer serializer() {
        return (KSerializer) ArtifactType.$cachedSerializer$delegate.getValue();
    }
}
