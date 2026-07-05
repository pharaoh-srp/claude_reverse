package defpackage;

import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class n7j {
    public final KSerializer serializer() {
        return (KSerializer) WebViewEvents$WebViewKind.$cachedSerializer$delegate.getValue();
    }
}
