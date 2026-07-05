package defpackage;

import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class dui {
    public final r8f a;
    public final t8f b;
    public final wg6 c;
    public final mb0 d;
    public final hsc e;
    public boolean g;
    public ge2 h;
    public oub i;
    public RectF j;
    public final boolean k;
    public final hsc f = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
    public final n2g l = o2g.b(1, 5, null);
    public final it5 m = new it5(new zc2(this, 1));

    public dui(boolean z, r8f r8fVar, t8f t8fVar, wg6 wg6Var, mb0 mb0Var, float f, boolean z2) {
        this.k = z;
        this.a = r8fVar;
        this.b = t8fVar;
        this.c = wg6Var;
        this.d = mb0Var;
        this.e = new hsc(f);
        this.g = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ed2 r13, defpackage.ed2 r14, defpackage.vp4 r15) {
        /*
            r12 = this;
            boolean r14 = r15 instanceof defpackage.cui
            if (r14 == 0) goto L13
            r14 = r15
            cui r14 = (defpackage.cui) r14
            int r0 = r14.G
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r14.G = r0
            goto L18
        L13:
            cui r14 = new cui
            r14.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r14.E
            int r0 = r14.G
            r1 = 2
            r2 = 1
            it5 r3 = r12.m
            iei r4 = defpackage.iei.a
            m45 r5 = defpackage.m45.E
            if (r0 == 0) goto L65
            if (r0 == r2) goto L35
            if (r0 != r1) goto L2e
            defpackage.sf5.h0(r15)
            return r4
        L2e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r12)
            r12 = 0
            return r12
        L35:
            defpackage.sf5.h0(r15)
            r14.G = r1
            ge2 r7 = r12.h
            oub r8 = r12.i
            android.graphics.RectF r9 = r12.j
            if (r7 == 0) goto L61
            if (r8 == 0) goto L61
            if (r9 == 0) goto L61
            hsc r13 = r12.f
            float r10 = r13.h()
            hsc r13 = r12.e
            float r11 = r13.h()
            t8f r6 = r12.b
            float r13 = defpackage.vuk.i(r6, r7, r8, r9, r10, r11)
            mb0 r12 = r12.d
            java.lang.Object r12 = defpackage.eve.k(r3, r13, r12, r14)
            if (r12 != r5) goto L61
            goto L62
        L61:
            r12 = r4
        L62:
            if (r12 != r5) goto L70
            return r5
        L65:
            defpackage.sf5.h0(r15)
            wg6 r12 = r12.c
            r12.getClass()
            r13.getClass()
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dui.a(ed2, ed2, vp4):java.lang.Object");
    }

    public final void b(float f) {
        hsc hscVar = this.e;
        float fH = hscVar.h();
        Float fValueOf = Float.valueOf(f);
        float fH2 = this.f.h();
        hscVar.i(((Number) wd6.i0(fValueOf, fH2 > MTTypesetterKt.kLineSkipLimitMultiplier ? new fq3(MTTypesetterKt.kLineSkipLimitMultiplier, fH2) : new fq3(fH2, MTTypesetterKt.kLineSkipLimitMultiplier))).floatValue());
        if (hscVar.h() == fH) {
            return;
        }
        this.l.f(Float.valueOf(fH - hscVar.h()));
    }
}
