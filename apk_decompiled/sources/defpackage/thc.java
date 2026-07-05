package defpackage;

import com.anthropic.claude.types.strings.ChatSnapshotId;

/* JADX INFO: loaded from: classes.dex */
public final class thc {
    public final String a;

    public thc(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thc) && ChatSnapshotId.m988equalsimpl0(this.a, ((thc) obj).a);
    }

    public final int hashCode() {
        return ChatSnapshotId.m989hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("OpenSharedChatParams(snapshotId=", ChatSnapshotId.m990toStringimpl(this.a), ")");
    }
}
