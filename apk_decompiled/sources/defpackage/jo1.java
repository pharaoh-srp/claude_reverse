package defpackage;

import com.anthropic.claude.bell.api.BellApiServerMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class jo1 implements ko1 {
    public final BellApiServerMessage.TTSWord a;
    public final long b;

    public jo1(BellApiServerMessage.TTSWord tTSWord, long j) {
        this.a = tTSWord;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo1)) {
            return false;
        }
        jo1 jo1Var = (jo1) obj;
        return this.a.equals(jo1Var.a) && this.b == jo1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Word(event=" + this.a + ", bufferedAtArrivalMs=" + this.b + ")";
    }
}
