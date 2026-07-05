package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kv5 extends xzg implements rz7 {
    public int E;
    public /* synthetic */ float F;
    public final /* synthetic */ b9i G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv5(b9i b9iVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.G = b9iVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        kv5 kv5Var = new kv5(this.G, (tp4) obj3);
        kv5Var.F = fFloatValue;
        return kv5Var.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            float f = this.F;
            g77 g77Var = (g77) this.G.o;
            s2i s2iVar = g77Var.a;
            zn5 zn5Var = g77Var.c;
            yig yigVar = g77Var.b;
            this.E = 1;
            Object objG = eg0.g(s2iVar, f, zn5Var, yigVar, this);
            m45 m45Var = m45.E;
            if (objG == m45Var) {
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
