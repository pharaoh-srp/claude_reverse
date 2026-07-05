package defpackage;

import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final class gtf {
    public final String a;
    public final String b;

    public gtf(String str, String str2) {
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
            boolean r1 = r5 instanceof defpackage.gtf
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gtf r5 = (defpackage.gtf) r5
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
            boolean r1 = com.anthropic.claude.types.strings.SessionId.m1117equalsimpl0(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtf.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int iM1118hashCodeimpl = (str == null ? 0 : SessionId.m1118hashCodeimpl(str)) * 31;
        String str2 = this.b;
        return iM1118hashCodeimpl + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        return ij0.l("SessionPageCursor(account=", str == null ? "null" : SessionId.m1119toStringimpl(str), ", agentOwned=", this.b, ")");
    }
}
