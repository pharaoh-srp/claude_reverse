package defpackage;

import com.anthropic.claude.conway.protocol.StreamMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class cqg implements StreamMessage {
    public final long a;
    public final long b;
    public final long c;

    public cqg(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqg)) {
            return false;
        }
        cqg cqgVar = (cqg) obj;
        return this.a == cqgVar.a && this.b == cqgVar.b && this.c == cqgVar.c;
    }

    @Override // com.anthropic.claude.conway.protocol.StreamMessage
    public final long getSeq() {
        return this.c;
    }

    @Override // com.anthropic.claude.conway.protocol.StreamMessage
    public final long getTs() {
        return 0L;
    }

    @Override // com.anthropic.claude.conway.protocol.StreamMessage
    public final String getType() {
        return "seqGap";
    }

    public final int hashCode() {
        return Long.hashCode(0L) + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "SeqGap(expected=", ", received=");
        sbW.append(this.b);
        sbW.append(", seq=");
        sbW.append(this.c);
        sbW.append(", ts=0)");
        return sbW.toString();
    }
}
