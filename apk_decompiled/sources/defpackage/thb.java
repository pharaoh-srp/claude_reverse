package defpackage;

import com.anthropic.claude.chat.parse.ParsedContentBlockId;

/* JADX INFO: loaded from: classes2.dex */
public final class thb implements whb {
    public final htc a;

    public thb(htc htcVar) {
        htcVar.getClass();
        this.a = htcVar;
    }

    @Override // defpackage.whb
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thb) && x44.r(this.a, ((thb) obj).a);
    }

    @Override // defpackage.whb
    public final ParsedContentBlockId getId() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Search(originalBlock=" + this.a + ")";
    }
}
