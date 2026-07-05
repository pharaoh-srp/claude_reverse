package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w80 extends ts9 implements rz7 {
    public final /* synthetic */ kdg F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ i90 H;
    public final /* synthetic */ ta4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(kdg kdgVar, Object obj, i90 i90Var, ta4 ta4Var) {
        super(3);
        this.F = kdgVar;
        this.G = obj;
        this.H = i90Var;
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
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ia0 ia0Var = (ia0) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ((e18) ld4Var).f(ia0Var) : ((e18) ld4Var).h(ia0Var) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            kdg kdgVar = this.F;
            boolean zF = e18Var.f(kdgVar);
            Object obj4 = this.G;
            boolean zH = zF | e18Var.h(obj4);
            i90 i90Var = this.H;
            boolean zH2 = zH | e18Var.h(i90Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH2 || objN == lz1Var) {
                objN = new v80(kdgVar, obj4, i90Var, 0);
                e18Var.k0(objN);
            }
            fd9.d(ia0Var, (bz7) objN, e18Var);
            ewb ewbVar = i90Var.d;
            ia0Var.getClass();
            ewbVar.m(obj4, ((ja0) ia0Var).b);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new c90(ia0Var);
                e18Var.k0(objN2);
            }
            this.I.i((c90) objN2, obj4, e18Var, 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
