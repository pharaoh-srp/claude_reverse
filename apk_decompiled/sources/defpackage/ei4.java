package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ei4 {
    public final r54 a;
    public final r54 b;
    public final r54 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ei4(defpackage.r54 r9, defpackage.r54 r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.yfd.y(r0, r2)
            if (r0 == 0) goto L12
            r54 r0 = defpackage.eve.j(r9)
            goto L13
        L12:
            r0 = r9
        L13:
            long r4 = r10.b
            boolean r1 = defpackage.yfd.y(r4, r2)
            if (r1 == 0) goto L20
            r54 r1 = defpackage.eve.j(r10)
            goto L21
        L20:
            r1 = r10
        L21:
            float[] r4 = defpackage.eve.f
            r5 = 3
            if (r11 != r5) goto L6c
            long r6 = r9.b
            boolean r11 = defpackage.yfd.y(r6, r2)
            long r6 = r10.b
            boolean r2 = defpackage.yfd.y(r6, r2)
            if (r11 == 0) goto L37
            if (r2 == 0) goto L37
            goto L6c
        L37:
            if (r11 != 0) goto L3b
            if (r2 == 0) goto L6c
        L3b:
            if (r11 == 0) goto L3e
            goto L3f
        L3e:
            r9 = r10
        L3f:
            rse r9 = (defpackage.rse) r9
            v9j r9 = r9.d
            if (r11 == 0) goto L4a
            float[] r11 = r9.a()
            goto L4b
        L4a:
            r11 = r4
        L4b:
            if (r2 == 0) goto L51
            float[] r4 = r9.a()
        L51:
            r9 = 0
            r2 = r11[r9]
            r3 = r4[r9]
            float r2 = r2 / r3
            r3 = 1
            r6 = r11[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r4 = r4[r7]
            float r11 = r11 / r4
            float[] r4 = new float[r5]
            r4[r9] = r2
            r4[r3] = r6
            r4[r7] = r11
            goto L6d
        L6c:
            r4 = 0
        L6d:
            r8.<init>(r10, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei4.<init>(r54, r54, int):void");
    }

    public long a(long j) {
        float fH = d54.h(j);
        float fG = d54.g(j);
        float fE = d54.e(j);
        float fD = d54.d(j);
        r54 r54Var = this.b;
        long jD = r54Var.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = r54Var.e(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.f(f, f2, fE2, fD, this.a);
    }

    public ei4(r54 r54Var, r54 r54Var2, r54 r54Var3, float[] fArr) {
        this.a = r54Var;
        this.b = r54Var2;
        this.c = r54Var3;
        this.d = fArr;
    }
}
