package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k9e implements i4a {
    public final /* synthetic */ int E;
    public final Object F;

    public /* synthetic */ k9e(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                u5f u5fVar = (u5f) obj;
                if (y3aVar != y3a.ON_CREATE) {
                    sz6.h("Next event must be ON_CREATE");
                    return;
                }
                m4aVar.a().c(this);
                Bundle bundleI = u5fVar.g().i("androidx.savedstate.Restarter");
                if (bundleI == null) {
                    return;
                }
                ArrayList<String> arrayListJ = ytk.j(bundleI);
                if (arrayListJ == null) {
                    sz6.j("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : arrayListJ) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, k9e.class.getClassLoader()).asSubclass(r5f.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                ((j2a) ((r5f) objNewInstance)).a(u5fVar);
                            } catch (Exception e) {
                                xh6.f(ij0.i("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        xh6.f(ij0.j("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                ba4 ba4Var = (ba4) obj;
                if (ba4Var.I == null) {
                    w94 w94Var = (w94) ba4Var.getLastNonConfigurationInstance();
                    if (w94Var != null) {
                        ba4Var.I = w94Var.a;
                    }
                    if (ba4Var.I == null) {
                        ba4Var.I = new dyi();
                    }
                }
                ba4Var.E.c(this);
                return;
            default:
                if (y3aVar != y3a.ON_CREATE) {
                    mr9.k("Next event must be ON_CREATE, it was ", y3aVar);
                    return;
                } else {
                    m4aVar.a().c(this);
                    ((p5f) obj).b();
                    return;
                }
        }
    }
}
