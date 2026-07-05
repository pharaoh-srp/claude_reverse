package kotlinx.datetime;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.crb;
import defpackage.djj;
import defpackage.hnf;
import defpackage.ljj;
import defpackage.mdj;
import defpackage.njj;
import defpackage.onf;
import defpackage.x44;
import defpackage.xrk;
import io.sentry.e0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlinx.datetime.DateTimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001:B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0014\u0010*\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010$R\u0011\u0010\t\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u00104\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b3\u0010$R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lkotlinx/datetime/YearMonth;", "", "Ljava/io/Serializable;", "Ljava/time/YearMonth;", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/time/YearMonth;)V", "", "year", "month", "(II)V", "Lcrb;", "(ILcrb;)V", "Ljava/io/ObjectInputStream;", "ois", "Liei;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "that", "Lkotlinx/datetime/i;", "rangeTo", "(Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/i;", "rangeUntil", "other", "compareTo", "(Lkotlinx/datetime/YearMonth;)I", "", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/time/YearMonth;", "getValue$kotlinx_datetime", "()Ljava/time/YearMonth;", "getYear", "getMonthNumber$kotlinx_datetime", "monthNumber", "getMonth", "()Lcrb;", "Lkotlinx/datetime/LocalDate;", "getFirstDay", "()Lkotlinx/datetime/LocalDate;", "firstDay", "getLastDay", "lastDay", "getNumberOfDays", "numberOfDays", "Lkotlinx/datetime/g;", "getDays", "()Lkotlinx/datetime/g;", "days", "Companion", "djj", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf(with = njj.class)
public final class YearMonth implements Comparable<YearMonth>, Serializable {
    public static final djj Companion = new djj();
    private static final long serialVersionUID = 0;
    private final java.time.YearMonth value;

    /* JADX WARN: Illegal instructions before constructor call */
    public YearMonth(int i, crb crbVar) {
        crbVar.getClass();
        try {
            Month monthOf = Month.of(crbVar.ordinal() + 1);
            monthOf.getClass();
            java.time.YearMonth yearMonthOf = java.time.YearMonth.of(i, monthOf);
            yearMonthOf.getClass();
            this(yearMonthOf);
        } catch (DateTimeException e) {
            e0.i(e);
            throw null;
        }
    }

    private final void readObject(ObjectInputStream ois) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new hnf(11, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(YearMonth other) {
        other.getClass();
        return this.value.compareTo(other.value);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof YearMonth) && x44.r(this.value, ((YearMonth) other).value);
        }
        return true;
    }

    public final g getDays() {
        return getFirstDay().rangeTo(getLastDay());
    }

    public final LocalDate getFirstDay() {
        java.time.LocalDate localDateAtDay = this.value.atDay(1);
        localDateAtDay.getClass();
        return new LocalDate(localDateAtDay);
    }

    public final LocalDate getLastDay() {
        java.time.LocalDate localDateAtEndOfMonth = this.value.atEndOfMonth();
        localDateAtEndOfMonth.getClass();
        return new LocalDate(localDateAtEndOfMonth);
    }

    public final crb getMonth() {
        Month month = this.value.getMonth();
        month.getClass();
        return xrk.g(month);
    }

    public final int getMonthNumber$kotlinx_datetime() {
        return this.value.getMonthValue();
    }

    public final int getNumberOfDays() {
        return this.value.lengthOfMonth();
    }

    /* JADX INFO: renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.YearMonth getValue() {
        return this.value;
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final i rangeTo(YearMonth that) {
        that.getClass();
        return new i(this, that);
    }

    public final i rangeUntil(YearMonth that) {
        that.getClass();
        i iVar = i.H;
        djj djjVar = Companion;
        djjVar.getClass();
        LocalDate.Companion.getClass();
        LocalDate localDate = LocalDate.MIN;
        localDate.getClass();
        if (that.equals(new YearMonth(localDate.getYear(), localDate.getMonth()))) {
            return i.H;
        }
        DateTimeUnit.Companion.getClass();
        DateTimeUnit.MonthBased monthBased = DateTimeUnit.MONTH;
        monthBased.getClass();
        try {
            long jMultiplyExact = Math.multiplyExact(-1L, monthBased.getMonths());
            if (jMultiplyExact != 0) {
                that = h.a(djjVar, Math.addExact(h.b(that), jMultiplyExact));
            }
            return new i(this, that);
        } catch (ArithmeticException e) {
            throw new DateTimeArithmeticException("Arithmetic overflow when adding -1 of " + monthBased + " to " + that, e);
        } catch (IllegalArgumentException e2) {
            throw new DateTimeArithmeticException("Boundaries of YearMonth exceeded when adding -1 of " + monthBased + " to " + that, e2);
        }
    }

    public String toString() {
        String str = ((DateTimeFormatter) ljj.a.getValue()).format(this.value);
        str.getClass();
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public YearMonth(int i, int i2) {
        try {
            java.time.YearMonth yearMonthOf = java.time.YearMonth.of(i, i2);
            yearMonthOf.getClass();
            this(yearMonthOf);
        } catch (DateTimeException e) {
            e0.i(e);
            throw null;
        }
    }

    public YearMonth(java.time.YearMonth yearMonth) {
        yearMonth.getClass();
        this.value = yearMonth;
    }
}
