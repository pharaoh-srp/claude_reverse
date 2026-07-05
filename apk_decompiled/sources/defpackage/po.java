package defpackage;

import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final class po implements so {
    public final String a;
    public final String b;
    public final boolean c;

    public po(String str, String str2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
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
            boolean r1 = r5 instanceof defpackage.po
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            po r5 = (defpackage.po) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.b
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L23
            if (r1 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r1 != 0) goto L26
            goto L21
        L26:
            boolean r1 = com.anthropic.claude.types.strings.SessionId.m1117equalsimpl0(r3, r1)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L34
            return r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : SessionId.m1118hashCodeimpl(str))) * 31);
    }

    public final String toString() {
        String str = this.b;
        return sq6.v(")", kgh.r("TaskSessionResolved(toolUseId=", this.a, ", sessionId=", str == null ? "null" : SessionId.m1119toStringimpl(str), ", isError="), this.c);
    }
}
