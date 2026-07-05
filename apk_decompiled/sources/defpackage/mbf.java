package defpackage;

import com.anthropic.claude.sessions.types.SdkMessageContent;

/* JADX INFO: loaded from: classes3.dex */
public final class mbf extends sg9 {
    public static final mbf c = new mbf(jce.a.b(SdkMessageContent.class));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    @Override // defpackage.sg9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.s06 a(kotlinx.serialization.json.JsonElement r1) {
        /*
            r0 = this;
            r1.getClass()
            kotlinx.serialization.json.JsonObject r0 = defpackage.ch9.i(r1)
            java.lang.String r1 = "type"
            java.lang.Object r0 = r0.get(r1)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L1a
            kotlinx.serialization.json.JsonPrimitive r0 = defpackage.ch9.j(r0)
            java.lang.String r0 = r0.getContent()
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L86
            int r1 = r0.hashCode()
            switch(r1) {
                case -983248288: goto L76;
                case -882361265: goto L66;
                case -371072860: goto L56;
                case 3556653: goto L46;
                case 100313435: goto L36;
                case 1224578480: goto L26;
                default: goto L24;
            }
        L24:
            goto L86
        L26:
            java.lang.String r1 = "thinking"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2f
            goto L86
        L2f:
            lcf r0 = com.anthropic.claude.sessions.types.SdkThinkingContent.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            goto L8c
        L36:
            java.lang.String r1 = "image"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L86
        L3f:
            ibf r0 = com.anthropic.claude.sessions.types.SdkImageContent.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            goto L8c
        L46:
            java.lang.String r1 = "text"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L86
        L4f:
            hcf r0 = com.anthropic.claude.sessions.types.SdkTextContent.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            goto L8c
        L56:
            java.lang.String r1 = "tool_result"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5f
            goto L86
        L5f:
            pcf r0 = com.anthropic.claude.sessions.types.SdkToolResultContent.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            goto L8c
        L66:
            java.lang.String r1 = "redacted_thinking"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6f
            goto L86
        L6f:
            wbf r0 = com.anthropic.claude.sessions.types.SdkRedactedThinkingContent.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            goto L8c
        L76:
            java.lang.String r1 = "tool_use"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7f
            goto L86
        L7f:
            rcf r0 = com.anthropic.claude.sessions.types.SdkToolUseContent.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            goto L8c
        L86:
            cdf r0 = com.anthropic.claude.sessions.types.SdkUnknownMessageContent.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
        L8c:
            s06 r0 = (defpackage.s06) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbf.a(kotlinx.serialization.json.JsonElement):s06");
    }
}
