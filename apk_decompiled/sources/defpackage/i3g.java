package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class i3g extends ts9 implements rz7 {
    public final /* synthetic */ h3g F;
    public final /* synthetic */ a6i G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ k3g I;
    public final /* synthetic */ g3g J;
    public final /* synthetic */ l3g K;
    public final /* synthetic */ eb0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3g(h3g h3gVar, a6i a6iVar, bz7 bz7Var, k3g k3gVar, g3g g3gVar, l3g l3gVar, eb0 eb0Var) {
        super(3);
        this.F = h3gVar;
        this.G = a6iVar;
        this.H = bz7Var;
        this.I = k3gVar;
        this.J = g3gVar;
        this.K = l3gVar;
        this.L = eb0Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a6i a6iVarA0;
        q5i q5iVar;
        l3g l3gVar;
        boolean z;
        g2g g2gVar;
        sv1 sv1Var;
        iqb iqbVar = (iqb) obj;
        ((Number) obj3).intValue();
        e18 e18Var = (e18) ((ld4) obj2);
        e18Var.a0(-1539505585);
        h3g h3gVar = this.F;
        Object obj4 = h3gVar.a;
        e18Var.X(-1996110647, obj4);
        Object objN = e18Var.N();
        k3g k3gVar = this.I;
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            mdg mdgVar = k3gVar.L;
            g2g g2gVar2 = (g2g) mdgVar.get(obj4);
            if (g2gVar2 == null) {
                g2gVar2 = new g2g(obj4, k3gVar);
                mdgVar.put(obj4, g2gVar2);
            }
            objN = g2gVar2;
            e18Var.k0(objN);
        }
        g2g g2gVar3 = (g2g) objN;
        a6i a6iVar = this.G;
        e18Var.X(-1996106866, a6iVar);
        bz7 bz7Var = this.H;
        if (a6iVar != null) {
            rok rokVar = a6iVar.a;
            e18Var.a0(-1749734647);
            String string = obj4.toString();
            boolean zF = e18Var.f(a6iVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = rokVar.q0();
                e18Var.k0(objN2);
            }
            if (a6iVar.g()) {
                objN2 = rokVar.q0();
            }
            e18Var.a0(1498260051);
            Boolean bool = (Boolean) bz7Var.invoke(objN2);
            bool.getClass();
            e18Var.p(false);
            Object value = a6iVar.d.getValue();
            e18Var.a0(1498260051);
            Boolean bool2 = (Boolean) bz7Var.invoke(value);
            bool2.getClass();
            e18Var.p(false);
            a6iVarA0 = nai.t(a6iVar, bool, bool2, string, e18Var, 0);
            e18Var = e18Var;
            e18Var.p(false);
        } else {
            e18Var.a0(-1749482679);
            boolean z2 = true;
            nai.n(1, bz7Var);
            Boolean bool3 = (Boolean) bz7Var.invoke(iei.a);
            boolean zBooleanValue = bool3.booleanValue();
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                if (g2gVar3.c().isEmpty()) {
                    z2 = zBooleanValue;
                } else if (zBooleanValue) {
                    z2 = false;
                }
                objN3 = new swb(Boolean.valueOf(z2));
                e18Var.k0(objN3);
            }
            swb swbVar = (swb) objN3;
            swbVar.M0(bool3);
            a6iVarA0 = nai.a0(swbVar, null, e18Var, 0, 2);
            e18Var.p(false);
        }
        a6i a6iVar2 = a6iVarA0;
        e18Var.X(-1996043323, Boolean.valueOf(k3gVar.a()));
        q5i q5iVarU = nai.u(a6iVar2, dgj.n, null, e18Var, 0, 2);
        e18Var.p(false);
        boolean zF2 = e18Var.f(a6iVar2);
        Object objN4 = e18Var.N();
        if (zF2 || objN4 == lz1Var) {
            sv1 sv1Var2 = new sv1(k3gVar, a6iVar2, q5iVarU, this.L, g2gVar3.h);
            q5iVar = q5iVarU;
            e18Var.k0(sv1Var2);
            objN4 = sv1Var2;
        } else {
            q5iVar = q5iVarU;
        }
        sv1 sv1Var3 = (sv1) objN4;
        if (!x44.r((q5i) sv1Var3.d.getValue(), q5iVar)) {
            sv1Var3.d.setValue(q5iVar);
            sv1Var3.g.setValue(null);
            sv1Var3.f = tv1.a;
        }
        sv1Var3.e.setValue(this.L);
        e18Var.p(false);
        Object objN5 = e18Var.N();
        g3g g3gVar = this.J;
        l3g l3gVar2 = this.K;
        if (objN5 == lz1Var) {
            l3gVar = l3gVar2;
            z = false;
            g2gVar = g2gVar3;
            sv1Var = sv1Var3;
            h2g h2gVar = new h2g(g2gVar, sv1Var, g3gVar, l3gVar, h3gVar);
            e18Var.k0(h2gVar);
            objN5 = h2gVar;
        } else {
            l3gVar = l3gVar2;
            z = false;
            g2gVar = g2gVar3;
            sv1Var = sv1Var3;
        }
        h2g h2gVar2 = (h2g) objN5;
        h3gVar.c.setValue(h2gVar2);
        h2gVar2.H.setValue(g2gVar);
        lsc lscVar = h2gVar2.K;
        Boolean bool4 = Boolean.TRUE;
        lscVar.setValue(bool4);
        h2gVar2.I.setValue(sv1Var);
        h2gVar2.J.setValue(g3gVar);
        h2gVar2.L.setValue(l3gVar);
        h2gVar2.F.i(MTTypesetterKt.kLineSkipLimitMultiplier);
        h2gVar2.G.setValue(bool4);
        h2gVar2.M.setValue(h3gVar);
        e18Var.p(z);
        iqb iqbVarB = iqbVar.B(new t1g(h2gVar2));
        e18Var.p(z);
        return iqbVarB;
    }
}
