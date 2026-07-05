package defpackage;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.types.strings.AccountId;

/* JADX INFO: loaded from: classes.dex */
public final class q7 {
    public final lsc a = mpk.P(null);
    public final lsc b = mpk.P(null);
    public final wz5 c = mpk.w(new p7(0, this));
    public final lsc d = mpk.P(Boolean.FALSE);

    public final Account a() {
        Account account = (Account) this.a.getValue();
        if (account != null) {
            return account;
        }
        sz6.j("Account not set yet");
        return null;
    }

    public final boolean b() {
        return ((Account) this.a.getValue()) != null;
    }

    public final void c(Account account) {
        account.getClass();
        lsc lscVar = this.a;
        Account account2 = (Account) lscVar.getValue();
        if (account2 == null || AccountId.m946equalsimpl0(account2.m106getUuidislZJdo(), account.m106getUuidislZJdo())) {
            lscVar.setValue(account);
        } else {
            sz6.j("Cannot change Account UUID");
        }
    }
}
