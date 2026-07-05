package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class v5f implements zxi {
    public final Application a;
    public final yxi b;
    public final Bundle c;
    public final c4a d;
    public final q28 e;

    public v5f(Application application, u5f u5fVar, Bundle bundle) {
        yxi yxiVar;
        this.e = u5fVar.g();
        this.d = u5fVar.a();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (yxi.c == null) {
                yxi.c = new yxi(application);
            }
            yxiVar = yxi.c;
            yxiVar.getClass();
        } else {
            yxiVar = new yxi(null);
        }
        this.b = yxiVar;
    }

    @Override // defpackage.zxi
    public final vxi a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        sz6.p("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.zxi
    public final vxi b(Class cls, sub subVar) {
        LinkedHashMap linkedHashMap = subVar.a;
        String str = (String) linkedHashMap.get(cyi.a);
        if (str == null) {
            sz6.j("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(o5f.a) == null || linkedHashMap.get(o5f.b) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            sz6.j("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(yxi.d);
        boolean zIsAssignableFrom = p70.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? w5f.a(cls, w5f.b) : w5f.a(cls, w5f.a);
        return constructorA == null ? this.b.b(cls, subVar) : (!zIsAssignableFrom || application == null) ? w5f.b(cls, constructorA, o5f.a(subVar)) : w5f.b(cls, constructorA, application, o5f.a(subVar));
    }

    @Override // defpackage.zxi
    public final vxi c(pl9 pl9Var, sub subVar) {
        pl9Var.getClass();
        return b(ez1.I(pl9Var), subVar);
    }

    public final vxi d(Class cls, String str) {
        c4a c4aVar = this.d;
        if (c4aVar == null) {
            pmf.n("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = p70.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? w5f.a(cls, w5f.b) : w5f.a(cls, w5f.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (ayi.a == null) {
                ayi.a = new ayi();
            }
            ayi.a.getClass();
            return sf5.B(cls);
        }
        q28 q28Var = this.e;
        q28Var.getClass();
        k5f k5fVarE = wtk.e(q28Var.i(str), this.c);
        l5f l5fVar = new l5f(str, k5fVarE);
        l5fVar.c(q28Var, c4aVar);
        a4a a4aVarB = c4aVar.b();
        if (a4aVarB == a4a.F || a4aVarB.compareTo(a4a.H) >= 0) {
            q28Var.D();
        } else {
            c4aVar.a(new k2a(q28Var, c4aVar));
        }
        vxi vxiVarB = (!zIsAssignableFrom || application == null) ? w5f.b(cls, constructorA, k5fVarE) : w5f.b(cls, constructorA, application, k5fVarE);
        vxiVarB.a("androidx.lifecycle.savedstate.vm.tag", l5fVar);
        return vxiVarB;
    }

    public final void e(vxi vxiVar) {
        c4a c4aVar = this.d;
        if (c4aVar != null) {
            q28 q28Var = this.e;
            q28Var.getClass();
            svj.e(vxiVar, q28Var, c4aVar);
        }
    }
}
