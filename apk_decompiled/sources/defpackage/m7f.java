package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.MissingScopeValueException;
import org.koin.core.error.NoDefinitionFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class m7f {
    public final rzd a;
    public final String b;
    public final boolean c;
    public final xai d;
    public final er9 e;
    public final ArrayList f;
    public Object g;
    public final LinkedHashSet h;
    public ThreadLocal i;
    public boolean j;

    public m7f(rzd rzdVar, String str, er9 er9Var, int i) {
        boolean z = (i & 4) == 0;
        rzdVar.getClass();
        str.getClass();
        this.a = rzdVar;
        this.b = str;
        this.c = z;
        this.d = null;
        this.e = er9Var;
        this.f = new ArrayList();
        this.h = new LinkedHashSet();
    }

    public final Object a(pl9 pl9Var, rzd rzdVar, zy7 zy7Var) {
        String str;
        pl9Var.getClass();
        bsc bscVar = zy7Var != null ? (bsc) zy7Var.a() : null;
        er9 er9Var = this.e;
        k3a k3aVar = (k3a) er9Var.a.E;
        k3a k3aVar2 = k3a.E;
        if (k3aVar.compareTo(k3aVar2) > 0) {
            return e(rzdVar, pl9Var, bscVar);
        }
        if (rzdVar != null) {
            str = " with qualifier '" + rzdVar + '\'';
        } else {
            str = "";
        }
        String strS = this.c ? "" : vb7.s(new StringBuilder(" - scope:'"), this.b, '\'');
        er9Var.a.n0(k3aVar2, "|- '" + ql9.a(pl9Var) + '\'' + str + strS + "...");
        long jA = brb.a();
        Object objE = e(rzdVar, pl9Var, bscVar);
        long jA2 = dqh.a(jA);
        rok rokVar = er9Var.a;
        StringBuilder sb = new StringBuilder("|- '");
        sb.append(ql9.a(pl9Var));
        sb.append("' in ");
        lz1 lz1Var = uh6.F;
        sb.append(uh6.o(jA2, zh6.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        rokVar.n0(k3aVar2, sb.toString());
        return objE;
    }

    public final ArrayList b(pl9 pl9Var) {
        pl9Var.getClass();
        er9 er9Var = this.e;
        ra4 ra4Var = new ra4(er9Var.a, this, pl9Var);
        fj0 fj0Var = er9Var.d;
        fj0Var.getClass();
        Collection collectionValues = ((ConcurrentHashMap) fj0Var.F).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            qh1 qh1Var = ((x59) obj).a;
            if (x44.r(qh1Var.a, ((m7f) ra4Var.F).a) && (x44.r(qh1Var.b, pl9Var) || qh1Var.f.contains(pl9Var))) {
                arrayList.add(obj);
            }
        }
        List listP1 = w44.p1(w44.s1(arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listP1.iterator();
        while (it.hasNext()) {
            Object objB = ((x59) it.next()).b(ra4Var);
            if (objB == null) {
                objB = null;
            }
            if (objB != null) {
                arrayList2.add(objB);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            b54.t0(arrayList3, ((m7f) it2.next()).b(pl9Var));
        }
        return w44.a1(arrayList2, arrayList3);
    }

    public final Object c(pl9 pl9Var) {
        k3a k3aVar = k3a.E;
        er9 er9Var = this.e;
        pl9Var.getClass();
        try {
            return a(pl9Var, null, null);
        } catch (ClosedScopeException unused) {
            rok rokVar = er9Var.a;
            String str = "* Scope closed - no instance found for " + ql9.a(pl9Var) + " on scope " + this;
            rokVar.getClass();
            rokVar.u0(k3aVar, str);
            return null;
        } catch (MissingScopeValueException unused2) {
            rok rokVar2 = er9Var.a;
            String str2 = "* No Scoped value found for type '" + ql9.a(pl9Var) + "' on scope '" + this + '\'';
            rokVar2.getClass();
            rokVar2.u0(k3aVar, str2);
            return null;
        } catch (NoDefinitionFoundException unused3) {
            rok rokVar3 = er9Var.a;
            String str3 = "* No instance found for type '" + ql9.a(pl9Var) + "' on scope '" + this + '\'';
            rokVar3.getClass();
            rokVar3.u0(k3aVar, str3);
            return null;
        }
    }

    public final Object d(ra4 ra4Var) throws NoDefinitionFoundException {
        String str;
        nyj nyjVar = this.e.b;
        nyjVar.getClass();
        Object objD0 = nyjVar.d0(this, ra4Var, true);
        if (objD0 != null) {
            return objD0;
        }
        rzd rzdVar = (rzd) ra4Var.H;
        if (rzdVar != null) {
            str = " and qualifier '" + rzdVar + '\'';
        } else {
            str = "";
        }
        throw new NoDefinitionFoundException("No definition found for type '" + ql9.a((pl9) ra4Var.G) + '\'' + str + ". Check your Modules configuration and add missing type and/or qualifier!");
    }

    public final Object e(rzd rzdVar, pl9 pl9Var, bsc bscVar) throws ClosedScopeException {
        qo0 qo0Var;
        if (this.j) {
            throw new ClosedScopeException(ij0.m(new StringBuilder("Scope '"), this.b, "' is closed"));
        }
        er9 er9Var = this.e;
        ra4 ra4Var = new ra4(er9Var.a, this, pl9Var, rzdVar, bscVar);
        if (bscVar == null) {
            return d(ra4Var);
        }
        rok rokVar = er9Var.a;
        k3a k3aVar = (k3a) rokVar.E;
        k3a k3aVar2 = k3a.E;
        if (k3aVar.compareTo(k3aVar2) <= 0) {
            rokVar.n0(k3aVar2, "| >> parameters " + bscVar);
        }
        ThreadLocal threadLocal = this.i;
        if (threadLocal == null || (qo0Var = (qo0) threadLocal.get()) == null) {
            qo0Var = new qo0();
            ThreadLocal threadLocal2 = new ThreadLocal();
            this.i = threadLocal2;
            threadLocal2.set(qo0Var);
        }
        qo0Var.addFirst(bscVar);
        try {
            return d(ra4Var);
        } finally {
            rok rokVar2 = er9Var.a;
            rokVar2.getClass();
            rokVar2.u0(k3aVar2, "| << parameters");
            if (!qo0Var.isEmpty()) {
                qo0Var.removeFirst();
            }
            if (qo0Var.isEmpty()) {
                ThreadLocal threadLocal3 = this.i;
                if (threadLocal3 != null) {
                    threadLocal3.remove();
                }
                this.i = null;
            }
        }
    }

    public final String toString() {
        return ij0.m(new StringBuilder("['"), this.b, "']");
    }
}
