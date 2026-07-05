package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class fid {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    public fid(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            sz6.p("Product id cannot be empty.");
            throw null;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            sz6.p("Product type cannot be empty.");
            throw null;
        }
        this.e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f = jSONObject.optString("skuDetailsToken");
        this.g = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new eid(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.h = arrayList;
        } else {
            this.h = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new cid(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.i = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.i = null;
        } else {
            arrayList2.add(new cid(jSONObjectOptJSONObject));
            this.i = arrayList2;
        }
    }

    public final cid a() {
        ArrayList arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (cid) arrayList.get(0);
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final ArrayList d() {
        return this.h;
    }

    public final String e() {
        return this.b.optString("packageName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fid) {
            return TextUtils.equals(this.a, ((fid) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.f;
    }

    public final String g(String str) {
        ArrayList<cid> arrayList;
        if (!TextUtils.isEmpty(str) && (arrayList = this.i) != null && !arrayList.isEmpty()) {
            for (cid cidVar : arrayList) {
                if (!TextUtils.isEmpty(cidVar.c) && Objects.equals(cidVar.a, str)) {
                    return cidVar.c;
                }
            }
        }
        return this.g;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String string = this.b.toString();
        String strValueOf = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        kgh.u(sb, this.a, "', parsedJson=", string, ", productId='");
        sb.append(this.c);
        sb.append("', productType='");
        sb.append(this.d);
        sb.append("', title='");
        sb.append(this.e);
        sb.append("', productDetailsToken='");
        return vb7.t(sb, this.f, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
