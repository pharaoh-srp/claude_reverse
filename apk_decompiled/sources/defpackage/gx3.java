package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$UserDialogAutoCancelReason;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class gx3 {
    public final KSerializer serializer() {
        return (KSerializer) CodeEvents$UserDialogAutoCancelReason.$cachedSerializer$delegate.getValue();
    }
}
