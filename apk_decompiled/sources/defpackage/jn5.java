package defpackage;

import kotlinx.datetime.DateTimePeriod;

/* JADX INFO: loaded from: classes3.dex */
public final class jn5 extends DateTimePeriod {
    public final long a;
    public final int b;
    public final long c;

    public jn5(long j, int i, long j2) {
        super(null);
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public final int getDays() {
        return this.b;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public final long getTotalMonths$kotlinx_datetime() {
        return this.a;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public final long getTotalNanoseconds$kotlinx_datetime() {
        return this.c;
    }
}
