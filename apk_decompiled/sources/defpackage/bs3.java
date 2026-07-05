package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodeComposerSurface;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class bs3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeEvents$CodeComposerSurface.$cachedSerializer$delegate.getValue();
    }
}
