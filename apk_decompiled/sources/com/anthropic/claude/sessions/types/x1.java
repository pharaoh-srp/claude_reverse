package com.anthropic.claude.sessions.types;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.sessions.types.StdoutMessage;
import defpackage.ch9;
import defpackage.jce;
import defpackage.s06;
import defpackage.sg9;
import defpackage.x44;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends sg9 {
    public static final x1 c = new x1(jce.a.b(StdoutMessage.class));

    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) VerifyResponse.AuthenticationState.DISCRIMINATOR);
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        return x44.r(content, "sdk_message") ? StdoutMessage.SdkMessage.Companion.serializer() : x44.r(content, "control_response") ? StdoutMessage.ControlResponse.Companion.serializer() : StdoutMessage.Unknown.Companion.serializer();
    }
}
