package defpackage;

import com.anthropic.claude.chat.parse.ParsedContentBlockId;

/* JADX INFO: loaded from: classes2.dex */
public final class vhb implements whb {
    public final qxh a;

    public vhb(qxh qxhVar) {
        qxhVar.getClass();
        this.a = qxhVar;
    }

    @Override // defpackage.whb
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vhb) && x44.r(this.a, ((vhb) obj).a);
    }

    @Override // defpackage.whb
    public final ParsedContentBlockId getId() {
        return this.a.getId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tool(originalBlock=" + this.a + ")";
    }
}
