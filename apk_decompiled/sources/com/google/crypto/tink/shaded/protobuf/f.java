package com.google.crypto.tink.shaded.protobuf;

import defpackage.e7f;
import defpackage.g22;
import defpackage.g28;
import defpackage.grc;
import defpackage.ive;
import defpackage.k22;
import defpackage.mc7;
import defpackage.pud;
import defpackage.r34;
import defpackage.sz6;
import defpackage.vgi;
import defpackage.xh6;
import io.sentry.e0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
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

    public static void g(f fVar) throws InvalidProtocolBufferException {
        if (!m(fVar, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    public static f j(Class cls) {
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
        f fVarA = ((f) vgi.b(cls)).a();
        if (fVarA != null) {
            defaultInstanceMap.put(cls, fVarA);
            return fVarA;
        }
        e0.b();
        return null;
    }

    public static Object l(Method method, f fVar, Object... objArr) {
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

    public static final boolean m(f fVar, boolean z) {
        byte bByteValue = ((Byte) fVar.i(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        pud pudVar = pud.c;
        pudVar.getClass();
        boolean zC = pudVar.a(fVar.getClass()).c(fVar);
        if (z) {
            fVar.i(2);
        }
        return zC;
    }

    public static f r(f fVar, k22 k22Var, mc7 mc7Var) throws InvalidProtocolBufferException {
        g22 g22Var = (g22) k22Var;
        b bVarH = r34.h(g22Var.H, g22Var.k(), g22Var.size(), true);
        f fVarS = s(fVar, bVarH, mc7Var);
        bVarH.b(0);
        g(fVarS);
        return fVarS;
    }

    public static f s(f fVar, r34 r34Var, mc7 mc7Var) throws InvalidProtocolBufferException {
        f fVarQ = fVar.q();
        try {
            pud pudVar = pud.c;
            pudVar.getClass();
            e7f e7fVarA = pudVar.a(fVarQ.getClass());
            d dVar = (d) r34Var.b;
            if (dVar == null) {
                dVar = new d(r34Var);
            }
            e7fVarA.e(fVarQ, dVar, mc7Var);
            e7fVarA.b(fVarQ);
            return fVarQ;
        } catch (InvalidProtocolBufferException e) {
            if (e.E) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static void t(Class cls, f fVar) {
        fVar.o();
        defaultInstanceMap.put(cls, fVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final int b(e7f e7fVar) {
        int i;
        int i2;
        if (n()) {
            if (e7fVar == null) {
                pud pudVar = pud.c;
                pudVar.getClass();
                i2 = pudVar.a(getClass()).i(this);
            } else {
                i2 = e7fVar.i(this);
            }
            if (i2 >= 0) {
                return i2;
            }
            sz6.j(grc.p(i2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & Integer.MAX_VALUE;
        }
        if (e7fVar == null) {
            pud pudVar2 = pud.c;
            pudVar2.getClass();
            i = pudVar2.a(getClass()).i(this);
        } else {
            i = e7fVar.i(this);
        }
        u(i);
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pud pudVar = pud.c;
        pudVar.getClass();
        return pudVar.a(getClass()).f(this, (f) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final void f(e eVar) {
        pud pudVar = pud.c;
        pudVar.getClass();
        e7f e7fVarA = pudVar.a(getClass());
        ive iveVar = eVar.a;
        if (iveVar == null) {
            iveVar = new ive(eVar);
        }
        e7fVarA.h(this, iveVar);
    }

    public final g28 h() {
        return (g28) i(5);
    }

    public final int hashCode() {
        if (n()) {
            pud pudVar = pud.c;
            pudVar.getClass();
            return pudVar.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            pud pudVar2 = pud.c;
            pudVar2.getClass();
            this.memoizedHashCode = pudVar2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(int i);

    @Override // defpackage.bib
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final f a() {
        return (f) i(6);
    }

    public final boolean n() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final g28 d() {
        return (g28) i(5);
    }

    public final f q() {
        return (f) i(4);
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

    public final void u(int i) {
        if (i < 0) {
            sz6.j(grc.p(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final g28 v() {
        g28 g28Var = (g28) i(5);
        if (!g28Var.E.equals(this)) {
            g28Var.f();
            g28.g(g28Var.F, this);
        }
        return g28Var;
    }
}
