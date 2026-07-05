package defpackage;

import com.anthropic.claude.sessions.types.GitInfoType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class o58 {
    public final KSerializer serializer() {
        return (KSerializer) GitInfoType.$cachedSerializer$delegate.getValue();
    }
}
