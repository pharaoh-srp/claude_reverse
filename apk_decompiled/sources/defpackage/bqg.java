package defpackage;

import com.anthropic.claude.conway.protocol.StreamMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class bqg implements StreamMessage {
    public final String a;

    public bqg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqg) && x44.r(this.a, ((bqg) obj).a);
    }

    @Override // com.anthropic.claude.conway.protocol.StreamMessage
    public final long getSeq() {
        return 0L;
    }

    @Override // com.anthropic.claude.conway.protocol.StreamMessage
    public final long getTs() {
        return 0L;
    }

    @Override // com.anthropic.claude.conway.protocol.StreamMessage
    public final String getType() {
        return "containerChanged";
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(0L) + vb7.e((str == null ? 0 : str.hashCode()) * 31, 31, 0L);
    }

    public final String toString() {
        return ij0.j("ContainerChanged(newContainerId=", this.a, ", seq=0, ts=0)");
    }
}
