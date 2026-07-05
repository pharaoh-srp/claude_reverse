package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.chat.ChatConversation;
import java.util.ArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;

    public /* synthetic */ o8(String str, int i) {
        this.E = i;
        this.F = str;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        tze tzeVarL0;
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.F;
        switch (i) {
            case 0:
                AccountSettings accountSettings = (AccountSettings) obj;
                accountSettings.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.F, null, 201326591, null);
            case 1:
                AccountSettings accountSettings2 = (AccountSettings) obj;
                accountSettings2.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.F, null, null, null, null, null, null, null, null, null, null, null, 268369919, null);
            case 2:
                AccountSettings accountSettings3 = (AccountSettings) obj;
                accountSettings3.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.F, null, null, null, null, null, null, null, null, null, null, null, 268369919, null);
            case 3:
                AccountSettings accountSettings4 = (AccountSettings) obj;
                accountSettings4.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.F, null, 201326591, null);
            case 4:
                AccountSettings accountSettings5 = (AccountSettings) obj;
                accountSettings5.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.F, null, null, null, null, null, null, null, null, 267911167, null);
            case 5:
                AccountSettings accountSettings6 = (AccountSettings) obj;
                accountSettings6.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.F, null, null, null, null, null, null, null, null, 267911167, null);
            case 6:
                AccountSettings accountSettings7 = (AccountSettings) obj;
                accountSettings7.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings7, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.F, null, null, null, 251658239, null);
            case 7:
                AccountSettings accountSettings8 = (AccountSettings) obj;
                accountSettings8.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.F, null, null, null, 251658239, null);
            case 8:
                yk ykVar = (yk) obj;
                ykVar.getClass();
                return Boolean.valueOf(x44.r(ykVar.c(), str));
            case 9:
                yk ykVar2 = (yk) obj;
                ykVar2.getClass();
                return Boolean.valueOf(x44.r(ykVar2.c(), str));
            case 10:
                yk ykVar3 = (yk) obj;
                ykVar3.getClass();
                return Boolean.valueOf(x44.r(ykVar3.c(), str));
            case 11:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.v(ekfVar, str);
                return ieiVar;
            case 12:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                ckf.v(ekfVar2, str);
                return ieiVar;
            case 13:
                ekf ekfVar3 = (ekf) obj;
                ekfVar3.getClass();
                ckf.l(ekfVar3, str);
                return ieiVar;
            case 14:
                ekf ekfVar4 = (ekf) obj;
                ekfVar4.getClass();
                ckf.l(ekfVar4, str);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ekf ekfVar5 = (ekf) obj;
                ekfVar5.getClass();
                if (str != null) {
                    ckf.l(ekfVar5, str);
                }
                return ieiVar;
            case 16:
                ekf ekfVar6 = (ekf) obj;
                ckf.p(ekfVar6, 1);
                ckf.q(ekfVar6, str);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ekf ekfVar7 = (ekf) obj;
                ekfVar7.getClass();
                ckf.l(ekfVar7, str);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ckf.l((ekf) obj, str);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ekf ekfVar8 = (ekf) obj;
                ckf.q(ekfVar8, str);
                dkf dkfVar = akf.u;
                wn9 wn9Var = ckf.a[11];
                ekfVar8.a(dkfVar, Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier));
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ekf ekfVar9 = (ekf) obj;
                ekfVar9.getClass();
                ckf.l(ekfVar9, str);
                return ieiVar;
            case 21:
                ekf ekfVar10 = (ekf) obj;
                ekfVar10.getClass();
                ckf.l(ekfVar10, str);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("SELECT EXISTS(SELECT 1 FROM cachedConversations WHERE uuid = ?)");
                try {
                    tzeVarL0.N(1, str);
                    boolean z = false;
                    if (tzeVarL0.H0()) {
                        z = ((int) tzeVarL0.getLong(0)) != 0;
                    }
                    tzeVarL0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                lze lzeVar2 = (lze) obj;
                lzeVar2.getClass();
                tzeVarL0 = lzeVar2.L0("DELETE FROM cachedConversations WHERE uuid = ?");
                try {
                    tzeVarL0.N(1, str);
                    tzeVarL0.H0();
                    return ieiVar;
                } finally {
                }
            case 24:
                lze lzeVar3 = (lze) obj;
                lzeVar3.getClass();
                tzeVarL0 = lzeVar3.L0("DELETE FROM cachedMessages WHERE conversation_uuid = ?");
                try {
                    tzeVarL0.N(1, str);
                    tzeVarL0.H0();
                    return ieiVar;
                } finally {
                }
            case BuildConfig.VERSION_CODE /* 25 */:
                lze lzeVar4 = (lze) obj;
                lzeVar4.getClass();
                tzeVarL0 = lzeVar4.L0("SELECT * FROM cachedMessages WHERE conversation_uuid = ?");
                try {
                    tzeVarL0.N(1, str);
                    int iV = iv1.v(tzeVarL0, "uuid");
                    int iV2 = iv1.v(tzeVarL0, "conversation_uuid");
                    int iV3 = iv1.v(tzeVarL0, "message_json");
                    ArrayList arrayList = new ArrayList();
                    while (tzeVarL0.H0()) {
                        arrayList.add(new b62(tzeVarL0.g0(iV), tzeVarL0.g0(iV2), tzeVarL0.g0(iV3)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 26:
                lze lzeVar5 = (lze) obj;
                lzeVar5.getClass();
                tzeVarL0 = lzeVar5.L0("DELETE FROM cachedProjects WHERE uuid = ?");
                try {
                    tzeVarL0.N(1, str);
                    tzeVarL0.H0();
                    return ieiVar;
                } finally {
                }
            case 27:
                ekf ekfVar11 = (ekf) obj;
                ekfVar11.getClass();
                ckf.w(ekfVar11, new zb0(str));
                return ieiVar;
            case 28:
                lze lzeVar6 = (lze) obj;
                lzeVar6.getClass();
                tzeVarL0 = lzeVar6.L0("DELETE FROM chatIdListEntries WHERE chat_uuid = ?");
                try {
                    tzeVarL0.N(1, str);
                    tzeVarL0.H0();
                    return ieiVar;
                } finally {
                }
            default:
                return ChatConversation.m167copytBaNr2I$default((ChatConversation) obj, null, null, null, this.F, null, null, null, false, null, false, null, 2039, null);
        }
    }
}
