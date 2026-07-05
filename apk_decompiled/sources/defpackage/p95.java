package defpackage;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p95 {
    public final Bundle a;
    public final Bundle b;
    public final Set c;

    public p95(Bundle bundle, Bundle bundle2, Set set) {
        this.a = bundle;
        this.b = bundle2;
        this.c = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
    }
}
