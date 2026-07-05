package defpackage;

import android.content.BroadcastReceiver;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ra6 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra6(Object obj, long j, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.F = j;
        this.H = obj2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                return new ra6((sa6) obj3, this.F, (BroadcastReceiver.PendingResult) obj2, tp4Var, 0);
            default:
                return new ra6((j8i) obj3, this.F, (t5e) obj2, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((ra6) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                return ((ra6) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        Object obj2 = this.H;
        long j = this.F;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj2;
                sf5.h0(obj);
                try {
                    sa6.a((sa6) obj3, j);
                    pendingResult.finish();
                    return iei.a;
                } catch (Throwable th) {
                    pendingResult.finish();
                    throw th;
                }
            default:
                sf5.h0(obj);
                u5e u5eVar = ((j8i) obj3).d;
                byte[] bArr = z5e.a;
                byte[] bArr2 = ((t5e) obj2).a;
                byte[] bArr3 = z5e.b;
                byte[] bArrArray = ByteBuffer.allocate(bArr3.length + 8 + bArr2.length).put(bArr3).putLong(j).put(bArr2).array();
                bArrArray.getClass();
                return u5eVar.k(bArrArray);
        }
    }
}
