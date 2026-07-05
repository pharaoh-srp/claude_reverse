package defpackage;

import android.icu.util.TimeZone;
import android.os.SystemClock;
import java.time.LocalDate;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class n10 implements mn5 {
    @Override // defpackage.mn5
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.mn5
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.mn5
    public final LocalDate c() {
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        return localDateNow;
    }

    @Override // defpackage.mn5
    public final int d() {
        int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis());
        lz1 lz1Var = uh6.F;
        return (int) uh6.o(v40.Q(offset, zh6.MILLISECONDS), zh6.MINUTES);
    }

    @Override // defpackage.mn5
    public final Date f() {
        return new Date();
    }

    @Override // defpackage.mn5
    public final String g() {
        String id = TimeZone.getDefault().getID();
        id.getClass();
        return id;
    }
}
