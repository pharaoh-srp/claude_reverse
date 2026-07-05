package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kmj implements h88, i88 {
    public final ge0 j;
    public final gf0 k;
    public final cbf l;
    public final int o;
    public final xmj p;
    public boolean q;
    public final /* synthetic */ j88 u;
    public final LinkedList i = new LinkedList();
    public final HashSet m = new HashSet();
    public final HashMap n = new HashMap();
    public final ArrayList r = new ArrayList();
    public hh4 s = null;
    public int t = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public kmj(j88 j88Var, e88 e88Var) {
        this.u = j88Var;
        Looper looper = j88Var.Q.getLooper();
        fj0 fj0VarA = e88Var.a();
        rl rlVar = new rl((String) fj0VarA.F, (String) fj0VarA.G, (ip0) fj0VarA.E);
        iv1 iv1Var = (iv1) e88Var.c.F;
        dgj.v(iv1Var);
        ge0 ge0VarK = iv1Var.k(e88Var.a, looper, rlVar, e88Var.d, this, this);
        String str = e88Var.b;
        if (str != null && (ge0VarK instanceof fe1)) {
            ((fe1) ge0VarK).W = str;
        }
        if (str != null && (ge0VarK instanceof f6c)) {
            ij0.x(ge0VarK);
            throw null;
        }
        this.j = ge0VarK;
        this.k = e88Var.e;
        this.l = new cbf(22);
        this.o = e88Var.g;
        if (!ge0VarK.l()) {
            this.p = null;
            return;
        }
        Context context = j88Var.I;
        xnj xnjVar = j88Var.Q;
        fj0 fj0VarA2 = e88Var.a();
        this.p = new xmj(context, xnjVar, new rl((String) fj0VarA2.F, (String) fj0VarA2.G, (ip0) fj0VarA2.E));
    }

    public final void a(hh4 hh4Var) {
        HashSet hashSet = this.m;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            mr9.o();
        } else {
            if (gb9.v(hh4Var, hh4.J)) {
                this.j.e();
            }
            throw null;
        }
    }

    @Override // defpackage.i88
    public final void b(hh4 hh4Var) {
        o(hh4Var, null);
    }

    @Override // defpackage.h88
    public final void c(int i) {
        Looper looperMyLooper = Looper.myLooper();
        xnj xnjVar = this.u.Q;
        if (looperMyLooper == xnjVar.getLooper()) {
            i(i);
        } else {
            xnjVar.post(new jmj(this, i));
        }
    }

    @Override // defpackage.h88
    public final void d() {
        Looper looperMyLooper = Looper.myLooper();
        xnj xnjVar = this.u.Q;
        if (looperMyLooper == xnjVar.getLooper()) {
            h();
        } else {
            xnjVar.post(new k51(12, this));
        }
    }

    public final void e(Status status) {
        dgj.q(this.u.Q);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z) {
        dgj.q(this.u.Q);
        if ((status == null) == (exc == null)) {
            sz6.p("Status XOR exception should be null");
            return;
        }
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            pnj pnjVar = (pnj) it.next();
            if (!z || pnjVar.a == 2) {
                if (status != null) {
                    pnjVar.a(status);
                } else {
                    pnjVar.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.i;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pnj pnjVar = (pnj) arrayList.get(i);
            if (!this.j.a()) {
                return;
            }
            if (k(pnjVar)) {
                linkedList.remove(pnjVar);
            }
        }
    }

    public final void h() {
        ge0 ge0Var = this.j;
        j88 j88Var = this.u;
        dgj.q(j88Var.Q);
        this.s = null;
        a(hh4.J);
        xnj xnjVar = j88Var.Q;
        if (this.q) {
            gf0 gf0Var = this.k;
            xnjVar.removeMessages(11, gf0Var);
            xnjVar.removeMessages(9, gf0Var);
            this.q = false;
        }
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            try {
                ((vmj) it.next()).a.a(ge0Var, new j5h());
            } catch (DeadObjectException unused) {
                c(3);
                ge0Var.c("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        g();
        j();
    }

    public final void i(int i) {
        j88 j88Var = this.u;
        xnj xnjVar = j88Var.Q;
        dgj.q(j88Var.Q);
        this.s = null;
        this.q = true;
        String strK = this.j.k();
        cbf cbfVar = this.l;
        cbfVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strK != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strK);
        }
        cbfVar.u(true, new Status(20, sb.toString(), null, null));
        gf0 gf0Var = this.k;
        xnjVar.sendMessageDelayed(Message.obtain(xnjVar, 9, gf0Var), 5000L);
        xnjVar.sendMessageDelayed(Message.obtain(xnjVar, 11, gf0Var), 120000L);
        ((SparseIntArray) j88Var.K.F).clear();
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((vmj) it.next()).getClass();
        }
    }

    public final void j() {
        j88 j88Var = this.u;
        xnj xnjVar = j88Var.Q;
        gf0 gf0Var = this.k;
        xnjVar.removeMessages(12, gf0Var);
        xnjVar.sendMessageDelayed(xnjVar.obtainMessage(12, gf0Var), j88Var.E);
    }

    public final boolean k(pnj pnjVar) {
        jf7 jf7Var;
        if (!(pnjVar instanceof omj)) {
            cbf cbfVar = this.l;
            ge0 ge0Var = this.j;
            pnjVar.d(cbfVar, ge0Var.l());
            try {
                pnjVar.c(this);
                return true;
            } catch (DeadObjectException unused) {
                c(1);
                ge0Var.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        omj omjVar = (omj) pnjVar;
        jf7[] jf7VarArrG = omjVar.g(this);
        if (jf7VarArrG == null || jf7VarArrG.length == 0) {
            jf7Var = null;
        } else {
            jf7[] jf7VarArrJ = this.j.j();
            if (jf7VarArrJ == null) {
                jf7VarArrJ = new jf7[0];
            }
            bp0 bp0Var = new bp0(jf7VarArrJ.length);
            for (jf7 jf7Var2 : jf7VarArrJ) {
                bp0Var.put(jf7Var2.E, Long.valueOf(jf7Var2.l0()));
            }
            int length = jf7VarArrG.length;
            for (int i = 0; i < length; i++) {
                jf7Var = jf7VarArrG[i];
                Long l = (Long) bp0Var.get(jf7Var.E);
                if (l == null || l.longValue() < jf7Var.l0()) {
                    break;
                }
            }
            jf7Var = null;
        }
        if (jf7Var == null) {
            cbf cbfVar2 = this.l;
            ge0 ge0Var2 = this.j;
            pnjVar.d(cbfVar2, ge0Var2.l());
            try {
                pnjVar.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                c(1);
                ge0Var2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.j.getClass().getName() + " could not execute call because it requires feature (" + jf7Var.E + ", " + jf7Var.l0() + ").");
        if (!this.u.R || !omjVar.f(this)) {
            omjVar.b(new UnsupportedApiCallException(jf7Var));
            return true;
        }
        lmj lmjVar = new lmj(this.k, jf7Var);
        int iIndexOf = this.r.indexOf(lmjVar);
        ArrayList arrayList = this.r;
        if (iIndexOf >= 0) {
            lmj lmjVar2 = (lmj) arrayList.get(iIndexOf);
            this.u.Q.removeMessages(15, lmjVar2);
            xnj xnjVar = this.u.Q;
            xnjVar.sendMessageDelayed(Message.obtain(xnjVar, 15, lmjVar2), 5000L);
        } else {
            arrayList.add(lmjVar);
            xnj xnjVar2 = this.u.Q;
            xnjVar2.sendMessageDelayed(Message.obtain(xnjVar2, 15, lmjVar), 5000L);
            xnj xnjVar3 = this.u.Q;
            xnjVar3.sendMessageDelayed(Message.obtain(xnjVar3, 16, lmjVar), 120000L);
            hh4 hh4Var = new hh4(2, null, null);
            if (!l(hh4Var)) {
                this.u.c(hh4Var, this.o);
            }
        }
        return false;
    }

    public final boolean l(hh4 hh4Var) {
        synchronized (j88.U) {
        }
        return false;
    }

    public final void m() {
        j88 j88Var = this.u;
        dgj.q(j88Var.Q);
        ge0 ge0Var = this.j;
        if (ge0Var.a() || ge0Var.d()) {
            return;
        }
        try {
            cbf cbfVar = j88Var.K;
            Context context = j88Var.I;
            SparseIntArray sparseIntArray = (SparseIntArray) cbfVar.F;
            dgj.v(context);
            int iC = 0;
            if (ge0Var.h()) {
                int i = ge0Var.i();
                int i2 = ((SparseIntArray) cbfVar.F).get(i, -1);
                if (i2 != -1) {
                    iC = i2;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= sparseIntArray.size()) {
                            iC = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i3);
                        if (iKeyAt > i && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (iC == -1) {
                        iC = ((f88) cbfVar.G).c(context, i);
                    }
                    sparseIntArray.put(i, iC);
                }
            }
            if (iC != 0) {
                hh4 hh4Var = new hh4(iC, null, null);
                Log.w("GoogleApiManager", "The service for " + ge0Var.getClass().getName() + " is not available: " + hh4Var.toString());
                o(hh4Var, null);
                return;
            }
            eoc eocVar = new eoc(j88Var, ge0Var, this.k);
            if (ge0Var.l()) {
                xmj xmjVar = this.p;
                dgj.v(xmjVar);
                Handler handler = xmjVar.k;
                rl rlVar = xmjVar.n;
                i6g i6gVar = xmjVar.o;
                if (i6gVar != null) {
                    i6gVar.o();
                }
                rlVar.J = Integer.valueOf(System.identityHashCode(xmjVar));
                xmjVar.o = (i6g) xmjVar.l.k(xmjVar.j, handler.getLooper(), rlVar, (k6g) rlVar.I, xmjVar, xmjVar);
                xmjVar.p = eocVar;
                Set set = xmjVar.m;
                if (set == null || set.isEmpty()) {
                    handler.post(new k51(14, xmjVar));
                } else {
                    xmjVar.o.E();
                }
            }
            try {
                ge0Var.f(eocVar);
            } catch (SecurityException e) {
                o(new hh4(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            o(new hh4(10, null, null), e2);
        }
    }

    public final void n(pnj pnjVar) {
        dgj.q(this.u.Q);
        boolean zA = this.j.a();
        LinkedList linkedList = this.i;
        if (zA) {
            if (k(pnjVar)) {
                j();
                return;
            } else {
                linkedList.add(pnjVar);
                return;
            }
        }
        linkedList.add(pnjVar);
        hh4 hh4Var = this.s;
        if (hh4Var == null || hh4Var.F == 0 || hh4Var.G == null) {
            m();
        } else {
            o(hh4Var, null);
        }
    }

    public final void o(hh4 hh4Var, RuntimeException runtimeException) {
        i6g i6gVar;
        dgj.q(this.u.Q);
        xmj xmjVar = this.p;
        if (xmjVar != null && (i6gVar = xmjVar.o) != null) {
            i6gVar.o();
        }
        dgj.q(this.u.Q);
        this.s = null;
        ((SparseIntArray) this.u.K.F).clear();
        a(hh4Var);
        if ((this.j instanceof tnj) && hh4Var.F != 24) {
            j88 j88Var = this.u;
            j88Var.F = true;
            xnj xnjVar = j88Var.Q;
            xnjVar.sendMessageDelayed(xnjVar.obtainMessage(19), 300000L);
        }
        if (hh4Var.F == 4) {
            e(j88.T);
            return;
        }
        if (this.i.isEmpty()) {
            this.s = hh4Var;
            return;
        }
        j88 j88Var2 = this.u;
        if (runtimeException != null) {
            dgj.q(j88Var2.Q);
            f(null, runtimeException, false);
            return;
        }
        boolean z = j88Var2.R;
        gf0 gf0Var = this.k;
        if (!z) {
            e(j88.d(gf0Var, hh4Var));
            return;
        }
        f(j88.d(gf0Var, hh4Var), null, true);
        if (this.i.isEmpty() || l(hh4Var) || this.u.c(hh4Var, this.o)) {
            return;
        }
        if (hh4Var.F == 18) {
            this.q = true;
        }
        if (!this.q) {
            e(j88.d(this.k, hh4Var));
            return;
        }
        j88 j88Var3 = this.u;
        gf0 gf0Var2 = this.k;
        xnj xnjVar2 = j88Var3.Q;
        xnjVar2.sendMessageDelayed(Message.obtain(xnjVar2, 9, gf0Var2), 5000L);
    }

    public final void p(hh4 hh4Var) {
        dgj.q(this.u.Q);
        ge0 ge0Var = this.j;
        ge0Var.c("onSignInFailed for " + ge0Var.getClass().getName() + " with " + String.valueOf(hh4Var));
        o(hh4Var, null);
    }

    public final void q() {
        dgj.q(this.u.Q);
        Status status = j88.S;
        e(status);
        this.l.u(false, status);
        for (dba dbaVar : (dba[]) this.n.keySet().toArray(new dba[0])) {
            n(new hnj(dbaVar, new j5h()));
        }
        a(new hh4(4, null, null));
        ge0 ge0Var = this.j;
        if (ge0Var.a()) {
            ge0Var.g(new xzd(23, this));
        }
    }
}
