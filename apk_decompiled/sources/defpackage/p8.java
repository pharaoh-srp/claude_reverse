package defpackage;

import com.anthropic.claude.api.account.AccountSettings;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Boolean F;
    public final /* synthetic */ Boolean G;

    public /* synthetic */ p8(Boolean bool, Boolean bool2, int i) {
        this.E = i;
        this.F = bool;
        this.G = bool2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.E) {
            case 0:
                AccountSettings accountSettings = (AccountSettings) obj;
                accountSettings.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings, null, null, null, null, null, null, null, null, this.F, this.G, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268434687, null);
            default:
                AccountSettings accountSettings2 = (AccountSettings) obj;
                accountSettings2.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings2, null, null, null, null, null, null, null, null, this.F, this.G, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268434687, null);
        }
    }
}
