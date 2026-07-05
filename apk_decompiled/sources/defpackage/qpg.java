package defpackage;

import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutput;

/* JADX INFO: loaded from: classes2.dex */
public final class qpg extends wpg {
    public final String a;
    public final ConwaySuggestConnectorsOutput b;
    public final long c;

    public qpg(String str, ConwaySuggestConnectorsOutput conwaySuggestConnectorsOutput, long j) {
        str.getClass();
        this.a = str;
        this.b = conwaySuggestConnectorsOutput;
        this.c = j;
    }

    @Override // defpackage.wpg
    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpg)) {
            return false;
        }
        qpg qpgVar = (qpg) obj;
        return x44.r(this.a, qpgVar.a) && x44.r(this.b, qpgVar.b) && this.c == qpgVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ConwaySuggestConnectorsOutput conwaySuggestConnectorsOutput = this.b;
        return Long.hashCode(this.c) + ((iHashCode + (conwaySuggestConnectorsOutput == null ? 0 : conwaySuggestConnectorsOutput.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestConnectors(id=");
        sb.append(this.a);
        sb.append(", output=");
        sb.append(this.b);
        sb.append(", timestamp=");
        return grc.r(this.c, ")", sb);
    }
}
