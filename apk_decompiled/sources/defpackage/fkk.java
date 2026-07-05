package defpackage;

import android.text.TextUtils;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class fkk {
    public final /* synthetic */ int a = 0;
    public final umk b;

    public fkk(o0l o0lVar) {
        this.b = o0lVar.P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        int i = this.a;
        boolean z = false;
        umk umkVar = this.b;
        switch (i) {
            case 0:
                try {
                    gmf gmfVarA = nij.a(umkVar.E);
                    if (gmfVarA == null) {
                        qgk qgkVar = umkVar.M;
                        umk.d(qgkVar);
                        qgkVar.R.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        umkVar = umkVar;
                    } else {
                        int i2 = gmfVarA.E(FreeTypeConstants.FT_LOAD_PEDANTIC, "com.android.vending").versionCode;
                        umkVar = i2;
                        if (i2 >= 80837300) {
                            z = true;
                            umkVar = i2;
                        }
                    }
                    break;
                } catch (Exception e) {
                    qgk qgkVar2 = umkVar.M;
                    umk.d(qgkVar2);
                    qgkVar2.R.c("Failed to retrieve Play Store version for Install Referrer", e);
                }
                return z;
            default:
                if (!TextUtils.isEmpty(umkVar.F)) {
                    return false;
                }
                qgk qgkVar3 = umkVar.M;
                umk.d(qgkVar3);
                return qgkVar3.S0(3);
        }
    }

    public fkk(umk umkVar) {
        this.b = umkVar;
    }
}
