package defpackage;

import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class fq0 {
    public final KSerializer serializer() {
        return (KSerializer) ArtifactBottomSheetParams.$cachedSerializer$delegate.getValue();
    }
}
