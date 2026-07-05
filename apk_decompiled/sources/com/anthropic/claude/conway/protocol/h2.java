package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.UserPart;
import defpackage.ch9;
import defpackage.jce;
import defpackage.s06;
import defpackage.sg9;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final class h2 extends sg9 {
    public static final h2 c = new h2(jce.a.b(UserPart.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "type");
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        if (content != null) {
            switch (content.hashCode()) {
                case -1963501277:
                    if (content.equals("attachment")) {
                        return UserPart.Attachment.Companion.serializer();
                    }
                    break;
                case -371072860:
                    if (content.equals("tool_result")) {
                        return UserPart.ToolResult.Companion.serializer();
                    }
                    break;
                case 3202695:
                    if (content.equals("hint")) {
                        return UserPart.Hint.Companion.serializer();
                    }
                    break;
                case 339523873:
                    if (content.equals("user_text")) {
                        return UserPart.UserText.Companion.serializer();
                    }
                    break;
            }
        }
        return UserPart.Unknown.INSTANCE.serializer();
    }
}
