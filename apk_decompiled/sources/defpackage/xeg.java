package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xeg {
    public final CharSequence a;
    public final cfg b;

    public xeg(CharSequence charSequence, cfg cfgVar) {
        if (charSequence == null) {
            mr9.h("content must not be null");
            throw null;
        }
        this.a = charSequence;
        this.b = cfgVar;
    }

    public static xeg b(CharSequence charSequence, cfg cfgVar) {
        return new xeg(charSequence, cfgVar);
    }

    public final CharSequence a() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xeg c(int r3, int r4) {
        /*
            r2 = this;
            java.lang.CharSequence r0 = r2.a
            java.lang.CharSequence r0 = r0.subSequence(r3, r4)
            cfg r2 = r2.b
            if (r2 == 0) goto L18
            int r1 = r2.b
            int r1 = r1 + r3
            int r4 = r4 - r3
            if (r4 == 0) goto L18
            int r2 = r2.a
            cfg r3 = new cfg
            r3.<init>(r2, r1, r4)
            goto L19
        L18:
            r3 = 0
        L19:
            xeg r2 = new xeg
            r2.<init>(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xeg.c(int, int):xeg");
    }
}
