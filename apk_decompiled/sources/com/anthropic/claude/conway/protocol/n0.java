package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.RichMessage;
import defpackage.ch9;
import defpackage.jce;
import defpackage.s06;
import defpackage.sg9;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends sg9 {
    public static final n0 c = new n0(jce.a.b(RichMessage.class));

    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "type");
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        if (content != null) {
            int iHashCode = content.hashCode();
            if (iHashCode != -892481550) {
                if (iHashCode != 3599307) {
                    if (iHashCode == 1429828318 && content.equals("assistant")) {
                        return RichMessage.Assistant.Companion.serializer();
                    }
                } else if (content.equals("user")) {
                    return RichMessage.User.Companion.serializer();
                }
            } else if (content.equals("status")) {
                return RichMessage.Status.Companion.serializer();
            }
        }
        return RichMessage.Unknown.Companion.serializer();
    }
}
