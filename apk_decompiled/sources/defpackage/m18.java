package defpackage;

import com.anthropic.claude.settings.internal.growthbook.GateKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class m18 {
    public final KSerializer serializer() {
        return (KSerializer) GateKind.$cachedSerializer$delegate.getValue();
    }
}
