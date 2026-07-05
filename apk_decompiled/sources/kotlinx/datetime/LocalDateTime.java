package kotlinx.datetime;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.crb;
import defpackage.gda;
import defpackage.hnf;
import defpackage.lda;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sn5;
import defpackage.x44;
import defpackage.xrk;
import io.sentry.e0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.chrono.ChronoLocalDateTime;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002LMB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BE\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000fBE\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0005\u0010\u0016BE\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0002¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b5\u0010%R\u001a\u00109\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010%R\u0011\u0010\t\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010:R\u001a\u0010\u0018\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010%R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0011\u0010@\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010?R\u0011\u0010B\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010%R\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bC\u0010%R\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bD\u0010%R\u0011\u0010\r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bE\u0010%R\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bF\u0010%R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lkotlinx/datetime/LocalDateTime;", "", "Ljava/io/Serializable;", "Ljava/time/LocalDateTime;", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/time/LocalDateTime;)V", "", "year", "month", "day", "hour", "minute", "second", "nanosecond", "(IIIIIII)V", "Lcrb;", "(ILcrb;IIIII)V", "Lkotlinx/datetime/LocalDate;", "date", "Lkotlinx/datetime/LocalTime;", "time", "(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalTime;)V", "Ljava/time/Month;", "dayOfMonth", "(ILjava/time/Month;IIIII)V", "getMonth", "()Ljava/time/Month;", "Ljava/time/DayOfWeek;", "getDayOfWeek", "()Ljava/time/DayOfWeek;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalDateTime;)I", "Ljava/io/ObjectInputStream;", "ois", "Liei;", "readObject", "(Ljava/io/ObjectInputStream;)V", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/LocalDateTime;", "getValue$kotlinx_datetime", "()Ljava/time/LocalDateTime;", "getYear", "getMonthNumber", "getMonthNumber$annotations", "()V", "monthNumber", "()Lcrb;", "getDayOfMonth", "getDayOfMonth$annotations", "getDay", "Lsn5;", "()Lsn5;", "dayOfWeek", "getDayOfYear", "dayOfYear", "getHour", "getMinute", "getSecond", "getNanosecond", "getDate", "()Lkotlinx/datetime/LocalDate;", "getTime", "()Lkotlinx/datetime/LocalTime;", "Companion", "gda", "hda", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf(with = lda.class)
public final class LocalDateTime implements Comparable<LocalDateTime>, Serializable {
    public static final gda Companion = new gda();
    private static final LocalDateTime MAX;
    private static final LocalDateTime MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalDateTime value;

    static {
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.MIN;
        localDateTime.getClass();
        MIN = new LocalDateTime(localDateTime);
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        localDateTime2.getClass();
        MAX = new LocalDateTime(localDateTime2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        localDate.getClass();
        localTime.getClass();
        java.time.LocalDateTime localDateTimeOf = java.time.LocalDateTime.of(localDate.getValue(), localTime.getValue());
        localDateTimeOf.getClass();
        this(localDateTimeOf);
    }

    @lz5
    public static /* synthetic */ void getDayOfMonth$annotations() {
    }

    @lz5
    public static /* synthetic */ void getMonthNumber$annotations() {
    }

    private final void readObject(ObjectInputStream ois) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalDateTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new hnf(4, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalDateTime other) {
        other.getClass();
        return this.value.compareTo((ChronoLocalDateTime<?>) other.value);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof LocalDateTime) && x44.r(this.value, ((LocalDateTime) other).value);
        }
        return true;
    }

    public final LocalDate getDate() {
        java.time.LocalDate localDate = this.value.toLocalDate();
        localDate.getClass();
        return new LocalDate(localDate);
    }

    public final int getDay() {
        return this.value.getDayOfMonth();
    }

    public final int getDayOfMonth() {
        return this.value.getDayOfMonth();
    }

    /* JADX INFO: renamed from: getDayOfWeek, reason: collision with other method in class */
    public final sn5 m1197getDayOfWeek() {
        this.value.getDayOfWeek().getClass();
        return (sn5) sn5.F.get(r1.getValue() - 1);
    }

    public final int getDayOfYear() {
        return this.value.getDayOfYear();
    }

    public final int getHour() {
        return this.value.getHour();
    }

    public final int getMinute() {
        return this.value.getMinute();
    }

    public final crb getMonth() {
        Month month = this.value.getMonth();
        month.getClass();
        return xrk.g(month);
    }

    public final int getMonthNumber() {
        return this.value.getMonthValue();
    }

    public final int getNanosecond() {
        return this.value.getNano();
    }

    public final int getSecond() {
        return this.value.getSecond();
    }

    public final LocalTime getTime() {
        java.time.LocalTime localTime = this.value.toLocalTime();
        localTime.getClass();
        return new LocalTime(localTime);
    }

    /* JADX INFO: renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.LocalDateTime getValue() {
        return this.value;
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        String string = this.value.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: getMonth, reason: collision with other method in class */
    public final Month m1198getMonth() {
        Month month = this.value.getMonth();
        month.getClass();
        return month;
    }

    public final DayOfWeek getDayOfWeek() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        dayOfWeek.getClass();
        return dayOfWeek;
    }

    public /* synthetic */ LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, mq5 mq5Var) {
        this(i, i2, i3, i4, i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            java.time.LocalDateTime localDateTimeOf = java.time.LocalDateTime.of(i, i2, i3, i4, i5, i6, i7);
            localDateTimeOf.getClass();
            this(localDateTimeOf);
        } catch (DateTimeException e) {
            e0.i(e);
            throw null;
        }
    }

    public /* synthetic */ LocalDateTime(int i, crb crbVar, int i2, int i3, int i4, int i5, int i6, int i7, mq5 mq5Var) {
        this(i, crbVar, i2, i3, i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0 : i6);
    }

    public LocalDateTime(java.time.LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.value = localDateTime;
    }

    public /* synthetic */ LocalDateTime(int i, Month month, int i2, int i3, int i4, int i5, int i6, int i7, mq5 mq5Var) {
        this(i, month, i2, i3, i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0 : i6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @lz5
    public LocalDateTime(int i, Month month, int i2, int i3, int i4, int i5, int i6) {
        this(i, xrk.g(month), i2, i3, i4, i5, i6);
        month.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDateTime(int i, crb crbVar, int i2, int i3, int i4, int i5, int i6) {
        this(i, crbVar.ordinal() + 1, i2, i3, i4, i5, i6);
        crbVar.getClass();
    }
}
