package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xx extends xzg implements sz7 {
    public int E;
    public /* synthetic */ qy F;
    public /* synthetic */ vq5 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ry I;
    public final /* synthetic */ mb0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(ry ryVar, mb0 mb0Var, tp4 tp4Var) {
        super(4, tp4Var);
        this.I = ryVar;
        this.J = mb0Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        xx xxVar = new xx(this.I, this.J, (tp4) obj4);
        xxVar.F = (qy) obj;
        xxVar.G = (vq5) obj2;
        xxVar.H = obj3;
        return xxVar.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            qy qyVar = this.F;
            vq5 vq5Var = this.G;
            Object obj2 = this.H;
            ry ryVar = this.I;
            float fH = ryVar.k.h();
            this.F = null;
            this.G = null;
            this.E = 1;
            Object objB = fy.b(ryVar, fH, qyVar, vq5Var, obj2, this.J, this);
            m45 m45Var = m45.E;
            if (objB == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
