package defpackage;

import com.anthropic.claude.api.common.ConsistencyLevel;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class dl4 {
    public final KSerializer serializer() {
        return (KSerializer) ConsistencyLevel.$cachedSerializer$delegate.getValue();
    }
}
