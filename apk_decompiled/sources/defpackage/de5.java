package defpackage;

import com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class de5 {
    public final KSerializer serializer() {
        return (KSerializer) CustomInstructionsDialogRoute.$cachedSerializer$delegate.getValue();
    }
}
