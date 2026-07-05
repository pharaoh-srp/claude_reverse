package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.tasks.TaskResponse;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class iec implements Comparator {
    public static final iec F = new iec(0);
    public final /* synthetic */ int E;

    public /* synthetic */ iec(int i) {
        this.E = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                av9 av9Var = (av9) obj;
                av9 av9Var2 = (av9) obj2;
                int iZ = x44.z(av9Var2.U, av9Var.U);
                return iZ != 0 ? iZ : x44.z(av9Var.hashCode(), av9Var2.hashCode());
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin = Math.min(str.length(), str2.length());
                int i = 4;
                while (true) {
                    if (i >= iMin) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                            return 1;
                        }
                    } else {
                        char cCharAt = str.charAt(i);
                        char cCharAt2 = str2.charAt(i);
                        if (cCharAt == cCharAt2) {
                            i++;
                        } else if (x44.z(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 2:
                return nai.r(((ChatConversationWithProjectReference) obj2).getUpdated_at(), ((ChatConversationWithProjectReference) obj).getUpdated_at());
            case 3:
                av9 av9Var3 = (av9) obj;
                av9 av9Var4 = (av9) obj2;
                int iZ2 = x44.z(av9Var3.U, av9Var4.U);
                return iZ2 != 0 ? iZ2 : x44.z(av9Var3.hashCode(), av9Var4.hashCode());
            case 4:
                return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
            case 5:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 6:
                return Long.valueOf(((Project) obj2).getUpdated_at().getTime()).compareTo(Long.valueOf(((Project) obj).getUpdated_at().getTime()));
            case 7:
                h2g h2gVar = (h2g) obj;
                h2g h2gVar2 = (h2g) obj2;
                return Float.valueOf((h2gVar.F.h() == MTTypesetterKt.kLineSkipLimitMultiplier && h2gVar.O == null) ? -1.0f : h2gVar.F.h()).compareTo(Float.valueOf((h2gVar2.F.h() == MTTypesetterKt.kLineSkipLimitMultiplier && h2gVar2.O == null) ? -1.0f : h2gVar2.F.h()));
            case 8:
                return nai.r(((TaskResponse) obj2).getLast_activity_at(), ((TaskResponse) obj).getLast_activity_at());
            default:
                Boolean connected = ((McpServer) obj).getConnected();
                Boolean bool = Boolean.TRUE;
                return Boolean.valueOf(!x44.r(connected, bool)).compareTo(Boolean.valueOf(!x44.r(((McpServer) obj2).getConnected(), bool)));
        }
    }
}
