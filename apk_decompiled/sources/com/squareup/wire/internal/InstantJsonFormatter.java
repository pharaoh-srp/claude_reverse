package com.squareup.wire.internal;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.mdj;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0014\u0010\t\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/squareup/wire/internal/InstantJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "<init>", "()V", "toStringOrNumber", "", ExperienceToggle.DEFAULT_PARAM_KEY, "fromString", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class InstantJsonFormatter implements JsonFormatter<Instant> {
    public static final InstantJsonFormatter INSTANCE = new InstantJsonFormatter();

    private InstantJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Instant fromString(String value) {
        value.getClass();
        Instant instantFrom = Instant.from(DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(value));
        instantFrom.getClass();
        return instantFrom;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Object toStringOrNumber(Instant value) {
        value.getClass();
        String str = DateTimeFormatter.ISO_INSTANT.format(value);
        str.getClass();
        return str;
    }
}
