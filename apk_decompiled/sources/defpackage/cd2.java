package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cd2 extends xzg implements pz7 {
    public final /* synthetic */ int E = 2;
    public int F;
    public final /* synthetic */ float G;
    public Object H;
    public Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd2(dae daeVar, rz7 rz7Var, gri griVar, float f, z9e z9eVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = daeVar;
        this.I = rz7Var;
        this.J = griVar;
        this.G = f;
        this.K = z9eVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.K;
        Object obj3 = this.J;
        switch (i) {
            case 0:
                return new cd2((eui) this.H, this.G, (fcc) this.I, (dui) obj3, (nwb) obj2, tp4Var);
            case 1:
                return new cd2((dae) this.H, (rz7) this.I, (gri) obj3, this.G, (z9e) obj2, tp4Var);
            case 2:
                return new cd2(this.G, (ir5) obj3, (h9f) obj2, tp4Var);
            default:
                return new cd2((kcg) this.I, this.G, (bz7) obj3, (h9f) obj2, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((cd2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        if (r0.invoke(r3, r7, r15) == r8) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bf  */
    /* JADX WARN: Type inference failed for: r4v6, types: [hcg] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd2(float f, ir5 ir5Var, h9f h9fVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = f;
        this.J = ir5Var;
        this.K = h9fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd2(kcg kcgVar, float f, bz7 bz7Var, h9f h9fVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = kcgVar;
        this.G = f;
        this.J = bz7Var;
        this.K = h9fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd2(eui euiVar, float f, fcc fccVar, dui duiVar, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = euiVar;
        this.G = f;
        this.I = fccVar;
        this.J = duiVar;
        this.K = nwbVar;
    }
}
