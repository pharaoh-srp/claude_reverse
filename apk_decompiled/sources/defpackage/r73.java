package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$ModelChangeDismissed;
import com.anthropic.claude.analytics.events.ChatEvents$ModelChangeViewed;
import com.anthropic.claude.analytics.events.ChatEvents$RefusalViewed;
import com.anthropic.claude.analytics.events.CodeEvents$PrAutoFixToggled;
import com.anthropic.claude.analytics.events.CodeEvents$PrAutoMergeToggled;
import com.anthropic.claude.api.chat.RefusalStopDetails;
import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.share.ChatSnapshotSummary;
import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.code.remote.i;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r73 extends m08 implements zy7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r73(rwe rweVar, int i) {
        super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
        this.E = i;
        switch (i) {
            case 7:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case 8:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case 9:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case 10:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case 11:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case 12:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case 13:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case 14:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case 16:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                super(0, 1, x0.class, rweVar, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        n58 n58VarQ0;
        n58 n58VarQ02;
        int i = this.E;
        int i2 = 2;
        int i3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((t53) this.receiver).w1.setValue(null);
                break;
            case 1:
                t53 t53Var = (t53) this.receiver;
                if (((bqb) t53Var.L1.getValue()) != null) {
                    t53Var.w.e(new ChatEvents$ModelChangeDismissed(t53Var.a1()), ChatEvents$ModelChangeDismissed.Companion.serializer());
                    t53Var.x1(null);
                }
                break;
            case 2:
                t53 t53Var2 = (t53) this.receiver;
                bqb bqbVar = (bqb) t53Var2.L1.getValue();
                if (bqbVar != null) {
                    t53Var2.w.e(new ChatEvents$ModelChangeViewed(bqbVar.b().m253getModeli4oh0I(), bqbVar.e(), t53Var2.a1()), ChatEvents$ModelChangeViewed.Companion.serializer());
                }
                break;
            case 3:
                t53 t53Var3 = (t53) this.receiver;
                qi3 qi3Var = t53Var3.w;
                RefusalStopDetails refusalStopDetails = (RefusalStopDetails) t53Var3.M1.getValue();
                qi3Var.e(new ChatEvents$RefusalViewed((refusalStopDetails != null ? refusalStopDetails.getRetry_suggestion() : null) != null, t53Var3.a1()), ChatEvents$RefusalViewed.Companion.serializer());
                break;
            case 4:
                t53 t53Var4 = (t53) this.receiver;
                Experience experience = (Experience) t53Var4.l2.getValue();
                if (experience != null && !t53Var4.m2) {
                    t53Var4.m2 = true;
                    gb9.D(t53Var4.a, null, null, new r53(t53Var4, experience, objArr == true ? 1 : 0, i3), 3);
                }
                break;
            case 5:
                t53 t53Var5 = (t53) this.receiver;
                Experience experience2 = (Experience) t53Var5.l2.getValue();
                if (experience2 != null) {
                    t53Var5.k2.setValue(Boolean.TRUE);
                    gb9.D(t53Var5.a, null, null, new r53(t53Var5, experience2, objArr2 == true ? 1 : 0, z ? 1 : 0), 3);
                }
                break;
            case 6:
                x0.d((rwe) this.receiver);
                break;
            case 7:
                x0.d((rwe) this.receiver);
                break;
            case 8:
                x0.d((rwe) this.receiver);
                break;
            case 9:
                x0.d((rwe) this.receiver);
                break;
            case 10:
                x0.d((rwe) this.receiver);
                break;
            case 11:
                x0.d((rwe) this.receiver);
                break;
            case 12:
                x0.d((rwe) this.receiver);
                break;
            case 13:
                x0.d((rwe) this.receiver);
                break;
            case 14:
                x0.d((rwe) this.receiver);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                x0.d((rwe) this.receiver);
                break;
            case 16:
                x0.d((rwe) this.receiver);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                x0.d((rwe) this.receiver);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                x0.d((rwe) this.receiver);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                x0.d((rwe) this.receiver);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                db3 db3Var = (db3) this.receiver;
                ChatSnapshotSummary chatSnapshotSummary = (ChatSnapshotSummary) db3Var.m.getValue();
                if (chatSnapshotSummary == null || ((Boolean) db3Var.o.getValue()).booleanValue()) {
                    db3Var.S(true);
                    gb9.D(db3Var.a, null, null, new cj(db3Var, objArr3 == true ? 1 : 0, 10), 3);
                } else {
                    db3Var.R(chatSnapshotSummary.m426getUuidN1vkeFQ());
                }
                break;
            case 21:
                ((xc3) this.receiver).a();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                v77 v77Var = ((f6d) this.receiver).a;
                if (tpi.K(v77Var)) {
                    int iN = v77Var.n();
                    if (iN == 1 && v77Var.q(2)) {
                        v77Var.w();
                    } else if (iN == 4 && v77Var.q(4)) {
                        int iF = v77Var.f();
                        v77Var.F();
                        if (iF != -1) {
                            fd9.E(iF >= 0);
                            mqh mqhVar = v77Var.d0.a;
                            if (mqhVar.p() || iF < mqhVar.o()) {
                                hp5 hp5Var = v77Var.s;
                                if (!hp5Var.i) {
                                    kx kxVarC = hp5Var.C();
                                    hp5Var.i = true;
                                    hp5Var.H(kxVarC, -1, new ed5(19));
                                }
                                v77Var.H++;
                                if (v77Var.r()) {
                                    ysj.u("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                                    a87 a87Var = new a87(v77Var.d0);
                                    a87Var.c(1);
                                    v77 v77Var2 = v77Var.k.E;
                                    v77Var2.j.d(new yw5(v77Var2, i3, a87Var));
                                } else {
                                    j6d j6dVarG = v77Var.d0;
                                    int i4 = j6dVarG.e;
                                    if (i4 == 3 || (i4 == 4 && !mqhVar.p())) {
                                        j6dVarG = v77Var.d0.g(2);
                                    }
                                    int iF2 = v77Var.f();
                                    j6d j6dVarT = v77Var.t(j6dVarG, mqhVar, v77Var.u(mqhVar, iF, -9223372036854775807L));
                                    v77Var.l.L.b(3, new c87(mqhVar, iF, tpi.C(-9223372036854775807L))).b();
                                    v77Var.D(j6dVarT, 0, true, 1, v77Var.i(j6dVarT), iF2);
                                }
                            }
                        }
                    }
                    if (v77Var.q(1)) {
                        v77Var.F();
                        v77Var.C(1, true);
                    }
                } else if (v77Var.q(1)) {
                    v77Var.F();
                    v77Var.C(1, false);
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((l4h) this.receiver).a();
                break;
            case 24:
                ((q2d) this.receiver).a();
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                i iVar = (i) this.receiver;
                String strE0 = iVar.E0();
                lsc lscVar = iVar.n1;
                if (strE0 != null && (n58VarQ0 = iVar.q0()) != null) {
                    d68 d68Var = n58VarQ0.c;
                    b68 b68Var = d68Var instanceof b68 ? (b68) d68Var : null;
                    if (b68Var != null) {
                        boolean z = !((Boolean) lscVar.getValue()).booleanValue();
                        lscVar.setValue(Boolean.valueOf(z));
                        iVar.p1++;
                        iVar.l.e(new CodeEvents$PrAutoFixToggled(iVar.m, strE0, z), CodeEvents$PrAutoFixToggled.Companion.serializer());
                        gb9.D(iVar.a, null, null, new j24(z, iVar, strE0, n58VarQ0, b68Var, (tp4) null), 3);
                    }
                }
                break;
            case 26:
                i iVar2 = (i) this.receiver;
                String strE02 = iVar2.E0();
                lsc lscVar2 = iVar2.o1;
                if (strE02 != null && (n58VarQ02 = iVar2.q0()) != null) {
                    d68 d68Var2 = n58VarQ02.c;
                    b68 b68Var2 = d68Var2 instanceof b68 ? (b68) d68Var2 : null;
                    if (b68Var2 != null) {
                        boolean z2 = !((Boolean) lscVar2.getValue()).booleanValue();
                        lscVar2.setValue(Boolean.valueOf(z2));
                        iVar2.q1++;
                        iVar2.l.e(new CodeEvents$PrAutoMergeToggled(iVar2.m, strE02, z2), CodeEvents$PrAutoMergeToggled.Companion.serializer());
                        gb9.D(iVar2.a, null, null, new j24(iVar2, strE02, n58VarQ02, b68Var2, z2, (tp4) null), 3);
                    }
                }
                break;
            case 27:
                ((j8i) this.receiver).l();
                break;
            case 28:
                ((j8i) this.receiver).j();
                break;
            default:
                j8i j8iVar = (j8i) this.receiver;
                gb9.D(j8iVar.k, null, null, new k7h(j8iVar, objArr4 == true ? 1 : 0, i2), 3);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r73(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }
}
