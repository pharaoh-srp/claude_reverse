package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.ContentBlock;
import defpackage.ch9;
import defpackage.jce;
import defpackage.s06;
import defpackage.sg9;
import defpackage.x44;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends sg9 {
    public static final l c = new l(jce.a.b(ContentBlock.class));

    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "type");
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        return x44.r(content, "text") ? ContentBlock.Text.Companion.serializer() : x44.r(content, "image") ? ContentBlock.Image.Companion.serializer() : ContentBlock.Unknown.Companion.serializer();
    }
}
