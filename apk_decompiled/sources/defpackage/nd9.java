package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nd9 implements v86 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ md9 b;
    public final /* synthetic */ fxc c;
    public final /* synthetic */ ad9 d;

    public nd9(boolean z, md9 md9Var, fxc fxcVar, ad9 ad9Var) {
        this.a = z;
        this.b = md9Var;
        this.c = fxcVar;
        this.d = ad9Var;
    }

    @Override // defpackage.v86
    public final void a() throws Throwable {
        if (this.a) {
            md9 md9Var = this.b;
            fxc fxcVar = this.c;
            ad9 ad9Var = this.d;
            md9Var.getClass();
            fxcVar.getClass();
            ad9Var.getClass();
            z9e z9eVar = new z9e();
            md9Var.d.compute(od9.d(ad9Var.a, ad9Var.b), new jd9(1, new a21(13, z9eVar)));
            if (z9eVar.E) {
                synchronized (md9Var.f) {
                    md9Var.f.remove(od9.d(ad9Var.a, ad9Var.b));
                }
                rl rlVar = fxcVar.a;
                if (rlVar != null) {
                    String str = ad9Var.a;
                    str.getClass();
                    rlVar.O(System.nanoTime(), str, (ArrayList) rlVar.F);
                }
                mpk.B(od9.c(ad9Var).hashCode(), od9.c(ad9Var));
            }
        }
    }
}
