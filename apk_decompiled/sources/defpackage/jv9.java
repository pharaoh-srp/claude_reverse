package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jv9 implements p5b {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5b b;
    public final /* synthetic */ nv9 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ p5b e;

    public /* synthetic */ jv9(p5b p5bVar, nv9 nv9Var, int i, p5b p5bVar2, int i2) {
        this.a = i2;
        this.c = nv9Var;
        this.d = i;
        this.e = p5bVar2;
        this.b = p5bVar;
    }

    @Override // defpackage.p5b
    public final int a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.p5b
    public final int b() {
        switch (this.a) {
        }
        return this.b.b();
    }

    @Override // defpackage.p5b
    public final Map c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    @Override // defpackage.p5b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.a
            p5b r2 = r0.e
            int r3 = r0.d
            nv9 r0 = r0.c
            switch(r1) {
                case 0: goto L1e;
                default: goto Ld;
            }
        Ld:
            r0.H = r3
            r2.d()
            av9 r1 = r0.E
            av9 r1 = r1.M
            if (r1 != 0) goto L1d
            int r1 = r0.H
            r0.g(r1)
        L1d:
            return
        L1e:
            r0.I = r3
            r2.d()
            wwb r1 = r0.Q
            ewb r2 = r0.P
            long[] r3 = r2.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L8e
            r6 = 0
        L2f:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L89
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L49:
            if (r11 >= r9) goto L87
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L83
            int r12 = r6 << 3
            int r12 = r12 + r11
            java.lang.Object[] r13 = r2.b
            r13 = r13[r12]
            java.lang.Object[] r14 = r2.c
            r14 = r14[r12]
            dvg r14 = (defpackage.dvg) r14
            int r15 = r1.k(r13)
            if (r15 < 0) goto L6b
            int r5 = r0.I
            if (r15 < r5) goto L83
        L6b:
            if (r15 < 0) goto L75
            java.lang.Object[] r5 = r1.E
            r16 = r5[r15]
            java.lang.Object r16 = defpackage.bvg.b
            r5[r15] = r16
        L75:
            ewb r5 = r0.N
            boolean r5 = r5.b(r13)
            if (r5 == 0) goto L80
            r14.a()
        L80:
            r2.l(r12)
        L83:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L49
        L87:
            if (r9 != r10) goto L8e
        L89:
            if (r6 == r4) goto L8e
            int r6 = r6 + 1
            goto L2f
        L8e:
            int r1 = r0.H
            r0.g(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv9.d():void");
    }

    @Override // defpackage.p5b
    public final bz7 e() {
        switch (this.a) {
        }
        return this.b.e();
    }
}
