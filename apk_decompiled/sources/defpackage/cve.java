package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes.dex */
public abstract class cve {
    public mp4 a;
    public c45 b;
    public Executor c;
    public knf d;
    public yue e;
    public vb9 f;
    public final fj0 g;
    public boolean h;
    public final ThreadLocal i;
    public final LinkedHashMap j;
    public boolean k;

    public cve() {
        dm dmVar = new dm(0, this, cve.class, "onClosed", "onClosed()V", 0, 18);
        fj0 fj0Var = new fj0();
        fj0Var.E = dmVar;
        fj0Var.F = new AtomicInteger(0);
        fj0Var.G = new AtomicBoolean(false);
        this.g = fj0Var;
        this.i = new ThreadLocal();
        this.j = new LinkedHashMap();
        this.k = true;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            sz6.j("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        oy7 oy7VarX = h().X();
        if (!oy7VarX.s0()) {
            yb5.J(new fj(g(), null, 16));
        }
        if (oy7VarX.E.isWriteAheadLoggingEnabled()) {
            oy7VarX.d();
        } else {
            oy7VarX.c();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tta.d0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(ez1.I((pl9) entry.getKey()), entry.getValue());
        }
        return lm6.E;
    }

    public abstract vb9 d();

    public cl6 e() {
        throw new NotImplementedError(0);
    }

    public final void f() {
        h().X().f();
        if (l()) {
            return;
        }
        vb9 vb9VarG = g();
        vb9VarG.b.e(vb9VarG.e, vb9VarG.f);
    }

    public final vb9 g() {
        vb9 vb9Var = this.f;
        if (vb9Var != null) {
            return vb9Var;
        }
        x44.o0("internalTracker");
        throw null;
    }

    public final bzg h() {
        yue yueVar = this.e;
        if (yueVar == null) {
            x44.o0("connectionManager");
            throw null;
        }
        bzg bzgVar = yueVar.g;
        if (bzgVar != null) {
            return bzgVar;
        }
        sz6.j("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set i() {
        return w44.t1(new ArrayList(x44.y(um6.E, 10)));
    }

    public LinkedHashMap j() {
        int iD0 = tta.d0(x44.y(um6.E, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        return new LinkedHashMap(iD0);
    }

    public final boolean k() {
        yue yueVar = this.e;
        if (yueVar != null) {
            return yueVar.g != null;
        }
        x44.o0("connectionManager");
        throw null;
    }

    public final boolean l() {
        return n() && h().X().s0();
    }

    public final void m(lze lzeVar) throws Exception {
        lzeVar.getClass();
        vb9 vb9VarG = g();
        o7i o7iVar = vb9VarG.b;
        o7iVar.getClass();
        tze tzeVarL0 = lzeVar.L0("PRAGMA query_only");
        try {
            tzeVarL0.H0();
            boolean zQ = tzeVarL0.Q();
            csg.o(tzeVarL0, null);
            if (!zQ) {
                u00.r(lzeVar, "PRAGMA temp_store = MEMORY");
                u00.r(lzeVar, "PRAGMA recursive_triggers = 1");
                u00.r(lzeVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (o7iVar.d) {
                    u00.r(lzeVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    u00.r(lzeVar, isg.n0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                ibc ibcVar = o7iVar.h;
                ReentrantLock reentrantLock = ibcVar.a;
                reentrantLock.lock();
                try {
                    ibcVar.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (vb9VarG.g) {
            }
        } finally {
        }
    }

    public final boolean n() {
        yue yueVar = this.e;
        if (yueVar == null) {
            x44.o0("connectionManager");
            throw null;
        }
        oy7 oy7Var = yueVar.h;
        if (oy7Var != null) {
            return oy7Var.isOpen();
        }
        return false;
    }

    public final Object o(zy7 zy7Var) {
        if (!k()) {
            return u00.E(this, false, true, new bg0(2, zy7Var));
        }
        b();
        try {
            Object objA = zy7Var.a();
            p();
            return objA;
        } finally {
            f();
        }
    }

    public final void p() {
        h().X().n();
    }

    public final Object q(boolean z, pz7 pz7Var, vp4 vp4Var) {
        yue yueVar = this.e;
        if (yueVar != null) {
            return yueVar.f.D(z, pz7Var, vp4Var);
        }
        x44.o0("connectionManager");
        throw null;
    }
}
