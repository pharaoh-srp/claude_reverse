package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j30 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(bi5 bi5Var, crd crdVar, c45 c45Var, pz7 pz7Var, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = 3;
        this.G = bi5Var;
        this.H = c45Var;
        this.I = pz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.I;
        switch (i) {
            case 0:
                return new j30((k30) this.G, (String) this.H, (String) obj, tp4Var, 0);
            case 1:
                return new j30((zs2) this.G, (ft2) this.H, (ArrayList) obj, tp4Var, 1);
            case 2:
                return new j30((bi5) this.H, (keb) obj, tp4Var);
            case 3:
                return new j30((bi5) this.G, (crd) null, (c45) this.H, (pz7) obj, tp4Var);
            case 4:
                return new j30((ij7) obj, tp4Var);
            case 5:
                return new j30((juc) this.G, (x4i) this.H, (pz7) obj, tp4Var, 5);
            case 6:
                return new j30((imd) this.G, (kmd) this.H, (ArrayList) obj, tp4Var, 6);
            default:
                return new j30((a6i) this.G, (gff) this.H, this.I, tp4Var, 7);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((j30) create(tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:91|(1:(1:(7:95|151|96|111|(1:113)(1:114)|115|116)(2:100|178))(1:101))(1:102)|103|156|104|(1:179)(5:107|111|(0)(0)|115|116)) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x019d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x019e, code lost:
    
        r15 = r0;
        r14 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b1  */
    /* JADX WARN: Type inference failed for: r2v0, types: [iei, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
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
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j30.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(bi5 bi5Var, keb kebVar, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = 2;
        this.H = bi5Var;
        this.I = kebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(ij7 ij7Var, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = 4;
        this.I = ij7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j30(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }
}
