package defpackage;

import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroDismissReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class q76 {
    public final KSerializer serializer() {
        return (KSerializer) DispatchEvents$StarterIntroDismissReason.$cachedSerializer$delegate.getValue();
    }
}
