package androidx.datastore.preferences.protobuf;

import defpackage.efe;
import defpackage.g7f;
import defpackage.grc;
import defpackage.sud;
import defpackage.sz6;
import defpackage.xgi;
import defpackage.xh6;
import io.sentry.e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, f> defaultInstanceMap = new ConcurrentHashMap();
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
        f fVar2 = (f) ((f) xgi.d(cls)).b(6);
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
        sud sudVar = sud.c;
        sudVar.getClass();
        boolean zC = sudVar.a(fVar.getClass()).c(fVar);
        if (z) {
            fVar.b(2);
        }
        return zC;
    }

    public static void j(Class cls, f fVar) {
        fVar.h();
        defaultInstanceMap.put(cls, fVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(g7f g7fVar) {
        int iF;
        int iF2;
        if (f()) {
            if (g7fVar == null) {
                sud sudVar = sud.c;
                sudVar.getClass();
                iF2 = sudVar.a(getClass()).f(this);
            } else {
                iF2 = g7fVar.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            sz6.j(grc.p(iF2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (g7fVar == null) {
            sud sudVar2 = sud.c;
            sudVar2.getClass();
            iF = sudVar2.a(getClass()).f(this);
        } else {
            iF = g7fVar.f(this);
        }
        k(iF);
        return iF;
    }

    public abstract Object b(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sud sudVar = sud.c;
        sudVar.getClass();
        return sudVar.a(getClass()).i(this, (f) obj);
    }

    public final boolean f() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void g() {
        sud sudVar = sud.c;
        sudVar.getClass();
        sudVar.a(getClass()).b(this);
        h();
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (f()) {
            sud sudVar = sud.c;
            sudVar.getClass();
            return sudVar.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            sud sudVar2 = sud.c;
            sudVar2.getClass();
            this.memoizedHashCode = sudVar2.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    public final f i() {
        return (f) b(4);
    }

    public final void k(int i) {
        if (i < 0) {
            sz6.j(grc.p(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final void l(e eVar) {
        sud sudVar = sud.c;
        sudVar.getClass();
        g7f g7fVarA = sudVar.a(getClass());
        efe efeVar = eVar.a;
        if (efeVar == null) {
            efeVar = new efe(eVar);
        }
        g7fVarA.g(efeVar, this);
    }

    public final String toString() {
        return g.d(this, super.toString());
    }
}
