package coil.compose;

import android.os.SystemClock;
import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.bpc;
import defpackage.cv9;
import defpackage.efe;
import defpackage.eve;
import defpackage.gb9;
import defpackage.hr1;
import defpackage.hsc;
import defpackage.ib2;
import defpackage.isc;
import defpackage.jo4;
import defpackage.k8g;
import defpackage.lsc;
import defpackage.mdj;
import defpackage.mpk;
import defpackage.wd6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/CrossfadePainter;", "Lbpc;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = mdj.f)
public final class CrossfadePainter extends bpc {
    public bpc J;
    public final bpc K;
    public final jo4 L;
    public final int M;
    public final boolean N;
    public boolean Q;
    public final isc O = new isc(0);
    public long P = -1;
    public final hsc R = new hsc(1.0f);
    public final lsc S = mpk.P(null);

    public CrossfadePainter(bpc bpcVar, bpc bpcVar2, jo4 jo4Var, int i, boolean z) {
        this.J = bpcVar;
        this.K = bpcVar2;
        this.L = jo4Var;
        this.M = i;
        this.N = z;
    }

    @Override // defpackage.bpc
    public final boolean c(float f) {
        this.R.i(f);
        return true;
    }

    @Override // defpackage.bpc
    public final boolean d(hr1 hr1Var) {
        this.S.setValue(hr1Var);
        return true;
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i */
    public final long getM() {
        bpc bpcVar = this.J;
        long n = bpcVar != null ? bpcVar.getM() : 0L;
        bpc bpcVar2 = this.K;
        long n2 = bpcVar2 != null ? bpcVar2.getM() : 0L;
        boolean z = n != 9205357640488583168L;
        boolean z2 = n2 != 9205357640488583168L;
        if (z && z2) {
            return eve.i(Math.max(k8g.e(n), k8g.e(n2)), Math.max(k8g.c(n), k8g.c(n2)));
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        boolean z = this.Q;
        hsc hscVar = this.R;
        bpc bpcVar = this.K;
        if (z) {
            k(cv9Var, bpcVar, hscVar.h());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.P == -1) {
            this.P = jUptimeMillis;
        }
        float f = (jUptimeMillis - this.P) / this.M;
        float fH = hscVar.h() * wd6.d0(f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
        float fH2 = this.N ? hscVar.h() - fH : hscVar.h();
        this.Q = f >= 1.0f;
        k(cv9Var, this.J, fH2);
        k(cv9Var, bpcVar, fH);
        if (this.Q) {
            this.J = null;
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
        long n = bpcVar.getM();
        long jZ = (n == 9205357640488583168L || k8g.f(n) || jG == 9205357640488583168L || k8g.f(jG)) ? jG : gb9.Z(n, this.L.b(n, jG));
        lsc lscVar = this.S;
        if (jG == 9205357640488583168L || k8g.f(jG)) {
            bpcVar.f(cv9Var, jZ, f, (hr1) lscVar.getValue());
            return;
        }
        float fE = (k8g.e(jG) - k8g.e(jZ)) / 2.0f;
        float fC = (k8g.c(jG) - k8g.c(jZ)) / 2.0f;
        ((efe) ib2Var.F.E).v(fE, fC, fE, fC);
        bpcVar.f(cv9Var, jZ, f, (hr1) lscVar.getValue());
        float f2 = -fE;
        float f3 = -fC;
        ((efe) ib2Var.F.E).v(f2, f3, f2, f3);
    }
}
