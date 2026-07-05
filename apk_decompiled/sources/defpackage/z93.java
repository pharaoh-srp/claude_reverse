package defpackage;

import com.anthropic.claude.chat.ChatScreenParams;

/* JADX INFO: loaded from: classes.dex */
public final class z93 {
    public final fb6 a;
    public final vd3 b;
    public final zkg c;

    public z93(fb6 fb6Var, vd3 vd3Var, zkg zkgVar) {
        this.a = fb6Var;
        this.b = vd3Var;
        this.c = zkgVar;
    }

    public static ChatScreenParams a(z93 z93Var, String str, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        String str4 = str3;
        boolean z = (i & 8) == 0;
        z93Var.getClass();
        str.getClass();
        ChatScreenParams.Companion.getClass();
        return new ChatScreenParams(str, str2, false, (String) null, str4, (String) null, z, false, 168, (mq5) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anthropic.claude.chat.ChatScreenParams b(defpackage.z93 r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17) {
        /*
            r0 = r17 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r4 = r1
            goto L8
        L7:
            r4 = r14
        L8:
            r14 = r17 & 2
            if (r14 == 0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r15
        Lf:
            r14 = r17 & 4
            if (r14 == 0) goto L15
            r8 = r1
            goto L17
        L15:
            r8 = r16
        L17:
            r14 = r17 & 8
            r0 = 1
            r2 = 0
            if (r14 == 0) goto L1f
            r9 = r2
            goto L20
        L1f:
            r9 = r0
        L20:
            r13.getClass()
            if (r6 != 0) goto L3c
            if (r8 != 0) goto L3c
            zkg r14 = r13.c
            lsc r14 = r14.a
            java.lang.Object r14 = r14.getValue()
            blg r14 = (defpackage.blg) r14
            if (r14 == 0) goto L36
            java.lang.String r14 = r14.c
            goto L37
        L36:
            r14 = r1
        L37:
            if (r14 == 0) goto L3a
            goto L3c
        L3a:
            r14 = r2
            goto L3d
        L3c:
            r14 = r0
        L3d:
            y93 r3 = com.anthropic.claude.chat.ChatScreenParams.Companion
            if (r14 == 0) goto L4b
            ws2 r13 = com.anthropic.claude.types.strings.ChatId.Companion
            r13.getClass()
            java.lang.String r13 = defpackage.ws2.a()
            goto L93
        L4b:
            fb6 r5 = r13.a
            android.content.SharedPreferences r7 = r5.f
            if (r4 != 0) goto L53
            r10 = r1
            goto L54
        L53:
            r10 = r4
        L54:
            if (r10 != 0) goto L58
            java.lang.String r10 = ""
        L58:
            java.lang.String r7 = r7.getString(r10, r1)
            if (r7 == 0) goto L62
            java.lang.String r1 = com.anthropic.claude.types.strings.ChatId.m979constructorimpl(r7)
        L62:
            if (r1 != 0) goto L6e
            ws2 r13 = com.anthropic.claude.types.strings.ChatId.Companion
            r13.getClass()
            java.lang.String r13 = defpackage.ws2.a()
            goto L93
        L6e:
            vd3 r13 = r13.b
            hq4 r13 = r13.e
            boolean r13 = r13.o(r1)
            if (r13 == 0) goto L92
            com.anthropic.claude.core.telemetry.SilentException r13 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r1 = "pendingNewChatId stale (already in chatsRepository)"
            r13.<init>(r1)
            ozf r1 = defpackage.ozf.F
            r7 = 2
            com.anthropic.claude.core.telemetry.SilentException.a(r13, r1, r2, r7)
            r5.b(r4)
            ws2 r13 = com.anthropic.claude.types.strings.ChatId.Companion
            r13.getClass()
            java.lang.String r13 = defpackage.ws2.a()
            goto L93
        L92:
            r13 = r1
        L93:
            r10 = r14 ^ 1
            r3.getClass()
            r13.getClass()
            com.anthropic.claude.chat.ChatScreenParams r2 = new com.anthropic.claude.chat.ChatScreenParams
            r11 = 16
            r12 = 0
            r5 = 1
            r7 = 0
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z93.b(z93, java.lang.String, java.lang.String, java.lang.String, int):com.anthropic.claude.chat.ChatScreenParams");
    }
}
