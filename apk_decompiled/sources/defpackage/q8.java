package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.chat.UpdatableChatConversationSettings;
import java.util.List;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;

    public /* synthetic */ q8(boolean z, int i) {
        this.E = i;
        this.F = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Boolean bool;
        int i;
        Object obj2;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        List list;
        Boolean bool6;
        Map map;
        Boolean bool7;
        Boolean bool8;
        int i2 = this.E;
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        iei ieiVar = iei.a;
        boolean z = this.F;
        switch (i2) {
            case 0:
                AccountSettings accountSettings = (AccountSettings) obj;
                accountSettings.getClass();
                if (!z) {
                }
                break;
            case 1:
                AccountSettings accountSettings2 = (AccountSettings) obj;
                accountSettings2.getClass();
                break;
            case 2:
                AccountSettings accountSettings3 = (AccountSettings) obj;
                accountSettings3.getClass();
                break;
            case 3:
                AccountSettings accountSettings4 = (AccountSettings) obj;
                accountSettings4.getClass();
                break;
            case 4:
                AccountSettings accountSettings5 = (AccountSettings) obj;
                accountSettings5.getClass();
                break;
            case 5:
                AccountSettings accountSettings6 = (AccountSettings) obj;
                accountSettings6.getClass();
                break;
            case 6:
                AccountSettings accountSettings7 = (AccountSettings) obj;
                accountSettings7.getClass();
                if (z) {
                    bool = Boolean.TRUE;
                    bool8 = Boolean.FALSE;
                    i = 268434687;
                    obj2 = null;
                    bool2 = null;
                    bool3 = null;
                    bool4 = null;
                    bool5 = null;
                    list = null;
                    bool6 = null;
                    map = null;
                    bool7 = null;
                } else {
                    bool = Boolean.FALSE;
                    i = 268435199;
                    obj2 = null;
                    bool2 = null;
                    bool3 = null;
                    bool4 = null;
                    bool5 = null;
                    list = null;
                    bool6 = null;
                    map = null;
                    bool7 = null;
                    bool8 = null;
                }
                break;
            case 7:
                AccountSettings accountSettings8 = (AccountSettings) obj;
                accountSettings8.getClass();
                break;
            case 8:
                AccountSettings accountSettings9 = (AccountSettings) obj;
                accountSettings9.getClass();
                break;
            case 9:
                AccountSettings accountSettings10 = (AccountSettings) obj;
                accountSettings10.getClass();
                break;
            case 10:
                AccountSettings accountSettings11 = (AccountSettings) obj;
                accountSettings11.getClass();
                break;
            case 11:
                AccountSettings accountSettings12 = (AccountSettings) obj;
                accountSettings12.getClass();
                break;
            case 12:
                AccountSettings accountSettings13 = (AccountSettings) obj;
                accountSettings13.getClass();
                break;
            case 13:
                AccountSettings accountSettings14 = (AccountSettings) obj;
                accountSettings14.getClass();
                break;
            case 14:
                AccountSettings accountSettings15 = (AccountSettings) obj;
                accountSettings15.getClass();
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                AccountSettings accountSettings16 = (AccountSettings) obj;
                accountSettings16.getClass();
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                if (z) {
                    iIntValue = -iIntValue;
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((i90) obj).getClass();
                int i3 = 8;
                po4 po4VarW0 = z ? xn5.w0(gp6.m(thk.n(), new xga(i3)).a(gp6.e(thk.m(), 2)), gp6.o(thk.n(), new c32(21)).a(gp6.f(thk.m(), 2))) : xn5.w0(gp6.m(thk.n(), new c32(22)).a(gp6.e(thk.m(), 2)), gp6.o(thk.n(), new xga(i3)).a(gp6.f(thk.m(), 2)));
                po4VarW0.d = xn5.Q(2);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue2 = ((Integer) obj).intValue();
                if (!z) {
                    iIntValue2 = -iIntValue2;
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                UpdatableChatConversationSettings updatableChatConversationSettings = (UpdatableChatConversationSettings) obj;
                updatableChatConversationSettings.getClass();
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                UpdatableChatConversationSettings updatableChatConversationSettings2 = (UpdatableChatConversationSettings) obj;
                updatableChatConversationSettings2.getClass();
                break;
            case 21:
                UpdatableChatConversationSettings updatableChatConversationSettings3 = (UpdatableChatConversationSettings) obj;
                updatableChatConversationSettings3.getClass();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                UpdatableChatConversationSettings updatableChatConversationSettings4 = (UpdatableChatConversationSettings) obj;
                updatableChatConversationSettings4.getClass();
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.t(ekfVar, z);
                break;
            case 24:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                if (z) {
                    ckf.t(ekfVar2, true);
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                if (!z) {
                    f = 1.0f;
                }
                xreVar.b(f);
                break;
            case 26:
                xre xreVar2 = (xre) obj;
                xreVar2.getClass();
                if (z) {
                    f = 1.0f;
                }
                xreVar2.b(f);
                break;
            case 27:
                xre xreVar3 = (xre) obj;
                xreVar3.getClass();
                if (z) {
                    f = 1.0f;
                }
                xreVar3.b(f);
                break;
            default:
                us7 us7Var = (us7) obj;
                if (!z) {
                    us7Var.b(false);
                    us7Var.c(new kac(17));
                }
                break;
        }
        return ieiVar;
    }
}
