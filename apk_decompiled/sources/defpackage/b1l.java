package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b1l implements Callable {
    public final /* synthetic */ u1l E;
    public final /* synthetic */ o0l F;

    public b1l(o0l o0lVar, u1l u1lVar) {
        this.E = u1lVar;
        this.F = o0lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        u1l u1lVar = this.E;
        String str = u1lVar.E;
        dgj.v(str);
        o0l o0lVar = this.F;
        qrk qrkVarD = o0lVar.D(str);
        ork orkVar = ork.ANALYTICS_STORAGE;
        if (qrkVarD.i(orkVar) && qrk.f(100, u1lVar.Z).i(orkVar)) {
            return o0lVar.f(u1lVar).g();
        }
        o0lVar.b0().R.b("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
