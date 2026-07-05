package defpackage;

import com.anthropic.claude.types.strings.ResearchTaskId;

/* JADX INFO: loaded from: classes3.dex */
public final class gtc implements mtc {
    public final String a;
    public final jme b;

    public gtc(String str, jme jmeVar) {
        this.a = str;
        this.b = jmeVar;
    }

    public static gtc a(String str, jme jmeVar) {
        return new gtc(str, jmeVar);
    }

    public final String b() {
        return this.a;
    }

    public final jme c() {
        return this.b;
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
            boolean r1 = r5 instanceof defpackage.gtc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gtc r5 = (defpackage.gtc) r5
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
            boolean r1 = com.anthropic.claude.types.strings.ResearchTaskId.m1103equalsimpl0(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            jme r4 = r4.b
            jme r5 = r5.b
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtc.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.mtc
    public final String getBody() {
        return "";
    }

    public final int hashCode() {
        String str = this.a;
        int iM1104hashCodeimpl = (str == null ? 0 : ResearchTaskId.m1104hashCodeimpl(str)) * 31;
        jme jmeVar = this.b;
        return iM1104hashCodeimpl + (jmeVar != null ? jmeVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        return "ResearchToolInvocation(researchTaskId=" + (str == null ? "null" : ResearchTaskId.m1105toStringimpl(str)) + ", statusUpdate=" + this.b + ")";
    }
}
