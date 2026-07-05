package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bpi extends f1 {
    public final z52 a;

    public bpi(z52 z52Var) {
        this.a = z52Var;
    }

    @Override // defpackage.f1
    public final z52 a() {
        return this.a;
    }

    @Override // defpackage.f1
    public final l25 b() {
        return cpi.d;
    }

    @Override // defpackage.f1
    public final Object d(l25 l25Var) {
        p09 p09Var = (p09) l25Var;
        p09Var.getClass();
        int i = x44.r(p09Var.a, Boolean.TRUE) ? -1 : 1;
        Integer num = p09Var.b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i) : null;
        Integer num2 = p09Var.c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i) : null;
        Integer num3 = p09Var.d;
        return epi.a(numValueOf, numValueOf2, num3 != null ? Integer.valueOf(num3.intValue() * i) : null);
    }
}
