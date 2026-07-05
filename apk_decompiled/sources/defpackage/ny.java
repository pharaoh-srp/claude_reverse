package defpackage;

import com.anthropic.claude.mcpapps.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ny extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.H;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new ny((ry) obj2, (rz7) obj, tp4Var, 0);
            case 1:
                return new ny((g60) obj2, (beh) obj, tp4Var, 1);
            case 2:
                return new ny((n01) obj2, (k20) obj, tp4Var, 2);
            case 3:
                return new ny((hf1) obj2, (gf1) obj, tp4Var, 3);
            case 4:
                return new ny((uj4) obj2, (b55) obj, tp4Var, 4);
            case 5:
                return new ny((kwc) obj2, (l4h) obj, tp4Var, 5);
            case 6:
                return new ny((cve) obj2, (bz7) obj, tp4Var, 6);
            case 7:
                return new ny((kq4) obj2, (String) obj, tp4Var, 7);
            case 8:
                return new ny((th8) obj2, (xr) obj, tp4Var, 8);
            case 9:
                return new ny((th8) obj2, (lr) obj, tp4Var, 9);
            case 10:
                return new ny((th8) obj2, (mr) obj, tp4Var, 10);
            case 11:
                return new ny((th8) obj2, (m3e) obj, tp4Var, 11);
            case 12:
                return new ny((b) obj2, (String) obj, tp4Var, 12);
            default:
                return new ny((np5) obj2, (spe) obj, tp4Var, 13);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((ny) create(tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:13:0x004c, B:15:0x0054, B:20:0x005c), top: B:347:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:388:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:407:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v13, types: [odg] */
    /* JADX WARN: Type inference failed for: r1v21, types: [android.os.Handler] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
