package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xsb implements vef {
    public final long a;
    public final ysb[] b;
    public final int c;

    public xsb(long j, ysb[] ysbVarArr, int i) {
        this.a = j;
        this.b = ysbVarArr;
        this.c = i;
    }

    @Override // defpackage.vef
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    @Override // defpackage.vef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.uef e(long r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            ysb[] r3 = r0.b
            int r4 = r3.length
            xef r5 = defpackage.xef.c
            if (r4 != 0) goto L11
            uef r0 = new uef
            r0.<init>(r5, r5)
            return r0
        L11:
            int r0 = r0.c
            r4 = -1
            r8 = -1
            if (r0 == r4) goto L4d
            r10 = r3[r0]
            b4i r10 = r10.b
            int r11 = r10.a(r1)
            if (r11 != r4) goto L26
            int r11 = r10.b(r1)
        L26:
            long[] r12 = r10.c
            long[] r13 = r10.f
            if (r11 != r4) goto L32
            uef r0 = new uef
            r0.<init>(r5, r5)
            return r0
        L32:
            r14 = r13[r11]
            r16 = r12[r11]
            int r5 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r5 >= 0) goto L53
            int r5 = r10.b
            int r5 = r5 + (-1)
            if (r11 >= r5) goto L53
            int r1 = r10.b(r1)
            if (r1 == r4) goto L53
            if (r1 == r11) goto L53
            r8 = r13[r1]
            r1 = r12[r1]
            goto L59
        L4d:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = r1
        L53:
            r1 = r8
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L59:
            r5 = 0
            r10 = r16
        L5c:
            int r12 = r3.length
            if (r5 >= r12) goto L9f
            if (r5 == r0) goto L97
            r12 = r3[r5]
            b4i r12 = r12.b
            long[] r13 = r12.c
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = r12.a(r14)
            if (r6 != r4) goto L76
            int r6 = r12.b(r14)
        L76:
            if (r6 != r4) goto L79
            goto L7f
        L79:
            r6 = r13[r6]
            long r10 = java.lang.Math.min(r6, r10)
        L7f:
            int r6 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r6 == 0) goto L9c
            int r6 = r12.a(r8)
            if (r6 != r4) goto L8d
            int r6 = r12.b(r8)
        L8d:
            if (r6 != r4) goto L90
            goto L9c
        L90:
            r6 = r13[r6]
            long r1 = java.lang.Math.min(r6, r1)
            goto L9c
        L97:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L9c:
            int r5 = r5 + 1
            goto L5c
        L9f:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            xef r0 = new xef
            r0.<init>(r14, r10)
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 != 0) goto Lb3
            uef r1 = new uef
            r1.<init>(r0, r0)
            return r1
        Lb3:
            xef r3 = new xef
            r3.<init>(r8, r1)
            uef r1 = new uef
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsb.e(long):uef");
    }

    @Override // defpackage.vef
    public final long g() {
        return this.a;
    }
}
