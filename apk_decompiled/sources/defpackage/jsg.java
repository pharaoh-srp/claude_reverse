package defpackage;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.api.tasks.TaskStepStatus;
import com.anthropic.claude.tasks.ui.q;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResult;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jsg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ jsg(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iH0 = bsg.H0(charSequence, (char[]) obj3, iIntValue, false);
                if (iH0 >= 0) {
                    break;
                }
                break;
            case 1:
                u7h u7hVar = (u7h) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(u7hVar.b(), gb9.J(yfd.p(gb9.N(b.c(fqb.E, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var).p, xve.b(6.0f)), 10.0f), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var).e.F).i, e18Var, 0, 0, 131064);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                p5h.h((a8h) obj3, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                s6h.b((t6h) obj3, (ld4) obj, x44.p0(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                q.d((TaskStepStatus) obj3, (ld4) obj, x44.p0(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                e18 e18Var2 = (e18) ((ld4) obj);
                e18Var2.a0(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj3).getLabel());
                e18Var2.p(false);
                break;
            case 6:
                ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ((ld4) obj);
                e18Var3.a0(-1376593684);
                String string = ((RemoteAction) obj3).getTitle().toString();
                e18Var3.p(false);
                break;
            case 7:
                ((Integer) obj2).getClass();
                pwh.c((Tool.CustomTool) obj3, (ld4) obj, x44.p0(1));
                break;
            case 8:
                ovg ovgVar = (ovg) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var2;
                if (e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int iOrdinal = ovgVar.ordinal();
                    int i2 = R.string.upgrade_to_pro_error_verify_play_purchase;
                    switch (iOrdinal) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            i2 = R.string.upgrade_to_pro_error_connection;
                            tjh.b(d4c.j0(i2, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                            break;
                        case 5:
                            i2 = R.string.upgrade_to_pro_error_account_mismatch;
                            tjh.b(d4c.j0(i2, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                            break;
                        case 6:
                            i2 = R.string.upgrade_to_pro_error_pending_purchase;
                            tjh.b(d4c.j0(i2, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                            break;
                        case 7:
                        case 8:
                            tjh.b(d4c.j0(i2, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                            break;
                        case 9:
                            i2 = R.string.generic_error_something_went_wrong_try_again;
                            tjh.b(d4c.j0(i2, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                            break;
                        case 10:
                        case 11:
                            i2 = R.string.generic_error_something_went_wrong_upgrade_app;
                            tjh.b(d4c.j0(i2, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                            break;
                        default:
                            wg6.i();
                            break;
                    }
                } else {
                    e18Var4.T();
                }
                break;
            case 9:
                UserLocationV0OutputUserLocationResult userLocationV0OutputUserLocationResult = (UserLocationV0OutputUserLocationResult) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var3;
                if (!e18Var5.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    rlk.b(rlk.k(new LatLng(userLocationV0OutputUserLocationResult.getLatitude(), userLocationV0OutputUserLocationResult.getLongitude()), e18Var5), null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0L, false, null, null, null, null, e18Var5, 0, 262142);
                }
                break;
            case 10:
                htc htcVar = (htc) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var4;
                if (!e18Var6.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    hvk.c(htcVar.b, e18Var6, 0);
                }
                break;
            case 11:
                g4j g4jVar = (g4j) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var5;
                if (!e18Var7.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    tjh.b(d4c.j0(g4jVar.F, e18Var7), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var7, 0, 0, 262142);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((m5j) obj3).b(x44.p0(7), (ld4) obj);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jsg(Object obj, int i, int i2) {
        this.E = i2;
        this.F = obj;
    }
}
