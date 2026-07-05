package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zn3 {
    public final String a = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE";
    public final Bundle b;

    public zn3() {
        Bundle bundle = new Bundle();
        this.b = bundle;
        if (!"androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE".equals("androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE") && !"androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE".equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            sz6.p(ij0.j("The request type ", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE", " is not supported."));
            throw null;
        }
        if ("androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE".equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST", true);
        }
    }
}
