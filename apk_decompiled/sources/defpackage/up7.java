package defpackage;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class up7 extends xzg implements bz7 {
    public final /* synthetic */ long E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up7(long j, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new up7(this.E, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        ((up7) create((tp4) obj)).invokeSuspend(iei.a);
        throw null;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) uh6.p(this.E)), null);
    }
}
