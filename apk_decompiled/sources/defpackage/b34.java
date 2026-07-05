package defpackage;

import android.content.Context;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class b34 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ ybg G;
    public final /* synthetic */ Context H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b34(ybg ybgVar, Context context, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = ybgVar;
        this.H = context;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Context context = this.H;
        ybg ybgVar = this.G;
        switch (i) {
            case 0:
                return new b34(ybgVar, context, tp4Var, 0);
            default:
                return new b34(ybgVar, context, tp4Var, 1);
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
        return ((b34) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Context context = this.H;
        ybg ybgVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    String string = context.getString(R.string.ccr_session_restored);
                    string.getClass();
                    this.F = 1;
                    if (ybg.b(ybgVar, string, null, this, 14) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    String string2 = context.getString(R.string.ccr_share_link_copied);
                    string2.getClass();
                    this.F = 1;
                    if (ybg.b(ybgVar, string2, null, this, 14) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
