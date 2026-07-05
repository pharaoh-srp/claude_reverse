package defpackage;

import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudOutcome;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class b3e {
    public final KSerializer serializer() {
        return (KSerializer) ReadAloudEvents$ReadAloudOutcome.$cachedSerializer$delegate.getValue();
    }
}
