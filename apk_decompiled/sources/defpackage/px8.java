package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class px8 extends xzg implements bz7 {
    public bz7 E;
    public int F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ np5 H;
    public final /* synthetic */ String I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px8(bz7 bz7Var, np5 np5Var, String str, tp4 tp4Var) {
        super(1, tp4Var);
        this.G = bz7Var;
        this.H = np5Var;
        this.I = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new px8(this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((px8) create((tp4) obj)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws IOException {
        bz7 bz7Var;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            bz7 bz7Var2 = this.G;
            this.E = bz7Var2;
            this.F = 1;
            this.H.getClass();
            InputStream inputStreamA = np5.a(this.I);
            try {
                Object objS = zni.S(inputStreamA);
                inputStreamA.close();
                m45 m45Var = m45.E;
                if (objS == m45Var) {
                    return m45Var;
                }
                bz7Var = bz7Var2;
                obj = objS;
            } finally {
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bz7Var = this.E;
            sf5.h0(obj);
        }
        return bz7Var.invoke(obj);
    }
}
