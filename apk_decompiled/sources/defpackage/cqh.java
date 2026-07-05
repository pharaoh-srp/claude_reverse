package defpackage;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAmount;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cqh {
    public static final Duration a;

    static {
        Duration durationOfDays = Duration.ofDays(1L);
        durationOfDays.getClass();
        a = durationOfDays;
    }

    public static final cea a(bqh bqhVar) {
        bqhVar.getClass();
        LocalDateTime localDateTimeOfInstant = bqhVar.b;
        if (localDateTimeOfInstant == null) {
            localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.EPOCH, ZoneOffset.MIN);
        }
        LocalDateTime localDateTime = bqhVar.c;
        localDateTimeOfInstant.getClass();
        return new cea(localDateTimeOfInstant, localDateTime);
    }

    public static final aqh b(bqh bqhVar) {
        bqhVar.getClass();
        return a(bqhVar);
    }

    public static final bqh c(bqh bqhVar) {
        bqhVar.getClass();
        Instant instant = bqhVar.a;
        Duration duration = a;
        Instant instantMinus = instant != null ? instant.minus((TemporalAmount) duration) : null;
        LocalDateTime localDateTime = bqhVar.b;
        return new bqh(instantMinus, localDateTime != null ? localDateTime.minus((TemporalAmount) duration) : null, bqhVar.c);
    }
}
