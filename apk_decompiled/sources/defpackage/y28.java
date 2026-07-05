package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y28 extends h1 {
    public final drd a;
    public final String b;
    public final Object c;

    public y28(drd drdVar, ao5 ao5Var, int i) {
        String str = drdVar.b;
        ao5Var = (i & 4) != 0 ? null : ao5Var;
        str.getClass();
        this.a = drdVar;
        this.b = str;
        this.c = ao5Var;
    }

    @Override // defpackage.h1
    public final drd a() {
        return this.a;
    }

    @Override // defpackage.h1
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.h1
    public final String c() {
        return this.b;
    }

    @Override // defpackage.h1
    public final kcc d() {
        return null;
    }
}
