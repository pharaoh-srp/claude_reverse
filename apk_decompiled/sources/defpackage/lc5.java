package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class lc5 extends ts9 implements pz7 {
    public final /* synthetic */ a6i F;
    public final /* synthetic */ kl7 G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ ta4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc5(a6i a6iVar, kl7 kl7Var, Object obj, ta4 ta4Var) {
        super(2);
        this.F = a6iVar;
        this.G = kl7Var;
        this.H = obj;
        this.I = ta4Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        Object objQ0;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Number) obj2).intValue();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d9i d9iVar = dgj.f;
            a6i a6iVar = this.F;
            boolean zG = a6iVar.g();
            rok rokVar = a6iVar.a;
            lz1 lz1Var = jd4.a;
            if (zG) {
                e18Var.a0(1666827533);
                e18Var.p(false);
                objQ0 = rokVar.q0();
            } else {
                e18Var.a0(1666573488);
                boolean zF = e18Var.f(a6iVar);
                objQ0 = e18Var.N();
                if (zF || objQ0 == lz1Var) {
                    rcg rcgVarZ = fd9.Z();
                    bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
                    rcg rcgVarK0 = fd9.k0(rcgVarZ);
                    try {
                        Object objQ02 = rokVar.q0();
                        fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                        e18Var.k0(objQ02);
                        objQ0 = objQ02;
                    } catch (Throwable th) {
                        fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                        throw th;
                    }
                }
                e18Var.p(false);
            }
            e18Var.a0(1378811975);
            Object obj3 = this.H;
            boolean zR = x44.r(objQ0, obj3);
            float f = MTTypesetterKt.kLineSkipLimitMultiplier;
            float f2 = zR ? 1.0f : 0.0f;
            e18Var.p(false);
            Float fValueOf = Float.valueOf(f2);
            boolean zF2 = e18Var.f(a6iVar);
            Object objN = e18Var.N();
            if (zF2 || objN == lz1Var) {
                objN = mpk.w(new kc5(a6iVar, 0));
                e18Var.k0(objN);
            }
            Object value = ((wlg) objN).getValue();
            e18Var.a0(1378811975);
            if (x44.r(value, obj3)) {
                f = 1.0f;
            }
            e18Var.p(false);
            Float fValueOf2 = Float.valueOf(f);
            boolean zF3 = e18Var.f(a6iVar);
            Object objN2 = e18Var.N();
            if (zF3 || objN2 == lz1Var) {
                objN2 = mpk.w(new kc5(a6iVar, 1));
                e18Var.k0(objN2);
            }
            e18Var.a0(955869654);
            e18Var.p(false);
            v5i v5iVarV = nai.v(a6iVar, fValueOf, fValueOf2, this.G, d9iVar, e18Var, 0);
            boolean zF4 = e18Var.f(v5iVarV);
            Object objN3 = e18Var.N();
            if (zF4 || objN3 == lz1Var) {
                objN3 = new e0(13, v5iVarV);
                e18Var.k0(objN3);
            }
            iqb iqbVarI0 = xn5.i0(fqb.E, (bz7) objN3);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI0);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.V(e18Var, Integer.valueOf(iHashCode), cd4.g);
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            this.I.invoke(obj3, e18Var, 0);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
