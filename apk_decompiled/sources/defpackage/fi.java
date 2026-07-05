package defpackage;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class fi implements hi {
    public final mn5 a;
    public final LocalDate b;
    public final boolean c;

    public fi(mn5 mn5Var, LocalDate localDate, boolean z) {
        mn5Var.getClass();
        this.a = mn5Var;
        this.b = localDate;
        this.c = z;
    }

    public static fi d(fi fiVar, LocalDate localDate, int i) {
        mn5 mn5Var = fiVar.a;
        if ((i & 2) != 0) {
            localDate = fiVar.b;
        }
        boolean z = (i & 4) != 0 ? fiVar.c : true;
        fiVar.getClass();
        mn5Var.getClass();
        return new fi(mn5Var, localDate, z);
    }

    @Override // defpackage.hi
    public final hi a() {
        return d(this, null, 3);
    }

    @Override // defpackage.hi
    public final boolean b() {
        LocalDate localDateC = this.a.c();
        LocalDate localDate = this.b;
        return localDate != null && ChronoUnit.YEARS.between(localDate, localDateC) >= 18;
    }

    @Override // defpackage.hi
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi)) {
            return false;
        }
        fi fiVar = (fi) obj;
        return x44.r(this.a, fiVar.a) && x44.r(this.b, fiVar.b) && this.c == fiVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LocalDate localDate = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirthdayAssurance(dateTimeProvider=");
        sb.append(this.a);
        sb.append(", birthday=");
        sb.append(this.b);
        sb.append(", showPostSubmitAgeAssuranceErrors=");
        return sq6.v(")", sb, this.c);
    }

    public /* synthetic */ fi(mn5 mn5Var, LocalDate localDate, int i) {
        this(mn5Var, (i & 2) != 0 ? null : localDate, false);
    }
}
