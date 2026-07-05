package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes.dex */
public final class tq7 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ dae F;

    public /* synthetic */ tq7(int i, dae daeVar) {
        this.E = i;
        this.F = daeVar;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        dae daeVar = this.F;
        switch (i) {
            case 0:
                daeVar.E = obj;
                throw new AbortFlowException(this);
            default:
                daeVar.E = obj;
                throw new AbortFlowException(this);
        }
    }
}
