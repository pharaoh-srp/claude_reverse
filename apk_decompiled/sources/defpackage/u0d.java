package defpackage;

import com.anthropic.claude.tool.model.PhoneCallCompletedOutputTranscriptItemSpeaker;

/* JADX INFO: loaded from: classes3.dex */
public final class u0d {
    public final int a;
    public final PhoneCallCompletedOutputTranscriptItemSpeaker b;
    public final String c;

    public u0d(int i, PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker, String str) {
        phoneCallCompletedOutputTranscriptItemSpeaker.getClass();
        str.getClass();
        this.a = i;
        this.b = phoneCallCompletedOutputTranscriptItemSpeaker;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0d)) {
            return false;
        }
        u0d u0dVar = (u0d) obj;
        return this.a == u0dVar.a && this.b == u0dVar.b && x44.r(this.c, u0dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranscriptLine(id=");
        sb.append(this.a);
        sb.append(", speaker=");
        sb.append(this.b);
        sb.append(", text=");
        return ij0.m(sb, this.c, ")");
    }
}
