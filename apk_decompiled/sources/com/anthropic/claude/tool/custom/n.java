package com.anthropic.claude.tool.custom;

import defpackage.jce;
import defpackage.sg9;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends sg9 {
    public static final n c = new n(jce.a.b(PhoneCallMonitorEvent.class));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r0.equals("history_complete") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r0.equals("connected") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        return com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.Meta.INSTANCE.serializer();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
            if (r0 == 0) goto L88
            int r1 = r0.hashCode()
            switch(r1) {
                case -1903898247: goto L76;
                case -579210487: goto L64;
                case -394615638: goto L52;
                case -16582174: goto L40;
                case 75523204: goto L37;
                case 830445627: goto L25;
                default: goto L24;
            }
        L24:
            goto L88
        L25:
            java.lang.String r1 = "agent_response"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L88
        L2e:
            com.anthropic.claude.tool.custom.c r0 = com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.AgentResponse.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            s06 r0 = (defpackage.s06) r0
            return r0
        L37:
            java.lang.String r1 = "history_complete"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6d
            goto L88
        L40:
            java.lang.String r1 = "agent_response_correction"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L49
            goto L88
        L49:
            com.anthropic.claude.tool.custom.g r0 = com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.AgentResponseCorrection.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            s06 r0 = (defpackage.s06) r0
            return r0
        L52:
            java.lang.String r1 = "user_transcript"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
            goto L88
        L5b:
            com.anthropic.claude.tool.custom.k r0 = com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.UserTranscript.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            s06 r0 = (defpackage.s06) r0
            return r0
        L64:
            java.lang.String r1 = "connected"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6d
            goto L88
        L6d:
            com.anthropic.claude.tool.custom.PhoneCallMonitorEvent$Meta r0 = com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.Meta.INSTANCE
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            s06 r0 = (defpackage.s06) r0
            return r0
        L76:
            java.lang.String r1 = "call_ended_processing"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7f
            goto L88
        L7f:
            com.anthropic.claude.tool.custom.PhoneCallMonitorEvent$CallEndedProcessing r0 = com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.CallEndedProcessing.INSTANCE
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            s06 r0 = (defpackage.s06) r0
            return r0
        L88:
            com.anthropic.claude.tool.custom.PhoneCallMonitorEvent$Unknown r0 = com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.Unknown.INSTANCE
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            s06 r0 = (defpackage.s06) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.tool.custom.n.a(kotlinx.serialization.json.JsonElement):s06");
    }
}
