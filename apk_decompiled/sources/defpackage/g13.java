package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.f;
import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.chat.dialogs.ChatScreenDialog;
import com.anthropic.claude.chat.dialogs.d;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g13 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;

    public /* synthetic */ g13(rwe rweVar, int i) {
        this.E = i;
        this.F = rweVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                f.c(rweVar);
                break;
            case 1:
                f.c(rweVar);
                break;
            case 2:
                f.c(rweVar);
                break;
            case 3:
                d.b(rweVar);
                break;
            case 4:
                d.b(rweVar);
                break;
            case 5:
                d.b(rweVar);
                break;
            case 6:
                d.b(rweVar);
                break;
            case 7:
                d.b(rweVar);
                break;
            case 8:
                rweVar.E.m(new jx2(4, ChatScreenModalBottomSheetDestination.VoiceSettings.INSTANCE), new p23(26));
                break;
            case 9:
                rweVar.E.m(new fv(23, new ChatScreenDialog[]{ChatScreenDialog.Rename.INSTANCE}), new j83(1));
                break;
            case 10:
                rweVar.E.m(new fv(24, new ChatScreenDialog[]{ChatScreenDialog.Delete.INSTANCE}), new j83(2));
                break;
            case 11:
                x0.d(rweVar);
                break;
            case 12:
                x0.d(rweVar);
                break;
            case 13:
                x0.d(rweVar);
                break;
            case 14:
                x0.d(rweVar);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                x0.d(rweVar);
                break;
            case 16:
                x0.d(rweVar);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                x0.d(rweVar);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                x0.d(rweVar);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                rweVar.E.m(hr0.K, new j83(4));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                x0.d(rweVar);
                break;
            case 21:
                x0.d(rweVar);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                x0.d(rweVar);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                x0.d(rweVar);
                break;
            case 24:
                x0.d(rweVar);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                x0.d(rweVar);
                break;
            case 26:
                rweVar.E.m(hr0.L, new j83(5));
                break;
            case 27:
                x0.d(rweVar);
                break;
            case 28:
                jx2 jx2Var = new jx2(7, ClaudeAppOverlay.CreateEnvironment.INSTANCE);
                j83 j83Var = new j83(21);
                rweVar.getClass();
                rweVar.E.m(jx2Var, j83Var);
                break;
            default:
                oj3 oj3Var = new oj3(new ClaudeAppOverlay.UpgradeToProBottomSheet(fji.F, (String) null, (String) null, 6, (mq5) null), 0);
                j83 j83Var2 = new j83(19);
                rweVar.getClass();
                rweVar.E.m(oj3Var, j83Var2);
                break;
        }
        return ieiVar;
    }
}
