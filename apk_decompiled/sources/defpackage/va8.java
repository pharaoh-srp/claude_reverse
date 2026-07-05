package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class va8 implements x6f, bec, h57 {
    public static final String S = nga.e("GreedyScheduler");
    public final Context E;
    public final jw5 G;
    public boolean H;
    public final xhd K;
    public final cbf L;
    public final fg4 M;
    public Boolean O;
    public final wig P;
    public final ggj Q;
    public final dpf R;
    public final HashMap F = new HashMap();
    public final Object I = new Object();
    public final cbf J = new cbf(new hr5(1));
    public final HashMap N = new HashMap();

    public va8(Context context, fg4 fg4Var, j4i j4iVar, xhd xhdVar, cbf cbfVar, ggj ggjVar) {
        this.E = context;
        n78 n78Var = fg4Var.g;
        this.G = new jw5(this, n78Var, fg4Var.d);
        this.R = new dpf(n78Var, cbfVar);
        this.Q = ggjVar;
        this.P = new wig(j4iVar);
        this.M = fg4Var;
        this.K = xhdVar;
        this.L = cbfVar;
    }

    @Override // defpackage.bec
    public final void a(tgj tgjVar, xl4 xl4Var) {
        xfj xfjVarD = amk.d(tgjVar);
        boolean z = xl4Var instanceof vl4;
        cbf cbfVar = this.L;
        dpf dpfVar = this.R;
        cbf cbfVar2 = this.J;
        if (z) {
            if (cbfVar2.a(xfjVarD)) {
                return;
            }
            nga ngaVarC = nga.c();
            xfjVarD.toString();
            ngaVarC.getClass();
            hlg hlgVarQ = cbfVar2.q(xfjVarD);
            dpfVar.V(hlgVarQ);
            cbfVar.getClass();
            cbfVar.n(hlgVarQ, null);
            return;
        }
        nga ngaVarC2 = nga.c();
        xfjVarD.toString();
        ngaVarC2.getClass();
        hlg hlgVarL = cbfVar2.l(xfjVarD);
        if (hlgVarL != null) {
            dpfVar.w(hlgVarL);
            int iA = ((wl4) xl4Var).a();
            cbfVar.getClass();
            cbfVar.o(hlgVarL, iA);
        }
    }

    @Override // defpackage.h57
    public final void b(xfj xfjVar, boolean z) {
        lf9 lf9Var;
        hlg hlgVarL = this.J.l(xfjVar);
        if (hlgVarL != null) {
            this.R.w(hlgVarL);
        }
        synchronized (this.I) {
            lf9Var = (lf9) this.F.remove(xfjVar);
        }
        if (lf9Var != null) {
            nga ngaVarC = nga.c();
            Objects.toString(xfjVar);
            ngaVarC.getClass();
            lf9Var.d(null);
        }
        if (z) {
            return;
        }
        synchronized (this.I) {
            this.N.remove(xfjVar);
        }
    }

    @Override // defpackage.x6f
    public final boolean c() {
        return false;
    }

    @Override // defpackage.x6f
    public final void d(String str) {
        List<hlg> listB;
        Runnable runnable;
        if (this.O == null) {
            this.O = Boolean.valueOf(shd.a(this.E, this.M));
        }
        if (!this.O.booleanValue()) {
            nga.c().d(S, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.H) {
            this.K.a(this);
            this.H = true;
        }
        nga.c().getClass();
        jw5 jw5Var = this.G;
        if (jw5Var != null && (runnable = (Runnable) jw5Var.d.remove(str)) != null) {
            ((Handler) jw5Var.b.F).removeCallbacks(runnable);
        }
        cbf cbfVar = this.J;
        cbfVar.getClass();
        str.getClass();
        synchronized (cbfVar.G) {
            listB = ((hr5) cbfVar.F).b(str);
        }
        for (hlg hlgVar : listB) {
            this.R.w(hlgVar);
            cbf cbfVar2 = this.L;
            cbfVar2.getClass();
            cbfVar2.o(hlgVar, -512);
        }
    }

    @Override // defpackage.x6f
    public final void e(tgj... tgjVarArr) {
        long jMax;
        if (this.O == null) {
            this.O = Boolean.valueOf(shd.a(this.E, this.M));
        }
        if (!this.O.booleanValue()) {
            nga.c().d(S, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.H) {
            this.K.a(this);
            this.H = true;
        }
        HashSet<tgj> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        boolean z = false;
        for (tgj tgjVar : tgjVarArr) {
            if (!this.J.a(amk.d(tgjVar))) {
                synchronized (this.I) {
                    try {
                        xfj xfjVarD = amk.d(tgjVar);
                        ua8 ua8Var = (ua8) this.N.get(xfjVarD);
                        if (ua8Var == null) {
                            int i = tgjVar.k;
                            this.M.d.getClass();
                            ua8Var = new ua8(i, System.currentTimeMillis());
                            this.N.put(xfjVarD, ua8Var);
                        }
                        jMax = (((long) Math.max((tgjVar.k - ua8Var.a) - 5, 0)) * 30000) + ua8Var.b;
                    } finally {
                    }
                }
                long jMax2 = Math.max(tgjVar.a(), jMax);
                this.M.d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (tgjVar.b == zfj.E) {
                    if (jCurrentTimeMillis < jMax2) {
                        jw5 jw5Var = this.G;
                        if (jw5Var != null) {
                            n78 n78Var = jw5Var.b;
                            HashMap map = jw5Var.d;
                            Runnable runnable = (Runnable) map.remove(tgjVar.a);
                            if (runnable != null) {
                                ((Handler) n78Var.F).removeCallbacks(runnable);
                            }
                            t08 t08Var = new t08(jw5Var, tgjVar, z, 4);
                            map.put(tgjVar.a, t08Var);
                            jw5Var.c.getClass();
                            ((Handler) n78Var.F).postDelayed(t08Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (tgjVar.i()) {
                        ql4 ql4Var = tgjVar.j;
                        if (ql4Var.j()) {
                            nga ngaVarC = nga.c();
                            tgjVar.toString();
                            ngaVarC.getClass();
                        } else if (ql4Var.g()) {
                            nga ngaVarC2 = nga.c();
                            tgjVar.toString();
                            ngaVarC2.getClass();
                        } else {
                            hashSet.add(tgjVar);
                            hashSet2.add(tgjVar.a);
                        }
                    } else if (!this.J.a(amk.d(tgjVar))) {
                        nga.c().getClass();
                        cbf cbfVar = this.J;
                        cbfVar.getClass();
                        hlg hlgVarQ = cbfVar.q(amk.d(tgjVar));
                        this.R.V(hlgVarQ);
                        cbf cbfVar2 = this.L;
                        cbfVar2.getClass();
                        cbfVar2.n(hlgVarQ, null);
                    }
                }
            }
        }
        synchronized (this.I) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    nga.c().getClass();
                    for (tgj tgjVar2 : hashSet) {
                        xfj xfjVarD2 = amk.d(tgjVar2);
                        if (!this.F.containsKey(xfjVarD2)) {
                            this.F.put(xfjVarD2, ofj.a(this.P, tgjVar2, this.Q.b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }
}
