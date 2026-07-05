package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import io.sentry.e0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class v77 {
    public final r09 A;
    public final long B;
    public final ig0 C;
    public final co1 D;
    public final xv8 E;
    public final qb5 F;
    public final qb5 G;
    public int H;
    public int I;
    public boolean J;
    public final taf K;
    public m5g L;
    public s6d M;
    public n7b N;
    public Object O;
    public Surface P;
    public SurfaceHolder Q;
    public boolean R;
    public TextureView S;
    public final int T;
    public h8g U;
    public final p31 V;
    public boolean W;
    public final boolean X;
    public boolean Y;
    public final int Z;
    public final kqh a;
    public boolean a0;
    public final f4i b;
    public yui b0;
    public final s6d c;
    public n7b c0;
    public final hf4 d;
    public j6d d0;
    public final Context e;
    public int e0;
    public final v77 f;
    public long f0;
    public final pe1[] g;
    public final pe1[] h;
    public final gv5 i;
    public final k1h j;
    public final l77 k;
    public final d87 l;
    public final kba m;
    public final CopyOnWriteArraySet n;
    public final jqh o;
    public final ArrayList p;
    public final boolean q;
    public final y7b r;
    public final hp5 s;
    public final Looper t;
    public final yp5 u;
    public final g1h v;
    public final r77 w;
    public final s77 x;
    public final s31 y;
    public final t6g z;

    static {
        k7b.a("media3.exoplayer");
    }

    public v77(h77 h77Var) {
        xv8 xv8Var;
        Looper looper = h77Var.g;
        int i = 0;
        this.a = new kqh();
        this.d = new hf4();
        try {
            ysj.n("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + tpi.a + "]");
            Context context = h77Var.a;
            g1h g1hVar = h77Var.b;
            this.e = context.getApplicationContext();
            this.s = new hp5(g1hVar);
            this.Z = h77Var.h;
            this.V = h77Var.i;
            this.T = h77Var.l;
            this.W = false;
            this.B = h77Var.r;
            r77 r77Var = new r77(this);
            this.w = r77Var;
            this.x = new s77();
            pe1[] pe1VarArrR = ((epk) h77Var.c.get()).r(new Handler(looper), r77Var, r77Var, r77Var, r77Var);
            this.g = pe1VarArrR;
            fd9.M(pe1VarArrR.length > 0);
            this.h = new pe1[pe1VarArrR.length];
            int i2 = 0;
            while (true) {
                pe1[] pe1VarArr = this.h;
                if (i2 >= pe1VarArr.length) {
                    break;
                }
                int i3 = this.g[i2].F;
                pe1VarArr[i2] = null;
                i2++;
            }
            gv5 gv5Var = (gv5) h77Var.e.get();
            this.i = gv5Var;
            this.r = (y7b) h77Var.d.get();
            yp5 yp5Var = (yp5) h77Var.f.get();
            this.u = yp5Var;
            this.q = h77Var.m;
            wef wefVar = h77Var.n;
            this.K = h77Var.o;
            this.t = looper;
            this.v = g1hVar;
            this.f = this;
            this.m = new kba(new CopyOnWriteArraySet(), looper, looper.getThread(), g1hVar, new l77(this), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.n = copyOnWriteArraySet;
            this.p = new ArrayList();
            this.L = new m5g();
            pe1[] pe1VarArr2 = this.g;
            f4i f4iVar = new f4i(new hge[pe1VarArr2.length], new f87[pe1VarArr2.length], r4i.b, (Object) null);
            this.b = f4iVar;
            this.o = new jqh();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i4 = 20; i < i4; i4 = 20) {
                int i5 = iArr[i];
                fd9.M(!false);
                sparseBooleanArray.append(i5, true);
                i++;
            }
            fd9.M(!false);
            sparseBooleanArray.append(29, true);
            fd9.M(!false);
            en7 en7Var = new en7(sparseBooleanArray);
            this.c = new s6d(en7Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i6 = 0; i6 < en7Var.a.size(); i6++) {
                int iA = en7Var.a(i6);
                fd9.M(!false);
                sparseBooleanArray2.append(iA, true);
            }
            fd9.M(!false);
            sparseBooleanArray2.append(4, true);
            fd9.M(!false);
            sparseBooleanArray2.append(10, true);
            fd9.M(!false);
            this.M = new s6d(new en7(sparseBooleanArray2));
            this.j = g1hVar.a(looper, null);
            l77 l77Var = new l77(this);
            this.k = l77Var;
            this.d0 = j6d.j(f4iVar);
            this.s.I(this, looper);
            z6d z6dVar = new z6d(h77Var.y);
            d87 d87Var = new d87(this.e, this.g, this.h, gv5Var, f4iVar, new es5(), yp5Var, this.s, wefVar, h77Var.p, h77Var.q, looper, g1hVar, l77Var, z6dVar, this.x, h77Var.z);
            k1h k1hVar = d87Var.L;
            this.l = d87Var;
            Looper looper2 = d87Var.N;
            n7b n7bVar = n7b.B;
            this.N = n7bVar;
            this.c0 = n7bVar;
            this.e0 = -1;
            i12 i12Var = fd5.b;
            this.X = true;
            hp5 hp5Var = this.s;
            kba kbaVar = this.m;
            hp5Var.getClass();
            kbaVar.a(hp5Var);
            Handler handler = new Handler(looper);
            hp5 hp5Var2 = this.s;
            yp5Var.getClass();
            hp5Var2.getClass();
            poj pojVar = yp5Var.c;
            pojVar.getClass();
            CopyOnWriteArrayList<wc1> copyOnWriteArrayList = (CopyOnWriteArrayList) pojVar.E;
            for (wc1 wc1Var : copyOnWriteArrayList) {
                if (wc1Var.b == hp5Var2) {
                    wc1Var.c = true;
                    copyOnWriteArrayList.remove(wc1Var);
                }
            }
            copyOnWriteArrayList.add(new wc1(handler, hp5Var2));
            copyOnWriteArraySet.add(this.w);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31) {
                Context context2 = this.e;
                boolean z = h77Var.w;
                Looper looper3 = d87Var.N;
                xv8Var = null;
                g1hVar.a(looper3, null).d(new p77(context2, z, this, z6dVar));
            } else {
                xv8Var = null;
            }
            xv8 xv8Var2 = xv8Var;
            ig0 ig0Var = new ig0(0, looper2, looper, g1hVar, new l77(this));
            this.C = ig0Var;
            ig0Var.p(new fc(18, this));
            s31 s31Var = new s31(h77Var.a, looper2, h77Var.g, this.w, g1hVar);
            this.y = s31Var;
            s31Var.h(h77Var.k);
            boolean z2 = (h77Var.s == Integer.MAX_VALUE || h77Var.t == Integer.MAX_VALUE || h77Var.u == Integer.MAX_VALUE || h77Var.v == Integer.MAX_VALUE) ? false : true;
            t6g t6gVar = new t6g(context, looper2, g1hVar);
            this.z = t6gVar;
            if (t6gVar.a != z2) {
                t6gVar.a = z2;
                t6gVar.f(z2, t6gVar.b);
            }
            this.A = new r09(context, looper2, g1hVar);
            int i8 = q26.c;
            this.b0 = yui.d;
            this.U = h8g.c;
            this.E = i7 >= 34 ? new xv8(this, context) : xv8Var2;
            this.F = new qb5(18);
            this.G = new qb5(18);
            this.D = new co1(this, this.w, this.v, h77Var.s, h77Var.t, h77Var.u, h77Var.v);
            k1hVar.b(38, this.K).b();
            p31 p31Var = this.V;
            boolean z3 = h77Var.j;
            j1h j1hVarC = k1h.c();
            j1hVarC.a = k1hVar.a.obtainMessage(31, z3 ? 1 : 0, 0, p31Var);
            j1hVarC.b();
            z(1, this.V, 3);
            z(2, Integer.valueOf(this.T), 4);
            z(2, 0, 5);
            z(1, Boolean.valueOf(this.W), 9);
            z(6, this.x, 8);
            z(-1, Integer.valueOf(this.Z), 16);
            this.d.c();
        } catch (Throwable th) {
            this.d.c();
            throw th;
        }
    }

    public static long p(j6d j6dVar) {
        kqh kqhVar = new kqh();
        jqh jqhVar = new jqh();
        j6dVar.a.g(j6dVar.b.a, jqhVar);
        long j = j6dVar.c;
        return j == -9223372036854775807L ? j6dVar.a.m(jqhVar.c, kqhVar, 0L).j : jqhVar.e + j;
    }

    public static j6d s(j6d j6dVar, int i) {
        j6d j6dVarG = j6dVar.g(i);
        return (i == 1 || i == 4) ? j6dVarG.b(false) : j6dVarG;
    }

    public final void A(Surface surface) {
        Object obj = this.O;
        boolean zB = true;
        boolean z = (obj == null || obj == surface) ? false : true;
        long j = z ? this.B : -9223372036854775807L;
        d87 d87Var = this.l;
        if (!d87Var.n0 && d87Var.N.getThread().isAlive()) {
            hf4 hf4Var = new hf4(d87Var.T);
            d87Var.L.b(30, new Pair(surface, hf4Var)).b();
            if (j != -9223372036854775807L) {
                zB = hf4Var.b(j);
            }
        }
        if (z) {
            Object obj2 = this.O;
            Surface surface2 = this.P;
            if (obj2 == surface2) {
                surface2.release();
                this.P = null;
            }
        }
        this.O = surface;
        if (zB) {
            return;
        }
        B(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
    }

    public final void B(ExoPlaybackException exoPlaybackException) {
        j6d j6dVar = this.d0;
        j6d j6dVarC = j6dVar.c(j6dVar.b);
        j6dVarC.q = j6dVarC.s;
        j6dVarC.r = 0L;
        j6d j6dVarF = s(j6dVarC, 1).f(exoPlaybackException);
        this.H++;
        this.l.L.a(6).b();
        D(j6dVarF, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void C(int i, boolean z) {
        j6d j6dVarA = this.d0;
        int i2 = j6dVarA.n;
        int i3 = (i2 != 1 || z) ? 0 : 1;
        if (j6dVarA.l == z && i2 == i3 && j6dVarA.m == i) {
            return;
        }
        this.H++;
        if (j6dVarA.p) {
            j6dVarA = j6dVarA.a();
        }
        j6d j6dVarE = j6dVarA.e(i, i3, z);
        k1h k1hVar = this.l.L;
        k1hVar.getClass();
        j1h j1hVarC = k1h.c();
        j1hVarC.a = k1hVar.a.obtainMessage(1, z ? 1 : 0, i | (i3 << 4));
        j1hVarC.b();
        D(j6dVarE, 0, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x044c A[LOOP:0: B:169:0x0444->B:171:0x044c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0508 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(final defpackage.j6d r36, final int r37, boolean r38, int r39, long r40, int r42) {
        /*
            Method dump skipped, instruction units count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v77.D(j6d, int, boolean, int, long, int):void");
    }

    public final void E() {
        int iN = n();
        r09 r09Var = this.A;
        t6g t6gVar = this.z;
        boolean z = false;
        if (iN != 1) {
            if (iN == 2 || iN == 3) {
                F();
                boolean z2 = this.d0.p;
                if (m() && !z2) {
                    z = true;
                }
                t6gVar.g(z);
                r09Var.d(m());
                return;
            }
            if (iN != 4) {
                e0.b();
                return;
            }
        }
        t6gVar.g(false);
        r09Var.d(false);
    }

    public final void F() {
        this.d.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = tpi.a;
            Locale locale = Locale.US;
            String strL = ij0.l("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.X) {
                sz6.j(strL);
            } else {
                ysj.v("ExoPlayerImpl", strL, this.Y ? null : new IllegalStateException());
                this.Y = true;
            }
        }
    }

    public final n7b a() {
        mqh mqhVarJ = j();
        if (mqhVarJ.p()) {
            return this.c0;
        }
        j7b j7bVar = mqhVarJ.m(f(), this.a, 0L).b;
        m7b m7bVarA = this.c0.a();
        n7b n7bVar = j7bVar.d;
        if (n7bVar != null) {
            nz8 nz8Var = n7bVar.A;
            byte[] bArr = n7bVar.f;
            CharSequence charSequence = n7bVar.a;
            if (charSequence != null) {
                m7bVarA.a = charSequence;
            }
            CharSequence charSequence2 = n7bVar.b;
            if (charSequence2 != null) {
                m7bVarA.b = charSequence2;
            }
            CharSequence charSequence3 = n7bVar.c;
            if (charSequence3 != null) {
                m7bVarA.c = charSequence3;
            }
            CharSequence charSequence4 = n7bVar.d;
            if (charSequence4 != null) {
                m7bVarA.d = charSequence4;
            }
            CharSequence charSequence5 = n7bVar.e;
            if (charSequence5 != null) {
                m7bVarA.e = charSequence5;
            }
            if (bArr != null) {
                Integer num = n7bVar.g;
                m7bVarA.f = bArr == null ? null : (byte[]) bArr.clone();
                m7bVarA.g = num;
                n7b n7bVar2 = n7b.B;
            }
            Integer num2 = n7bVar.h;
            if (num2 != null) {
                m7bVarA.h = num2;
            }
            Integer num3 = n7bVar.i;
            if (num3 != null) {
                m7bVarA.i = num3;
            }
            Integer num4 = n7bVar.j;
            if (num4 != null) {
                m7bVarA.j = num4;
            }
            Boolean bool = n7bVar.k;
            if (bool != null) {
                m7bVarA.k = bool;
            }
            Integer num5 = n7bVar.l;
            if (num5 != null) {
                m7bVarA.l = num5;
            }
            Integer num6 = n7bVar.m;
            if (num6 != null) {
                m7bVarA.l = num6;
            }
            Integer num7 = n7bVar.n;
            if (num7 != null) {
                m7bVarA.m = num7;
            }
            Integer num8 = n7bVar.o;
            if (num8 != null) {
                m7bVarA.n = num8;
            }
            Integer num9 = n7bVar.p;
            if (num9 != null) {
                m7bVarA.o = num9;
            }
            Integer num10 = n7bVar.q;
            if (num10 != null) {
                m7bVarA.p = num10;
            }
            Integer num11 = n7bVar.r;
            if (num11 != null) {
                m7bVarA.q = num11;
            }
            CharSequence charSequence6 = n7bVar.s;
            if (charSequence6 != null) {
                m7bVarA.r = charSequence6;
            }
            CharSequence charSequence7 = n7bVar.t;
            if (charSequence7 != null) {
                m7bVarA.s = charSequence7;
            }
            CharSequence charSequence8 = n7bVar.u;
            if (charSequence8 != null) {
                m7bVarA.t = charSequence8;
            }
            Integer num12 = n7bVar.v;
            if (num12 != null) {
                m7bVarA.u = num12;
            }
            Integer num13 = n7bVar.w;
            if (num13 != null) {
                m7bVarA.v = num13;
            }
            CharSequence charSequence9 = n7bVar.x;
            if (charSequence9 != null) {
                m7bVarA.w = charSequence9;
            }
            CharSequence charSequence10 = n7bVar.y;
            if (charSequence10 != null) {
                m7bVarA.x = charSequence10;
            }
            Integer num14 = n7bVar.z;
            if (num14 != null) {
                m7bVarA.y = num14;
            }
            if (!nz8Var.isEmpty()) {
                m7bVarA.z = nz8.q(nz8Var);
            }
        }
        return new n7b(m7bVarA);
    }

    public final void b() {
        F();
        y();
        A(null);
        v(0, 0);
    }

    public final long c(j6d j6dVar) {
        z7b z7bVar = j6dVar.b;
        long j = j6dVar.c;
        mqh mqhVar = j6dVar.a;
        if (!z7bVar.b()) {
            return tpi.M(i(j6dVar));
        }
        Object obj = j6dVar.b.a;
        jqh jqhVar = this.o;
        mqhVar.g(obj, jqhVar);
        if (j == -9223372036854775807L) {
            return tpi.M(mqhVar.m(k(j6dVar), this.a, 0L).j);
        }
        return tpi.M(j) + tpi.M(jqhVar.e);
    }

    public final int d() {
        F();
        if (r()) {
            return this.d0.b.b;
        }
        return -1;
    }

    public final int e() {
        F();
        if (r()) {
            return this.d0.b.c;
        }
        return -1;
    }

    public final int f() {
        F();
        int iK = k(this.d0);
        if (iK == -1) {
            return 0;
        }
        return iK;
    }

    public final int g() {
        F();
        if (!this.d0.a.p()) {
            j6d j6dVar = this.d0;
            return j6dVar.a.b(j6dVar.b.a);
        }
        int i = this.e0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final long h() {
        F();
        return tpi.M(i(this.d0));
    }

    public final long i(j6d j6dVar) {
        if (j6dVar.a.p()) {
            return tpi.C(this.f0);
        }
        long jK = j6dVar.p ? j6dVar.k() : j6dVar.s;
        if (j6dVar.b.b()) {
            return jK;
        }
        mqh mqhVar = j6dVar.a;
        Object obj = j6dVar.b.a;
        jqh jqhVar = this.o;
        mqhVar.g(obj, jqhVar);
        return jK + jqhVar.e;
    }

    public final mqh j() {
        F();
        return this.d0.a;
    }

    public final int k(j6d j6dVar) {
        return j6dVar.a.p() ? this.e0 : j6dVar.a.g(j6dVar.b.a, this.o).c;
    }

    public final long l() {
        F();
        if (!r()) {
            mqh mqhVarJ = j();
            if (mqhVarJ.p()) {
                return -9223372036854775807L;
            }
            return tpi.M(mqhVarJ.m(f(), this.a, 0L).k);
        }
        j6d j6dVar = this.d0;
        z7b z7bVar = j6dVar.b;
        mqh mqhVar = j6dVar.a;
        Object obj = z7bVar.a;
        jqh jqhVar = this.o;
        mqhVar.g(obj, jqhVar);
        return tpi.M(jqhVar.a(z7bVar.b, z7bVar.c));
    }

    public final boolean m() {
        F();
        return this.d0.l;
    }

    public final int n() {
        F();
        return this.d0.e;
    }

    public final int o() {
        F();
        return this.d0.n;
    }

    public final boolean q(int i) {
        F();
        return this.M.a.a.get(i);
    }

    public final boolean r() {
        F();
        return this.d0.b.b();
    }

    public final j6d t(j6d j6dVar, mqh mqhVar, Pair pair) {
        List list;
        fd9.E(mqhVar.p() || pair != null);
        mqh mqhVar2 = j6dVar.a;
        long jC = c(j6dVar);
        j6d j6dVarI = j6dVar.i(mqhVar);
        if (mqhVar.p()) {
            z7b z7bVar = j6d.u;
            long jC2 = tpi.C(this.f0);
            j6d j6dVarC = j6dVarI.d(z7bVar, jC2, jC2, jC2, 0L, w3i.d, this.b, vde.I).c(z7bVar);
            j6dVarC.q = j6dVarC.s;
            return j6dVarC;
        }
        Object obj = j6dVarI.b.a;
        boolean zEquals = obj.equals(pair.first);
        z7b z7bVar2 = !zEquals ? new z7b(pair.first) : j6dVarI.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jC3 = tpi.C(jC);
        if (!mqhVar2.p()) {
            jC3 -= mqhVar2.g(obj, this.o).e;
            if (zEquals && jC3 - jLongValue == 1 && jC3 == mqhVar2.g(obj, this.o).d) {
                jC3--;
            }
        }
        if (!zEquals || jLongValue < jC3) {
            z7b z7bVar3 = z7bVar2;
            fd9.M(!z7bVar3.b());
            w3i w3iVar = !zEquals ? w3i.d : j6dVarI.h;
            f4i f4iVar = !zEquals ? this.b : j6dVarI.i;
            if (zEquals) {
                list = j6dVarI.j;
            } else {
                iz8 iz8Var = nz8.F;
                list = vde.I;
            }
            j6d j6dVarC2 = j6dVarI.d(z7bVar3, jLongValue, jLongValue, jLongValue, 0L, w3iVar, f4iVar, list).c(z7bVar3);
            j6dVarC2.q = jLongValue;
            return j6dVarC2;
        }
        if (jLongValue != jC3) {
            z7b z7bVar4 = z7bVar2;
            fd9.M(!z7bVar4.b());
            long jMax = Math.max(0L, j6dVarI.r - (jLongValue - jC3));
            long j = j6dVarI.q;
            if (j6dVarI.k.equals(j6dVarI.b)) {
                j = jLongValue + jMax;
            }
            j6d j6dVarD = j6dVarI.d(z7bVar4, jLongValue, jLongValue, jLongValue, jMax, j6dVarI.h, j6dVarI.i, j6dVarI.j);
            j6dVarD.q = j;
            return j6dVarD;
        }
        int iB = mqhVar.b(j6dVarI.k.a);
        if (iB != -1 && mqhVar.f(iB, this.o, false).c == mqhVar.g(z7bVar2.a, this.o).c) {
            return j6dVarI;
        }
        mqhVar.g(z7bVar2.a, this.o);
        boolean zB = z7bVar2.b();
        jqh jqhVar = this.o;
        long jA = zB ? jqhVar.a(z7bVar2.b, z7bVar2.c) : jqhVar.d;
        z7b z7bVar5 = z7bVar2;
        j6d j6dVarC3 = j6dVarI.d(z7bVar5, j6dVarI.s, j6dVarI.s, j6dVarI.d, jA - j6dVarI.s, j6dVarI.h, j6dVarI.i, j6dVarI.j).c(z7bVar5);
        j6dVarC3.q = jA;
        return j6dVarC3;
    }

    public final Pair u(mqh mqhVar, int i, long j) {
        if (mqhVar.p()) {
            this.e0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f0 = j;
            return null;
        }
        if (i == -1 || i >= mqhVar.o()) {
            i = mqhVar.a(false);
            j = tpi.M(mqhVar.m(i, this.a, 0L).j);
        }
        return mqhVar.i(this.a, this.o, i, tpi.C(j));
    }

    public final void v(final int i, final int i2) {
        h8g h8gVar = this.U;
        if (i == h8gVar.a && i2 == h8gVar.b) {
            return;
        }
        this.U = new h8g(i, i2);
        this.m.e(24, new hba() { // from class: m77
            @Override // defpackage.hba
            public final void invoke(Object obj) {
                ((u6d) obj).z(i, i2);
            }
        });
        z(2, new h8g(i, i2), 14);
    }

    public final void w() {
        F();
        j6d j6dVar = this.d0;
        if (j6dVar.e != 1) {
            return;
        }
        j6d j6dVarF = j6dVar.f(null);
        j6d j6dVarS = s(j6dVarF, j6dVarF.a.p() ? 4 : 2);
        this.H++;
        this.l.L.a(29).b();
        D(j6dVarS, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void x(u6d u6dVar) {
        F();
        u6dVar.getClass();
        kba kbaVar = this.m;
        if (kbaVar.i) {
            fd9.M(Thread.currentThread() == kbaVar.a);
        }
        CopyOnWriteArraySet<jba> copyOnWriteArraySet = kbaVar.d;
        for (jba jbaVar : copyOnWriteArraySet) {
            if (jbaVar.a.equals(u6dVar)) {
                iba ibaVar = kbaVar.c;
                jbaVar.d = true;
                if (ibaVar != null && jbaVar.c) {
                    jbaVar.c = false;
                    ibaVar.f(jbaVar.a, jbaVar.b.b());
                }
                copyOnWriteArraySet.remove(jbaVar);
            }
        }
    }

    public final void y() {
        TextureView textureView = this.S;
        r77 r77Var = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != r77Var) {
                ysj.u("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.S.setSurfaceTextureListener(null);
            }
            this.S = null;
        }
        SurfaceHolder surfaceHolder = this.Q;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(r77Var);
            this.Q = null;
        }
    }

    public final void z(int i, Object obj, int i2) {
        d87 d87Var;
        pe1[] pe1VarArr = this.g;
        int length = pe1VarArr.length;
        int i3 = 0;
        while (true) {
            d87Var = this.l;
            if (i3 >= length) {
                break;
            }
            pe1 pe1Var = pe1VarArr[i3];
            if (i == -1 || pe1Var.F == i) {
                int iK = k(this.d0);
                mqh mqhVar = this.d0.a;
                if (iK == -1) {
                    iK = 0;
                }
                c7d c7dVar = new c7d(d87Var, pe1Var, mqhVar, iK, d87Var.N);
                fd9.M(!c7dVar.f);
                c7dVar.c = i2;
                fd9.M(!c7dVar.f);
                c7dVar.d = obj;
                c7dVar.b();
            }
            i3++;
        }
        for (pe1 pe1Var2 : this.h) {
            if (pe1Var2 != null && (i == -1 || pe1Var2.F == i)) {
                int iK2 = k(this.d0);
                mqh mqhVar2 = this.d0.a;
                if (iK2 == -1) {
                    iK2 = 0;
                }
                c7d c7dVar2 = new c7d(d87Var, pe1Var2, mqhVar2, iK2, d87Var.N);
                fd9.M(!c7dVar2.f);
                c7dVar2.c = i2;
                fd9.M(!c7dVar2.f);
                c7dVar2.d = obj;
                c7dVar2.b();
            }
        }
    }
}
