package defpackage;

import com.anthropic.claude.api.account.AccountSettings;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;

    public /* synthetic */ s8(boolean z, int i) {
        this.E = i;
        this.F = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        boolean z = this.F;
        switch (i) {
            case 0:
                AccountSettings accountSettings = (AccountSettings) obj;
                accountSettings.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268433407, null);
            case 1:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                if (z) {
                    ckf.f(ekfVar);
                }
                return iei.a;
            default:
                tjg tjgVar = (tjg) obj;
                tjgVar.getClass();
                if (!z || tjgVar.a.size() <= 1) {
                    return null;
                }
                return new p7(8, tjgVar);
        }
    }
}
