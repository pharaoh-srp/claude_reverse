package kotlinx.datetime;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.dea;
import defpackage.hnf;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.x44;
import defpackage.yda;
import io.sentry.e0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001-B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006."}, d2 = {"Lkotlinx/datetime/LocalTime;", "", "Ljava/io/Serializable;", "Ljava/time/LocalTime;", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/time/LocalTime;)V", "", "hour", "minute", "second", "nanosecond", "(IIII)V", "Ljava/io/ObjectInputStream;", "ois", "Liei;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "toSecondOfDay", "()I", "toMillisecondOfDay", "", "toNanosecondOfDay", "()J", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalTime;)I", "Ljava/time/LocalTime;", "getValue$kotlinx_datetime", "()Ljava/time/LocalTime;", "getHour", "getMinute", "getSecond", "getNanosecond", "Companion", "yda", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf(with = dea.class)
public final class LocalTime implements Comparable<LocalTime>, Serializable {
    public static final yda Companion = new yda();
    private static final LocalTime MAX;
    private static final LocalTime MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalTime value;

    static {
        java.time.LocalTime localTime = java.time.LocalTime.MIN;
        localTime.getClass();
        MIN = new LocalTime(localTime);
        java.time.LocalTime localTime2 = java.time.LocalTime.MAX;
        localTime2.getClass();
        MAX = new LocalTime(localTime2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalTime(int i, int i2, int i3, int i4) {
        try {
            java.time.LocalTime localTimeOf = java.time.LocalTime.of(i, i2, i3, i4);
            localTimeOf.getClass();
            this(localTimeOf);
        } catch (DateTimeException e) {
            e0.i(e);
            throw null;
        }
    }

    private final void readObject(ObjectInputStream ois) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new hnf(3, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime other) {
        other.getClass();
        return this.value.compareTo(other.value);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof LocalTime) && x44.r(this.value, ((LocalTime) other).value);
        }
        return true;
    }

    public final int getHour() {
        return this.value.getHour();
    }

    public final int getMinute() {
        return this.value.getMinute();
    }

    public final int getNanosecond() {
        return this.value.getNano();
    }

    public final int getSecond() {
        return this.value.getSecond();
    }

    /* JADX INFO: renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.LocalTime getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final int toMillisecondOfDay() {
        return (int) (this.value.toNanoOfDay() / 1000000);
    }

    public final long toNanosecondOfDay() {
        return this.value.toNanoOfDay();
    }

    public final int toSecondOfDay() {
        return this.value.toSecondOfDay();
    }

    public String toString() {
        String string = this.value.toString();
        string.getClass();
        return string;
    }

    public /* synthetic */ LocalTime(int i, int i2, int i3, int i4, int i5, mq5 mq5Var) {
        this(i, i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public LocalTime(java.time.LocalTime localTime) {
        localTime.getClass();
        this.value = localTime;
    }
}
