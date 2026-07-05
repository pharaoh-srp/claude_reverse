package defpackage;

import android.content.Context;
import com.anthropic.claude.widget.ClaudeAppWidgetReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class n68 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public /* synthetic */ Object G;
    public int H;
    public int I;
    public Object J;
    public final /* synthetic */ Object K;
    public Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n68(dkb dkbVar, int i, bkb bkbVar, qd qdVar, gi1 gi1Var, int i2, gi1 gi1Var2, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = dkbVar;
        this.H = i;
        this.K = bkbVar;
        this.L = qdVar;
        this.M = gi1Var;
        this.I = i2;
        this.N = gi1Var2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.N;
        Object obj3 = this.M;
        Object obj4 = this.K;
        switch (i) {
            case 0:
                n68 n68Var = new n68((ClaudeAppWidgetReceiver) obj4, (Context) obj3, (int[]) obj2, tp4Var);
                n68Var.G = obj;
                return n68Var;
            default:
                n68 n68Var2 = new n68((dkb) this.J, this.H, (bkb) obj4, (qd) this.L, (gi1) obj3, this.I, (gi1) obj2, tp4Var);
                n68Var2.G = obj;
                return n68Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((n68) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((n68) create((lp7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00bf -> B:23:0x00c3). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n68.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n68(ClaudeAppWidgetReceiver claudeAppWidgetReceiver, Context context, int[] iArr, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = claudeAppWidgetReceiver;
        this.M = context;
        this.N = iArr;
    }
}
