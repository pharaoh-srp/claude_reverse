package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x9f extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ z9f F;
    public final /* synthetic */ float G;
    public final /* synthetic */ float H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9f(z9f z9fVar, float f, float f2, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = z9fVar;
        this.G = f;
        this.H = f2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new x9f(this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((x9f) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            raf rafVar = this.F.r0;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.G)) << 32) | (((long) Float.floatToRawIntBits(this.H)) & 4294967295L);
            this.E = 1;
            Object objA = r9f.a(rafVar, jFloatToRawIntBits, this);
            m45 m45Var = m45.E;
            if (objA == m45Var) {
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
