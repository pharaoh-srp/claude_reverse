package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fqk implements nyg {
    public /* synthetic */ Context E;

    @Override // defpackage.nyg
    public final Object get() {
        kjc kjcVar;
        kjc kjcVarB;
        Context contextCreateDeviceProtectedStorageContext = this.E;
        kjc kjcVar2 = mpk.a;
        if (kjcVar2 != null) {
            return kjcVar2;
        }
        synchronized (mpk.class) {
            try {
                kjcVar = mpk.a;
                if (kjcVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    bp0 bp0Var = rpk.a;
                    if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                        if (!contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                        }
                        kjcVarB = ryi.b(contextCreateDeviceProtectedStorageContext);
                    } else {
                        kjcVarB = x.E;
                    }
                    kjcVar = kjcVarB;
                    mpk.a = kjcVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kjcVar;
    }
}
