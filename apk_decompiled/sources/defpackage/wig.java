package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wig {
    public final ArrayList a;

    public wig(j4i j4iVar) {
        j4iVar.getClass();
        int i = ofj.a;
        ml4 ml4Var = j4iVar.b;
        s1c s1cVar = j4iVar.d;
        ArrayList arrayListA0 = x44.a0(new kh1(ml4Var, 0), new kh1(j4iVar.c), new kh1(j4iVar.e, 2));
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = j4iVar.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            arrayListA0.add(new l1c((ConnectivityManager) systemService));
        } else {
            s1cVar.getClass();
            arrayListA0.addAll(x44.X(new n0c(s1cVar, 0), new n0c(s1cVar, 1), new h1c(s1cVar), new c1c(s1cVar)));
        }
        this.a = arrayListA0;
    }

    public void a(Object obj) {
        this.a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.a;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public wig(int i) {
        this.a = new ArrayList(i);
    }
}
