package defpackage;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class ded implements mn5 {
    @Override // defpackage.mn5
    public final long a() {
        return 1750181400000L;
    }

    @Override // defpackage.mn5
    public final long b() {
        return 0L;
    }

    @Override // defpackage.mn5
    public final LocalDate c() {
        LocalDate localDate = Instant.ofEpochMilli(1750181400000L).atZone(ZoneId.of("America/Los_Angeles")).toLocalDate();
        localDate.getClass();
        return localDate;
    }

    @Override // defpackage.mn5
    public final int d() {
        return -420;
    }

    @Override // defpackage.mn5
    public final Date f() {
        return new Date(1750181400000L);
    }

    @Override // defpackage.mn5
    public final String g() {
        return "America/Los_Angeles";
    }
}
