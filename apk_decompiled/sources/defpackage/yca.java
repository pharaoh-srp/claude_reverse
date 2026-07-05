package defpackage;

import io.sentry.e0;
import java.time.DateTimeException;
import kotlinx.datetime.LocalDate;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class yca {
    public static LocalDate a(long j) {
        try {
            java.time.LocalDate localDateOfEpochDay = java.time.LocalDate.ofEpochDay(j);
            localDateOfEpochDay.getClass();
            return new LocalDate(localDateOfEpochDay);
        } catch (DateTimeException e) {
            e0.i(e);
            return null;
        }
    }

    public final KSerializer serializer() {
        return fda.a;
    }
}
