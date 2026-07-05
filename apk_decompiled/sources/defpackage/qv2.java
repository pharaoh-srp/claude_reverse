package defpackage;

import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes.dex */
public final class qv2 {
    public final String a;
    public final String b;

    public qv2(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.qv2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qv2 r5 = (defpackage.qv2) r5
            java.lang.String r1 = r5.a
            java.lang.String r3 = r4.a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        return ChatId.m982hashCodeimpl(this.b) + ((str == null ? 0 : ChatId.m982hashCodeimpl(str)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return ij0.l("ChatInputDataChatId(server=", str == null ? "null" : ChatId.m983toStringimpl(str), ", local=", ChatId.m983toStringimpl(this.b), ")");
    }
}
