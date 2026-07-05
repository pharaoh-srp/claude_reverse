package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ym0 implements a45 {
    public final /* synthetic */ AtomicReference E;
    public final /* synthetic */ aid F;

    public ym0(AtomicReference atomicReference, aid aidVar) {
        this.E = atomicReference;
        this.F = aidVar;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.c45
    public final c45 S(b45 b45Var) {
        return nai.W(this, b45Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pz7 r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.xm0
            if (r0 == 0) goto L13
            r0 = r6
            xm0 r0 = (defpackage.xm0) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            xm0 r0 = new xm0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return
        L27:
            defpackage.sf5.h0(r6)
            goto L60
        L2b:
            defpackage.sf5.h0(r6)
            r0.G = r2
            ua2 r6 = new ua2
            tp4 r0 = defpackage.zni.I(r0)
            r6.<init>(r2, r0)
            r6.t()
            cv r0 = new cv
            aid r1 = r4.F
            r0.<init>(r2, r1)
            r6.w(r0)
            java.util.concurrent.atomic.AtomicReference r4 = r4.E
            java.lang.Object r4 = r4.getAndSet(r6)
            ta2 r4 = (defpackage.ta2) r4
            if (r4 == 0) goto L54
            r0 = 0
            r4.q(r0)
        L54:
            r1.r(r5)
            java.lang.Object r4 = r6.r()
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L60
            return
        L60:
            defpackage.sz6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym0.a(pz7, vp4):void");
    }

    @Override // defpackage.a45
    public b45 getKey() {
        return c0l.J;
    }

    @Override // defpackage.c45
    public final c45 r0(c45 c45Var) {
        return nai.Z(this, c45Var);
    }

    @Override // defpackage.c45
    public final a45 x0(b45 b45Var) {
        return nai.C(this, b45Var);
    }
}
