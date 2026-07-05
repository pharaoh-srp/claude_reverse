package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ll8 extends ez1 {
    public final /* synthetic */ int p;
    public final ez1 q;

    public ll8(String str) {
        this.p = 0;
        this.q = Build.VERSION.SDK_INT >= 34 ? new ll8() : new rc(str, 1);
    }

    @Override // defpackage.ez1
    public g6 L(Context context, Object obj) {
        switch (this.p) {
            case 1:
                Set set = (Set) obj;
                set.getClass();
                g6 g6VarY = ((vc) this.q).Y(context, (String[]) set.toArray(new String[0]));
                if (g6VarY == null) {
                    return null;
                }
                Object objB = g6VarY.b();
                objB.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) objB).entrySet()) {
                    Boolean bool = (Boolean) entry.getValue();
                    bool.getClass();
                    if (bool.booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return new g6(linkedHashMap.keySet());
            default:
                return super.L(context, obj);
        }
    }

    @Override // defpackage.ez1
    public final Object O(Intent intent, int i) {
        switch (this.p) {
            case 0:
                Object objO = this.q.O(intent, i);
                objO.getClass();
                return (Set) objO;
            default:
                Map mapZ = vc.Z(intent, i);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapZ.entrySet()) {
                    Boolean bool = (Boolean) entry.getValue();
                    bool.getClass();
                    if (bool.booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap.keySet();
        }
    }

    @Override // defpackage.ez1
    public final Intent y(Context context, Object obj) {
        switch (this.p) {
            case 0:
                Set set = (Set) obj;
                set.getClass();
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        if (!isg.q0((String) it.next(), "android.permission.health.", false)) {
                            sz6.p("Unsupported health connect permission");
                            return null;
                        }
                    }
                }
                if (set.isEmpty()) {
                    sz6.p("At least one permission is required!");
                    return null;
                }
                Intent intentY = this.q.y(context, set);
                intentY.getClass();
                return intentY;
            default:
                Set set3 = (Set) obj;
                set3.getClass();
                String[] strArr = (String[]) set3.toArray(new String[0]);
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
        }
    }

    public ll8() {
        this.p = 1;
        this.q = new vc(0);
    }
}
