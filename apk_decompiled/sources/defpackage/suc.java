package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class suc extends rp9 {
    public Path q;
    public final rp9 r;

    public suc(bna bnaVar, rp9 rp9Var) {
        super(bnaVar, (PointF) rp9Var.b, (PointF) rp9Var.c, rp9Var.d, rp9Var.e, rp9Var.f, rp9Var.g, rp9Var.h);
        this.r = rp9Var;
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            java.lang.Object r1 = r12.b
            if (r0 == 0) goto L19
            if (r1 == 0) goto L19
            r2 = r1
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r3 = r0.x
            float r0 = r0.y
            boolean r0 = r2.equals(r3, r0)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r1 == 0) goto L73
            java.lang.Object r2 = r12.c
            if (r2 == 0) goto L73
            if (r0 != 0) goto L73
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            rp9 r0 = r12.r
            android.graphics.PointF r3 = r0.o
            android.graphics.PointF r0 = r0.p
            android.graphics.Matrix r4 = defpackage.zpi.a
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            float r4 = r1.x
            float r6 = r1.y
            r5.moveTo(r4, r6)
            if (r3 == 0) goto L6a
            if (r0 == 0) goto L6a
            float r4 = r3.length()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L4f
            float r4 = r0.length()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L6a
        L4f:
            float r4 = r1.x
            float r6 = r3.x
            float r6 = r6 + r4
            float r1 = r1.y
            float r3 = r3.y
            float r7 = r1 + r3
            float r10 = r2.x
            float r1 = r0.x
            float r8 = r10 + r1
            float r11 = r2.y
            float r0 = r0.y
            float r9 = r11 + r0
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            goto L71
        L6a:
            float r0 = r2.x
            float r1 = r2.y
            r5.lineTo(r0, r1)
        L71:
            r12.q = r5
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suc.d():void");
    }
}
