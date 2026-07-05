package androidx.glance.appwidget.protobuf;

import defpackage.c7f;
import defpackage.grc;
import defpackage.nud;
import defpackage.sz6;
import defpackage.tgi;
import defpackage.xh6;
import io.sentry.e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, f> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected l unknownFields;

    public f() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = l.f;
    }

    public static f c(Class cls) {
        f fVar = defaultInstanceMap.get(cls);
        if (fVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                fVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = (f) ((f) tgi.d(cls)).b(6);
        if (fVar2 != null) {
            defaultInstanceMap.put(cls, fVar2);
            return fVar2;
        }
        e0.b();
        return null;
    }

    public static Object d(Method method, f fVar, Object... objArr) {
        try {
            return method.invoke(fVar, objArr);
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

    public static final boolean e(f fVar, boolean z) {
        byte bByteValue = ((Byte) fVar.b(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        nud nudVar = nud.c;
        nudVar.getClass();
        boolean zC = nudVar.a(fVar.getClass()).c(fVar);
        if (z) {
            fVar.b(2);
        }
        return zC;
    }

    public static void i(Class cls, f fVar) {
        fVar.g();
        defaultInstanceMap.put(cls, fVar);
    }

    @Override // androidx.glance.appwidget.protobuf.a
    public final int a(c7f c7fVar) {
        int iE;
        int iE2;
        if (f()) {
            if (c7fVar == null) {
                nud nudVar = nud.c;
                nudVar.getClass();
                iE2 = nudVar.a(getClass()).e(this);
            } else {
                iE2 = c7fVar.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            sz6.j(grc.p(iE2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (c7fVar == null) {
            nud nudVar2 = nud.c;
            nudVar2.getClass();
            iE = nudVar2.a(getClass()).e(this);
        } else {
            iE = c7fVar.e(this);
        }
        j(iE);
        return iE;
    }

    public abstract Object b(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nud nudVar = nud.c;
        nudVar.getClass();
        return nudVar.a(getClass()).i(this, (f) obj);
    }

    public final boolean f() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void g() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final f h() {
        return (f) b(4);
    }

    public final int hashCode() {
        if (f()) {
            nud nudVar = nud.c;
            nudVar.getClass();
            return nudVar.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            nud nudVar2 = nud.c;
            nudVar2.getClass();
            this.memoizedHashCode = nudVar2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final void j(int i) {
        if (i < 0) {
            sz6.j(grc.p(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = g.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        g.c(this, sb, 0);
        return sb.toString();
    }
}
