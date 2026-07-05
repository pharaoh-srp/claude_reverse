package defpackage;

import com.anthropic.claude.api.common.EmptyResponseWithSuccess;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ltja;", "", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/common/EmptyResponseWithSuccess;", "a", "(Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface tja {
    @smc("auth/logout")
    Object a(tp4<? super ApiResult<EmptyResponseWithSuccess>> tp4Var);
}
