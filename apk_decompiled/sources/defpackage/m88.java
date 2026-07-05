package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import io.sentry.e0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class m88 extends wd5 {
    public final String c;

    public m88(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        str.getClass();
        str2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, 0);
        this.c = str2;
        if (str.length() <= 0) {
            sz6.p("id should not be empty");
            throw null;
        }
        if (str2.length() <= 0) {
            sz6.p("idToken should not be empty");
            throw null;
        }
        List listY0 = bsg.Y0(str2, new String[]{"."}, 6);
        if (listY0.size() != 3) {
            sz6.p("Invalid token format");
            throw null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) listY0.get(1), 8);
            bArrDecode.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            jSONObject.optString("email").getClass();
            String strOptString = jSONObject.optString("sub");
            if ((strOptString.length() == 0 ? null : strOptString) != null) {
            } else {
                throw new IllegalArgumentException("ID token missing required field: sub");
            }
        } catch (JSONException e) {
            e0.i(e);
            throw null;
        }
    }

    public final String t() {
        return this.c;
    }
}
