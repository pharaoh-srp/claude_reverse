package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ad extends zh4 {
    public final /* synthetic */ int r;
    public final /* synthetic */ z94 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ ez1 u;

    public /* synthetic */ ad(z94 z94Var, String str, ez1 ez1Var, int i) {
        this.r = i;
        this.s = z94Var;
        this.t = str;
        this.u = ez1Var;
    }

    public void B() {
        this.s.e(this.t);
    }

    @Override // defpackage.zh4
    public final void t(Object obj) {
        int i = this.r;
        ez1 ez1Var = this.u;
        String str = this.t;
        z94 z94Var = this.s;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = z94Var.b;
                ArrayList arrayList = z94Var.d;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    mr9.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", ez1Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    z94Var.b(iIntValue, ez1Var, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = z94Var.d;
                Object obj3 = z94Var.b.get(str);
                if (obj3 == null) {
                    mr9.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", ez1Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    z94Var.b(iIntValue2, ez1Var, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }
}
