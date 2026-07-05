package defpackage;

import com.anthropic.claude.tool.model.SuggestConnectorsOutputConnectorsItem;

/* JADX INFO: loaded from: classes3.dex */
public final class txg {
    public final SuggestConnectorsOutputConnectorsItem a;
    public final sxg b;

    public txg(SuggestConnectorsOutputConnectorsItem suggestConnectorsOutputConnectorsItem, sxg sxgVar) {
        this.a = suggestConnectorsOutputConnectorsItem;
        this.b = sxgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txg)) {
            return false;
        }
        txg txgVar = (txg) obj;
        return this.a.equals(txgVar.a) && this.b == txgVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestedConnectorRow(item=" + this.a + ", state=" + this.b + ")";
    }
}
