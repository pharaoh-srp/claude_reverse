package androidx.compose.ui.draw;

import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.bpc;
import defpackage.c3d;
import defpackage.cv9;
import defpackage.efe;
import defpackage.fma;
import defpackage.gb9;
import defpackage.h5b;
import defpackage.hqb;
import defpackage.hr1;
import defpackage.ib2;
import defpackage.jo4;
import defpackage.k8g;
import defpackage.mdj;
import defpackage.nm6;
import defpackage.p5b;
import defpackage.pu9;
import defpackage.q5b;
import defpackage.rl4;
import defpackage.sl4;
import defpackage.sz;
import defpackage.tt;
import defpackage.vd6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Lpu9;", "Lhqb;", "Lvd6;", "Lbpc;", "painter", "Lbpc;", "p1", "()Lbpc;", "u1", "(Lbpc;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class PainterNode extends hqb implements pu9, vd6 {
    public boolean S;
    public tt T;
    public jo4 U;
    public float V;
    public hr1 W;
    private bpc painter;

    public PainterNode(bpc bpcVar, boolean z, tt ttVar, jo4 jo4Var, float f, hr1 hr1Var) {
        this.painter = bpcVar;
        this.S = z;
        this.T = ttVar;
        this.U = jo4Var;
        this.V = f;
        this.W = hr1Var;
    }

    public static boolean r1(long j) {
        return !k8g.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean s1(long j) {
        return !k8g.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        if (!q1()) {
            return h5bVar.Q(i);
        }
        long jT1 = t1(sl4.b(0, i, 0, 0, 13));
        return Math.max(rl4.i(jT1), h5bVar.Q(i));
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        long m = this.painter.getM();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s1(m) ? Float.intBitsToFloat((int) (m >> 32)) : Float.intBitsToFloat((int) (ib2Var.g() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(r1(m) ? Float.intBitsToFloat((int) (m & 4294967295L)) : Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)))) & 4294967295L);
        long jZ = (Float.intBitsToFloat((int) (ib2Var.g() >> 32)) == MTTypesetterKt.kLineSkipLimitMultiplier || Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)) == MTTypesetterKt.kLineSkipLimitMultiplier) ? 0L : gb9.Z(jFloatToRawIntBits, this.U.b(jFloatToRawIntBits, ib2Var.g()));
        long jA = this.T.a((((long) Math.round(Float.intBitsToFloat((int) (jZ >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jZ & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (ib2Var.g() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)))) & 4294967295L), cv9Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((efe) ib2Var.F.E).G(f, f2);
        try {
            this.painter.f(cv9Var, jZ, this.V, this.W);
            ((efe) ib2Var.F.E).G(-f, -f2);
            cv9Var.a();
        } catch (Throwable th) {
            ((efe) ib2Var.F.E).G(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        if (!q1()) {
            return h5bVar.l(i);
        }
        long jT1 = t1(sl4.b(0, 0, 0, i, 7));
        return Math.max(rl4.j(jT1), h5bVar.l(i));
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU = h5bVar.u(t1(j));
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new sz(c3dVarU, 3));
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        if (!q1()) {
            return h5bVar.o(i);
        }
        long jT1 = t1(sl4.b(0, 0, 0, i, 7));
        return Math.max(rl4.j(jT1), h5bVar.o(i));
    }

    @Override // defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        if (!q1()) {
            return h5bVar.a(i);
        }
        long jT1 = t1(sl4.b(0, i, 0, 0, 13));
        return Math.max(rl4.i(jT1), h5bVar.a(i));
    }

    /* JADX INFO: renamed from: p1, reason: from getter */
    public final bpc getPainter() {
        return this.painter;
    }

    public final boolean q1() {
        return this.S && this.painter.getM() != 9205357640488583168L;
    }

    public final long t1(long j) {
        boolean z = false;
        boolean z2 = rl4.d(j) && rl4.c(j);
        if (rl4.f(j) && rl4.e(j)) {
            z = true;
        }
        if ((!q1() && z2) || z) {
            return rl4.a(rl4.h(j), 0, rl4.g(j), 0, 10, j);
        }
        long m = this.painter.getM();
        int iRound = s1(m) ? Math.round(Float.intBitsToFloat((int) (m >> 32))) : rl4.j(j);
        int iRound2 = r1(m) ? Math.round(Float.intBitsToFloat((int) (m & 4294967295L))) : rl4.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(sl4.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(sl4.g(iRound, j))) << 32);
        if (q1()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!s1(this.painter.getM()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.painter.getM() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!r1(this.painter.getM()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.getM() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == MTTypesetterKt.kLineSkipLimitMultiplier || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == MTTypesetterKt.kLineSkipLimitMultiplier) ? 0L : gb9.Z(jFloatToRawIntBits2, this.U.b(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return rl4.a(sl4.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, sl4.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.S + ", alignment=" + this.T + ", alpha=" + this.V + ", colorFilter=" + this.W + ')';
    }

    public final void u1(bpc bpcVar) {
        this.painter = bpcVar;
    }
}
