package defpackage;

import com.anthropic.claude.analytics.events.ScreenSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class b8f {
    public final KSerializer serializer() {
        return (KSerializer) ScreenSource.$cachedSerializer$delegate.getValue();
    }
}
