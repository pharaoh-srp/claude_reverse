package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o33 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;

    public o33(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6, LinkedHashMap linkedHashMap7) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = linkedHashMap3;
        this.d = linkedHashMap4;
        this.e = linkedHashMap5;
        this.f = linkedHashMap6;
        this.g = linkedHashMap7;
    }

    public final Map a() {
        return this.c;
    }

    public final Map b() {
        return this.b;
    }

    public final Map c() {
        return this.g;
    }

    public final Map d() {
        return this.d;
    }

    public final Map e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o33)) {
            return false;
        }
        o33 o33Var = (o33) obj;
        return this.a.equals(o33Var.a) && this.b.equals(o33Var.b) && this.c.equals(o33Var.c) && this.d.equals(o33Var.d) && this.e.equals(o33Var.e) && this.f.equals(o33Var.f) && this.g.equals(o33Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BlockIndices(lastArtifactUuidPerMessage=" + this.a + ", artifactUuidToMessageId=" + this.b + ", analysisToolInvocations=" + this.c + ", mcpToolInvocationsByBlockId=" + this.d + ", thinkingBlocksByBlockId=" + this.e + ", researchBlocksByResearchId=" + this.f + ", citationsByCitationId=" + this.g + ")";
    }
}
