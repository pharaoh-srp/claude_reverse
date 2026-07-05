package defpackage;

import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class kb8 {
    public final KSerializer serializer() {
        return (KSerializer) GroveEvents$GroveLocation.$cachedSerializer$delegate.getValue();
    }
}
