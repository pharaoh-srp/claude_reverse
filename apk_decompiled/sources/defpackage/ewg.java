package defpackage;

import java.text.NumberFormat;
import java.util.Currency;

/* JADX INFO: loaded from: classes3.dex */
public final class ewg implements gwg {
    public final fid a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final iid h;
    public final long i;

    public ewg(fid fidVar, String str, long j, String str2, String str3, String str4, boolean z) {
        this.a = fidVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z ? iid.F : iid.H;
        this.i = j;
    }

    @Override // defpackage.hwg
    public final fid a() {
        return this.a;
    }

    @Override // defpackage.hwg
    public final String b() {
        return this.b;
    }

    @Override // defpackage.hwg
    public final String c() {
        return this.d;
    }

    @Override // defpackage.hwg
    public final iid d() {
        return this.h;
    }

    @Override // defpackage.hwg
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewg)) {
            return false;
        }
        ewg ewgVar = (ewg) obj;
        return this.a.equals(ewgVar.a) && this.b.equals(ewgVar.b) && this.c == ewgVar.c && this.d.equals(ewgVar.d) && this.e.equals(ewgVar.e) && this.f.equals(ewgVar.f) && this.g == ewgVar.g;
    }

    @Override // defpackage.hwg
    public final long f() {
        return this.i;
    }

    public final String g(long j, int i, Integer num) {
        long j2 = ((long) i) * 1000000;
        long j3 = ((j + j2) - 1) / j2;
        Currency currency = Currency.getInstance(this.f);
        int iIntValue = num != null ? num.intValue() : currency.getDefaultFractionDigits();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        currencyInstance.setMinimumFractionDigits(iIntValue);
        currencyInstance.setMaximumFractionDigits(iIntValue);
        String str = currencyInstance.format(j3);
        str.getClass();
        return str;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + kgh.l(kgh.l(kgh.l(vb7.e(kgh.l(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProAnnual(productDetails=");
        sb.append(this.a);
        sb.append(", formattedPrice=");
        sb.append(this.b);
        sb.append(", priceMicros=");
        qy1.m(this.c, ", basePlanId=", this.d, sb);
        kgh.u(sb, ", offerToken=", this.e, ", priceCurrencyCode=", this.f);
        sb.append(", isRecurring=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
