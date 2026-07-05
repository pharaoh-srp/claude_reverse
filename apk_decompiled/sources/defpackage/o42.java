package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o42 implements n42 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public o42(int i, int i2, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[RETURN] */
    @Override // defpackage.n42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.h1f r8) {
        /*
            r7 = this;
            boolean r0 = r7.d
            java.lang.String r1 = r7.e
            if (r0 == 0) goto Lc
            if (r1 != 0) goto Lc
            java.lang.String r1 = r8.o()
        Lc:
            f1f r0 = r8.b
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3c
            java.util.List r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
            r4 = r2
            r5 = r4
        L1c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r0.next()
            j1f r6 = (defpackage.j1f) r6
            h1f r6 = (defpackage.h1f) r6
            if (r6 != r8) goto L2d
            r4 = r5
        L2d:
            if (r1 == 0) goto L39
            java.lang.String r6 = r6.o()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L1c
        L39:
            int r5 = r5 + 1
            goto L1c
        L3c:
            r4 = r2
            r5 = r3
        L3e:
            boolean r8 = r7.c
            if (r8 == 0) goto L44
            int r4 = r4 + r3
            goto L46
        L44:
            int r4 = r5 - r4
        L46:
            int r8 = r7.b
            int r7 = r7.a
            if (r7 != 0) goto L4f
            if (r4 != r8) goto L65
            goto L64
        L4f:
            int r4 = r4 - r8
            int r8 = r4 % r7
            if (r8 != 0) goto L65
            int r8 = java.lang.Integer.signum(r4)
            if (r8 == 0) goto L64
            int r8 = java.lang.Integer.signum(r4)
            int r7 = java.lang.Integer.signum(r7)
            if (r8 != r7) goto L65
        L64:
            return r3
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o42.a(h1f):boolean");
    }

    public final String toString() {
        String str = this.c ? "" : "last-";
        int i = this.b;
        boolean z = this.d;
        int i2 = this.a;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
