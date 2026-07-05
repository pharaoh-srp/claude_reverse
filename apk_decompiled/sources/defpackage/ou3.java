package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$PullRequestOpenEntryPoint;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ou3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeEvents$PullRequestOpenEntryPoint.$cachedSerializer$delegate.getValue();
    }
}
