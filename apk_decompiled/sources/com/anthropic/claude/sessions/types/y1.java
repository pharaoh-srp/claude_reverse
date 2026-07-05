package com.anthropic.claude.sessions.types;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.sessions.types.StdoutMessage;
import defpackage.ch9;
import defpackage.gh9;
import defpackage.j8;
import defpackage.kfd;
import defpackage.rfd;
import defpackage.sz6;
import defpackage.zg9;
import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements KSerializer {
    public static final y1 a = new y1();
    public static final rfd b = j8.h("Unknown", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String content;
        decoder.getClass();
        if (!(decoder instanceof zg9)) {
            sz6.p("Failed requirement.");
            return null;
        }
        JsonElement jsonElement = (JsonElement) ch9.i(((zg9) decoder).n()).get((Object) VerifyResponse.AuthenticationState.DISCRIMINATOR);
        if (jsonElement == null || (content = ch9.j(jsonElement).getContent()) == null) {
            content = "unknown";
        }
        return new StdoutMessage.Unknown(content);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StdoutMessage.Unknown unknown = (StdoutMessage.Unknown) obj;
        encoder.getClass();
        unknown.getClass();
        if (!(encoder instanceof gh9)) {
            sz6.p("Failed requirement.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive jsonPrimitiveC = ch9.c(unknown.getKind());
        jsonPrimitiveC.getClass();
        ((gh9) encoder).u(new JsonObject(linkedHashMap));
    }
}
