package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tx7 extends vxi {
    public static final f20 h = new f20(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public tx7(boolean z) {
        this.e = z;
    }

    @Override // defpackage.vxi
    public final void d() {
        if (rx7.J(3)) {
            toString();
        }
        this.f = true;
    }

    public final void e(String str, boolean z) {
        HashMap map = this.c;
        tx7 tx7Var = (tx7) map.get(str);
        if (tx7Var != null) {
            if (z) {
                ArrayList<String> arrayList = new ArrayList();
                arrayList.addAll(tx7Var.c.keySet());
                for (String str2 : arrayList) {
                    rx7.J(3);
                    tx7Var.e(str2, true);
                }
            }
            tx7Var.d();
            map.remove(str);
        }
        HashMap map2 = this.d;
        dyi dyiVar = (dyi) map2.get(str);
        if (dyiVar != null) {
            dyiVar.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tx7.class == obj.getClass()) {
            tx7 tx7Var = (tx7) obj;
            if (this.b.equals(tx7Var.b) && this.c.equals(tx7Var.c) && this.d.equals(tx7Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(cx7 cx7Var) {
        if (this.g) {
            if (rx7.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(cx7Var.I) == null || !rx7.J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + cx7Var);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
