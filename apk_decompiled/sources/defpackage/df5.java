package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class df5 implements Closeable {
    public static final g11 Z = new g11(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING, 2);
    public static final Map a0 = Collections.EMPTY_MAP;
    public static final AtomicIntegerFieldUpdater b0 = AtomicIntegerFieldUpdater.newUpdater(df5.class, "U");
    public final nwc E;
    public final ef5 G;
    public final long H;
    public final long J;
    public final adi K;
    public volatile short L;
    public final HashMap M;
    public volatile String N;
    public volatile CharSequence O;
    public volatile CharSequence Q;
    public volatile boolean R;
    public volatile boolean T;
    public volatile CharSequence V;
    public final boolean W;
    public final umc X;
    public final efk Y;
    public volatile byte P = 0;
    public volatile byte S = -128;
    public volatile int U = -128;
    public final String I = "null";
    public volatile Map F = a0;

    public df5(ef5 ef5Var, long j, String str, CharSequence charSequence, int i, nwc nwcVar, boolean z, umc umcVar, efk efkVar) {
        this.E = nwcVar;
        this.G = ef5Var;
        this.H = j;
        this.M = new HashMap(Math.max(((i <= 0 ? 3 : i + 1) * 4) / 3, 8));
        this.Y = efkVar;
        efkVar.getClass();
        K(str);
        this.Q = charSequence;
        this.R = false;
        Thread threadCurrentThread = Thread.currentThread();
        this.J = threadCurrentThread.getId();
        this.K = (adi) Z.j(threadCurrentThread.getName(), zh4.j);
        this.W = z;
        this.X = umcVar;
        long jD = ef5Var.d();
        if (umcVar.h != jD) {
            umcVar.h = jD;
            umcVar.j = jD == 0 ? null : g4h.d(j8.j0(16, jD));
            umcVar.a(brd.E);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(int r5, int r6) {
        /*
            r4 = this;
            df5 r4 = r4.d()
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r5 != r0) goto L9
            goto L36
        L9:
            r1 = 1
            if (r6 == r0) goto L23
            r2 = 10
            r3 = 2
            if (r6 == r2) goto L20
            switch(r6) {
                case 0: goto L1b;
                case 1: goto L1b;
                case 2: goto L1b;
                case 3: goto L15;
                case 4: goto L15;
                case 5: goto L20;
                case 6: goto L15;
                default: goto L14;
            }
        L14:
            goto L27
        L15:
            r2 = -1
            if (r5 == r2) goto L27
            if (r5 != r3) goto L23
            goto L27
        L1b:
            if (r5 == 0) goto L27
            if (r5 != r1) goto L23
            goto L27
        L20:
            if (r5 != r3) goto L23
            goto L27
        L23:
            boolean r2 = r4.W
            if (r2 == 0) goto L36
        L27:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.df5.b0
            boolean r0 = r2.compareAndSet(r4, r0, r5)
            if (r0 != 0) goto L30
            goto L36
        L30:
            umc r4 = r4.X
            r4.d(r5, r6)
            return r1
        L36:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df5.H(int, int):boolean");
    }

    public final void K(String str) {
        l35 l35Var = this.E.e;
        if (l35Var.d.containsKey(str)) {
            str = (String) l35Var.d.get(str);
        }
        this.N = str;
        String str2 = this.I;
        String str3 = this.N;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        str2.equals(str3);
    }

    public final void P(String str, Object obj) {
        if (obj == null) {
            synchronized (this.M) {
                this.M.remove(str);
            }
        } else {
            if (this.E.b.f0.b(this, str, obj)) {
                return;
            }
            synchronized (this.M) {
                this.M.put(str, obj);
            }
        }
    }

    public final CharSequence c() {
        return (this.O == null || this.O.length() == 0) ? this.Q : this.O;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final df5 d() {
        df5 df5Var;
        cf5 cf5Var = this.E.m;
        if (cf5Var == null || (df5Var = cf5Var.c) == this) {
            df5Var = null;
        }
        return df5Var != null ? df5Var : this;
    }

    public final Map e() {
        Map mapUnmodifiableMap;
        synchronized (this.M) {
            try {
                HashMap map = new HashMap(this.M);
                map.put("thread.id", Long.valueOf(this.J));
                map.put("thread.name", this.K.E);
                if (this.U != -128) {
                    map.put("_sample_rate", Integer.valueOf(this.U));
                }
                if (this.L != 0) {
                    map.put("http.status_code", Integer.valueOf(this.L));
                }
                Object obj = map.get("http.url");
                if (obj != null) {
                    map.put("http.url", obj.toString());
                }
                mapUnmodifiableMap = Collections.unmodifiableMap(map);
            } catch (Throwable th) {
                throw th;
            }
        }
        return mapUnmodifiableMap;
    }

    public final boolean f() {
        df5 df5Var;
        cf5 cf5Var = this.E.m;
        return (cf5Var == null || (df5Var = cf5Var.c) == this) ? b0.get(this) != -128 : df5Var.f();
    }

    public final void i(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        c4h c4hVar = this.E.b.f0;
        synchronized (this.M) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    if (!c4hVar.b(this, (String) entry.getKey(), entry.getValue())) {
                        this.M.put((String) entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Number number, String str) {
        synchronized (this.M) {
            this.M.put(str.toString(), number);
        }
    }

    public final void n(CharSequence charSequence) {
        df5 df5VarD = d();
        df5VarD.V = charSequence;
        umc umcVar = df5VarD.X;
        if (Objects.equals(umcVar.f, charSequence)) {
            return;
        }
        umcVar.a(brd.F);
        umcVar.f = g4h.d(charSequence);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DDSpan [ t_id=");
        sb.append(this.G);
        sb.append(", s_id=");
        sb.append(this.H);
        sb.append(", p_id=0 ] trace=");
        sb.append(this.N);
        sb.append("/");
        sb.append(this.Q);
        sb.append("/");
        sb.append(c());
        if (this.R) {
            sb.append(" *errored*");
        }
        if (this.T) {
            sb.append(" *measured*");
        }
        synchronized (this.M) {
            sb.append(" tags=");
            sb.append(new TreeMap(e()));
        }
        return sb.toString();
    }

    public final void x(CharSequence charSequence, byte b) {
        if (charSequence != null && b >= this.P) {
            this.P = b;
            this.O = charSequence;
            this.Y.getClass();
        }
    }
}
