package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kw implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ kw(List list, koc kocVar, pz7 pz7Var, l45 l45Var) {
        this.E = 14;
        this.H = list;
        this.G = kocVar;
        this.I = pz7Var;
        this.F = l45Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        tkd tkdVar = (tkd) this.F;
        zy7 zy7Var = (zy7) this.G;
        rwe rweVar = (rwe) this.H;
        bz7 bz7Var = (bz7) this.I;
        zy7 zy7Var2 = (zy7) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        lyk lykVar = lyk.U;
        ((s64) obj).getClass();
        zy7Var2.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= ((e18) ld4Var).h(zy7Var2) ? 32 : 16;
        }
        int i = 1;
        int i2 = 0;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
            Boolean boolValueOf = tkdVar != null ? Boolean.valueOf(tkdVar.g) : null;
            lz1 lz1Var = jd4.a;
            if (boolValueOf != null) {
                e18Var.a0(-1913018829);
                boolean zBooleanValue = boolValueOf.booleanValue();
                boolean zF = e18Var.f(zy7Var) | ((iIntValue & 112) == 32);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = new kt0(zy7Var, zy7Var2, 24);
                    e18Var.k0(objN);
                }
                lykVar.e(384, e18Var, (zy7) objN, zBooleanValue);
                e18Var.p(false);
            } else {
                e18Var.a0(-1912819902);
                e18Var.p(false);
            }
            if (tkdVar == null || !tkdVar.i) {
                e18Var.a0(-1912530238);
                e18Var.p(false);
            } else {
                e18Var.a0(-1912754151);
                boolean zH = e18Var.h(rweVar) | ((iIntValue & 112) == 32);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new lld(rweVar, zy7Var2, i2);
                    e18Var.k0(objN2);
                }
                lykVar.c((zy7) objN2, e18Var, 48);
                e18Var.p(false);
            }
            if (tkdVar == null || !tkdVar.i) {
                e18Var.a0(-1912234622);
                e18Var.p(false);
            } else {
                e18Var.a0(-1912464301);
                boolean z = tkdVar.f;
                boolean zF2 = e18Var.f(bz7Var) | e18Var.f(tkdVar) | ((iIntValue & 112) == 32);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = new hya(bz7Var, tkdVar, zy7Var2, 13);
                    e18Var.k0(objN3);
                }
                lykVar.a(384, e18Var, (zy7) objN3, z);
                e18Var.p(false);
            }
            if (tkdVar == null || !tkdVar.h) {
                e18Var.a0(-1911950910);
                e18Var.p(false);
            } else {
                e18Var.a0(-1912174823);
                boolean zH2 = e18Var.h(rweVar) | ((iIntValue & 112) == 32);
                Object objN4 = e18Var.N();
                if (zH2 || objN4 == lz1Var) {
                    objN4 = new lld(rweVar, zy7Var2, i);
                    e18Var.k0(objN4);
                }
                lykVar.b((zy7) objN4, e18Var, 48);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        qi3 qi3Var = (qi3) this.F;
        String str = (String) this.G;
        ysg ysgVar = (ysg) this.H;
        zy7 zy7Var = (zy7) this.I;
        mnc mncVar = (mnc) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iH = ebh.h((Integer) obj4, (s64) obj, mncVar);
        if ((iH & 48) == 0) {
            iH |= ((e18) ld4Var).f(mncVar) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iH & 1, (iH & 145) != 144)) {
            String strJ0 = d4c.j0(R.string.generic_button_continue, e18Var);
            iqb iqbVarN = gb9.N(gb9.I(b.c(fqb.E, 1.0f), mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            boolean zH = e18Var.h(qi3Var) | e18Var.f(str) | e18Var.h(ysgVar) | e18Var.f(zy7Var);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new zsg(qi3Var, str, ysgVar, zy7Var, 1);
                e18Var.k0(objN);
            }
            dtj.a(strJ0, iqbVarN, false, null, null, null, 0L, (zy7) objN, e18Var, 0, 124);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:261:0x078a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x085f  */
    @Override // defpackage.sz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r54, java.lang.Object r55, java.lang.Object r56, java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 3300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw.i(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ kw(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    public /* synthetic */ kw(mra mraVar, l45 l45Var, x0a x0aVar, koc kocVar) {
        this.E = 6;
        this.G = mraVar;
        this.F = l45Var;
        this.H = x0aVar;
        this.I = kocVar;
    }

    public /* synthetic */ kw(List list, String str, List list2, yw8 yw8Var) {
        this.E = 4;
        this.H = list;
        this.F = str;
        this.G = list2;
        this.I = yw8Var;
    }
}
