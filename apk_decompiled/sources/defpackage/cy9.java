package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cy9 implements zmc {
    public final el5 a;
    public final afa b;

    public cy9(ke9 ke9Var) {
        this.a = new el5(ke9Var, efk.P, new t29(null));
        gfa gfaVar = ke9Var.a;
        gfaVar.getClass();
        this.b = new afa(gfaVar, new ConcurrentHashMap(3, 1.0f, 2), new wl0(13), 0);
    }

    @Override // defpackage.zmc
    public final boolean a(ww7 ww7Var) {
        ww7Var.getClass();
        ((ke9) this.a.E).b.getClass();
        return false;
    }

    @Override // defpackage.zmc
    public final void b(ww7 ww7Var, ArrayList arrayList) {
        ww7Var.getClass();
        arrayList.add(c(ww7Var));
    }

    public final by9 c(ww7 ww7Var) throws Throwable {
        ((ke9) this.a.E).b.getClass();
        ww7Var.getClass();
        mx1 mx1Var = new mx1(this, 11, new ube(ww7Var));
        afa afaVar = this.b;
        afaVar.getClass();
        Object objInvoke = afaVar.invoke(new bfa(ww7Var, mx1Var));
        if (objInvoke != null) {
            return (by9) objInvoke;
        }
        afa.d(3);
        throw null;
    }

    @Override // defpackage.zmc
    public final Collection g(ww7 ww7Var, bz7 bz7Var) {
        ww7Var.getClass();
        Collection collection = (List) c(ww7Var).O.a();
        if (collection == null) {
            collection = lm6.E;
        }
        return collection;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((ke9) this.a.E).o;
    }
}
