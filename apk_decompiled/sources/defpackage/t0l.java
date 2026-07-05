package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0l {
    public static final Unsafe a;
    public static final Class b;
    public static final r0l c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    static {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0l.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            pmf.m(e2);
            return null;
        }
    }

    public static void b(long j, Object obj, int i) {
        c.b(j, obj, i);
    }

    public static void c(long j, Object obj, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static int d(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe e() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a1l());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void f(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static void g(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iJ = c.j(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        b(j2, obj, ((255 & b2) << i) | (iJ & (~(255 << i))));
    }

    public static void h(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        b(j2, obj, ((255 & b2) << i) | (c.j(j2, obj) & (~(255 << i))));
    }

    public static boolean i(Class cls) {
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

    public static Object j(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static Field k() {
        Field declaredField;
        Field declaredField2;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }
}
