package defpackage;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class o25 {
    public static final sz6 O = new sz6(25);
    public static final sz6 P = new sz6(26);
    public static final zf3[] Q = {zf3.r, zf3.s, zf3.t, zf3.n, zf3.o, zf3.l, zf3.m};
    public tzb A;
    public volatile rk5 B;
    public volatile String C;
    public qga D;
    public ob1 E;
    public ThreadPoolExecutor F;
    public pb1 G;
    public File H;
    public final u0h I;
    public final u0h J;
    public final u0h K;
    public int L;
    public int M;
    public final int N;
    public final h99 a;
    public final qp5 b;
    public final sz6 c;
    public final sz6 d;
    public final jz1 e;
    public final u0h f;
    public final AtomicBoolean g;
    public WeakReference h;
    public hr5 i;
    public b1c j;
    public p1h k;
    public iuj l;
    public bl4 m;
    public twb n;
    public ql8 o;
    public mm0 p;
    public t20 q;
    public m25 r;
    public hs9 s;
    public volatile String t;
    public volatile String u;
    public volatile String v;
    public volatile String w;
    public volatile boolean x;
    public volatile String y;
    public volatile String z;

    public o25(h99 h99Var, qp5 qp5Var, sz6 sz6Var) {
        sz6 sz6Var2 = P;
        jz1.a.getClass();
        hz1 hz1Var = iz1.b;
        h99Var.getClass();
        this.a = h99Var;
        this.b = qp5Var;
        this.c = sz6Var;
        this.d = sz6Var2;
        this.e = hz1Var;
        this.f = new u0h(new n25(this, 3));
        this.g = new AtomicBoolean(false);
        this.h = new WeakReference(null);
        this.i = new hr5(0);
        int i = 23;
        this.j = new k2e(i);
        this.k = new lz1(24);
        this.l = new uu5();
        this.m = new dd8(22);
        this.n = new vz8(i);
        this.o = new ql8(i);
        this.p = new lja(22);
        this.q = new lz1(22);
        this.t = "";
        this.u = "";
        this.v = "android";
        this.w = "3.10.0";
        this.x = true;
        this.y = "";
        this.z = "";
        this.L = 2;
        this.M = 2;
        this.N = 2;
        this.A = new unb(23);
        this.B = rk5.G;
        this.I = new u0h(new n25(this, 0));
        this.J = new u0h(new n25(this, 1));
        this.K = new u0h(new n25(this, 2));
    }

    public final ThreadPoolExecutor a() {
        ThreadPoolExecutor threadPoolExecutor = this.F;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        x44.o0("contextExecutorService");
        throw null;
    }

    public final ob1 b() {
        ob1 ob1Var = this.E;
        if (ob1Var != null) {
            return ob1Var;
        }
        x44.o0("persistenceExecutorService");
        throw null;
    }

    public final File c() {
        File file = this.H;
        if (file != null) {
            return file;
        }
        x44.o0("storageDir");
        throw null;
    }
}
