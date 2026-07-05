package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cag implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ v9g G;

    public /* synthetic */ cag(boolean z, v9g v9gVar, int i) {
        this.E = i;
        this.F = z;
        this.G = v9gVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                int i2 = (iIntValue & 14) | 100663296;
                aag.a.b((mag) obj, null, this.F, this.G, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (ld4) obj2, i2);
                break;
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                aag.a.b((mag) obj, null, this.F, this.G, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (ld4) obj2, (iIntValue2 & 14) | 100663296);
                break;
        }
        return ieiVar;
    }
}
