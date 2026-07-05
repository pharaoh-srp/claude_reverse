package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f6d {
    public final v77 a;
    public final lsc b = mpk.P(Boolean.FALSE);
    public final lsc c = mpk.P(Boolean.TRUE);
    public final e7d d;

    public f6d(v77 v77Var) {
        this.a = v77Var;
        this.d = new e7d(v77Var, Arrays.copyOf(new int[]{5, 13}, 2), new d6d(0, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.e6d
            if (r0 == 0) goto L13
            r0 = r5
            e6d r0 = (defpackage.e6d) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            e6d r0 = new e6d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L28
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L28:
            kotlin.KotlinNothingValueException r4 = defpackage.sq6.y(r5)
            throw r4
        L2d:
            defpackage.sf5.h0(r5)
            e7d r4 = r4.d
            if (r4 == 0) goto L3c
            r0.G = r2
            r4.a(r0)
            m45 r4 = defpackage.m45.E
            return r4
        L3c:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6d.a(vp4):java.lang.Object");
    }
}
