package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class k40 implements y5d, l45 {
    public final View E;
    public final jjh F;
    public final l45 G;
    public final AtomicReference H = new AtomicReference(null);

    public k40(View view, jjh jjhVar, l45 l45Var) {
        this.E = view;
        this.F = jjhVar;
        this.G = l45Var;
    }

    @Override // defpackage.y5d
    public final View P() {
        return this.E;
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        return this.G.getCoroutineContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.y5d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(defpackage.s5d r8, defpackage.vp4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.i40
            if (r0 == 0) goto L13
            r0 = r9
            i40 r0 = (defpackage.i40) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            i40 r0 = new i40
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return
        L27:
            defpackage.sf5.h0(r9)
            goto L50
        L2b:
            defpackage.sf5.h0(r9)
            r9 = r2
            j40 r2 = new j40
            r1 = 0
            r2.<init>(r8, r1, r7)
            dx r4 = new dx
            r8 = 2
            r5 = 0
            r4.<init>(r7, r5, r8)
            r0.G = r9
            zw r1 = new zw
            r6 = 21
            java.util.concurrent.atomic.AtomicReference r3 = r7.H
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.fd9.N(r1, r0)
            m45 r8 = defpackage.m45.E
            if (r7 != r8) goto L50
            return
        L50:
            defpackage.sz6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k40.l0(s5d, vp4):void");
    }
}
