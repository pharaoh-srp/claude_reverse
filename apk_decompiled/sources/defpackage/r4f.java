package defpackage;

import android.net.Uri;
import android.webkit.WebMessage;

/* JADX INFO: loaded from: classes3.dex */
public final class r4f extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t4f F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4f(t4f t4fVar, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = t4fVar;
        this.G = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.G;
        t4f t4fVar = this.F;
        switch (i) {
            case 0:
                return new r4f(t4fVar, str, tp4Var, 0);
            default:
                return new r4f(t4fVar, str, tp4Var, 1);
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
                ((r4f) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((r4f) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.G;
        t4f t4fVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                Uri uri = t4fVar.T;
                if (j7j.a.equals(uri)) {
                    uri = j7j.b;
                }
                bf0 bf0Var = t7j.a;
                t4fVar.postWebMessage(new WebMessage(str, null), uri);
                break;
            default:
                sf5.h0(obj);
                t4fVar.evaluateJavascript(str, null);
                break;
        }
        return ieiVar;
    }
}
