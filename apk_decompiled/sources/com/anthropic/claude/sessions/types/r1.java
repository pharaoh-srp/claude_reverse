package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.StdinMessage;
import defpackage.ch9;
import defpackage.jce;
import defpackage.s06;
import defpackage.sg9;
import defpackage.sz6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends sg9 {
    public static final r1 c = new r1(jce.a.b(StdinMessage.class));

    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        KSerializer kSerializerSerializer;
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "type");
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        if (content != null) {
            int iHashCode = content.hashCode();
            if (iHashCode != 3599307) {
                if (iHashCode != 1010651565) {
                    if (iHashCode == 1318361315 && content.equals("control_response")) {
                        kSerializerSerializer = StdinMessage.ControlResponse.Companion.serializer();
                        return kSerializerSerializer;
                    }
                } else if (content.equals("control_request")) {
                    kSerializerSerializer = StdinMessage.ControlRequest.Companion.serializer();
                    return kSerializerSerializer;
                }
            } else if (content.equals("user")) {
                kSerializerSerializer = StdinMessage.SdkUserMessage.Companion.serializer();
                return kSerializerSerializer;
            }
        }
        sz6.p("Unknown StdinMessage type");
        return null;
    }
}
