package coil3.compose;

import android.os.Trace;
import defpackage.a45;
import defpackage.a4e;
import defpackage.a5;
import defpackage.amg;
import defpackage.aw5;
import defpackage.bmg;
import defpackage.bpc;
import defpackage.bw5;
import defpackage.bz7;
import defpackage.c45;
import defpackage.cv9;
import defpackage.d11;
import defpackage.e45;
import defpackage.fd9;
import defpackage.fkg;
import defpackage.fqi;
import defpackage.fx8;
import defpackage.g86;
import defpackage.gb9;
import defpackage.ho4;
import defpackage.hr1;
import defpackage.ib2;
import defpackage.im6;
import defpackage.ix8;
import defpackage.j8;
import defpackage.jo4;
import defpackage.jx8;
import defpackage.k6f;
import defpackage.k8g;
import defpackage.l45;
import defpackage.lf9;
import defpackage.lsc;
import defpackage.mdj;
import defpackage.mee;
import defpackage.mpk;
import defpackage.o0;
import defpackage.o45;
import defpackage.q01;
import defpackage.qb5;
import defpackage.r01;
import defpackage.tad;
import defpackage.tp4;
import defpackage.x44;
import defpackage.x8g;
import defpackage.zv;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/compose/AsyncImagePainter;", "Lbpc;", "Lmee;", "q01", "t01", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class AsyncImagePainter extends bpc implements mee {
    public static final zv Z = new zv(10);
    public hr1 L;
    public boolean M;
    public lf9 N;
    public l45 P;
    public bz7 R;
    public d11 U;
    public q01 V;
    public final amg W;
    public final amg X;
    public final a4e Y;
    public final lsc J = mpk.P(null);
    public float K = 1.0f;
    public long O = 9205357640488583168L;
    public bz7 Q = Z;
    public jo4 S = ho4.b;
    public int T = 1;

    public AsyncImagePainter(q01 q01Var) {
        this.V = q01Var;
        this.W = bmg.a(q01Var);
        amg amgVarA = bmg.a(r01.a);
        this.X = amgVarA;
        this.Y = j8.k(amgVarA);
    }

    public static final jx8 k(AsyncImagePainter asyncImagePainter, jx8 jx8Var, boolean z) {
        fx8 fx8VarV = jx8.v(jx8Var);
        fx8VarV.d = new qb5((Object) jx8Var, (Object) asyncImagePainter, false);
        ix8 ix8Var = jx8Var.u;
        if (ix8Var.g == null) {
            fx8VarV.n = x8g.m;
        }
        if (ix8Var.h == null) {
            jo4 jo4Var = asyncImagePainter.S;
            int i = fqi.b;
            fx8VarV.o = (x44.r(jo4Var, ho4.b) || x44.r(jo4Var, ho4.d)) ? k6f.F : k6f.E;
        }
        if (ix8Var.i == null) {
            fx8VarV.p = tad.F;
        }
        if (z) {
            im6 im6Var = im6.E;
            fx8VarV.g = im6Var;
            fx8VarV.h = im6Var;
            fx8VarV.i = im6Var;
        }
        return fx8VarV.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(coil3.compose.AsyncImagePainter r11, defpackage.t01 r12) {
        /*
            amg r0 = r11.X
            java.lang.Object r1 = r0.getValue()
            t01 r1 = (defpackage.t01) r1
            bz7 r2 = r11.Q
            java.lang.Object r12 = r2.invoke(r12)
            t01 r12 = (defpackage.t01) r12
            r0.m(r12)
            jo4 r5 = r11.S
            boolean r0 = r12 instanceof coil3.compose.AsyncImagePainter$State$Success
            r10 = 0
            if (r0 == 0) goto L20
            r0 = r12
            coil3.compose.AsyncImagePainter$State$Success r0 = (coil3.compose.AsyncImagePainter$State$Success) r0
            hxg r0 = r0.a
            goto L29
        L20:
            boolean r0 = r12 instanceof coil3.compose.AsyncImagePainter$State$Error
            if (r0 == 0) goto L7c
            r0 = r12
            coil3.compose.AsyncImagePainter$State$Error r0 = (coil3.compose.AsyncImagePainter$State$Error) r0
            eu6 r0 = r0.a
        L29:
            jx8 r2 = r0.a()
            r5i r2 = defpackage.nx8.h(r2)
            b11 r3 = defpackage.ybi.a
            z5i r2 = r2.a(r3, r0)
            boolean r3 = r2 instanceof defpackage.pc5
            if (r3 == 0) goto L7c
            bpc r3 = r1.getPainter()
            boolean r4 = r1 instanceof coil3.compose.AsyncImagePainter$State$Loading
            if (r4 == 0) goto L44
            goto L45
        L44:
            r3 = r10
        L45:
            bpc r4 = r12.getPainter()
            lz1 r6 = defpackage.uh6.F
            pc5 r2 = (defpackage.pc5) r2
            int r2 = r2.c
            zh6 r6 = defpackage.zh6.MILLISECONDS
            long r6 = defpackage.v40.Q(r2, r6)
            boolean r2 = r0 instanceof defpackage.hxg
            if (r2 == 0) goto L64
            r2 = r0
            hxg r2 = (defpackage.hxg) r2
            boolean r2 = r2.g
            if (r2 != 0) goto L61
            goto L64
        L61:
            r2 = 0
        L62:
            r8 = r2
            goto L66
        L64:
            r2 = 1
            goto L62
        L66:
            jx8 r0 = r0.a()
            efe r2 = defpackage.idi.c
            java.lang.Object r0 = defpackage.dch.y(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            coil3.compose.CrossfadePainter r2 = new coil3.compose.CrossfadePainter
            r2.<init>(r3, r4, r5, r6, r8, r9)
            goto L7d
        L7c:
            r2 = r10
        L7d:
            if (r2 == 0) goto L80
            goto L84
        L80:
            bpc r2 = r12.getPainter()
        L84:
            lsc r0 = r11.J
            r0.setValue(r2)
            bpc r0 = r1.getPainter()
            bpc r2 = r12.getPainter()
            if (r0 == r2) goto Lb4
            bpc r0 = r1.getPainter()
            boolean r1 = r0 instanceof defpackage.mee
            if (r1 == 0) goto L9e
            mee r0 = (defpackage.mee) r0
            goto L9f
        L9e:
            r0 = r10
        L9f:
            if (r0 == 0) goto La4
            r0.b()
        La4:
            bpc r0 = r12.getPainter()
            boolean r1 = r0 instanceof defpackage.mee
            if (r1 == 0) goto Laf
            r10 = r0
            mee r10 = (defpackage.mee) r10
        Laf:
            if (r10 == 0) goto Lb4
            r10.g()
        Lb4:
            bz7 r11 = r11.R
            if (r11 == 0) goto Lbb
            r11.invoke(r12)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter.l(coil3.compose.AsyncImagePainter, t01):void");
    }

    @Override // defpackage.mee
    public final void a() {
        lf9 lf9Var = this.N;
        if (lf9Var != null) {
            lf9Var.d(null);
        }
        this.N = null;
        Object objM = m();
        mee meeVar = objM instanceof mee ? (mee) objM : null;
        if (meeVar != null) {
            meeVar.a();
        }
        this.M = false;
    }

    @Override // defpackage.mee
    public final void b() {
        lf9 lf9Var = this.N;
        if (lf9Var != null) {
            lf9Var.d(null);
        }
        this.N = null;
        Object objM = m();
        mee meeVar = objM instanceof mee ? (mee) objM : null;
        if (meeVar != null) {
            meeVar.b();
        }
        this.M = false;
    }

    @Override // defpackage.bpc
    public final boolean c(float f) {
        this.K = f;
        return true;
    }

    @Override // defpackage.bpc
    public final boolean d(hr1 hr1Var) {
        this.L = hr1Var;
        return true;
    }

    @Override // defpackage.mee
    public final void g() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objM = m();
            mee meeVar = objM instanceof mee ? (mee) objM : null;
            if (meeVar != null) {
                meeVar.g();
            }
            n();
            this.M = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i */
    public final long getU() {
        bpc bpcVarM = m();
        if (bpcVarM != null) {
            return bpcVarM.getU();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        long jG = ib2Var.g();
        if (!k8g.b(this.O, jG)) {
            this.O = jG;
        }
        bpc bpcVarM = m();
        if (bpcVarM != null) {
            bpcVarM.f(cv9Var, ib2Var.g(), this.K, this.L);
        }
    }

    public final bpc m() {
        return (bpc) this.J.getValue();
    }

    public final void n() {
        q01 q01Var = this.V;
        if (q01Var == null) {
            return;
        }
        l45 l45Var = this.P;
        tp4 tp4Var = null;
        if (l45Var == null) {
            x44.o0("scope");
            throw null;
        }
        o0 o0Var = new o0(this, q01Var, tp4Var, 14);
        c45 coroutineContext = l45Var.getCoroutineContext();
        int i = fqi.b;
        a45 a45VarX0 = coroutineContext.x0(a5.G);
        e45 e45Var = a45VarX0 instanceof e45 ? (e45) a45VarX0 : null;
        o45 o45Var = o45.H;
        fkg fkgVarC = (e45Var == null || e45Var.equals(g86.b)) ? gb9.C(l45Var, g86.b, o45Var, o0Var) : gb9.C(fd9.c(new aw5(l45Var.getCoroutineContext())), new bw5(e45Var), o45Var, o0Var);
        lf9 lf9Var = this.N;
        if (lf9Var != null) {
            lf9Var.d(null);
        }
        this.N = fkgVarC;
    }

    public final void o(q01 q01Var) {
        if (x44.r(this.V, q01Var)) {
            return;
        }
        this.V = q01Var;
        if (q01Var == null) {
            lf9 lf9Var = this.N;
            if (lf9Var != null) {
                lf9Var.d(null);
            }
            this.N = null;
        } else if (this.M) {
            n();
        }
        if (q01Var != null) {
            amg amgVar = this.W;
            amgVar.getClass();
            amgVar.n(null, q01Var);
        }
    }
}
