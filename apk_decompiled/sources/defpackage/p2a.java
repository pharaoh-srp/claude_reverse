package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\u0002\b\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lp2a;", "", "Lcom/anthropic/claude/api/result/ApiResult;", "", "", "Lcom/anthropic/claude/api/account/LegalDocumentsByType;", "Lonf;", "a", "(Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface p2a {
    @u08("legal")
    Object a(tp4<? super ApiResult<? extends Map<String, String>>> tp4Var);
}
