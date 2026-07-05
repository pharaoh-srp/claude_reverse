package com.google.android.gms.internal.measurement;

import defpackage.ayk;
import defpackage.b0l;
import defpackage.dyk;
import defpackage.grc;
import defpackage.nxk;
import defpackage.ozk;
import defpackage.p0l;
import defpackage.qyk;
import defpackage.sz6;
import defpackage.t0l;
import defpackage.xh6;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends l0 {
    private static Map<Class<?>, n0> zzc = new ConcurrentHashMap();
    protected p0l zzb;
    private int zzd;

    public n0() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = p0l.f;
    }

    public static n0 d(Class cls) {
        n0 n0Var = zzc.get(cls);
        if (n0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                n0Var = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = (n0) ((n0) t0l.a(cls)).e(6);
        if (n0Var2 != null) {
            zzc.put(cls, n0Var2);
            return n0Var2;
        }
        io.sentry.e0.b();
        return null;
    }

    public static Object f(Method method, n0 n0Var, Object... objArr) {
        try {
            return method.invoke(n0Var, objArr);
        } catch (IllegalAccessException e) {
            xh6.f("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            xh6.f("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static dyk g(dyk dykVar) {
        int size = dykVar.size();
        return dykVar.d(size == 0 ? 10 : size << 1);
    }

    public static qyk h(ayk aykVar) {
        int size = aykVar.size();
        return ((qyk) aykVar).d(size == 0 ? 10 : size << 1);
    }

    public static void i(Class cls, n0 n0Var) {
        n0Var.n();
        zzc.put(cls, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final int a(b0l b0lVar) {
        int iD;
        int iD2;
        if (o()) {
            if (b0lVar == null) {
                ozk ozkVar = ozk.c;
                ozkVar.getClass();
                iD2 = ozkVar.a(getClass()).d(this);
            } else {
                iD2 = b0lVar.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            sz6.j(grc.p(iD2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (b0lVar == null) {
            ozk ozkVar2 = ozk.c;
            ozkVar2.getClass();
            iD = ozkVar2.a(getClass()).d(this);
        } else {
            iD = b0lVar.d(this);
        }
        j(iD);
        return iD;
    }

    public abstract Object e(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ozk ozkVar = ozk.c;
        ozkVar.getClass();
        return ozkVar.a(getClass()).e(this, (n0) obj);
    }

    public final int hashCode() {
        if (o()) {
            ozk ozkVar = ozk.c;
            ozkVar.getClass();
            return ozkVar.a(getClass()).h(this);
        }
        if (this.zza == 0) {
            ozk ozkVar2 = ozk.c;
            ozkVar2.getClass();
            this.zza = ozkVar2.a(getClass()).h(this);
        }
        return this.zza;
    }

    public final void j(int i) {
        if (i < 0) {
            sz6.j(grc.p(i, "serialized size must be non-negative, was "));
        } else {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        }
    }

    public final nxk k() {
        return (nxk) e(5);
    }

    public final nxk l() {
        nxk nxkVar = (nxk) e(5);
        nxkVar.a(this);
        return nxkVar;
    }

    public final void m() {
        ozk ozkVar = ozk.c;
        ozkVar.getClass();
        ozkVar.a(getClass()).c(this);
        n();
    }

    public final void n() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean o() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        return o0.a(this, super.toString());
    }
}
