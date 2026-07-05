package defpackage;

import com.anthropic.claude.types.strings.ModelId;

/* JADX INFO: loaded from: classes2.dex */
public final class na7 implements oa7 {
    public final String a;
    public final String b;

    public na7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na7)) {
            return false;
        }
        na7 na7Var = (na7) obj;
        return x44.r(this.a, na7Var.a) && ModelId.m1061equalsimpl0(this.b, na7Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ModelId.m1062hashCodeimpl(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return ij0.l("ShowUpgrade(inputText=", this.a, ", modelId=", ModelId.m1063toStringimpl(this.b), ")");
    }
}
