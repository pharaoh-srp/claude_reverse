package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ModelSelectorSheetSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class op2 {
    public final KSerializer serializer() {
        return (KSerializer) ChatEvents$ModelSelectorSheetSource.$cachedSerializer$delegate.getValue();
    }
}
