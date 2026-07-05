package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class vsa {
    public final String a;
    public final double b;
    public final double c;
    public final String d;
    public final String e;
    public final Double f;
    public final Integer g;
    public final String h;
    public final String i;
    public final String j;

    public vsa(String str, double d, double d2, String str2, String str3, Double d3, Integer num, String str4, String str5, String str6, int i) {
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        d3 = (i & 32) != 0 ? null : d3;
        num = (i & 64) != 0 ? null : num;
        str4 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str4;
        str5 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str5;
        str6 = (i & 512) != 0 ? null : str6;
        str.getClass();
        this.a = str;
        this.b = d;
        this.c = d2;
        this.d = str2;
        this.e = str3;
        this.f = d3;
        this.g = num;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    public final double a() {
        return this.b;
    }

    public final double b() {
        return this.c;
    }

    public final String c() {
        return this.j;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsa)) {
            return false;
        }
        vsa vsaVar = (vsa) obj;
        return x44.r(this.a, vsaVar.a) && Double.compare(this.b, vsaVar.b) == 0 && Double.compare(this.c, vsaVar.c) == 0 && x44.r(this.d, vsaVar.d) && x44.r(this.e, vsaVar.e) && x44.r(this.f, vsaVar.f) && x44.r(this.g, vsaVar.g) && x44.r(this.h, vsaVar.h) && x44.r(this.i, vsaVar.i) && x44.r(this.j, vsaVar.j);
    }

    public final int hashCode() {
        int iO = fsh.o(this.c, fsh.o(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iO + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapMarker(name=");
        sb.append(this.a);
        sb.append(", latitude=");
        sb.append(this.b);
        sb.append(", longitude=");
        sb.append(this.c);
        sb.append(", label=");
        kgh.u(sb, this.d, ", time=", this.e, ", rating=");
        sb.append(this.f);
        sb.append(", reviewCount=");
        sb.append(this.g);
        sb.append(", type=");
        kgh.u(sb, this.h, ", imageUrl=", this.i, ", mapsUrl=");
        return ij0.m(sb, this.j, ")");
    }
}
