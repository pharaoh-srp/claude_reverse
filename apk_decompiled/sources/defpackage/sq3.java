package defpackage;

import com.anthropic.claude.analytics.events.CodeBlockEvents$CodeBlockAction;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class sq3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeBlockEvents$CodeBlockAction.$cachedSerializer$delegate.getValue();
    }
}
