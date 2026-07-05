package defpackage;

import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudInterruptReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class a3e {
    public final KSerializer serializer() {
        return (KSerializer) ReadAloudEvents$ReadAloudInterruptReason.$cachedSerializer$delegate.getValue();
    }
}
