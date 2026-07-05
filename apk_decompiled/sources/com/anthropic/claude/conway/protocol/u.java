package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.ContentBlock;
import defpackage.ch9;
import defpackage.jce;
import defpackage.s06;
import defpackage.sg9;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends sg9 {
    public static final u c = new u(jce.a.b(ContentBlock.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "type");
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        if (content != null) {
            switch (content.hashCode()) {
                case -1912254500:
                    if (content.equals("server_tool_use")) {
                        return ContentBlock.ServerToolUse.Companion.serializer();
                    }
                    break;
                case -983248288:
                    if (content.equals("tool_use")) {
                        return ContentBlock.ToolUse.Companion.serializer();
                    }
                    break;
                case -371072860:
                    if (content.equals("tool_result")) {
                        return ContentBlock.ToolResult.Companion.serializer();
                    }
                    break;
                case 3556653:
                    if (content.equals("text")) {
                        return ContentBlock.Text.Companion.serializer();
                    }
                    break;
                case 100313435:
                    if (content.equals("image")) {
                        return ContentBlock.Image.Companion.serializer();
                    }
                    break;
                case 503733080:
                    if (content.equals("web_search_tool_result")) {
                        return ContentBlock.WebSearchToolResult.Companion.serializer();
                    }
                    break;
                case 1224578480:
                    if (content.equals("thinking")) {
                        return ContentBlock.Thinking.Companion.serializer();
                    }
                    break;
            }
        }
        return ContentBlock.Unknown.INSTANCE.serializer();
    }
}
