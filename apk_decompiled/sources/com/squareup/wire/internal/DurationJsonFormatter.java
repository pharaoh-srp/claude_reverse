package com.squareup.wire.internal;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.bsg;
import defpackage.isg;
import defpackage.mdj;
import java.time.Duration;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0014\u0010\t\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/DurationJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "<init>", "()V", "toStringOrNumber", "", ExperienceToggle.DEFAULT_PARAM_KEY, "fromString", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class DurationJsonFormatter implements JsonFormatter<Duration> {
    public static final DurationJsonFormatter INSTANCE = new DurationJsonFormatter();

    private DurationJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Duration fromString(String value) {
        int i;
        value.getClass();
        int iF0 = bsg.F0(value, 's', 0, 6);
        if (iF0 != value.length() - 1) {
            throw new NumberFormatException();
        }
        int iF02 = bsg.F0(value, '.', 0, 6);
        if (iF02 == -1) {
            Duration durationOfSeconds = Duration.ofSeconds(Long.parseLong(value.substring(0, iF0)));
            durationOfSeconds.getClass();
            return durationOfSeconds;
        }
        long j = Long.parseLong(value.substring(0, iF02));
        int i2 = iF02 + 1;
        long j2 = Long.parseLong(value.substring(i2, iF0));
        if (isg.q0(value, "-", false)) {
            j2 = -j2;
        }
        int i3 = iF0 - i2;
        int i4 = i3;
        while (true) {
            if (i4 >= 9) {
                break;
            }
            j2 *= 10;
            i4++;
        }
        for (i = 9; i < i3; i++) {
            j2 /= 10;
        }
        Duration durationOfSeconds2 = Duration.ofSeconds(j, j2);
        durationOfSeconds2.getClass();
        return durationOfSeconds2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public String toStringOrNumber(Duration value) {
        String str;
        value.getClass();
        long seconds = value.getSeconds();
        int nano = value.getNano();
        if (seconds < 0) {
            if (seconds == Long.MIN_VALUE) {
                str = "-922337203685477580";
                seconds = 8;
            } else {
                seconds = -seconds;
                str = "-";
            }
            if (nano != 0) {
                seconds--;
                nano = 1000000000 - nano;
            }
        } else {
            str = "";
        }
        return nano == 0 ? String.format("%s%ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds)}, 2)) : nano % 1000000 == 0 ? String.format("%s%d.%03ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(((long) nano) / 1000000)}, 3)) : nano % 1000 == 0 ? String.format("%s%d.%06ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(((long) nano) / 1000)}, 3)) : String.format("%s%d.%09ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano)}, 3));
    }
}
