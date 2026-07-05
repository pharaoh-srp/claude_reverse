package defpackage;

import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class j2a implements r5f {
    public final void a(u5f u5fVar) {
        if (!(u5fVar instanceof eyi)) {
            mr9.k("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", u5fVar);
            return;
        }
        dyi dyiVarF = ((eyi) u5fVar).f();
        q28 q28VarG = u5fVar.g();
        dyiVarF.getClass();
        LinkedHashMap linkedHashMap = dyiVarF.a;
        for (String str : new HashSet(linkedHashMap.keySet())) {
            str.getClass();
            vxi vxiVar = (vxi) linkedHashMap.get(str);
            if (vxiVar != null) {
                svj.e(vxiVar, q28VarG, u5fVar.a());
            }
        }
        if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
            return;
        }
        q28VarG.D();
    }
}
