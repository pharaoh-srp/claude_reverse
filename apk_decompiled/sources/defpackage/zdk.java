package defpackage;

import io.sentry.e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdk extends h8k {
    private static final Map zzb = new ConcurrentHashMap();
    protected vnk zzc;
    private int zzd;

    public zdk() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = vnk.f;
    }

    public static void f(Class cls, zdk zdkVar) {
        zdkVar.e();
        zzb.put(cls, zdkVar);
    }

    public static final boolean i(zdk zdkVar, boolean z) {
        byte bByteValue = ((Byte) zdkVar.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = zkk.c.a(zdkVar.getClass()).f(zdkVar);
        if (z) {
            zdkVar.j(2);
        }
        return zF;
    }

    public static zdk m(Class cls) {
        Map map = zzb;
        zdk zdkVar = (zdk) map.get(cls);
        if (zdkVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zdkVar = (zdk) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zdkVar != null) {
            return zdkVar;
        }
        zdk zdkVar2 = (zdk) ((zdk) wok.g(cls)).j(6);
        if (zdkVar2 != null) {
            map.put(cls, zdkVar2);
            return zdkVar2;
        }
        e0.b();
        return null;
    }

    public static Object o(Method method, zdk zdkVar, Object... objArr) {
        try {
            return method.invoke(zdkVar, objArr);
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

    @Override // defpackage.h8k
    public final void a(xak xakVar) {
        klk klkVarA = zkk.c.a(getClass());
        w9h w9hVar = xakVar.a;
        if (w9hVar == null) {
            w9hVar = new w9h(xakVar);
        }
        klkVarA.c(this, w9hVar);
    }

    @Override // defpackage.h8k
    public final int c(klk klkVar) {
        if (h()) {
            int i = klkVar.i(this);
            if (i >= 0) {
                return i;
            }
            sz6.j(grc.p(i, "serialized size must be non-negative, was "));
            return 0;
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = klkVar.i(this);
        if (i3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i3;
            return i3;
        }
        sz6.j(grc.p(i3, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // defpackage.h8k
    public final int d() {
        if (h()) {
            int i = zkk.c.a(getClass()).i(this);
            if (i >= 0) {
                return i;
            }
            sz6.j(grc.p(i, "serialized size must be non-negative, was "));
            return 0;
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = zkk.c.a(getClass()).i(this);
        if (i3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i3;
            return i3;
        }
        sz6.j(grc.p(i3, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zkk.c.a(getClass()).e(this, (zdk) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return zkk.c.a(getClass()).d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iD = zkk.c.a(getClass()).d(this);
        this.zza = iD;
        return iD;
    }

    public abstract Object j(int i);

    public final mdk k() {
        return (mdk) j(5);
    }

    public final mdk l() {
        mdk mdkVar = (mdk) j(5);
        if (!mdkVar.E.equals(this)) {
            if (!mdkVar.F.h()) {
                zdk zdkVarN = mdkVar.E.n();
                zkk.c.a(zdkVarN.getClass()).h(zdkVarN, mdkVar.F);
                mdkVar.F = zdkVarN;
            }
            zdk zdkVar = mdkVar.F;
            zkk.c.a(zdkVar.getClass()).h(zdkVar, this);
        }
        return mdkVar;
    }

    public final zdk n() {
        return (zdk) j(4);
    }

    public final String toString() {
        return ekk.a(this, super.toString());
    }
}
