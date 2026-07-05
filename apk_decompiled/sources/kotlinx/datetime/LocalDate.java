package kotlinx.datetime;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.crb;
import defpackage.fda;
import defpackage.hnf;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.onf;
import defpackage.sn5;
import defpackage.x44;
import defpackage.xrk;
import defpackage.yca;
import io.sentry.e0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import kotlin.Metadata;
import kotlinx.datetime.DateTimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002DEB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000bB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\rB!\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0007H\u0001¢\u0006\u0004\b/\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u001a\u00108\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010(R\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010(R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b;\u0010(R\u0011\u0010\t\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010<R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b=\u0010(R\u0011\u0010@\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010?R\u0011\u0010B\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010(¨\u0006F"}, d2 = {"Lkotlinx/datetime/LocalDate;", "", "Ljava/io/Serializable;", "Ljava/time/LocalDate;", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/time/LocalDate;)V", "", "year", "month", "day", "(III)V", "Lcrb;", "(ILcrb;I)V", "Ljava/time/Month;", "dayOfMonth", "(ILjava/time/Month;I)V", "Ljava/io/ObjectInputStream;", "ois", "Liei;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "getMonth", "()Ljava/time/Month;", "Ljava/time/DayOfWeek;", "getDayOfWeek", "()Ljava/time/DayOfWeek;", "that", "Lkotlinx/datetime/g;", "rangeTo", "(Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/g;", "rangeUntil", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalDate;)I", "", "toEpochDays", "()J", "toEpochDaysJvm", "Ljava/time/LocalDate;", "getValue$kotlinx_datetime", "()Ljava/time/LocalDate;", "getMonthNumber", "getMonthNumber$annotations", "()V", "monthNumber", "getDayOfMonth", "getDayOfMonth$annotations", "getYear", "()Lcrb;", "getDay", "Lsn5;", "()Lsn5;", "dayOfWeek", "getDayOfYear", "dayOfYear", "Companion", "yca", "zca", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf(with = fda.class)
public final class LocalDate implements Comparable<LocalDate>, Serializable {
    public static final yca Companion = new yca();
    private static final LocalDate MAX;
    private static final LocalDate MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalDate value;

    static {
        java.time.LocalDate localDate = java.time.LocalDate.MIN;
        localDate.getClass();
        MIN = new LocalDate(localDate);
        java.time.LocalDate localDate2 = java.time.LocalDate.MAX;
        localDate2.getClass();
        MAX = new LocalDate(localDate2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalDate(int i, int i2, int i3) {
        try {
            java.time.LocalDate localDateOf = java.time.LocalDate.of(i, i2, i3);
            localDateOf.getClass();
            this(localDateOf);
        } catch (DateTimeException e) {
            e0.i(e);
            throw null;
        }
    }

    @lz5
    public static /* synthetic */ void getDayOfMonth$annotations() {
    }

    @lz5
    public static /* synthetic */ void getMonthNumber$annotations() {
    }

    private final void readObject(ObjectInputStream ois) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new hnf(2, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalDate other) {
        other.getClass();
        return this.value.compareTo((ChronoLocalDate) other.value);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof LocalDate) && x44.r(this.value, ((LocalDate) other).value);
        }
        return true;
    }

    public final int getDay() {
        return this.value.getDayOfMonth();
    }

    public final int getDayOfMonth() {
        return this.value.getDayOfMonth();
    }

    /* JADX INFO: renamed from: getDayOfWeek, reason: collision with other method in class */
    public final sn5 m1194getDayOfWeek() {
        this.value.getDayOfWeek().getClass();
        return (sn5) sn5.F.get(r1.getValue() - 1);
    }

    public final int getDayOfYear() {
        return this.value.getDayOfYear();
    }

    public final crb getMonth() {
        Month month = this.value.getMonth();
        month.getClass();
        return xrk.g(month);
    }

    public final int getMonthNumber() {
        return this.value.getMonthValue();
    }

    /* JADX INFO: renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.LocalDate getValue() {
        return this.value;
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final g rangeTo(LocalDate that) {
        that.getClass();
        return new g(this, that);
    }

    public final g rangeUntil(LocalDate that) {
        that.getClass();
        g gVar = g.H;
        Companion.getClass();
        if (that.equals(MIN)) {
            return g.H;
        }
        DateTimeUnit.Companion.getClass();
        DateTimeUnit.DayBased dayBased = DateTimeUnit.DAY;
        dayBased.getClass();
        return new g(this, f.a(that, -1L, dayBased));
    }

    public final int toEpochDays() {
        long epochDay = this.value.toEpochDay();
        if (epochDay > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (epochDay < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) epochDay;
    }

    public String toString() {
        String string = this.value.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: getMonth, reason: collision with other method in class */
    public final Month m1195getMonth() {
        Month month = this.value.getMonth();
        month.getClass();
        return month;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDate(int i, crb crbVar, int i2) {
        this(i, crbVar.ordinal() + 1, i2);
        crbVar.getClass();
    }

    public LocalDate(java.time.LocalDate localDate) {
        localDate.getClass();
        this.value = localDate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @lz5
    public LocalDate(int i, Month month, int i2) {
        this(i, xrk.g(month), i2);
        month.getClass();
    }

    public final DayOfWeek getDayOfWeek() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        dayOfWeek.getClass();
        return dayOfWeek;
    }

    /* JADX INFO: renamed from: toEpochDays, reason: collision with other method in class */
    public final long m1196toEpochDays() {
        return this.value.toEpochDay();
    }
}
