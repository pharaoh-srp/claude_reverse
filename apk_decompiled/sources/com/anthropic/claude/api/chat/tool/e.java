package com.anthropic.claude.api.chat.tool;

import com.anthropic.claude.api.chat.tool.Tool;
import defpackage.ch9;
import defpackage.jce;
import defpackage.s06;
import defpackage.sg9;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends sg9 {
    public static final e c = new e(jce.a.b(Tool.class));

    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        jsonElement.getClass();
        return ch9.i(jsonElement).containsKey((Object) "input_schema") ? Tool.CustomTool.Companion.serializer() : Tool.KnownTool.Companion.serializer();
    }
}
