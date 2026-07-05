package kotlinx.datetime;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.internal.MathMethodsKt;
import defpackage.drb;
import defpackage.gl5;
import defpackage.grc;
import defpackage.lph;
import defpackage.lz1;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mr9;
import defpackage.nn5;
import defpackage.onf;
import defpackage.pn5;
import defpackage.uh6;
import defpackage.v40;
import defpackage.zh6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\u000e\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/datetime/DateTimeUnit;", "", "<init>", "()V", "", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit;", ExperienceToggle.DEFAULT_PARAM_KEY, "", "unit", "formatToString", "(ILjava/lang/String;)Ljava/lang/String;", "", "(JLjava/lang/String;)Ljava/lang/String;", "Companion", "TimeBased", "DateBased", "DayBased", "MonthBased", "kotlinx/datetime/a", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "Lkotlinx/datetime/DateTimeUnit$TimeBased;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf(with = nn5.class)
public abstract class DateTimeUnit {
    private static final MonthBased CENTURY;
    public static final a Companion = new a();
    private static final DayBased DAY;
    private static final TimeBased HOUR;
    private static final TimeBased MICROSECOND;
    private static final TimeBased MILLISECOND;
    private static final TimeBased MINUTE;
    private static final MonthBased MONTH;
    private static final TimeBased NANOSECOND;
    private static final MonthBased QUARTER;
    private static final TimeBased SECOND;
    private static final DayBased WEEK;
    private static final MonthBased YEAR;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0017"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$DayBased;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "", "days", "<init>", "(I)V", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$DayBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getDays", "Companion", "kotlinx/datetime/c", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    @onf(with = pn5.class)
    public static final class DayBased extends DateBased {
        public static final c Companion = new c();
        private final int days;

        public DayBased(int i) {
            super(null);
            this.days = i;
            if (i > 0) {
                return;
            }
            mr9.q(grc.u("Unit duration must be positive, but was ", i, " days."));
            throw null;
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof DayBased) && this.days == ((DayBased) other).days;
            }
            return true;
        }

        public final int getDays() {
            return this.days;
        }

        public int hashCode() {
            return this.days ^ 65536;
        }

        @Override // kotlinx.datetime.DateTimeUnit
        public DayBased times(int scalar) {
            return new DayBased(Math.multiplyExact(this.days, scalar));
        }

        public String toString() {
            int i = this.days;
            return i % 7 == 0 ? formatToString(i / 7, "WEEK") : formatToString(i, "DAY");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0017"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$MonthBased;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "", "months", "<init>", "(I)V", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$MonthBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getMonths", "Companion", "kotlinx/datetime/d", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    @onf(with = drb.class)
    public static final class MonthBased extends DateBased {
        public static final d Companion = new d();
        private final int months;

        public MonthBased(int i) {
            super(null);
            this.months = i;
            if (i > 0) {
                return;
            }
            mr9.q(grc.u("Unit duration must be positive, but was ", i, " months."));
            throw null;
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof MonthBased) && this.months == ((MonthBased) other).months;
            }
            return true;
        }

        public final int getMonths() {
            return this.months;
        }

        public int hashCode() {
            return this.months ^ 131072;
        }

        @Override // kotlinx.datetime.DateTimeUnit
        public MonthBased times(int scalar) {
            return new MonthBased(Math.multiplyExact(this.months, scalar));
        }

        public String toString() {
            int i = this.months;
            return i % 1200 == 0 ? formatToString(i / 1200, "CENTURY") : i % 12 == 0 ? formatToString(i / 12, "YEAR") : i % 3 == 0 ? formatToString(i / 3, "QUARTER") : formatToString(i, "MONTH");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001c\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001f"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$TimeBased;", "Lkotlinx/datetime/DateTimeUnit;", "", "nanoseconds", "<init>", "(J)V", "", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$TimeBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getNanoseconds", "()J", "unitName", "Ljava/lang/String;", "unitScale", "Luh6;", "getDuration-UwyO8pc", "duration", "Companion", "kotlinx/datetime/e", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    @onf(with = lph.class)
    public static final class TimeBased extends DateTimeUnit {
        public static final e Companion = new e();
        private final long nanoseconds;
        private final String unitName;
        private final long unitScale;

        public TimeBased(long j) {
            super(null);
            this.nanoseconds = j;
            if (j <= 0) {
                mr9.q(grc.q(j, "Unit duration must be positive, but was ", " ns."));
                throw null;
            }
            if (j % 3600000000000L == 0) {
                this.unitName = "HOUR";
                this.unitScale = j / 3600000000000L;
                return;
            }
            if (j % 60000000000L == 0) {
                this.unitName = "MINUTE";
                this.unitScale = j / 60000000000L;
                return;
            }
            if (j % MathMethodsKt.NANOS_PER_SECOND == 0) {
                this.unitName = "SECOND";
                this.unitScale = j / MathMethodsKt.NANOS_PER_SECOND;
            } else if (j % 1000000 == 0) {
                this.unitName = "MILLISECOND";
                this.unitScale = j / 1000000;
            } else if (j % 1000 == 0) {
                this.unitName = "MICROSECOND";
                this.unitScale = j / 1000;
            } else {
                this.unitName = "NANOSECOND";
                this.unitScale = j;
            }
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof TimeBased) && this.nanoseconds == ((TimeBased) other).nanoseconds;
            }
            return true;
        }

        /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
        public final long m1193getDurationUwyO8pc() {
            lz1 lz1Var = uh6.F;
            return v40.R(this.nanoseconds, zh6.NANOSECONDS);
        }

        public final long getNanoseconds() {
            return this.nanoseconds;
        }

        public int hashCode() {
            long j = this.nanoseconds;
            return ((int) j) ^ ((int) (j >> 32));
        }

        @Override // kotlinx.datetime.DateTimeUnit
        public TimeBased times(int scalar) {
            return new TimeBased(Math.multiplyExact(this.nanoseconds, scalar));
        }

        public String toString() {
            return formatToString(this.unitScale, this.unitName);
        }
    }

    static {
        TimeBased timeBased = new TimeBased(1L);
        NANOSECOND = timeBased;
        TimeBased timeBasedTimes = timeBased.times(1000);
        MICROSECOND = timeBasedTimes;
        TimeBased timeBasedTimes2 = timeBasedTimes.times(1000);
        MILLISECOND = timeBasedTimes2;
        TimeBased timeBasedTimes3 = timeBasedTimes2.times(1000);
        SECOND = timeBasedTimes3;
        TimeBased timeBasedTimes4 = timeBasedTimes3.times(60);
        MINUTE = timeBasedTimes4;
        HOUR = timeBasedTimes4.times(60);
        DayBased dayBased = new DayBased(1);
        DAY = dayBased;
        WEEK = dayBased.times(7);
        MonthBased monthBased = new MonthBased(1);
        MONTH = monthBased;
        QUARTER = monthBased.times(3);
        MonthBased monthBasedTimes = monthBased.times(12);
        YEAR = monthBasedTimes;
        CENTURY = monthBasedTimes.times(100);
    }

    public /* synthetic */ DateTimeUnit(mq5 mq5Var) {
        this();
    }

    public final String formatToString(long value, String unit) {
        unit.getClass();
        if (value == 1) {
            return unit;
        }
        return value + '-' + unit;
    }

    public abstract DateTimeUnit times(int scalar);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$DateBased;", "Lkotlinx/datetime/DateTimeUnit;", "<init>", "()V", "Companion", "kotlinx/datetime/b", "Lkotlinx/datetime/DateTimeUnit$DayBased;", "Lkotlinx/datetime/DateTimeUnit$MonthBased;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    @onf(with = gl5.class)
    public static abstract class DateBased extends DateTimeUnit {
        public static final b Companion = new b();

        private DateBased() {
            super(null);
        }

        public /* synthetic */ DateBased(mq5 mq5Var) {
            this();
        }
    }

    private DateTimeUnit() {
    }

    public final String formatToString(int value, String unit) {
        unit.getClass();
        if (value == 1) {
            return unit;
        }
        return value + '-' + unit;
    }
}
