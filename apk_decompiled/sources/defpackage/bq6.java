package defpackage;

import com.anthropic.claude.api.consent.EntityType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class bq6 {
    public final KSerializer serializer() {
        return (KSerializer) EntityType.$cachedSerializer$delegate.getValue();
    }
}
