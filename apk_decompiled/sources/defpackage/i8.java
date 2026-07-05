package defpackage;

import com.anthropic.claude.api.account.AccountProfile;
import com.anthropic.claude.api.account.UpdateAccountProfileRequest;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Li8;", "", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/account/AccountProfile;", "a", "(Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/account/UpdateAccountProfileRequest;", "request", "b", "(Lcom/anthropic/claude/api/account/UpdateAccountProfileRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface i8 {
    @u08("account_profile")
    Object a(tp4<? super ApiResult<AccountProfile>> tp4Var);

    @vmc("account_profile")
    Object b(@ft1 UpdateAccountProfileRequest updateAccountProfileRequest, tp4<? super ApiResult<AccountProfile>> tp4Var);
}
