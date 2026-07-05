package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class yk4 implements pog {
    public final ob1 E;
    public final hh1 F;
    public final hh1 G;
    public final g4d H;
    public final g4d I;
    public final gmf J;
    public final h99 K;
    public final xi7 L;
    public final wjb M;
    public final String N;
    public final efk O;
    public final LinkedHashSet P;
    public final Object Q;

    public yk4(ob1 ob1Var, hh1 hh1Var, hh1 hh1Var2, g4d g4dVar, g4d g4dVar2, gmf gmfVar, h99 h99Var, xi7 xi7Var, wjb wjbVar, String str) {
        efk efkVar = new efk(13);
        h99Var.getClass();
        wjbVar.getClass();
        this.E = ob1Var;
        this.F = hh1Var;
        this.G = hh1Var2;
        this.H = g4dVar;
        this.I = g4dVar2;
        this.J = gmfVar;
        this.K = h99Var;
        this.L = xi7Var;
        this.M = wjbVar;
        this.N = str;
        this.O = efkVar;
        this.P = new LinkedHashSet();
        this.Q = new Object();
    }

    @Override // defpackage.pog
    public final void h(ih1 ih1Var, mpk mpkVar, boolean z) {
        Object next;
        xk4 xk4Var;
        synchronized (this.P) {
            try {
                Iterator it = this.P.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String absolutePath = ((xk4) next).a.getAbsolutePath();
                    absolutePath.getClass();
                    if (absolutePath.equals(ih1Var.a)) {
                        break;
                    }
                }
                xk4Var = (xk4) next;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xk4Var == null) {
            return;
        }
        if (z) {
            File file = xk4Var.a;
            File file2 = xk4Var.b;
            g99 g99Var = g99.F;
            h99 h99Var = this.K;
            long jI0 = fd9.i0(file, h99Var);
            gmf gmfVar = this.J;
            if (gmfVar.z(file)) {
                this.M.r(file, mpkVar, this.F.J.decrementAndGet());
                if (mpkVar.equals(new kfe(202)) && jI0 > 0) {
                    efk efkVar = this.O;
                    String str = this.N;
                    efkVar.getClass();
                    str.getClass();
                    efkVar.w(str, "android.benchmark.bytes_deleted");
                }
            } else {
                dch.H(this.K, 4, g99Var, new fh1(file, 2), null, false, 56);
            }
            if (file2 != null && fd9.T(file2, h99Var) && !gmfVar.z(file2)) {
                dch.H(this.K, 4, g99Var, new fh1(file2, 3), null, false, 56);
            }
        }
        synchronized (this.P) {
            this.P.remove(xk4Var);
        }
    }

    @Override // defpackage.pog
    public final yg1 m() {
        synchronized (this.P) {
            try {
                hh1 hh1Var = this.F;
                LinkedHashSet linkedHashSet = this.P;
                ArrayList arrayList = new ArrayList(x44.y(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xk4) it.next()).a);
                }
                File fileE = hh1Var.e(w44.t1(arrayList));
                byte[] bArr = null;
                if (fileE == null) {
                    return null;
                }
                File fileL = this.F.l(fileE);
                this.P.add(new xk4(fileE, fileL));
                String absolutePath = fileE.getAbsolutePath();
                absolutePath.getClass();
                ih1 ih1Var = new ih1(absolutePath);
                if (fileL != null && fd9.T(fileL, this.K)) {
                    bArr = (byte[]) this.I.e(fileL);
                }
                return new yg1(ih1Var, this.H.f(fileE), bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pog
    public final bz7 q(lj5 lj5Var) {
        hh1 hh1Var;
        lj5Var.getClass();
        int iOrdinal = lj5Var.o.ordinal();
        if (iOrdinal != 0) {
            hh1Var = null;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    mr9.b();
                    return null;
                }
                hh1Var = this.G;
            }
        } else {
            hh1Var = this.F;
        }
        hh1 hh1Var2 = hh1Var;
        Object obj = this.Q;
        if (hh1Var2 == null) {
            return new k01(this.E, new k4c(), obj, this.N, this.K);
        }
        return new k01(this.E, new ki7(hh1Var2, this.H, this.I, this.L, this, this.K), obj, this.N, this.K);
    }
}
