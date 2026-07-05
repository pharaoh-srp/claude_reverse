package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ja5 implements cec, dv5 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ ja5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.I = obj;
        this.F = obj2;
        this.G = obj3;
        this.H = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    @Override // defpackage.dv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.vde e(int r17, defpackage.v3i r18, int[] r19) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja5.e(int, v3i, int[]):vde");
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        int i = this.E;
        Object obj = this.H;
        Object obj2 = this.G;
        Object obj3 = this.F;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$2((CredentialProviderGetDigitalCredentialController) obj4, (CancellationSignal) obj3, (Executor) obj2, (m95) obj, exc);
                break;
            default:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2((CredentialProviderPlayServicesImpl) obj4, (CancellationSignal) obj3, (Executor) obj2, (m95) obj, exc);
                break;
        }
    }
}
