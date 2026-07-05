package defpackage;

import android.content.ClipData;

/* JADX INFO: loaded from: classes2.dex */
public final class tm1 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ op3 G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm1(op3 op3Var, String str, String str2, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = op3Var;
        this.H = str;
        this.I = str2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.I;
        String str2 = this.H;
        op3 op3Var = this.G;
        switch (i) {
            case 0:
                return new tm1(str2, str, op3Var, tp4Var);
            default:
                return new tm1(op3Var, str2, str, tp4Var);
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
        return ((tm1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        String str = this.I;
        String str2 = this.H;
        op3 op3Var = this.G;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    ClipData clipDataNewPlainText = ClipData.newPlainText(null, str2 + "\n" + str);
                    clipDataNewPlainText.getClass();
                    this.F = 1;
                    ((mz) op3Var).a.a().setPrimaryClip(clipDataNewPlainText);
                    if (ieiVar == m45Var) {
                    }
                }
                break;
            default:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    ClipData clipDataNewPlainText2 = ClipData.newPlainText(str2, str);
                    clipDataNewPlainText2.getClass();
                    this.F = 1;
                    ((mz) op3Var).a.a().setPrimaryClip(clipDataNewPlainText2);
                    if (ieiVar == m45Var) {
                    }
                }
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm1(String str, String str2, op3 op3Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = str;
        this.I = str2;
        this.G = op3Var;
    }
}
