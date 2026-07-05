package defpackage;

import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem;

/* JADX INFO: loaded from: classes2.dex */
public final class ns4 {
    public final ConwaySuggestConnectorsOutputConnectorsItem a;
    public final ms4 b;

    public ns4(ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem, ms4 ms4Var) {
        this.a = conwaySuggestConnectorsOutputConnectorsItem;
        this.b = ms4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns4)) {
            return false;
        }
        ns4 ns4Var = (ns4) obj;
        return this.a.equals(ns4Var.a) && this.b == ns4Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConwayConnectorRowState(item=" + this.a + ", state=" + this.b + ")";
    }
}
