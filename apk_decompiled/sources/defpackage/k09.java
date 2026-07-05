package defpackage;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.f;

/* JADX INFO: loaded from: classes3.dex */
public final class k09 implements ejj, hl5, l25 {
    public final q09 a;
    public Integer b;
    public Integer c;
    public Integer d;

    public k09(q09 q09Var, Integer num, Integer num2, Integer num3) {
        this.a = q09Var;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.l25
    public final Object a() {
        q09 q09Var = this.a;
        return new k09(new q09(q09Var.a, q09Var.b), this.b, this.c, this.d);
    }

    public final LocalDate b() {
        LocalDate localDate;
        q09 q09Var = this.a;
        Integer num = q09Var.a;
        kjj.a("year", num);
        int iIntValue = num.intValue();
        Integer num2 = this.d;
        if (num2 == null) {
            Integer num3 = q09Var.b;
            kjj.a("monthNumber", num3);
            int iIntValue2 = num3.intValue();
            Integer num4 = this.b;
            kjj.a("day", num4);
            localDate = new LocalDate(iIntValue, iIntValue2, num4.intValue());
        } else {
            LocalDate localDate2 = new LocalDate(iIntValue, 1, 1);
            int iIntValue3 = num2.intValue() - 1;
            DateTimeUnit.Companion.getClass();
            DateTimeUnit.DayBased dayBased = DateTimeUnit.DAY;
            dayBased.getClass();
            LocalDate localDateA = f.a(localDate2, iIntValue3, dayBased);
            if (localDateA.getYear() != iIntValue) {
                throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + iIntValue);
            }
            if (q09Var.b != null) {
                crb month = localDateA.getMonth();
                month.getClass();
                int iOrdinal = month.ordinal() + 1;
                Integer num5 = q09Var.b;
                if (num5 == null || iOrdinal != num5.intValue()) {
                    StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb.append(num2);
                    sb.append(", which is ");
                    sb.append(localDateA.getMonth());
                    Integer num6 = q09Var.b;
                    sb.append(", but ");
                    sb.append(num6);
                    sb.append(" was specified as the month number");
                    throw new DateTimeFormatException(sb.toString());
                }
            }
            if (this.b != null) {
                int day = localDateA.getDay();
                Integer num7 = this.b;
                if (num7 == null || day != num7.intValue()) {
                    StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb2.append(num2);
                    sb2.append(", which is the day ");
                    sb2.append(localDateA.getDay());
                    sb2.append(" of ");
                    sb2.append(localDateA.getMonth());
                    Integer num8 = this.b;
                    sb2.append(", but ");
                    sb2.append(num8);
                    sb2.append(" was specified as the day of month");
                    throw new DateTimeFormatException(sb2.toString());
                }
            }
            localDate = localDateA;
        }
        Integer num9 = this.c;
        if (num9 != null) {
            int iIntValue4 = num9.intValue();
            sn5 sn5VarM1194getDayOfWeek = localDate.m1194getDayOfWeek();
            sn5VarM1194getDayOfWeek.getClass();
            if (iIntValue4 != sn5VarM1194getDayOfWeek.ordinal() + 1) {
                StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > iIntValue4 || iIntValue4 >= 8) {
                    mr9.q(grc.p(iIntValue4, "Expected ISO day-of-week number in 1..7, got "));
                    return null;
                }
                sb3.append((sn5) sn5.F.get(iIntValue4 - 1));
                sb3.append(" but the date is ");
                sb3.append(localDate);
                sb3.append(", which is a ");
                sb3.append(localDate.m1194getDayOfWeek());
                throw new DateTimeFormatException(sb3.toString());
            }
        }
        return localDate;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k09)) {
            return false;
        }
        k09 k09Var = (k09) obj;
        return x44.r(this.a, k09Var.a) && x44.r(this.b, k09Var.b) && x44.r(this.c, k09Var.c) && x44.r(this.d, k09Var.d);
    }

    @Override // defpackage.ejj
    public final void f(Integer num) {
        this.a.b = num;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 29791;
        Integer num = this.b;
        int iHashCode2 = ((num != null ? num.hashCode() : 0) * 961) + iHashCode;
        Integer num2 = this.c;
        int iHashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode2;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.ejj
    public final Integer i() {
        return this.a.a;
    }

    @Override // defpackage.hl5
    public final Integer j() {
        return this.c;
    }

    @Override // defpackage.hl5
    public final Integer n() {
        return this.b;
    }

    @Override // defpackage.hl5
    public final void o(Integer num) {
        this.b = num;
    }

    @Override // defpackage.hl5
    public final Integer q() {
        return this.d;
    }

    @Override // defpackage.ejj
    public final void r(Integer num) {
        this.a.a = num;
    }

    @Override // defpackage.ejj
    public final Integer s() {
        return this.a.b;
    }

    @Override // defpackage.hl5
    public final void t(Integer num) {
        this.c = num;
    }

    public final String toString() {
        Integer num = this.d;
        q09 q09Var = this.a;
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(q09Var);
            sb.append('-');
            Object obj = this.b;
            if (obj == null) {
                obj = "??";
            }
            sb.append(obj);
            sb.append(" (day of week is ");
            Integer num2 = this.c;
            sb.append(num2 != null ? num2 : "??");
            sb.append(')');
            return sb.toString();
        }
        if (this.b == null && q09Var.b == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Object obj2 = q09Var.a;
            if (obj2 == null) {
                obj2 = "??";
            }
            sb2.append(obj2);
            sb2.append(")-");
            sb2.append(this.d);
            sb2.append(" (day of week is ");
            Integer num3 = this.c;
            sb2.append(num3 != null ? num3 : "??");
            sb2.append(')');
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(q09Var);
        sb3.append('-');
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb3.append(obj3);
        sb3.append(" (day of week is ");
        Integer num4 = this.c;
        sb3.append(num4 != null ? num4 : "??");
        sb3.append(", day of year is ");
        sb3.append(this.d);
        sb3.append(')');
        return sb3.toString();
    }

    @Override // defpackage.hl5
    public final void y(Integer num) {
        this.d = num;
    }

    public /* synthetic */ k09() {
        this(new q09(null, null), null, null, null);
    }
}
