package defpackage;

import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class t33 {
    public final String a;
    public final String b;

    public t33(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
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
            boolean r1 = r5 instanceof defpackage.t33
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t33 r5 = (defpackage.t33) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r5 = r5.b
            java.lang.String r4 = r4.b
            if (r4 != 0) goto L23
            if (r5 != 0) goto L21
            r4 = r0
            goto L2a
        L21:
            r4 = r2
            goto L2a
        L23:
            if (r5 != 0) goto L26
            goto L21
        L26:
            boolean r4 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r4, r5)
        L2a:
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t33.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iM1055hashCodeimpl = MessageId.m1055hashCodeimpl(this.a) * 31;
        String str = this.b;
        return iM1055hashCodeimpl + (str == null ? 0 : MessageId.m1055hashCodeimpl(str));
    }

    public final String toString() {
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.a);
        String str = this.b;
        return ij0.l("TerminalErrored(messageUuid=", strM1056toStringimpl, ", humanMessageUuid=", str == null ? "null" : MessageId.m1056toStringimpl(str), ")");
    }
}
