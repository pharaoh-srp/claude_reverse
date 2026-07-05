package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class otg implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ List F;
    public final /* synthetic */ ptg G;
    public final /* synthetic */ ysg H;
    public final /* synthetic */ bz7 I;
    public final /* synthetic */ nwb J;
    public final /* synthetic */ nwb K;

    public /* synthetic */ otg(nwb nwbVar, nwb nwbVar2, List list, ptg ptgVar, ysg ysgVar, bz7 bz7Var) {
        this.J = nwbVar;
        this.K = nwbVar2;
        this.F = list;
        this.G = ptgVar;
        this.H = ysgVar;
        this.I = bz7Var;
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
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        int i2 = 2;
        fqb fqbVar = fqb.E;
        int i3 = 1;
        switch (i) {
            case 0:
                wb7 wb7Var = (wb7) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                wb7Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((e18) ld4Var).f(wb7Var) : ((e18) ld4Var).h(wb7Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    nwb nwbVar = this.J;
                    huk.a.i(wb7Var, (SttSupportedLanguage) nwbVar.getValue(), e18Var, Integer.valueOf(iIntValue & 14));
                    nwb nwbVar2 = this.K;
                    boolean zBooleanValue = ((Boolean) nwbVar2.getValue()).booleanValue();
                    Object objN = e18Var.N();
                    if (objN == lz1Var) {
                        objN = new lxf(9, nwbVar2);
                        e18Var.k0(objN);
                    }
                    wb7Var.a(zBooleanValue, (zy7) objN, b.g(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 320.0f, 1), null, false, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1371703615, new otg(this.F, this.G, this.H, this.I, nwbVar, nwbVar2), e18Var), e18Var, 432, 6 | ((iIntValue << 3) & 112), 1016);
                } else {
                    e18Var.T();
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (SttSupportedLanguage sttSupportedLanguage : this.F) {
                        iqb iqbVarV = b.v(fqbVar, 240.0f, MTTypesetterKt.kLineSkipLimitMultiplier, i2);
                        ta4 ta4VarQ0 = fd9.q0(939153697, new gc4(sttSupportedLanguage, i3), e18Var2);
                        boolean zF = e18Var2.f(sttSupportedLanguage);
                        ptg ptgVar = this.G;
                        boolean zH = zF | e18Var2.h(ptgVar);
                        ysg ysgVar = this.H;
                        boolean zH2 = zH | e18Var2.h(ysgVar);
                        bz7 bz7Var = this.I;
                        boolean zF2 = zH2 | e18Var2.f(bz7Var);
                        Object objN2 = e18Var2.N();
                        if (zF2 || objN2 == lz1Var) {
                            ck4 ck4Var = new ck4(sttSupportedLanguage, ptgVar, ysgVar, bz7Var, this.J, this.K);
                            e18Var2.k0(ck4Var);
                            objN2 = ck4Var;
                        }
                        t30.b(ta4VarQ0, (zy7) objN2, iqbVarV, null, null, false, null, null, e18Var2, 390, 504);
                        i2 = 2;
                    }
                } else {
                    e18Var2.T();
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ otg(List list, ptg ptgVar, ysg ysgVar, bz7 bz7Var, nwb nwbVar, nwb nwbVar2) {
        this.F = list;
        this.G = ptgVar;
        this.H = ysgVar;
        this.I = bz7Var;
        this.J = nwbVar;
        this.K = nwbVar2;
    }
}
