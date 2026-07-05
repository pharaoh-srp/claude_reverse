package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o9e implements ge1, ym4, quc {
    public final boolean c;
    public final pna d;
    public final ke1 e;
    public final ke1 f;
    public final g54 g;
    public boolean j;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final d80 h = new d80(3);
    public ke1 i = null;

    public o9e(pna pnaVar, le1 le1Var, p9e p9eVar) {
        this.c = p9eVar.c;
        this.d = pnaVar;
        ke1 ke1VarA = p9eVar.d.a();
        this.e = ke1VarA;
        ke1 ke1VarA2 = ((k80) p9eVar.e).a();
        this.f = ke1VarA2;
        g54 g54VarA = p9eVar.b.a();
        this.g = g54VarA;
        le1Var.d(ke1VarA);
        le1Var.d(ke1VarA2);
        le1Var.d(g54VarA);
        ke1VarA.a(this);
        ke1VarA2.a(this);
        g54VarA.a(this);
    }

    @Override // defpackage.ge1
    public final void a() {
        this.j = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // defpackage.ym4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L34
            java.lang.Object r0 = r0.get(r6)
            ym4 r0 = (defpackage.ym4) r0
            boolean r1 = r0 instanceof defpackage.p7i
            if (r1 == 0) goto L27
            r1 = r0
            p7i r1 = (defpackage.p7i) r1
            int r2 = r1.c
            r3 = 1
            if (r2 != r3) goto L27
            d80 r0 = r4.h
            java.util.ArrayList r0 = r0.F
            r0.add(r1)
            r1.d(r4)
            goto L31
        L27:
            boolean r1 = r0 instanceof defpackage.bwe
            if (r1 == 0) goto L31
            bwe r0 = (defpackage.bwe) r0
            ke1 r0 = r0.b
            r4.i = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9e.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.quc
    public final Path e() {
        float f;
        ke1 ke1Var;
        boolean z = this.j;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.j = true;
            return path;
        }
        PointF pointF = (PointF) this.f.d();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        g54 g54Var = this.g;
        float fI = g54Var == null ? 0.0f : g54Var.i();
        if (fI == MTTypesetterKt.kLineSkipLimitMultiplier && (ke1Var = this.i) != null) {
            fI = Math.min(((Float) ke1Var.d()).floatValue(), Math.min(f2, f3));
        }
        float fMin = Math.min(f2, f3);
        if (fI > fMin) {
            fI = fMin;
        }
        PointF pointF2 = (PointF) this.e.d();
        path.moveTo(pointF2.x + f2, (pointF2.y - f3) + fI);
        path.lineTo(pointF2.x + f2, (pointF2.y + f3) - fI);
        RectF rectF = this.b;
        if (fI > MTTypesetterKt.kLineSkipLimitMultiplier) {
            float f4 = pointF2.x + f2;
            float f5 = fI * 2.0f;
            f = 2.0f;
            float f6 = pointF2.y + f3;
            rectF.set(f4 - f5, f6 - f5, f4, f6);
            path.arcTo(rectF, MTTypesetterKt.kLineSkipLimitMultiplier, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f2) + fI, pointF2.y + f3);
        if (fI > MTTypesetterKt.kLineSkipLimitMultiplier) {
            float f7 = pointF2.x - f2;
            float f8 = pointF2.y + f3;
            float f9 = fI * f;
            rectF.set(f7, f8 - f9, f9 + f7, f8);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f2, (pointF2.y - f3) + fI);
        if (fI > MTTypesetterKt.kLineSkipLimitMultiplier) {
            float f10 = pointF2.x - f2;
            float f11 = pointF2.y - f3;
            float f12 = fI * f;
            rectF.set(f10, f11, f10 + f12, f12 + f11);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f2) - fI, pointF2.y - f3);
        if (fI > MTTypesetterKt.kLineSkipLimitMultiplier) {
            float f13 = pointF2.x + f2;
            float f14 = fI * f;
            float f15 = pointF2.y - f3;
            rectF.set(f13 - f14, f15, f13, f14 + f15);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.h.f(path);
        this.j = true;
        return path;
    }
}
