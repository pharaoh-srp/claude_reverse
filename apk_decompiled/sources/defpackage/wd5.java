package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class wd5 extends k5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd5(String str, Bundle bundle, int i) {
        super(str, bundle);
        switch (i) {
            case 1:
                super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                sz6.p("credentialJson must not be empty, and must be a valid JSON");
                throw null;
            case 2:
                super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
                if (str.length() > 0) {
                    return;
                }
                sz6.p("password should not be empty");
                throw null;
            case 3:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused2) {
                    }
                }
                sz6.p("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                str.getClass();
                bundle.getClass();
                if (str.length() > 0) {
                    return;
                }
                sz6.p("type should not be empty");
                throw null;
        }
    }
}
