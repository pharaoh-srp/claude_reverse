package defpackage;

import com.anthropic.claude.types.strings.ModelId;

/* JADX INFO: loaded from: classes2.dex */
public final class cqb {
    public final String a;
    public final pvg b;

    public cqb(String str, pvg pvgVar) {
        str.getClass();
        this.a = str;
        this.b = pvgVar;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqb)) {
            return false;
        }
        cqb cqbVar = (cqb) obj;
        return ModelId.m1061equalsimpl0(this.a, cqbVar.a) && this.b == cqbVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (ModelId.m1062hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return "ModelUpsell(modelId=" + ModelId.m1063toStringimpl(this.a) + ", upsellTier=" + this.b + ")";
    }
}
