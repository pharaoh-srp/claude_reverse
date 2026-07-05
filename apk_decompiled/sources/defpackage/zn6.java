package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zn6 implements ao6 {
    public final /* synthetic */ int E;
    public final qo6 F;

    public /* synthetic */ zn6(qo6 qo6Var, int i) {
        this.E = i;
        this.F = qo6Var;
    }

    @Override // defpackage.ao6
    public final Object u(String str) throws GeneralSecurityException {
        int i = this.E;
        qo6 qo6Var = this.F;
        Exception exc = null;
        int i2 = 0;
        switch (i) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                while (i2 < 2) {
                    Provider provider = Security.getProvider(strArr[i2]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                    i2++;
                }
                Iterator it = arrayList.iterator();
                Exception exc2 = null;
                while (it.hasNext()) {
                    try {
                        return qo6Var.f(str, (Provider) it.next());
                    } catch (Exception e) {
                        if (exc2 == null) {
                            exc2 = e;
                        }
                    }
                }
                return qo6Var.f(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                while (i2 < 3) {
                    Provider provider2 = Security.getProvider(strArr2[i2]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                    i2++;
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        return qo6Var.f(str, (Provider) it2.next());
                    } catch (Exception e2) {
                        if (exc == null) {
                            exc = e2;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }
}
