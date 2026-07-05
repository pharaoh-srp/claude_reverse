package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class sn0 implements p5b {
    public final int a;
    public final int b;
    public final Map c;
    public final bz7 d;
    public final /* synthetic */ bz7 e;
    public final /* synthetic */ tn0 f;

    public sn0(int i, int i2, Map map, bz7 bz7Var, bz7 bz7Var2, tn0 tn0Var) {
        this.e = bz7Var2;
        this.f = tn0Var;
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = bz7Var;
    }

    @Override // defpackage.p5b
    public final int a() {
        return this.b;
    }

    @Override // defpackage.p5b
    public final int b() {
        return this.a;
    }

    @Override // defpackage.p5b
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.p5b
    public final void d() {
        this.e.invoke(this.f.E.P);
    }

    @Override // defpackage.p5b
    public final bz7 e() {
        return this.d;
    }
}
