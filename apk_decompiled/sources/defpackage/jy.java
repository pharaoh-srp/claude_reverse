package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jy extends xzg implements rz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ky G;
    public final /* synthetic */ aae H;
    public final /* synthetic */ float I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(ky kyVar, aae aaeVar, float f, tp4 tp4Var) {
        super(3, tp4Var);
        this.G = kyVar;
        this.H = aaeVar;
        this.I = f;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        aae aaeVar = this.H;
        float f = this.I;
        jy jyVar = new jy(this.G, aaeVar, f, (tp4) obj3);
        jyVar.F = (qy) obj;
        return jyVar.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        aae aaeVar;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            qy qyVar = (qy) this.F;
            ky kyVar = this.G;
            iy iyVar = new iy(kyVar, 0, qyVar);
            eo7 eo7Var = kyVar.r0;
            if (eo7Var == null) {
                x44.o0("resolvedFlingBehavior");
                throw null;
            }
            aae aaeVar2 = this.H;
            this.F = aaeVar2;
            this.E = 1;
            obj = eo7Var.a(iyVar, this.I, this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
            aaeVar = aaeVar2;
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aaeVar = (aae) this.F;
            sf5.h0(obj);
        }
        aaeVar.E = ((Number) obj).floatValue();
        return iei.a;
    }
}
