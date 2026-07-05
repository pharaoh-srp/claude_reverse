package defpackage;

import java.time.ZoneOffset;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dpi implements TemporalQuery {
    @Override // java.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return ZoneOffset.from(temporalAccessor);
    }
}
