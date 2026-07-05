package defpackage;

import com.anthropic.claude.api.mcp.McpServer;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class o0i implements Comparator {
    public final /* synthetic */ iec E;

    public o0i(iec iecVar) {
        this.E = iecVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.E.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(((McpServer) obj).getName(), ((McpServer) obj2).getName());
    }
}
