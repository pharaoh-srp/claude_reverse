package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.accompanist.drawablepainter.DrawablePainter;
import defpackage.amg;
import defpackage.bmg;
import defpackage.bpc;
import defpackage.bz7;
import defpackage.cj;
import defpackage.ct5;
import defpackage.cv9;
import defpackage.ex;
import defpackage.fd9;
import defpackage.ft5;
import defpackage.g86;
import defpackage.gb9;
import defpackage.gx8;
import defpackage.ho4;
import defpackage.hr1;
import defpackage.hsc;
import defpackage.ib2;
import defpackage.iuj;
import defpackage.jo4;
import defpackage.k;
import defpackage.k8g;
import defpackage.kx8;
import defpackage.lsc;
import defpackage.mdj;
import defpackage.mee;
import defpackage.mp4;
import defpackage.mpk;
import defpackage.myg;
import defpackage.nai;
import defpackage.r20;
import defpackage.s01;
import defpackage.s4e;
import defpackage.tp4;
import defpackage.tpa;
import defpackage.u01;
import defpackage.wb5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcoil/compose/AsyncImagePainter;", "Lbpc;", "Lmee;", "u01", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = mdj.f)
public final class AsyncImagePainter extends bpc implements mee {
    public mp4 J;
    public final amg K = bmg.a(new k8g(0));
    public final lsc L = mpk.P(null);
    public final hsc M = new hsc(1.0f);
    public final lsc N = mpk.P(null);
    public u01 O;
    public bpc P;
    public bz7 Q;
    public jo4 R;
    public int S;
    public boolean T;
    public final lsc U;
    public final lsc V;
    public final lsc W;

    public AsyncImagePainter(kx8 kx8Var, s4e s4eVar) {
        s01 s01Var = s01.a;
        this.O = s01Var;
        this.Q = ex.X;
        this.R = ho4.b;
        this.S = 1;
        this.U = mpk.P(s01Var);
        this.V = mpk.P(kx8Var);
        this.W = mpk.P(s4eVar);
    }

    @Override // defpackage.mee
    public final void a() {
        mp4 mp4Var = this.J;
        if (mp4Var != null) {
            fd9.z(mp4Var, null);
        }
        this.J = null;
        Object obj = this.P;
        mee meeVar = obj instanceof mee ? (mee) obj : null;
        if (meeVar != null) {
            meeVar.a();
        }
    }

    @Override // defpackage.mee
    public final void b() {
        mp4 mp4Var = this.J;
        if (mp4Var != null) {
            fd9.z(mp4Var, null);
        }
        this.J = null;
        Object obj = this.P;
        mee meeVar = obj instanceof mee ? (mee) obj : null;
        if (meeVar != null) {
            meeVar.b();
        }
    }

    @Override // defpackage.bpc
    public final boolean c(float f) {
        this.M.i(f);
        return true;
    }

    @Override // defpackage.bpc
    public final boolean d(hr1 hr1Var) {
        this.N.setValue(hr1Var);
        return true;
    }

    @Override // defpackage.mee
    public final void g() {
        if (this.J != null) {
            return;
        }
        myg mygVarG = iuj.g();
        ft5 ft5Var = g86.a;
        mp4 mp4VarC = fd9.c(nai.Z(mygVarG, tpa.a.J));
        this.J = mp4VarC;
        Object obj = this.P;
        tp4 tp4Var = null;
        mee meeVar = obj instanceof mee ? (mee) obj : null;
        if (meeVar != null) {
            meeVar.g();
        }
        if (!this.T) {
            gb9.D(mp4VarC, null, null, new cj(this, tp4Var, 4), 3);
            return;
        }
        gx8 gx8VarA = kx8.a((kx8) this.V.getValue());
        gx8VarA.b = ((s4e) this.W.getValue()).a;
        gx8VarA.q = null;
        gx8VarA.a().z.getClass();
        ct5 ct5Var = k.a;
        l(new AsyncImagePainter$State$Loading(null));
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i */
    public final long getN() {
        bpc bpcVar = (bpc) this.L.getValue();
        if (bpcVar != null) {
            return bpcVar.getN();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        k8g k8gVar = new k8g(ib2Var.g());
        amg amgVar = this.K;
        amgVar.getClass();
        amgVar.n(null, k8gVar);
        bpc bpcVar = (bpc) this.L.getValue();
        if (bpcVar != null) {
            bpcVar.f(cv9Var, ib2Var.g(), this.M.h(), (hr1) this.N.getValue());
        }
    }

    public final bpc k(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? wb5.a(new r20(((BitmapDrawable) drawable).getBitmap()), this.S) : new DrawablePainter(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.u01 r13) {
        /*
            r12 = this;
            u01 r0 = r12.O
            bz7 r1 = r12.Q
            java.lang.Object r13 = r1.invoke(r13)
            u01 r13 = (defpackage.u01) r13
            r12.O = r13
            lsc r1 = r12.U
            r1.setValue(r13)
            boolean r1 = r13 instanceof coil.compose.AsyncImagePainter$State$Success
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r13
            coil.compose.AsyncImagePainter$State$Success r1 = (coil.compose.AsyncImagePainter$State$Success) r1
            ixg r1 = r1.a
            goto L25
        L1c:
            boolean r1 = r13 instanceof coil.compose.AsyncImagePainter$State$Error
            if (r1 == 0) goto L60
            r1 = r13
            coil.compose.AsyncImagePainter$State$Error r1 = (coil.compose.AsyncImagePainter$State$Error) r1
            fu6 r1 = r1.a
        L25:
            kx8 r3 = r1.b()
            s5i r3 = r3.g
            a11 r4 = defpackage.t9e.a
            y5i r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof defpackage.qc5
            if (r4 == 0) goto L60
            bpc r4 = r0.getPainter()
            boolean r5 = r0 instanceof coil.compose.AsyncImagePainter$State$Loading
            if (r5 == 0) goto L3f
            r7 = r4
            goto L40
        L3f:
            r7 = r2
        L40:
            bpc r8 = r13.getPainter()
            jo4 r9 = r12.R
            qc5 r3 = (defpackage.qc5) r3
            int r10 = r3.c
            boolean r3 = r1 instanceof defpackage.ixg
            if (r3 == 0) goto L58
            ixg r1 = (defpackage.ixg) r1
            boolean r1 = r1.g
            if (r1 != 0) goto L55
            goto L58
        L55:
            r1 = 0
        L56:
            r11 = r1
            goto L5a
        L58:
            r1 = 1
            goto L56
        L5a:
            coil.compose.CrossfadePainter r6 = new coil.compose.CrossfadePainter
            r6.<init>(r7, r8, r9, r10, r11)
            goto L61
        L60:
            r6 = r2
        L61:
            if (r6 == 0) goto L64
            goto L68
        L64:
            bpc r6 = r13.getPainter()
        L68:
            r12.P = r6
            lsc r1 = r12.L
            r1.setValue(r6)
            mp4 r12 = r12.J
            if (r12 == 0) goto L9e
            bpc r12 = r0.getPainter()
            bpc r1 = r13.getPainter()
            if (r12 == r1) goto L9e
            bpc r12 = r0.getPainter()
            boolean r0 = r12 instanceof defpackage.mee
            if (r0 == 0) goto L88
            mee r12 = (defpackage.mee) r12
            goto L89
        L88:
            r12 = r2
        L89:
            if (r12 == 0) goto L8e
            r12.b()
        L8e:
            bpc r12 = r13.getPainter()
            boolean r13 = r12 instanceof defpackage.mee
            if (r13 == 0) goto L99
            r2 = r12
            mee r2 = (defpackage.mee) r2
        L99:
            if (r2 == 0) goto L9e
            r2.g()
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter.l(u01):void");
    }
}
