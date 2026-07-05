package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class t73 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ boolean F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t73(boolean z, nwb nwbVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = z;
        this.G = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new t73(this.F, (nwb) obj2, tp4Var, 0);
            case 1:
                return new t73(this.F, (nwb) obj2, tp4Var, 1);
            default:
                t73 t73Var = new t73((Context) obj2, tp4Var);
                t73Var.F = ((Boolean) obj).booleanValue();
                return t73Var;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((t73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((t73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((t73) create(bool, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                sf5.h0(obj);
                if (!this.F) {
                    ((nwb) obj2).setValue(Boolean.FALSE);
                }
                break;
            case 1:
                sf5.h0(obj);
                if (this.F) {
                    ((zy7) ((nwb) obj2).getValue()).a();
                }
                break;
            default:
                sf5.h0(obj);
                anc.a((Context) obj2, RescheduleReceiver.class, this.F);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t73(Context context, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.G = context;
    }
}
