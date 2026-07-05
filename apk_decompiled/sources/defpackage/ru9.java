package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ru9 implements p5b {
    public final /* synthetic */ p5b a;
    public final int b;
    public final int c;

    public ru9(p5b p5bVar, su9 su9Var) {
        this.a = p5bVar;
        qu9 qu9Var = su9Var.A0;
        qu9Var.getClass();
        this.b = qu9Var.E;
        qu9 qu9Var2 = su9Var.A0;
        qu9Var2.getClass();
        this.c = qu9Var2.F;
    }

    @Override // defpackage.p5b
    public final int a() {
        return this.c;
    }

    @Override // defpackage.p5b
    public final int b() {
        return this.b;
    }

    @Override // defpackage.p5b
    public final Map c() {
        return this.a.c();
    }

    @Override // defpackage.p5b
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.p5b
    public final bz7 e() {
        return this.a.e();
    }
}
