package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b4 implements fab {
    @Override // defpackage.fab
    public final Set a() {
        return i().a();
    }

    @Override // defpackage.fab
    public Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        return i().b(c06Var, bz7Var);
    }

    @Override // defpackage.fab
    public final Set c() {
        return i().c();
    }

    @Override // defpackage.fab
    public Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return i().d(sxbVar, i);
    }

    @Override // defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return i().e(sxbVar, i);
    }

    @Override // defpackage.fab
    public final Set f() {
        return i().f();
    }

    @Override // defpackage.fab
    public Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return i().g(sxbVar, i);
    }

    public final fab h() {
        if (!(i() instanceof b4)) {
            return i();
        }
        fab fabVarI = i();
        fabVarI.getClass();
        return ((b4) fabVarI).h();
    }

    public abstract fab i();
}
