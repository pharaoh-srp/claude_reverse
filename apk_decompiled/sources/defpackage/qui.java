package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class qui {
    public final nm7 a;
    public final Context b;
    public nui c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;

    public qui(Context context) {
        this.b = context;
        nm7 nm7Var = new nm7();
        nm7Var.H = new mm7();
        nm7Var.I = new mm7();
        nm7Var.F = -9223372036854775807L;
        this.a = nm7Var;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == MTTypesetterKt.kLineSkipLimitMultiplier || !surface.isValid()) {
            return;
        }
        this.h = MTTypesetterKt.kLineSkipLimitMultiplier;
        try {
            this.e.setFrameRate(MTTypesetterKt.kLineSkipLimitMultiplier, 0);
        } catch (IllegalStateException e) {
            ysj.k("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public final void b() {
        this.m = 0L;
        this.q = -1L;
        this.n = -1L;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L99
            android.view.Surface r0 = r9.e
            if (r0 != 0) goto Lc
            goto L99
        Lc:
            nm7 r0 = r9.a
            java.lang.Object r2 = r0.H
            mm7 r2 = (defpackage.mm7) r2
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.H
            mm7 r2 = (defpackage.mm7) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.H
            mm7 r2 = (defpackage.mm7) r2
            long r4 = r2.e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L31
            goto L34
        L31:
            long r6 = r2.f
            long r6 = r6 / r4
        L34:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L41
        L3d:
            r2 = r3
            goto L41
        L3f:
            float r2 = r9.f
        L41:
            float r4 = r9.g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L48
            goto L99
        L48:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L8c
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L8c
            java.lang.Object r1 = r0.H
            mm7 r1 = (defpackage.mm7) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.H
            mm7 r1 = (defpackage.mm7) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L6b
            java.lang.Object r0 = r0.H
            mm7 r0 = (defpackage.mm7) r0
            long r0 = r0.f
            goto L70
        L6b:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L70:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L7d
            r0 = 1036831949(0x3dcccccd, float:0.1)
            goto L7f
        L7d:
            r0 = 1065353216(0x3f800000, float:1.0)
        L7f:
            float r1 = r9.g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L99
            goto L93
        L8c:
            if (r5 == 0) goto L8f
            goto L93
        L8f:
            int r0 = r0.E
            if (r0 < r1) goto L99
        L93:
            r9.g = r2
            r0 = 0
            r9.d(r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qui.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L49
            android.view.Surface r0 = r3.e
            if (r0 == 0) goto L49
            int r1 = r3.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L49
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L17
            goto L49
        L17:
            boolean r0 = r3.d
            r1 = 0
            if (r0 == 0) goto L28
            float r0 = r3.g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L28
            float r2 = r3.i
            float r0 = r0 * r2
            goto L29
        L28:
            r0 = r1
        L29:
            if (r4 != 0) goto L32
            float r4 = r3.h
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L32
            goto L49
        L32:
            r3.h = r0
            android.view.Surface r3 = r3.e
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 != 0) goto L3c
            r4 = 0
            goto L3d
        L3c:
            r4 = 1
        L3d:
            defpackage.cqi.d(r3, r0, r4)     // Catch: java.lang.IllegalStateException -> L41
            return
        L41:
            r3 = move-exception
            java.lang.String r4 = "VideoFrameReleaseHelper"
            java.lang.String r0 = "Failed to call Surface.setFrameRate"
            defpackage.ysj.k(r4, r0, r3)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qui.d(boolean):void");
    }
}
