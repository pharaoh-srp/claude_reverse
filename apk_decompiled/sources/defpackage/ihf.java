package defpackage;

import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.model.ThinkingState;

/* JADX INFO: loaded from: classes.dex */
public final class ihf {
    public final ModelSelectorEntry a;
    public final ThinkingState b;

    public ihf(ModelSelectorEntry modelSelectorEntry, ThinkingState thinkingState) {
        this.a = modelSelectorEntry;
        this.b = thinkingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihf)) {
            return false;
        }
        ihf ihfVar = (ihf) obj;
        return this.a.equals(ihfVar.a) && x44.r(this.b, ihfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ThinkingState thinkingState = this.b;
        return iHashCode + (thinkingState == null ? 0 : thinkingState.hashCode());
    }

    public final String toString() {
        return "SelectedModelSnapshot(model=" + this.a + ", thinking=" + this.b + ")";
    }
}
