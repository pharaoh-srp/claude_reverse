package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zri extends bsi implements Iterable, mm9 {
    public final String E;
    public final float F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;
    public final float K;
    public final float L;
    public final List M;
    public final List N;

    public zri(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.E = str;
        this.F = f;
        this.G = f2;
        this.H = f3;
        this.I = f4;
        this.J = f5;
        this.K = f6;
        this.L = f7;
        this.M = list;
        this.N = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zri)) {
            zri zriVar = (zri) obj;
            return x44.r(this.E, zriVar.E) && this.F == zriVar.F && this.G == zriVar.G && this.H == zriVar.H && this.I == zriVar.I && this.J == zriVar.J && this.K == zriVar.K && this.L == zriVar.L && x44.r(this.M, zriVar.M) && x44.r(this.N, zriVar.N);
        }
        return false;
    }

    public final int hashCode() {
        return this.N.hashCode() + kgh.m(vb7.b(this.L, vb7.b(this.K, vb7.b(this.J, vb7.b(this.I, vb7.b(this.H, vb7.b(this.G, vb7.b(this.F, this.E.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.M);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new syc(this);
    }
}
