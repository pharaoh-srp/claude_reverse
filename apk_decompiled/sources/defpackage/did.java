package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class did {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public did(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.c = jSONObject.optString("priceCurrencyCode");
        this.a = jSONObject.optString("formattedPrice");
        this.b = jSONObject.optLong("priceAmountMicros");
        this.f = jSONObject.optInt("recurrenceMode");
        this.e = jSONObject.optInt("billingCycleCount");
    }

    public final int a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final int f() {
        return this.f;
    }
}
