package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0l {
    public final Unsafe a;

    public r0l(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(long j, Object obj);

    public final void b(long j, Object obj, int i) {
        this.a.putInt(obj, j, i);
    }

    public abstract void c(Object obj, long j, byte b);

    public abstract void d(Object obj, long j, double d);

    public abstract void e(Object obj, long j, float f);

    public final void f(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public abstract void g(Object obj, long j, boolean z);

    public abstract float h(long j, Object obj);

    public abstract boolean i(long j, Object obj);

    public final int j(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public final long k(long j, Object obj) {
        return this.a.getLong(obj, j);
    }
}
