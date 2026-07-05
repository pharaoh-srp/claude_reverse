package defpackage;

import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes.dex */
public final class vhc {
    public final String a;
    public final String b;
    public final q2c c;

    public vhc(String str, String str2, q2c q2cVar) {
        this.a = str;
        this.b = str2;
        this.c = q2cVar;
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
            boolean r1 = r5 instanceof defpackage.vhc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vhc r5 = (defpackage.vhc) r5
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
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            q2c r4 = r4.c
            q2c r5 = r5.c
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int iM1118hashCodeimpl = (str == null ? 0 : SessionId.m1118hashCodeimpl(str)) * 31;
        String str2 = this.b;
        int iHashCode = (iM1118hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        q2c q2cVar = this.c;
        return iHashCode + (q2cVar != null ? q2cVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sbR = kgh.r("OpenSharedCodeSessionParams(sessionId=", str == null ? "null" : SessionId.m1119toStringimpl(str), ", environmentId=", this.b, ", prefill=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
