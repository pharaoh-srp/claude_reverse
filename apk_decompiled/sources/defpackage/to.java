package defpackage;

import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes3.dex */
public final class to {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public to(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
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
            boolean r1 = r5 instanceof defpackage.to
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            to r5 = (defpackage.to) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r5.e
            java.lang.String r3 = r4.e
            if (r3 != 0) goto L44
            if (r1 != 0) goto L42
            r1 = r0
            goto L4b
        L42:
            r1 = r2
            goto L4b
        L44:
            if (r1 != 0) goto L47
            goto L42
        L47:
            boolean r1 = com.anthropic.claude.types.strings.SessionId.m1117equalsimpl0(r3, r1)
        L4b:
            if (r1 != 0) goto L4e
            return r2
        L4e:
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L55
            return r2
        L55:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 == r5) goto L5c
            return r2
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.g) + fsh.p((iHashCode + (str2 != null ? SessionId.m1118hashCodeimpl(str2) : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        String str = this.e;
        String strM1119toStringimpl = str == null ? "null" : SessionId.m1119toStringimpl(str);
        StringBuilder sbR = kgh.r("AgentChatTask(toolName=", this.a, ", title=", this.b, ", prompt=");
        kgh.u(sbR, this.c, ", device=", this.d, ", sessionId=");
        gid.t(sbR, strM1119toStringimpl, ", hasResult=", this.f, ", isError=");
        return sq6.v(")", sbR, this.g);
    }

    public /* synthetic */ to(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, false, false);
    }
}
