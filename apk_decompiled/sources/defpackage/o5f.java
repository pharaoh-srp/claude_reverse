package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class o5f {
    public static final vz8 a;
    public static final unb b = new unb(27);
    public static final k2e c;

    static {
        int i = 27;
        a = new vz8(i);
        c = new k2e(i);
    }

    public static final k5f a(sub subVar) {
        LinkedHashMap linkedHashMap = subVar.a;
        u5f u5fVar = (u5f) linkedHashMap.get(a);
        Bundle bundle = null;
        if (u5fVar == null) {
            sz6.p("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        eyi eyiVar = (eyi) linkedHashMap.get(b);
        if (eyiVar == null) {
            sz6.p("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(cyi.a);
        if (str == null) {
            sz6.p("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        s5f s5fVarT = u5fVar.g().t("androidx.lifecycle.internal.SavedStateHandlesProvider");
        p5f p5fVar = s5fVarT instanceof p5f ? (p5f) s5fVarT : null;
        if (p5fVar == null) {
            sz6.j("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = c(eyiVar).b;
        k5f k5fVar = (k5f) linkedHashMap2.get(str);
        if (k5fVar != null) {
            return k5fVar;
        }
        p5fVar.b();
        Bundle bundle3 = p5fVar.c;
        if (bundle3 != null && ytk.f(str, bundle3)) {
            Bundle bundleI = ytk.i(str, bundle3);
            if (bundleI == null) {
                bundleI = eve.m((cpc[]) Arrays.copyOf(new cpc[0], 0));
            }
            bundle3.remove(str);
            if (ytk.l(bundle3)) {
                p5fVar.c = null;
            }
            bundle = bundleI;
        }
        k5f k5fVarE = wtk.e(bundle, bundle2);
        linkedHashMap2.put(str, k5fVarE);
        return k5fVarE;
    }

    public static final void b(u5f u5fVar) {
        a4a a4aVarB = u5fVar.a().b();
        if (a4aVarB != a4a.F && a4aVarB != a4a.G) {
            sz6.p("Failed requirement.");
        } else if (u5fVar.g().t("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            p5f p5fVar = new p5f(u5fVar.g(), (eyi) u5fVar);
            u5fVar.g().B("androidx.lifecycle.internal.SavedStateHandlesProvider", p5fVar);
            u5fVar.a().a(new k9e(2, p5fVar));
        }
    }

    public static final q5f c(eyi eyiVar) {
        n5f n5fVar = new n5f();
        j95 j95VarD = eyiVar instanceof tf8 ? ((tf8) eyiVar).d() : i95.b;
        j95VarD.getClass();
        dyi dyiVarF = eyiVar.f();
        dyiVarF.getClass();
        return (q5f) new dpf(dyiVarF, n5fVar, j95VarD).L(jce.a.b(q5f.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
