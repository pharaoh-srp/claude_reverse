package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class xg2 implements y5d {
    public final /* synthetic */ y5d E;
    public final /* synthetic */ y5d F;
    public final /* synthetic */ AtomicReference G;
    public final /* synthetic */ yg2 H;

    public xg2(y5d y5dVar, AtomicReference atomicReference, yg2 yg2Var) {
        this.F = y5dVar;
        this.G = atomicReference;
        this.H = yg2Var;
        this.E = y5dVar;
    }

    @Override // defpackage.y5d
    public final View P() {
        return this.E.P();
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        return this.E.getCoroutineContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.y5d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(defpackage.s5d r10, defpackage.vp4 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.wg2
            if (r0 == 0) goto L13
            r0 = r11
            wg2 r0 = (defpackage.wg2) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            wg2 r0 = new wg2
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return
        L27:
            defpackage.sf5.h0(r11)
            goto L55
        L2b:
            defpackage.sf5.h0(r11)
            r11 = r2
            bx r2 = defpackage.bx.U
            cx r3 = new cx
            y5d r6 = r9.F
            r8 = 4
            yg2 r4 = r9.H
            r5 = 0
            r7 = r5
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r5 = r7
            r0.G = r11
            zw r1 = new zw
            r6 = 21
            java.util.concurrent.atomic.AtomicReference r9 = r9.G
            r4 = r3
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r9 = defpackage.fd9.N(r1, r0)
            m45 r10 = defpackage.m45.E
            if (r9 != r10) goto L55
            return
        L55:
            defpackage.sz6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg2.l0(s5d, vp4):void");
    }
}
