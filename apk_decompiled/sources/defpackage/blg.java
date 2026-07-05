package defpackage;

import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes.dex */
public final class blg {
    public final alg a;
    public final String b;
    public final String c;

    public blg(alg algVar, String str, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        this.a = algVar;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            goto L34
        L4:
            boolean r1 = r5 instanceof defpackage.blg
            r2 = 0
            if (r1 != 0) goto La
            goto L33
        La:
            blg r5 = (defpackage.blg) r5
            alg r1 = r4.a
            alg r3 = r5.a
            if (r1 == r3) goto L13
            goto L33
        L13:
            java.lang.String r1 = r5.b
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L1f
            if (r1 != 0) goto L1d
            r1 = r0
            goto L26
        L1d:
            r1 = r2
            goto L26
        L1f:
            if (r1 != 0) goto L22
            goto L1d
        L22:
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r3, r1)
        L26:
            if (r1 != 0) goto L29
            goto L33
        L29:
            java.lang.String r4 = r4.c
            java.lang.String r5 = r5.c
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L34
        L33:
            return r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iM982hashCodeimpl = (iHashCode + (str == null ? 0 : ChatId.m982hashCodeimpl(str))) * 31;
        String str2 = this.c;
        return iM982hashCodeimpl + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        String strM983toStringimpl = str == null ? "null" : ChatId.m983toStringimpl(str);
        StringBuilder sb = new StringBuilder("StartChatParams(mode=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(strM983toStringimpl);
        sb.append(", initialPrompt=");
        return ij0.m(sb, this.c, ")");
    }
}
