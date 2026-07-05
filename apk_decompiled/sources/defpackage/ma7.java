package defpackage;

import com.anthropic.claude.types.strings.ModelId;

/* JADX INFO: loaded from: classes2.dex */
public final class ma7 implements oa7 {
    public final String a;
    public final String b;

    public ma7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
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
            boolean r1 = r5 instanceof defpackage.ma7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ma7 r5 = (defpackage.ma7) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.x44.r(r1, r3)
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
            boolean r4 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r4, r5)
        L2a:
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? ModelId.m1062hashCodeimpl(str2) : 0);
    }

    public final String toString() {
        String str = this.b;
        return ij0.l("NewChat(inputText=", this.a, ", modelId=", str == null ? "null" : ModelId.m1063toStringimpl(str), ")");
    }
}
