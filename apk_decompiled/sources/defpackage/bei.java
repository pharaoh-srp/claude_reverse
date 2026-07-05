package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class bei {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public bei(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.c = strOptString;
        this.d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            sz6.p("Product type cannot be empty.");
            throw null;
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bei) {
            return TextUtils.equals(this.a, ((bei) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.b);
        sb.append("', productType='");
        sb.append(this.c);
        sb.append("', statusCode=");
        return vb7.l(this.d, "}", sb);
    }
}
