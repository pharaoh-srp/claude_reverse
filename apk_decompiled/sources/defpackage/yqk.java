package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class yqk {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Date d;
    public final String e;

    public yqk(Integer num, Integer num2, Integer num3, Date date, String str) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = date;
        this.e = str;
    }

    public final Integer a() {
        return this.b;
    }

    public final Integer b() {
        return this.c;
    }

    public final Integer c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yqk) {
            yqk yqkVar = (yqk) obj;
            Integer num = yqkVar.a;
            Integer num2 = this.a;
            if (num2 != null ? num2.equals(num) : num == null) {
                Integer num3 = yqkVar.b;
                Integer num4 = this.b;
                if (num4 != null ? num4.equals(num3) : num3 == null) {
                    Integer num5 = yqkVar.c;
                    Integer num6 = this.c;
                    if (num6 != null ? num6.equals(num5) : num5 == null) {
                        Date date = yqkVar.d;
                        Date date2 = this.d;
                        if (date2 != null ? date2.equals(date) : date == null) {
                            String str = yqkVar.e;
                            String str2 = this.e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i = iHashCode ^ 1000003;
        Integer num3 = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.d;
        int iHashCode4 = (iHashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        String str = this.e;
        return iHashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder("AgeSignalsResult{userStatus=");
        sb.append(this.a);
        sb.append(", ageLower=");
        sb.append(this.b);
        sb.append(", ageUpper=");
        sb.append(this.c);
        sb.append(", mostRecentApprovalDate=");
        sb.append(strValueOf);
        sb.append(", installId=");
        return ij0.m(sb, this.e, "}");
    }
}
