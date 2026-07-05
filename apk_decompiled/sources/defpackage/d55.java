package defpackage;

import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final class d55 {
    public final String a;
    public final String b;
    public final long c;

    public d55(String str, String str2, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.d55
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            d55 r6 = (defpackage.d55) r6
            java.lang.String r1 = r5.a
            java.lang.String r3 = r6.a
            boolean r1 = com.anthropic.claude.types.strings.SessionId.m1117equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r6.b
            java.lang.String r3 = r5.b
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
            boolean r1 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r3, r1)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            long r3 = r5.c
            long r5 = r6.c
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L36
            return r2
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d55.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iM1118hashCodeimpl = SessionId.m1118hashCodeimpl(this.a) * 31;
        String str = this.b;
        return Long.hashCode(this.c) + ((iM1118hashCodeimpl + (str == null ? 0 : ModelId.m1062hashCodeimpl(str))) * 31);
    }

    public final String toString() {
        String strM1119toStringimpl = SessionId.m1119toStringimpl(this.a);
        String str = this.b;
        return grc.r(this.c, ")", kgh.r("Primed(sessionId=", strM1119toStringimpl, ", modelSnapshot=", str == null ? "null" : ModelId.m1063toStringimpl(str), ", firedAtMs="));
    }
}
