package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class sl7 extends vp4 {
    public ul7 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ul7 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl7(ul7 ul7Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = ul7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Serializable serializableB = this.G.b(this);
        return serializableB == m45.E ? serializableB : new jre(serializableB);
    }
}
