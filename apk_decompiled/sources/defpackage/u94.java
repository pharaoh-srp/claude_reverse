package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u94 implements s5f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u94(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.s5f
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                z94 z94Var = ((ba4) obj).M;
                z94Var.getClass();
                LinkedHashMap linkedHashMap = z94Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(z94Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(z94Var.g));
                return bundle;
            case 1:
                Map mapE = ((d5f) obj).e();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapE.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                fx7 fx7Var = (fx7) obj;
                while (fx7.o(((ex7) fx7Var.Z.F).P)) {
                }
                fx7Var.a0.f(y3a.ON_STOP);
                return new Bundle();
            default:
                return ((rx7) obj).X();
        }
    }
}
