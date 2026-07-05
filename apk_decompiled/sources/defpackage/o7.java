package defpackage;

import com.anthropic.claude.api.account.AcceptLegalDocsRequest;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AccountDeletableResponse;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import com.anthropic.claude.api.account.UpdateAccountRequest;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0005J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0005J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0005¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lo7;", "", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/account/Account;", "a", "(Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/account/UpdateAccountRequest;", "request", "c", "(Lcom/anthropic/claude/api/account/UpdateAccountRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/account/AccountSettings;", "accountSettings", "Liei;", "f", "(Lcom/anthropic/claude/api/account/AccountSettings;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/account/AccountDeletableResponse;", "b", "Lcom/anthropic/claude/api/account/AcceptLegalDocsRequest;", "h", "(Lcom/anthropic/claude/api/account/AcceptLegalDocsRequest;Ltp4;)Ljava/lang/Object;", "g", "Lcom/anthropic/claude/api/account/SendProductEmailLinkRequest;", "d", "(Lcom/anthropic/claude/api/account/SendProductEmailLinkRequest;Ltp4;)Ljava/lang/Object;", "e", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface o7 {
    @u08("account")
    Object a(tp4<? super ApiResult<Account>> tp4Var);

    @u08("account/deletion-allowed")
    Object b(tp4<? super ApiResult<AccountDeletableResponse>> tp4Var);

    @vmc("account")
    Object c(@ft1 UpdateAccountRequest updateAccountRequest, tp4<? super ApiResult<Account>> tp4Var);

    @smc("account/send_product_email_link")
    Object d(@ft1 SendProductEmailLinkRequest sendProductEmailLinkRequest, tp4<? super ApiResult<iei>> tp4Var);

    @ff5("account")
    Object e(tp4<? super ApiResult<iei>> tp4Var);

    @rmc("account/settings")
    Object f(@ft1 AccountSettings accountSettings, tp4<? super ApiResult<iei>> tp4Var);

    @smc("account/grove_notice_viewed")
    Object g(tp4<? super ApiResult<iei>> tp4Var);

    @vmc("account/accept_legal_docs")
    Object h(@ft1 AcceptLegalDocsRequest acceptLegalDocsRequest, tp4<? super ApiResult<iei>> tp4Var);
}
