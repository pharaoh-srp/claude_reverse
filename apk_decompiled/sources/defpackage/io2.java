package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ChooseStyleSheetSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class io2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$ChooseStyleSheetSource.$cachedSerializer$delegate.getValue();
    }
}
