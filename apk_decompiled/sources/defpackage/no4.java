package defpackage;

import android.content.ClipData;

/* JADX INFO: loaded from: classes2.dex */
public final class no4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ op3 G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no4(op3 op3Var, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = op3Var;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.H;
        op3 op3Var = this.G;
        switch (i) {
            case 0:
                return new no4(op3Var, str, tp4Var, 0);
            case 1:
                return new no4(op3Var, str, tp4Var, 1);
            default:
                return new no4(op3Var, str, tp4Var, 2);
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
        return ((no4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        String str = this.H;
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
                    this.F = 1;
                    if (sqk.h(op3Var, str, this) == m45Var) {
                    }
                }
                break;
            case 1:
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
                    ClipData clipDataNewPlainText = ClipData.newPlainText(null, str);
                    clipDataNewPlainText.getClass();
                    this.F = 1;
                    ((mz) op3Var).a.a().setPrimaryClip(clipDataNewPlainText);
                    if (ieiVar == m45Var) {
                    }
                }
                break;
            default:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    ClipData clipDataNewPlainText2 = ClipData.newPlainText("Error details", str);
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
}
