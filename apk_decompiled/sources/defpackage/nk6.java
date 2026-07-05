package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nk6 implements quc, ge1, ym4 {
    public final pna b;
    public final x98 c;
    public final ke1 d;
    public final ag3 e;
    public boolean g;
    public final Path a = new Path();
    public final d80 f = new d80(3);

    public nk6(pna pnaVar, le1 le1Var, ag3 ag3Var) {
        this.b = pnaVar;
        ke1 ke1VarA = ag3Var.b.a();
        this.c = (x98) ke1VarA;
        ke1 ke1VarA2 = ag3Var.a.a();
        this.d = ke1VarA2;
        this.e = ag3Var;
        le1Var.d(ke1VarA);
        le1Var.d(ke1VarA2);
        ke1VarA.a(this);
        ke1VarA2.a(this);
    }

    @Override // defpackage.ge1
    public final void a() {
        this.g = false;
        this.b.invalidateSelf();
    }

    @Override // defpackage.ym4
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            ym4 ym4Var = (ym4) arrayList.get(i);
            if (ym4Var instanceof p7i) {
                p7i p7iVar = (p7i) ym4Var;
                if (p7iVar.c == 1) {
                    this.f.F.add(p7iVar);
                    p7iVar.d(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.quc
    public final Path e() {
        boolean z = this.g;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        ag3 ag3Var = this.e;
        if (ag3Var.d) {
            this.g = true;
            return path;
        }
        PointF pointF = (PointF) this.c.d();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (ag3Var.c) {
            float f5 = -f2;
            path.moveTo(MTTypesetterKt.kLineSkipLimitMultiplier, f5);
            float f6 = MTTypesetterKt.kLineSkipLimitMultiplier - f3;
            float f7 = -f;
            float f8 = MTTypesetterKt.kLineSkipLimitMultiplier - f4;
            path.cubicTo(f6, f5, f7, f8, f7, MTTypesetterKt.kLineSkipLimitMultiplier);
            float f9 = f4 + MTTypesetterKt.kLineSkipLimitMultiplier;
            path.cubicTo(f7, f9, f6, f2, MTTypesetterKt.kLineSkipLimitMultiplier, f2);
            float f10 = f3 + MTTypesetterKt.kLineSkipLimitMultiplier;
            path.cubicTo(f10, f2, f, f9, f, MTTypesetterKt.kLineSkipLimitMultiplier);
            path.cubicTo(f, f8, f10, f5, MTTypesetterKt.kLineSkipLimitMultiplier, f5);
        } else {
            float f11 = -f2;
            path.moveTo(MTTypesetterKt.kLineSkipLimitMultiplier, f11);
            float f12 = f3 + MTTypesetterKt.kLineSkipLimitMultiplier;
            float f13 = MTTypesetterKt.kLineSkipLimitMultiplier - f4;
            path.cubicTo(f12, f11, f, f13, f, MTTypesetterKt.kLineSkipLimitMultiplier);
            float f14 = f4 + MTTypesetterKt.kLineSkipLimitMultiplier;
            path.cubicTo(f, f14, f12, f2, MTTypesetterKt.kLineSkipLimitMultiplier, f2);
            float f15 = MTTypesetterKt.kLineSkipLimitMultiplier - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, MTTypesetterKt.kLineSkipLimitMultiplier);
            path.cubicTo(f16, f13, f15, f11, MTTypesetterKt.kLineSkipLimitMultiplier, f11);
        }
        PointF pointF2 = (PointF) this.d.d();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f.f(path);
        this.g = true;
        return path;
    }
}
