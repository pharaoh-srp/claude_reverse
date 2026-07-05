package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ca9 extends iwe {
    public final gob b;
    public final x97 c;
    public final j8i d;

    public ca9(gob gobVar, x97 x97Var, j8i j8iVar, h86 h86Var) {
        super(h86Var);
        this.b = gobVar;
        this.c = x97Var;
        this.d = j8iVar;
    }

    public final void O() {
        gob gobVar = this.b;
        SharedPreferences sharedPreferences = gobVar.a;
        Set<String> setKeySet = sharedPreferences.getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            str.getClass();
            if (isg.q0(str, "notice_", false)) {
                arrayList.add(obj);
            }
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
        gobVar.d.clear();
    }

    public final String P() {
        j8i j8iVar = this.d;
        boolean zB = ((jf0) j8iVar.e).b();
        u5e u5eVar = j8iVar.d;
        boolean zG = u5eVar.g();
        boolean z = u5eVar.g() && u5eVar.i().containsAlias("trusted_device_reattest");
        boolean zH = u5eVar.h();
        k8i k8iVar = j8iVar.c;
        boolean z2 = k8iVar.c() != null;
        boolean z3 = k8iVar.e() != null;
        SharedPreferences sharedPreferencesD = k8iVar.d();
        boolean z4 = (sharedPreferencesD != null ? sharedPreferencesD.getString("device_binding_kid", null) : null) != null;
        StringBuilder sb = new StringBuilder("gate=");
        sb.append(zB);
        sb.append(" bio=");
        sb.append(zG);
        sb.append(" key=");
        ij0.A(sb, z, " bind=", zH, " deviceId=");
        ij0.A(sb, z2, " kid=", z3, " bindKid=");
        sb.append(z4);
        return sb.toString();
    }
}
