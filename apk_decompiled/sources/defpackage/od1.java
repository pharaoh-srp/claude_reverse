package defpackage;

import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class od1 implements ov1, be2 {
    public final y5a a;
    public final wdh b;
    public final ke2 c;
    public final y5a d;
    public final float e;
    public final y5a f;
    public final nd1 g;
    public final wdh h;
    public final CharSequence i;
    public final ArrayList j = new ArrayList();
    public final RectF k = new RectF();

    public od1(y5a y5aVar, wdh wdhVar, ke2 ke2Var, y5a y5aVar2, float f, y5a y5aVar3, nd1 nd1Var, wdh wdhVar2, CharSequence charSequence) {
        this.a = y5aVar;
        this.b = wdhVar;
        this.c = ke2Var;
        this.d = y5aVar2;
        this.e = f;
        this.f = y5aVar3;
        this.g = nd1Var;
        this.h = wdhVar2;
        this.i = charSequence;
    }

    public abstract void d(yd2 yd2Var);

    public abstract void e(yd2 yd2Var);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od1)) {
            return false;
        }
        od1 od1Var = (od1) obj;
        return x44.r(h(), od1Var.h()) && x44.r(this.a, od1Var.a) && this.b.equals(od1Var.b) && this.c.equals(od1Var.c) && x44.r(this.d, od1Var.d) && this.e == od1Var.e && x44.r(this.f, od1Var.f) && this.g.equals(od1Var.g) && this.h.equals(od1Var.h) && x44.r(this.i, od1Var.i);
    }

    public final float f(yd2 yd2Var) {
        y5a y5aVar = this.f;
        Float fValueOf = y5aVar != null ? Float.valueOf(y5aVar.i) : null;
        return yd2Var.a.b(fValueOf != null ? fValueOf.floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public final float g(w5b w5bVar) {
        w5bVar.getClass();
        y5a y5aVar = this.a;
        Float fValueOf = y5aVar != null ? Float.valueOf(y5aVar.i) : null;
        return w5bVar.b(fValueOf != null ? fValueOf.floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    @Override // defpackage.ov1
    public final RectF getBounds() {
        return this.k;
    }

    public abstract ra1 h();

    public int hashCode() {
        y5a y5aVar = this.a;
        int iHashCode = (this.c.hashCode() + vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, (this.b.hashCode() + ((h().hashCode() + ((y5aVar != null ? y5aVar.hashCode() : 0) * 31)) * 31)) * 31, 31)) * 31;
        y5a y5aVar2 = this.d;
        int iB = vb7.b(this.e, (iHashCode + (y5aVar2 != null ? y5aVar2.hashCode() : 0)) * 31, 31);
        y5a y5aVar3 = this.f;
        int iHashCode2 = (this.h.hashCode() + ((this.g.hashCode() + ((iB + (y5aVar3 != null ? y5aVar3.hashCode() : 0)) * 31)) * 31)) * 31;
        CharSequence charSequence = this.i;
        return iHashCode2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final float i(ge2 ge2Var) {
        ge2Var.getClass();
        return this.d != null ? ge2Var.b(this.e) : MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final float j(ge2 ge2Var) {
        ge2Var.getClass();
        y5a y5aVar = this.d;
        Float fValueOf = y5aVar != null ? Float.valueOf(y5aVar.i) : null;
        return ge2Var.b(fValueOf != null ? fValueOf.floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public final boolean k(float f, float f2, float f3, float f4) {
        ArrayList<RectF> arrayList = this.j;
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        for (RectF rectF : arrayList) {
            if (rectF.contains(f, f2, f3, f4) || rectF.intersects(f, f2, f3, f4)) {
                return false;
            }
        }
        return true;
    }

    public final void l(RectF... rectFArr) {
        List listC0 = mp0.C0(rectFArr);
        ArrayList arrayList = this.j;
        arrayList.getClass();
        arrayList.clear();
        arrayList.addAll(listC0);
    }

    @Override // defpackage.be2
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(ge2 ge2Var, sp0 sp0Var, float f, ed2 ed2Var) {
        ge2Var.getClass();
    }

    public abstract void n(ge2 ge2Var, oub oubVar);
}
