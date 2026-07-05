package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mqg {
    public final String a;
    public final List b;
    public final boolean c;

    public mqg(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqg)) {
            return false;
        }
        mqg mqgVar = (mqg) obj;
        return x44.r(this.a, mqgVar.a) && this.b.equals(mqgVar.b) && this.c == mqgVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + kgh.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamingAssistantText(messageId=");
        sb.append(this.a);
        sb.append(", textBlocks=");
        sb.append(this.b);
        sb.append(", isComplete=");
        return sq6.v(")", sb, this.c);
    }
}
