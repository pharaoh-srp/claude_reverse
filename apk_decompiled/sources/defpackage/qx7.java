package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class qx7 implements ox7 {
    public final /* synthetic */ rx7 a;

    public qx7(rx7 rx7Var) {
        this.a = rx7Var;
    }

    @Override // defpackage.ox7
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zT;
        rx7 rx7Var = this.a;
        ArrayList arrayList3 = rx7Var.n;
        if (rx7.J(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + rx7Var.a);
        }
        if (rx7Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zT = false;
        } else {
            ArrayList arrayList4 = rx7Var.d;
            tb1 tb1Var = (tb1) arrayList4.get(arrayList4.size() - 1);
            rx7Var.h = tb1Var;
            Iterator it = tb1Var.a.iterator();
            while (it.hasNext()) {
                cx7 cx7Var = ((zx7) it.next()).b;
                if (cx7Var != null) {
                    cx7Var.Q = true;
                }
            }
            zT = rx7Var.T(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(rx7.E((tb1) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    mr9.o();
                    return false;
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zT;
    }
}
