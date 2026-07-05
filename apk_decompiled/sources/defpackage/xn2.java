package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$BlockKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class xn2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$BlockKind.$cachedSerializer$delegate.getValue();
    }
}
