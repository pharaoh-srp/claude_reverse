package defpackage;

import androidx.datastore.core.CorruptionException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class vh5 extends xzg implements bz7 {
    public CorruptionException E;
    public Object F;
    public Serializable G;
    public int H;
    public int I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ bi5 K;
    public final /* synthetic */ pz7 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh5(boolean z, bi5 bi5Var, pz7 pz7Var, tp4 tp4Var) {
        super(1, tp4Var);
        this.J = z;
        this.K = bi5Var;
        this.L = pz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new vh5(this.J, this.K, this.L, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((vh5) create((tp4) obj)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
    
        if (r2 == r0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9 A[Catch: CorruptionException -> 0x009a, TryCatch #0 {CorruptionException -> 0x009a, blocks: (B:36:0x0094, B:60:0x00ff, B:41:0x00a3, B:55:0x00e1, B:42:0x00a9, B:50:0x00c9, B:51:0x00cd, B:46:0x00b9, B:57:0x00ed), top: B:64:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
