package defpackage;

import com.anthropic.claude.conway.protocol.ChatPart;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class r03 {
    public final KSerializer serializer() {
        return (KSerializer) ChatPart.$cachedSerializer$delegate.getValue();
    }
}
