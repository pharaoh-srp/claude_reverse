package defpackage;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oq9 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static u20 a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (u20 u20Var : a) {
            synchronized (u20Var) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return u20Var;
            }
        }
        throw new GeneralSecurityException(ij0.i("No KMS client does support: ", str));
    }
}
