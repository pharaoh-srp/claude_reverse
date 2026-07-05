package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class coc implements p5b {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final ukc e;
    public final int f;
    public final int g;
    public final int h;
    public final r5b i;
    public final r5b j;
    public final float k;
    public final int l;
    public final boolean m;
    public final pcg n;
    public final p5b o;
    public final boolean p;
    public final List q;
    public final List r;
    public final l45 s;
    public final cz5 t;
    public final long u;

    public coc(List list, int i, int i2, int i3, ukc ukcVar, int i4, int i5, int i6, r5b r5bVar, r5b r5bVar2, float f, int i7, boolean z, pcg pcgVar, p5b p5bVar, boolean z2, List list2, List list3, l45 l45Var, cz5 cz5Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = ukcVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = r5bVar;
        this.j = r5bVar2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = pcgVar;
        this.o = p5bVar;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = l45Var;
        this.t = cz5Var;
        this.u = j;
    }

    @Override // defpackage.p5b
    public final int a() {
        return this.o.a();
    }

    @Override // defpackage.p5b
    public final int b() {
        return this.o.b();
    }

    @Override // defpackage.p5b
    public final Map c() {
        return this.o.c();
    }

    @Override // defpackage.p5b
    public final void d() {
        this.o.d();
    }

    @Override // defpackage.p5b
    public final bz7 e() {
        return this.o.e();
    }

    public final coc f(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : MTTypesetterKt.kLineSkipLimitMultiplier);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        r5b r5bVar = (r5b) w44.L0(list);
        r5b r5bVar2 = (r5b) w44.U0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((r5bVar.j + i3) - i5, (r5bVar2.j + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - r5bVar.j, i4 - r5bVar2.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((r5b) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((r5b) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((r5b) list3.get(i8)).a(i);
        }
        return new coc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long g() {
        p5b p5bVar = this.o;
        return (((long) p5bVar.b()) << 32) | (((long) p5bVar.a()) & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ coc(int i, int i2, int i3, int i4, int i5, int i6, pcg pcgVar, p5b p5bVar, l45 l45Var, cz5 cz5Var, long j) {
        lm6 lm6Var = lm6.E;
        this(lm6Var, i, i2, i3, ukc.F, i4, i5, i6, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, pcgVar, p5bVar, false, lm6Var, lm6Var, l45Var, cz5Var, j);
    }
}
