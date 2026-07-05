package defpackage;

import com.anthropic.claude.ui.demo.app.UiDemoAppDestination;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class fdi {
    public final KSerializer serializer() {
        return (KSerializer) UiDemoAppDestination.$cachedSerializer$delegate.getValue();
    }
}
