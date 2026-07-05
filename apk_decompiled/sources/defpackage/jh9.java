package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class jh9 extends JsonPrimitive {
    public final boolean E;
    public final SerialDescriptor F;
    public final String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh9(Object obj, boolean z, SerialDescriptor serialDescriptor) {
        super(null);
        obj.getClass();
        this.E = z;
        this.F = serialDescriptor;
        this.G = obj.toString();
        if (serialDescriptor == null || serialDescriptor.isInline()) {
            return;
        }
        sz6.p("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jh9.class != obj.getClass()) {
            return false;
        }
        jh9 jh9Var = (jh9) obj;
        return this.E == jh9Var.E && x44.r(this.G, jh9Var.G);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String getContent() {
        return this.G;
    }

    public final int hashCode() {
        return this.G.hashCode() + (Boolean.hashCode(this.E) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final boolean isString() {
        return this.E;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z = this.E;
        String str = this.G;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        jrg.a(sb, str);
        return sb.toString();
    }
}
