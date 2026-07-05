package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ugi {
    public static final Unsafe a;
    public static final Class b;
    public static final pgi c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe unsafeJ = j();
        a = unsafeJ;
        b = xy.a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        char c2 = 1;
        int i = 0;
        pgi kgiVar = null;
        if (unsafeJ != null) {
            if (!xy.a()) {
                kgiVar = new kgi(unsafeJ);
            } else if (zF) {
                kgiVar = new dgi(unsafeJ, c2 == true ? 1 : 0);
            } else if (zF2) {
                kgiVar = new dgi(unsafeJ, i);
            }
        }
        c = kgiVar;
        d = kgiVar == null ? false : kgiVar.s();
        e = kgiVar == null ? false : kgiVar.r();
        f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && kgiVar != null) {
            kgiVar.j(fieldE);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(ugi.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            pmf.m(e2);
            return null;
        }
    }

    public static int c(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (xy.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class cls) {
        if (!xy.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j) {
        return c.d(f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((c.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((c.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new yfi());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b2) {
        c.l(bArr, f + j, b2);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iG = c.g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        n(j2, obj, ((255 & b2) << i) | (iG & (~(255 << i))));
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        n(j2, obj, ((255 & b2) << i) | (c.g(j2, obj) & (~(255 << i))));
    }

    public static void n(long j, Object obj, int i) {
        c.o(j, obj, i);
    }

    public static void o(long j, Object obj, Object obj2) {
        c.q(j, obj, obj2);
    }
}
