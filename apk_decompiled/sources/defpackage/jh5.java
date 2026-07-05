package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class jh5 extends xzg implements rz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh5(bi5 bi5Var, tp4 tp4Var) {
        super(3, tp4Var);
        this.G = bi5Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return new jh5((bi5) this.G, (tp4) obj3).invokeSuspend(ieiVar);
            default:
                ((Boolean) obj2).getClass();
                jh5 jh5Var = new jh5(3, (tp4) obj3);
                jh5Var.G = (ij7) obj;
                return jh5Var.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws IOException {
        int i = this.E;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    bi5 bi5Var = (bi5) this.G;
                    this.F = 1;
                    if (bi5.b(bi5Var, this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return iei.a;
            default:
                ij7 ij7Var = (ij7) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.F = 1;
                    if (!ij7Var.c.get()) {
                        Object objM = knk.m(ij7Var.a, new j30(ij7Var, null), this);
                        return objM == m45Var ? m45Var : objM;
                    }
                    sz6.j("This scope has already been closed.");
                } else {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ jh5(int i, tp4 tp4Var) {
        super(i, tp4Var);
    }
}
