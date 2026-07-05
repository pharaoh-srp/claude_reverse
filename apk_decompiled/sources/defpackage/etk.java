package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class etk implements Runnable {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ etk(jsk jskVar, Bundle bundle, long j) {
        this.G = jskVar;
        this.H = bundle;
        this.F = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.E;
        long j = this.F;
        Object obj = this.G;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                jsk jskVar = (jsk) obj;
                Bundle bundle = (Bundle) obj2;
                if (!TextUtils.isEmpty(((umk) jskVar.E).j().S0())) {
                    jskVar.b0().O.b("Using developer consent only; google app id found");
                } else {
                    jskVar.U0(bundle, 0, j);
                }
                break;
            default:
                vxk vxkVar = (vxk) obj2;
                vxkVar.W0((xxk) obj, false, j);
                vxkVar.I = null;
                hyk hykVarN = ((umk) vxkVar.E).n();
                hykVarN.K0();
                hykVarN.O0();
                hykVarN.R0(new s2k(hykVarN, null, false, 22));
                break;
        }
    }

    public etk(vxk vxkVar, xxk xxkVar, long j) {
        this.G = xxkVar;
        this.F = j;
        this.H = vxkVar;
    }
}
