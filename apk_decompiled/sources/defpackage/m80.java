package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m80 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public Object I;
    public /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
        this.L = obj6;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.L;
        Object obj3 = this.K;
        switch (i) {
            case 0:
                m80 m80Var = new m80((gh2) this.I, (a80) this.J, (nwb) obj3, (nwb) obj2, tp4Var, 0);
                m80Var.H = obj;
                return m80Var;
            case 1:
                return new m80((hw2) this.G, (t53) this.H, (t4g) this.I, (t4g) this.J, (t4g) obj3, (bt7) obj2, tp4Var, 1);
            case 2:
                m80 m80Var2 = new m80((ft2) obj3, (bj5) obj2, tp4Var, 2);
                m80Var2.J = obj;
                return m80Var2;
            case 3:
                m80 m80Var3 = new m80((gxb) obj3, (bz7) obj2, tp4Var, 3);
                m80Var3.J = obj;
                return m80Var3;
            case 4:
                return new m80((vpc) this.G, (wpc) this.H, (List) this.I, (kl7) this.J, (eo7) obj3, (mpc) obj2, tp4Var, 4);
            case 5:
                return new m80((c4a) this.I, (a4a) this.J, (l45) obj3, (pz7) obj2, tp4Var, 5);
            default:
                m80 m80Var4 = new m80((b4a) this.J, (z3a) obj3, (h30) obj2, tp4Var);
                m80Var4.H = obj;
                return m80Var4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((m80) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x03ba, code lost:
    
        if (r1.e(r8, r3, false, r20) != r2) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038a A[Catch: Exception -> 0x02fd, CancellationException -> 0x03eb, LOOP:4: B:186:0x0384->B:188:0x038a, LOOP_END, TryCatch #4 {Exception -> 0x02fd, blocks: (B:162:0x02f6, B:181:0x035c, B:183:0x0367, B:185:0x0373, B:186:0x0384, B:188:0x038a, B:189:0x039e, B:176:0x033a, B:178:0x033e, B:172:0x0326), top: B:246:0x02ca }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Type inference failed for: r1v18, types: [xz8] */
    /* JADX WARN: Type inference failed for: r2v20, types: [hxb, java.lang.Object, m45] */
    /* JADX WARN: Type inference failed for: r6v4, types: [xz8] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [ft2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15, types: [ft2] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:228:0x049e -> B:230:0x04a2). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m80.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m80(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.K = obj;
        this.L = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m80(Object obj, Object obj2, Object obj3, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.J = obj2;
        this.K = obj3;
        this.L = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m80(b4a b4aVar, z3a z3aVar, h30 h30Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 6;
        this.J = b4aVar;
        this.K = z3aVar;
        this.L = h30Var;
    }
}
