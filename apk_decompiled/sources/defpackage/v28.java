package defpackage;

import com.google.protobuf.f;
import io.sentry.e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class v28 {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public int a = 0;
    public int b = -1;
    public f c = f.e;

    public static v28 b(Class cls) {
        ConcurrentHashMap concurrentHashMap = d;
        v28 v28Var = (v28) concurrentHashMap.get(cls);
        if (v28Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                v28Var = (v28) concurrentHashMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (v28Var != null) {
            return v28Var;
        }
        v28 v28Var2 = (v28) ((v28) wgi.b(cls)).a(6);
        if (v28Var2 != null) {
            concurrentHashMap.put(cls, v28Var2);
            return v28Var2;
        }
        e0.b();
        return null;
    }

    public static Object c(Method method, v28 v28Var, Object... objArr) {
        try {
            return method.invoke(v28Var, objArr);
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

    public static final boolean d(v28 v28Var, boolean z) {
        byte bByteValue = ((Byte) v28Var.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        rud rudVar = rud.c;
        rudVar.getClass();
        boolean zC = rudVar.a(v28Var.getClass()).c(v28Var);
        if (z) {
            v28Var.a(2);
        }
        return zC;
    }

    public abstract Object a(int i);

    public final boolean e() {
        return (this.b & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rud rudVar = rud.c;
        rudVar.getClass();
        return rudVar.a(getClass()).e(this, (v28) obj);
    }

    public final v28 f() {
        return (v28) a(4);
    }

    public final int hashCode() {
        if (e()) {
            rud rudVar = rud.c;
            rudVar.getClass();
            return rudVar.a(getClass()).f(this);
        }
        if (this.a == 0) {
            rud rudVar2 = rud.c;
            rudVar2.getClass();
            this.a = rudVar2.a(getClass()).f(this);
        }
        return this.a;
    }

    public final String toString() {
        return cib.d(this, super.toString());
    }
}
