package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidComposeView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class y50 {
    public boolean a;
    public Object b = new efk(20);
    public Object c = new qo0();
    public Object d = um6.E;
    public Object e;

    public void a(Object obj) {
        Object objRemoveFirst;
        Set set;
        synchronized (((efk) this.b)) {
            Throwable th = (Throwable) this.e;
            if (th != null) {
                throw new IllegalStateException("Can't process the event due to a previous failure", th);
            }
            ((qo0) this.c).addLast(obj);
            if (this.a) {
                return;
            }
            this.a = true;
            while (true) {
                synchronized (((efk) this.b)) {
                    if (((qo0) this.c).isEmpty()) {
                        this.a = false;
                        return;
                    } else {
                        objRemoveFirst = ((qo0) this.c).removeFirst();
                        set = (Set) this.d;
                    }
                }
                try {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((bz7) it.next()).invoke(objRemoveFirst);
                    }
                } catch (Throwable th2) {
                    synchronized (((efk) this.b)) {
                        ((qo0) this.c).clear();
                        this.a = false;
                        this.e = th2;
                        throw th2;
                    }
                }
            }
        }
    }

    public int b(i49 i49Var, AndroidComposeView androidComposeView, boolean z) {
        boolean z2;
        boolean z3;
        an8 an8Var = (an8) this.c;
        dn8 dn8Var = (dn8) this.e;
        if (this.a) {
            return lvj.c(false, false, false);
        }
        boolean z4 = true;
        try {
            this.a = true;
            i99 i99VarI = ((gmf) this.d).I(i49Var, androidComposeView);
            zka zkaVar = (zka) i99VarI.F;
            int iH = zkaVar.h();
            for (int i = 0; i < iH; i++) {
                z7d z7dVar = (z7d) zkaVar.i(i);
                if (!z7dVar.f() && !z7dVar.i()) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int iH2 = zkaVar.h();
            for (int i2 = 0; i2 < iH2; i2++) {
                z7d z7dVar2 = (z7d) zkaVar.i(i2);
                if (z2 || hvj.h(z7dVar2)) {
                    ((av9) this.b).N(z7dVar2.e(), (dn8) this.e, z7dVar2.j(), true);
                    if (!dn8Var.E.h()) {
                        an8Var.a(z7dVar2.d(), dn8Var, hvj.h(z7dVar2));
                        dn8Var.clear();
                    }
                }
            }
            boolean zB = an8Var.b(i99VarI, z);
            if (i99VarI.E) {
                z3 = false;
            } else {
                int iH3 = zkaVar.h();
                for (int i3 = 0; i3 < iH3; i3++) {
                    z7d z7dVar3 = (z7d) zkaVar.i(i3);
                    if (hvj.s(z7dVar3) && z7dVar3.l()) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            }
            int iH4 = zkaVar.h();
            int i4 = 0;
            while (true) {
                if (i4 >= iH4) {
                    z4 = false;
                    break;
                }
                if (((z7d) zkaVar.i(i4)).l()) {
                    break;
                }
                i4++;
            }
            int iC = lvj.c(zB, z3, z4);
            this.a = false;
            return iC;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public synchronized void c() {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            Context context = (Context) this.e;
            if (context != null) {
                ((x50) this.c).b(context);
                context.unregisterComponentCallbacks((o20) this.d);
            }
            ((WeakReference) this.b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public uwb d(bz7 bz7Var) {
        synchronized (((efk) this.b)) {
            this.d = dxf.q0((Set) this.d, bz7Var);
        }
        return new uwb(this, bz7Var, 1);
    }

    public void e(int i, int i2) {
        if (i < MTTypesetterKt.kLineSkipLimitMultiplier) {
            e39.a("Index should be non-negative (" + i + ')');
        }
        ((isc) this.b).i(i);
        ((pz9) this.e).a(i);
        ((isc) this.c).i(i2);
    }
}
