package defpackage;

import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class imb implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    public /* synthetic */ imb(Object obj, float f, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = f;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        float f = this.F;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kmb.b((MobileAppToolPreviewInfo) obj3, f, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                ikk.g(f, iP0, (ld4) obj, (iqb) obj3);
                break;
        }
        return ieiVar;
    }
}
