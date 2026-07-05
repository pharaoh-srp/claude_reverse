package coil3.compose;

import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.bpc;
import defpackage.cv9;
import defpackage.dqh;
import defpackage.efe;
import defpackage.eqh;
import defpackage.gb9;
import defpackage.hr1;
import defpackage.ib2;
import defpackage.isc;
import defpackage.jo4;
import defpackage.k8g;
import defpackage.mdj;
import defpackage.uh6;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/CrossfadePainter;", "Lbpc;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class CrossfadePainter extends bpc {
    public final bpc J;
    public final jo4 K;
    public final long L;
    public final eqh M;
    public final boolean N;
    public final isc O;
    public dqh P;
    public boolean Q;
    public float R;
    public hr1 S;
    public bpc T;
    public final long U;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CrossfadePainter(defpackage.bpc r5, defpackage.bpc r6, defpackage.jo4 r7, long r8, boolean r10, boolean r11) {
        /*
            r4 = this;
            k2e r0 = defpackage.k2e.M
            r4.<init>()
            r4.J = r6
            r4.K = r7
            r4.L = r8
            r4.M = r0
            r4.N = r10
            isc r7 = new isc
            r8 = 0
            r7.<init>(r8)
            r4.O = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.R = r7
            r4.T = r5
            r9 = 0
            if (r5 == 0) goto L26
            long r0 = r5.getM()
            goto L27
        L26:
            r0 = r9
        L27:
            if (r6 == 0) goto L2d
            long r9 = r6.getM()
        L2d:
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r2 = 1
            if (r7 == 0) goto L39
            r7 = r2
            goto L3a
        L39:
            r7 = r8
        L3a:
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 == 0) goto L3f
            r8 = r2
        L3f:
            if (r11 == 0) goto L48
            if (r8 == 0) goto L45
            r0 = r9
            goto L86
        L45:
            if (r7 == 0) goto L48
            goto L86
        L48:
            if (r7 == 0) goto L85
            if (r8 == 0) goto L85
            r5 = 32
            long r6 = r0 >> r5
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r9 >> r5
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r6 = java.lang.Math.max(r6, r7)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r7
            int r11 = (int) r0
            float r11 = java.lang.Float.intBitsToFloat(r11)
            long r9 = r9 & r7
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = java.lang.Math.max(r11, r9)
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r10 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r9)
            long r0 = (long) r6
            long r5 = r10 << r5
            long r7 = r7 & r0
            long r0 = r5 | r7
            goto L86
        L85:
            r0 = r5
        L86:
            r4.U = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.CrossfadePainter.<init>(bpc, bpc, jo4, long, boolean, boolean):void");
    }

    @Override // defpackage.bpc
    public final boolean c(float f) {
        this.R = f;
        return true;
    }

    @Override // defpackage.bpc
    public final boolean d(hr1 hr1Var) {
        this.S = hr1Var;
        return true;
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getM() {
        return this.U;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        boolean z = this.Q;
        bpc bpcVar = this.J;
        if (z) {
            k(cv9Var, bpcVar, this.R);
            return;
        }
        dqh dqhVarD = this.P;
        if (dqhVarD == null) {
            dqhVarD = this.M.d();
            this.P = dqhVarD;
        }
        float f = uh6.f(dqh.a(dqhVarD.E)) / uh6.f(this.L);
        float fD0 = wd6.d0(f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
        float f2 = this.R;
        float f3 = fD0 * f2;
        if (this.N) {
            f2 -= f3;
        }
        this.Q = f >= 1.0f;
        k(cv9Var, this.T, f2);
        k(cv9Var, bpcVar, f3);
        if (this.Q) {
            this.T = null;
        } else {
            isc iscVar = this.O;
            iscVar.i(iscVar.h() + 1);
        }
    }

    public final void k(cv9 cv9Var, bpc bpcVar, float f) {
        ib2 ib2Var = cv9Var.E;
        if (bpcVar == null || f <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        long jG = ib2Var.g();
        long u = bpcVar.getM();
        long jZ = (u == 9205357640488583168L || k8g.f(u) || jG == 9205357640488583168L || k8g.f(jG)) ? jG : gb9.Z(u, this.K.b(u, jG));
        if (jG == 9205357640488583168L || k8g.f(jG)) {
            bpcVar.f(cv9Var, jZ, f, this.S);
            return;
        }
        long j = jZ;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jG >> 32)) - Float.intBitsToFloat((int) (j >> 32))) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jG & 4294967295L)) - Float.intBitsToFloat((int) (4294967295L & j))) / 2.0f;
        ((efe) ib2Var.F.E).v(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            bpcVar.f(cv9Var, j, f, this.S);
        } finally {
            float f2 = -fIntBitsToFloat;
            float f3 = -fIntBitsToFloat2;
            ((efe) ib2Var.F.E).v(f2, f3, f2, f3);
        }
    }
}
