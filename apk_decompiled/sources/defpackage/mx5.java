package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.chat.menu.b;
import java.util.ArrayList;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mx5 extends m08 implements zy7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx5(int i, Object obj) {
        super(0, 0, fca.class, obj, "retryLoading", "retryLoading()V");
        this.E = i;
        switch (i) {
            case 10:
                super(0, 0, m9j.class, obj, "submitEmail", "submitEmail()V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        boolean z = false;
        z = false;
        z = false;
        int i2 = 1;
        int i3 = 3;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                jx5 jx5Var = (jx5) this.receiver;
                jx5Var.e.setValue(Boolean.TRUE);
                gb9.D(jx5Var.a, null, null, new ix5(jx5Var, tp4Var, z ? 1 : 0), 3);
                break;
            case 1:
                ((by5) this.receiver).I();
                break;
            case 2:
                ((r4g) this.receiver).a();
                break;
            case 3:
                ((b) this.receiver).b();
                break;
            case 4:
                ((b) this.receiver).a();
                break;
            case 5:
                rp6 rp6Var = (rp6) this.receiver;
                rp6Var.X();
                lsc lscVar = rp6Var.D;
                lsc lscVar2 = rp6Var.A;
                lsc lscVar3 = rp6Var.C;
                lsc lscVar4 = rp6Var.z;
                lsc lscVar5 = rp6Var.t;
                hng hngVarU = rp6Var.U();
                hng hngVar = hng.F;
                Object[] objArr = hngVarU == hngVar && !((hi) lscVar5.getValue()).b();
                lscVar3.setValue(Boolean.valueOf(rp6Var.U() == hngVar && ((Boolean) rp6Var.x.getValue()).booleanValue() && !((Boolean) lscVar4.getValue()).booleanValue()));
                if (rp6Var.U() == hngVar && ((Boolean) rp6Var.y.getValue()).booleanValue() && !((Boolean) lscVar2.getValue()).booleanValue()) {
                    z = true;
                }
                lscVar.setValue(Boolean.valueOf(z));
                if (rp6Var.T() || objArr == true || ((Boolean) lscVar.getValue()).booleanValue() || ((Boolean) lscVar3.getValue()).booleanValue()) {
                    lscVar5.setValue(((hi) lscVar5.getValue()).a());
                } else {
                    ArrayList arrayListB = rp6Var.i.b(((Boolean) lscVar4.getValue()).booleanValue(), ((Boolean) lscVar2.getValue()).booleanValue());
                    vb7.B(rp6Var.j.a, "age_assurances_completed", true);
                    gb9.D(rp6Var.a, null, null, new t74(rp6Var, arrayListB, tp4Var, 21), 3);
                }
                break;
            case 6:
                ((r4g) this.receiver).a();
                break;
            case 7:
                vg7 vg7Var = (vg7) this.receiver;
                nwb nwbVar = vg7Var.a;
                if (((Number) nwbVar.getValue()).intValue() > 0) {
                    (((Number) nwbVar.getValue()).intValue() <= 1 ? vg7Var.b : vg7Var.c).t("image/*");
                }
                break;
            case 8:
                ((tn1) ((fn1) this.receiver)).G();
                break;
            case 9:
                fca fcaVar = (fca) this.receiver;
                fcaVar.getClass();
                List list = xah.a;
                xah.e(6, "Retrying user session load", null, null);
                fcaVar.R();
                break;
            case 10:
                ((m9j) this.receiver).T();
                break;
            case 11:
                rja rjaVar = (rja) this.receiver;
                rjaVar.d.setValue(Boolean.TRUE);
                gb9.D(rjaVar.a, null, null, new al8(rjaVar, tp4Var, 11), 3);
                break;
            case 12:
                ((opa) this.receiver).b.setValue(Boolean.TRUE);
                break;
            case 13:
                lbb lbbVar = (lbb) this.receiver;
                gb9.D(lbbVar.a, null, null, new kza(lbbVar, tp4Var, i3), 3);
                break;
            case 14:
                pbb pbbVar = (pbb) this.receiver;
                gb9.D(pbbVar.a, null, null, new e41(pbbVar, tp4Var, 4), 3);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                break;
            case 16:
                ((dyc) this.receiver).O();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((dyc) this.receiver).O();
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((dyc) this.receiver).O();
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                fti ftiVar = (fti) this.receiver;
                gb9.D(ftiVar.a, null, null, new v2h(ftiVar, tp4Var, 9), 3);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((r4g) this.receiver).a();
                break;
            case 21:
                ((r4g) this.receiver).a();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                vid vidVar = (vid) this.receiver;
                gb9.D(vidVar.a, null, null, new tid(vidVar, tp4Var, i2), 3);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((ild) this.receiver).o();
                break;
            case 24:
                ((ild) this.receiver).o();
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                nfe nfeVar = (nfe) this.receiver;
                nfeVar.f.setValue(Boolean.TRUE);
                gb9.D(nfeVar.a, null, null, new o6e(nfeVar, ((cjh) nfeVar.e.getValue()).a.F, tp4Var, i2), 3);
                break;
            case 26:
                qfe qfeVar = (qfe) this.receiver;
                lsc lscVar6 = qfeVar.f;
                lsc lscVar7 = qfeVar.g;
                if (!bsg.I0(((cjh) lscVar6.getValue()).a.F) && !((Boolean) lscVar7.getValue()).booleanValue()) {
                    String string = bsg.k1(((cjh) qfeVar.f.getValue()).a.F).toString();
                    lscVar7.setValue(Boolean.TRUE);
                    gb9.D(qfeVar.a, null, null, new o6e(string, qfeVar, tp4Var, 2), 3);
                }
                break;
            case 27:
                ((r4g) this.receiver).a();
                break;
            case 28:
                ((t4g) this.receiver).a();
                break;
            default:
                ((t4g) this.receiver).c();
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mx5(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx5(opa opaVar) {
        super(0, 0, opa.class, opaVar, "onClearSplashScreen", "onClearSplashScreen()V");
        this.E = 12;
    }
}
