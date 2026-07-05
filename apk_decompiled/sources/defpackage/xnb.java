package defpackage;

import com.anthropic.claude.types.strings.ModelId;

/* JADX INFO: loaded from: classes.dex */
public final class xnb implements znb {
    public final String a;

    public xnb(String str) {
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.xnb
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xnb r4 = (defpackage.xnb) r4
            java.lang.String r4 = r4.a
            java.lang.String r3 = r3.a
            if (r3 != 0) goto L18
            if (r4 != 0) goto L16
            r3 = r0
            goto L1f
        L16:
            r3 = r2
            goto L1f
        L18:
            if (r4 != 0) goto L1b
            goto L16
        L1b:
            boolean r3 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r3, r4)
        L1f:
            if (r3 != 0) goto L22
            return r2
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xnb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return ModelId.m1062hashCodeimpl(str);
    }

    public final String toString() {
        String str = this.a;
        return ij0.j("Model(modelId=", str == null ? "null" : ModelId.m1063toStringimpl(str), ")");
    }
}
