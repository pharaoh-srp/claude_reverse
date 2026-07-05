package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class x75 extends l65 {
    public x75(String str, Bundle bundle) {
        bundle.getClass();
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        sz6.p("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
