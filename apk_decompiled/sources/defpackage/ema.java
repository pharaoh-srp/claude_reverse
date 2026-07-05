package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ema implements p5b {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ bz7 d;
    public final /* synthetic */ bz7 e;
    public final /* synthetic */ fma f;

    public ema(int i, int i2, Map map, bz7 bz7Var, bz7 bz7Var2, fma fmaVar) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = bz7Var;
        this.e = bz7Var2;
        this.f = fmaVar;
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
        this.e.invoke(this.f.P);
    }

    @Override // defpackage.p5b
    public final bz7 e() {
        return this.d;
    }
}
