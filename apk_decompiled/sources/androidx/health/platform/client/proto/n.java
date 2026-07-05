package androidx.health.platform.client.proto;

import defpackage.d7f;
import defpackage.f28;
import defpackage.grc;
import defpackage.lc7;
import defpackage.mr9;
import defpackage.oud;
import defpackage.po0;
import defpackage.poj;
import defpackage.s89;
import defpackage.sz6;
import defpackage.ugi;
import defpackage.xh6;
import io.sentry.e0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, n> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected b0 unknownFields;

    public n() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = b0.f;
    }

    public static n f(Class cls) {
        n nVar = defaultInstanceMap.get(cls);
        if (nVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                nVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = (n) ((n) ugi.b(cls)).e(6);
        if (nVar2 != null) {
            defaultInstanceMap.put(cls, nVar2);
            return nVar2;
        }
        e0.b();
        return null;
    }

    public static Object g(Method method, n nVar, Object... objArr) {
        try {
            return method.invoke(nVar, objArr);
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

    public static final boolean h(n nVar, boolean z) {
        byte bByteValue = ((Byte) nVar.e(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        oud oudVar = oud.c;
        oudVar.getClass();
        boolean zC = oudVar.a(nVar.getClass()).c(nVar);
        if (z) {
            nVar.e(2);
        }
        return zC;
    }

    public static n m(n nVar, byte[] bArr) throws InvalidProtocolBufferException {
        int length = bArr.length;
        lc7 lc7VarA = lc7.a();
        if (length != 0) {
            n nVarL = nVar.l();
            try {
                oud oudVar = oud.c;
                oudVar.getClass();
                d7f d7fVarA = oudVar.a(nVarL.getClass());
                po0 po0Var = new po0();
                lc7VarA.getClass();
                d7fVarA.i(nVarL, bArr, 0, length, po0Var);
                d7fVarA.b(nVarL);
                nVar = nVarL;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (UninitializedMessageException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e3.getCause());
                }
                throw new InvalidProtocolBufferException(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.d();
            }
        }
        if (nVar == null || h(nVar, true)) {
            return nVar;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    public static void n(Class cls, n nVar) {
        nVar.k();
        defaultInstanceMap.put(cls, nVar);
    }

    @Override // androidx.health.platform.client.proto.a
    public final int b(d7f d7fVar) {
        int iE;
        int iE2;
        if (i()) {
            if (d7fVar == null) {
                oud oudVar = oud.c;
                oudVar.getClass();
                iE2 = oudVar.a(getClass()).e(this);
            } else {
                iE2 = d7fVar.e(this);
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
        if (d7fVar == null) {
            oud oudVar2 = oud.c;
            oudVar2.getClass();
            iE = oudVar2.a(getClass()).e(this);
        } else {
            iE = d7fVar.e(this);
        }
        o(iE);
        return iE;
    }

    @Override // androidx.health.platform.client.proto.a
    public final void c(b bVar) {
        oud oudVar = oud.c;
        oudVar.getClass();
        d7f d7fVarA = oudVar.a(getClass());
        poj pojVar = bVar.a;
        if (pojVar == null) {
            pojVar = new poj();
            Charset charset = s89.a;
            if (bVar == null) {
                mr9.h("output");
                throw null;
            }
            pojVar.E = bVar;
            bVar.a = pojVar;
        }
        d7fVarA.g(this, pojVar);
    }

    public final f28 d() {
        return (f28) e(5);
    }

    public abstract Object e(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oud oudVar = oud.c;
        oudVar.getClass();
        return oudVar.a(getClass()).h(this, (n) obj);
    }

    public final int hashCode() {
        if (i()) {
            oud oudVar = oud.c;
            oudVar.getClass();
            return oudVar.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            oud oudVar2 = oud.c;
            oudVar2.getClass();
            this.memoizedHashCode = oudVar2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        oud oudVar = oud.c;
        oudVar.getClass();
        oudVar.a(getClass()).b(this);
        k();
    }

    public final void k() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final n l() {
        return (n) e(4);
    }

    public final void o(int i) {
        if (i < 0) {
            sz6.j(grc.p(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = o.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        o.c(this, sb, 0);
        return sb.toString();
    }
}
