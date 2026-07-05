package defpackage;

import java.time.OffsetDateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class b9e {
    public final OffsetDateTime a;
    public final OffsetDateTime b;
    public final String c;
    public final String d;

    public b9e(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, String str2) {
        str.getClass();
        this.a = offsetDateTime;
        this.b = offsetDateTime2;
        this.c = str;
        this.d = str2;
    }

    public final OffsetDateTime a() {
        return this.a;
    }

    public final OffsetDateTime b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9e)) {
            return false;
        }
        b9e b9eVar = (b9e) obj;
        return x44.r(this.a, b9eVar.a) && x44.r(this.b, b9eVar.b) && x44.r(this.c, b9eVar.c) && x44.r(this.d, b9eVar.d);
    }

    public final int hashCode() {
        OffsetDateTime offsetDateTime = this.a;
        int iL = kgh.l((this.b.hashCode() + ((offsetDateTime == null ? 0 : offsetDateTime.hashCode()) * 31)) * 31, 31, this.c);
        String str = this.d;
        return iL + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordSample(end_time=");
        sb.append(this.a);
        sb.append(", start_time=");
        sb.append(this.b);
        sb.append(", value=");
        return vb7.t(sb, this.c, ", unit=", this.d, ")");
    }

    public /* synthetic */ b9e(OffsetDateTime offsetDateTime, String str, String str2, int i) {
        this((OffsetDateTime) null, offsetDateTime, str, (i & 8) != 0 ? null : str2);
    }
}
