package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c16 extends i0 implements bo5 {
    public final esd I;
    public final wp1 J;
    public final neg K;
    public final gh3 L;
    public final int M;
    public final ow5 N;
    public final int O;
    public final wk P;
    public final gab Q;
    public final a16 R;
    public final y7f S;
    public final dpf T;
    public final bo5 U;
    public final cfa V;
    public final dfa W;
    public final dfa X;
    public final cfa Y;
    public final cud Z;
    public final wc0 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c16(wk wkVar, esd esdVar, txb txbVar, wp1 wp1Var, neg negVar) {
        int i;
        zp3 zp3Var;
        super(((r06) wkVar.d).a, iv1.u(txbVar, esdVar.I).i());
        wkVar.getClass();
        esdVar.getClass();
        txbVar.getClass();
        negVar.getClass();
        this.I = esdVar;
        this.J = wp1Var;
        this.K = negVar;
        this.L = iv1.u(txbVar, esdVar.I);
        this.M = lja.m((wsd) on7.e.e(esdVar.H));
        this.N = ez1.z((bud) on7.d.e(esdVar.H));
        dsd dsdVar = (dsd) on7.f.e(esdVar.H);
        int i2 = 2;
        int i3 = 4;
        int i4 = 5;
        int i5 = 3;
        int i6 = 1;
        switch (dsdVar == null ? -1 : hud.b[dsdVar.ordinal()]) {
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
            case 7:
                i = 6;
                break;
            default:
                i = 1;
                break;
        }
        this.O = i;
        List list = esdVar.K;
        list.getClass();
        ttd ttdVar = esdVar.i0;
        ttdVar.getClass();
        cbi cbiVar = new cbi(ttdVar);
        aud audVar = esdVar.k0;
        audVar.getClass();
        if (audVar.F.size() == 0) {
            zp3Var = zp3.Z;
        } else {
            audVar.F.getClass();
            zp3Var = new zp3(10);
        }
        wk wkVarA = wkVar.a(this, list, txbVar, cbiVar, zp3Var, wp1Var);
        r06 r06Var = (r06) wkVarA.d;
        gfa gfaVar = r06Var.a;
        this.P = wkVarA;
        this.Q = i == 3 ? new wmg(gfaVar, this) : eab.b;
        this.R = new a16(this);
        lz1 lz1Var = y7f.d;
        ((d3c) r06Var.q).getClass();
        tz1 tz1Var = new tz1(i6, this, i6);
        lz1Var.getClass();
        gfaVar.getClass();
        this.S = new y7f(this, gfaVar, tz1Var);
        this.T = i == 3 ? new dpf(this) : null;
        bo5 bo5Var = (bo5) wkVar.a;
        this.U = bo5Var;
        this.V = new cfa(gfaVar, new z06(this, i3));
        this.W = new dfa(gfaVar, new z06(this, i5));
        new cfa(gfaVar, new z06(this, i2));
        this.X = new dfa(gfaVar, new z06(this, i4));
        this.Y = new cfa(gfaVar, new z06(this, 6));
        txb txbVar2 = (txb) wkVarA.e;
        cbi cbiVar2 = (cbi) wkVarA.f;
        c16 c16Var = bo5Var instanceof c16 ? (c16) bo5Var : null;
        this.Z = new cud(esdVar, txbVar2, cbiVar2, negVar, c16Var != null ? c16Var.Z : null);
        this.a0 = !on7.c.e(esdVar.H).booleanValue() ? dd8.F : new e6c(gfaVar, new z06(this, i6));
    }

    @Override // defpackage.qqb
    public final Collection O() {
        return (Collection) this.X.a();
    }

    @Override // defpackage.qqb
    public final fab b0() {
        return this.Q;
    }

    @Override // defpackage.do5
    public final neg d() {
        return this.K;
    }

    @Override // defpackage.w9b
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.ub0
    public final wc0 getAnnotations() {
        return this.a0;
    }

    @Override // defpackage.qqb, defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        return this.N;
    }

    @Override // defpackage.bo5
    public final bo5 h() {
        return this.U;
    }

    @Override // defpackage.qqb, defpackage.yh3
    public final List i0() {
        return ((aai) this.P.c).b();
    }

    @Override // defpackage.w9b
    public final boolean isExternal() {
        return on7.i.e(this.I.H).booleanValue();
    }

    @Override // defpackage.qqb
    public final boolean isInline() {
        if (!on7.k.e(this.I.H).booleanValue()) {
            return false;
        }
        wp1 wp1Var = this.J;
        int i = wp1Var.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = wp1Var.c;
            if (i2 >= 4 && (i2 > 4 || wp1Var.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.qqb
    public final Collection j() {
        return (Collection) this.W.a();
    }

    @Override // defpackage.i0, defpackage.qqb
    public final List k() {
        wk wkVar = this.P;
        List listC = ajk.c(this.I, (cbi) wkVar.f);
        ArrayList arrayList = new ArrayList(x44.y(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(new mw9(j0(), new uo4(this, ((aai) wkVar.c).g((ntd) it.next()), (sxb) null), dd8.F));
        }
        return arrayList;
    }

    @Override // defpackage.qqb
    public final int m() {
        return this.O;
    }

    @Override // defpackage.qqb
    public final fab m0(es9 es9Var) {
        y7f y7fVar = this.S;
        i0 i0Var = y7fVar.a;
        int i = o06.a;
        m06.d(i0Var).getClass();
        return (fab) wd6.s0(y7fVar.c, y7f.e[0]);
    }

    @Override // defpackage.qqb
    public final tg3 n0() {
        return (tg3) this.V.a();
    }

    @Override // defpackage.qqb
    public final sqi o0() {
        return (sqi) this.Y.a();
    }

    @Override // defpackage.xh3
    public final u9i p() {
        return this.R;
    }

    @Override // defpackage.qqb
    public final boolean p0() {
        return on7.f.e(this.I.H) == dsd.COMPANION_OBJECT;
    }

    @Override // defpackage.qqb, defpackage.w9b
    public final int q() {
        return this.M;
    }

    @Override // defpackage.qqb
    public final boolean q0() {
        return on7.h.e(this.I.H).booleanValue();
    }

    @Override // defpackage.qqb
    public final boolean r0() {
        return on7.l.e(this.I.H).booleanValue();
    }

    @Override // defpackage.qqb
    public final boolean s0() {
        return on7.k.e(this.I.H).booleanValue() && this.J.a(1, 4, 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(x() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    public final y06 v0() {
        ((d3c) ((r06) this.P.d).q).getClass();
        y7f y7fVar = this.S;
        y7fVar.getClass();
        i0 i0Var = y7fVar.a;
        int i = o06.a;
        m06.d(i0Var).getClass();
        return (y06) ((fab) wd6.s0(y7fVar.c, y7f.e[0]));
    }

    public final j7g w0(sxb sxbVar) {
        Iterator it = v0().d(sxbVar, 18).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((hrd) next).S() == null) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        hrd hrdVar = (hrd) obj;
        return (j7g) (hrdVar != null ? hrdVar.getType() : null);
    }

    @Override // defpackage.w9b
    public final boolean x() {
        return on7.j.e(this.I.H).booleanValue();
    }

    @Override // defpackage.yh3
    public final boolean y() {
        return on7.g.e(this.I.H).booleanValue();
    }
}
