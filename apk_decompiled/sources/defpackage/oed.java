package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.api.chat.MessageBlobFile;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oed implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ MessageBlobFile G;
    public final /* synthetic */ hdc H;
    public final /* synthetic */ o3f I;
    public final /* synthetic */ nwb J;

    public /* synthetic */ oed(String str, MessageBlobFile messageBlobFile, hdc hdcVar, o3f o3fVar, nwb nwbVar, int i) {
        this.E = i;
        this.F = str;
        this.G = messageBlobFile;
        this.H = hdcVar;
        this.I = o3fVar;
        this.J = nwbVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        nwb nwbVar = this.J;
        MessageBlobFile messageBlobFile = this.G;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    String str = this.F;
                    if (str == null || ((Boolean) nwbVar.getValue()).booleanValue()) {
                        e18Var.a0(-422837578);
                        twj.d(messageBlobFile.getFile_name(), null, e18Var, 0);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-422737355);
                        FillElement fillElement = b.c;
                        boolean zF = e18Var.f(nwbVar);
                        Object objN = e18Var.N();
                        if (zF || objN == lz1Var) {
                            objN = new k3c(11, nwbVar);
                            e18Var.k0(objN);
                        }
                        etj.d(str, this.H, this.I, fillElement, (zy7) objN, e18Var, 3072);
                        e18Var.p(false);
                    }
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    String str2 = this.F;
                    if (str2 == null || ((Boolean) nwbVar.getValue()).booleanValue()) {
                        e18Var2.a0(-895551166);
                        twj.d(messageBlobFile.getFile_name(), null, e18Var2, 0);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-895450726);
                        FillElement fillElement2 = b.c;
                        boolean zF2 = e18Var2.f(nwbVar);
                        Object objN2 = e18Var2.N();
                        if (zF2 || objN2 == lz1Var) {
                            objN2 = new k3c(12, nwbVar);
                            e18Var2.k0(objN2);
                        }
                        qwj.c(str2, this.H, this.I, fillElement2, (zy7) objN2, e18Var2, 3072);
                        e18Var2.p(false);
                    }
                }
                break;
        }
        return ieiVar;
    }
}
