package defpackage;

import android.content.Context;
import android.os.Parcel;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.api.tasks.TaskStepResponse;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nif implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ nif(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        w1c w1cVar;
        int i = this.E;
        int i2 = 21;
        int i3 = 6;
        int i4 = 5;
        int i5 = 4;
        int i6 = 14;
        int i7 = 3;
        int i8 = 0;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                mif mifVar = (mif) obj3;
                hp4 hp4Var = (hp4) obj2;
                cp4 cp4Var = (cp4) obj;
                ieh iehVar = ieh.Copy;
                boolean zM = mifVar.m();
                rhf rhfVar = new rhf(mifVar, 5);
                if (zM) {
                    cp4.b(cp4Var, new u74(i8 == true ? 1 : 0, iehVar), null, new p4(rhfVar, 13, hp4Var), 14);
                }
                ieh iehVar2 = ieh.SelectAll;
                boolean zK = mifVar.k();
                rhf rhfVar2 = new rhf(mifVar, 6);
                if (!zK) {
                    cp4.b(cp4Var, new u74(i8 == true ? 1 : 0, iehVar2), null, new p4(rhfVar2, 13, hp4Var), 14);
                }
                x44.X(ieiVar, ieiVar);
                return ieiVar;
            case 1:
                mif mifVar2 = (mif) obj3;
                Context context = (Context) obj2;
                ydh ydhVar = (ydh) obj;
                ydhVar.a();
                yfd.h0(ydhVar, context.getResources(), ieh.Copy, mifVar2.m(), new pif(new rhf(mifVar2, 7), null, 0));
                yfd.h0(ydhVar, context.getResources(), ieh.SelectAll, true ^ mifVar2.k(), new pif(new rhf(mifVar2, 9), new rhf(mifVar2, 8), 0));
                ydhVar.a();
                return ieiVar;
            case 2:
                iqf iqfVar = (iqf) obj3;
                nf0 nf0Var = (nf0) obj2;
                ek6 ek6Var = (ek6) obj;
                ek6Var.getClass();
                int iOrdinal = ek6Var.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        wg6.i();
                        return null;
                    }
                    iqfVar.c.a1(nf0Var);
                }
                return ieiVar;
            case 3:
                iqf iqfVar2 = (iqf) obj3;
                fvf fvfVar = (fvf) obj2;
                ek6 ek6Var2 = (ek6) obj;
                ek6Var2.getClass();
                int iOrdinal2 = ek6Var2.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        wg6.i();
                        return null;
                    }
                    amg amgVar = iqfVar2.f;
                    nh4 nh4Var = new nh4(new Exception("Elevated auth required: " + ((muf) fvfVar).a));
                    amgVar.getClass();
                    amgVar.n(null, nh4Var);
                }
                return ieiVar;
            case 4:
                s2g s2gVar = (s2g) obj3;
                bz7 bz7Var = (bz7) obj2;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                for (Object obj4 : (List) s2gVar.k.getValue()) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        x44.n0();
                        throw null;
                    }
                    ucg ucgVar = (ucg) obj4;
                    j0aVar.U(Integer.valueOf(ucgVar.a.E), kc9.E, new ta4(598950510, true, new lca(14, ucgVar)));
                    List list = ucgVar.b;
                    j0aVar.W(list.size(), new zkd(new z1g(3), 7, list), new zkd(new z1g(i5), 8, list), new ta4(802480018, true, new lp(list, s2gVar, bz7Var, 10)));
                    i8 = i9;
                }
                return ieiVar;
            case 5:
                x3g x3gVar = (x3g) obj3;
                bz7 bz7Var2 = (bz7) obj2;
                x3g x3gVar2 = (x3g) obj;
                x3gVar2.getClass();
                if (x3gVar != x3gVar2) {
                    bz7Var2.invoke(Boolean.valueOf(x3gVar2 == x3g.F));
                }
                return ieiVar;
            case 6:
                bz7 bz7Var3 = (bz7) obj3;
                isc iscVar = (isc) obj2;
                int i10 = (int) (((g79) obj).a & 4294967295L);
                int i11 = i10 >= 1 ? i10 : 1;
                iscVar.i(i11);
                bz7Var3.invoke(Float.valueOf(i11));
                return ieiVar;
            case 7:
                ((Integer) obj).intValue();
                return ((Parcel) obj3).readValue((ClassLoader) obj2);
            case 8:
                cae caeVar = (cae) obj3;
                List list2 = (List) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (caeVar.E == 0) {
                    caeVar.E = jLongValue;
                }
                float f = ((jLongValue - caeVar.E) % 1800) / 1800.0f;
                for (int i12 = 0; i12 < 3; i12++) {
                    ((hsc) list2.get(i12)).i(f < 0.6f ? (wd6.d0(((f / 0.6f) - (i12 / 3.0f)) / 0.33f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f) * 0.65f) + 0.35f : ((1.0f - ((f - 0.6f) / 0.39999998f)) * 0.65f) + 0.35f);
                }
                return ieiVar;
            case 9:
                CharSequence charSequence = (CharSequence) obj3;
                z1g z1gVar = (z1g) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int length = iIntValue + 2000;
                if (length < 0 || length > charSequence.length()) {
                    length = charSequence.length();
                }
                return z1gVar.invoke(charSequence.subSequence(iIntValue, length));
            case 10:
                dae daeVar = (dae) obj3;
                pug pugVar = (pug) obj2;
                p6i p6iVar = (p6i) obj;
                if (p6iVar instanceof pug) {
                    pug pugVar2 = (pug) p6iVar;
                    if ((pugVar2.W.H & 96) != 0 || ((w1cVar = pugVar2.Y) != null && w1cVar.e())) {
                        qvb qvbVar = (qvb) daeVar.E;
                        if (qvbVar == null) {
                            qvbVar = new qvb();
                            daeVar.E = qvbVar;
                            pugVar.o0 = qvbVar;
                        }
                        qvbVar.a(p6iVar);
                    }
                }
                return Boolean.TRUE;
            case 11:
                i4d i4dVar = (i4d) obj;
                i4dVar.getClass();
                gb9.D((l45) obj3, null, null, new o6e((xs5) obj2, i4dVar, null, 25), 3);
                return ieiVar;
            case 12:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                ((m1h) obj3).b.m0(lzeVar, (l1h) obj2);
                return ieiVar;
            case 13:
                List list3 = (List) obj3;
                c9h c9hVar = (c9h) obj2;
                j0a j0aVar2 = (j0a) obj;
                j0aVar2.getClass();
                j0a.V(j0aVar2, "top_spacer", null, yuk.a, 2);
                if (list3.isEmpty() && c9hVar != c9h.G) {
                    j0a.V(j0aVar2, "loading-spinner", null, yuk.b, 2);
                }
                j0aVar2.W(list3.size(), new zkd(new qte(i8 == true ? (byte) 1 : (byte) 0, 21), 14, list3), new wxf(list3, 1), new ta4(2039820996, true, new u8h(list3, i8 == true ? 1 : 0)));
                return ieiVar;
            case 14:
                TaskStepResponse taskStepResponse = (TaskStepResponse) obj;
                taskStepResponse.getClass();
                ((t4g) obj3).d(new TasksBottomSheetDestination.StepDetail(((TaskResponse) obj2).m450getUuidFxcw9s(), taskStepResponse.getUuid(), null));
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                List list4 = (List) obj3;
                List list5 = (List) obj2;
                b3d b3dVar = (b3d) obj;
                if (list4 != null) {
                    int size = list4.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        cpc cpcVar = (cpc) list4.get(i13);
                        b3d.j(b3dVar, (c3d) cpcVar.E, ((y69) cpcVar.F).a);
                    }
                }
                if (list5 != null) {
                    int size2 = list5.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        cpc cpcVar2 = (cpc) list5.get(i14);
                        c3d c3dVar = (c3d) cpcVar2.E;
                        zy7 zy7Var = (zy7) cpcVar2.F;
                        b3d.j(b3dVar, c3dVar, zy7Var != null ? ((y69) zy7Var.a()).a : 0L);
                    }
                }
                return ieiVar;
            case 16:
                pz7 pz7Var = (pz7) obj3;
                zy7 zy7Var2 = (zy7) obj2;
                v7 v7Var = (v7) obj;
                v7Var.getClass();
                int iOrdinal3 = v7Var.ordinal();
                if (iOrdinal3 == 0) {
                    pz7Var.invoke(Boolean.TRUE, null);
                    zy7Var2.a();
                } else if (iOrdinal3 == 1) {
                    pz7Var.invoke(Boolean.FALSE, "switched_account");
                } else {
                    if (iOrdinal3 != 2) {
                        wg6.i();
                        return null;
                    }
                    pz7Var.invoke(Boolean.FALSE, "overlay_dismissed");
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                hhi hhiVar = (hhi) obj3;
                ((Long) obj).getClass();
                float f2 = hhiVar.e;
                hhiVar.e = MTTypesetterKt.kLineSkipLimitMultiplier;
                ((bz7) obj2).invoke(Float.valueOf(f2));
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                r4g r4gVar = (r4g) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((cji) obj3).n.setValue(null);
                if (zBooleanValue) {
                    r4gVar.a();
                }
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                lze lzeVar2 = (lze) obj;
                lzeVar2.getClass();
                ((jgj) obj3).b.m0(lzeVar2, (igj) obj2);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                lze lzeVar3 = (lze) obj;
                lzeVar3.getClass();
                ((lgj) obj3).b.m0(lzeVar3, (kgj) obj2);
                return ieiVar;
            case 21:
                zfj zfjVar = (zfj) obj3;
                String str = (String) obj2;
                lze lzeVar4 = (lze) obj;
                lzeVar4.getClass();
                tze tzeVarL0 = lzeVar4.L0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    tzeVarL0.o(1, cmk.w(zfjVar));
                    tzeVarL0.N(2, str);
                    tzeVarL0.H0();
                    int iC = v40.C(lzeVar4);
                    tzeVarL0.close();
                    return Integer.valueOf(iC);
                } finally {
                }
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                String str2 = (String) obj3;
                ahj ahjVar = (ahj) obj2;
                lze lzeVar5 = (lze) obj;
                lzeVar5.getClass();
                tze tzeVarL02 = lzeVar5.L0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    tzeVarL02.N(1, str2);
                    bp0 bp0Var = new bp0(0);
                    bp0 bp0Var2 = new bp0(0);
                    while (tzeVarL02.H0()) {
                        String strG0 = tzeVarL02.g0(0);
                        if (!bp0Var.containsKey(strG0)) {
                            bp0Var.put(strG0, new ArrayList());
                        }
                        String strG02 = tzeVarL02.g0(0);
                        if (!bp0Var2.containsKey(strG02)) {
                            bp0Var2.put(strG02, new ArrayList());
                        }
                    }
                    tzeVarL02.reset();
                    ahjVar.b(lzeVar5, bp0Var);
                    ahjVar.a(lzeVar5, bp0Var2);
                    ArrayList arrayList = new ArrayList();
                    while (tzeVarL02.H0()) {
                        String strG03 = tzeVarL02.g0(0);
                        zfj zfjVarP = cmk.p((int) tzeVarL02.getLong(1));
                        byte[] blob = tzeVarL02.getBlob(2);
                        pf5 pf5Var = pf5.b;
                        pf5 pf5VarJ = rvk.j(blob);
                        int i15 = (int) tzeVarL02.getLong(i7);
                        int i16 = (int) tzeVarL02.getLong(4);
                        long j = tzeVarL02.getLong(i6);
                        long j2 = tzeVarL02.getLong(15);
                        long j3 = tzeVarL02.getLong(16);
                        jc1 jc1VarM = cmk.m((int) tzeVarL02.getLong(17));
                        long j4 = tzeVarL02.getLong(18);
                        long j5 = tzeVarL02.getLong(19);
                        int i17 = (int) tzeVarL02.getLong(20);
                        long j6 = tzeVarL02.getLong(i2);
                        int i18 = (int) tzeVarL02.getLong(22);
                        ql4 ql4Var = new ql4(cmk.x(tzeVarL02.getBlob(i3)), cmk.n((int) tzeVarL02.getLong(i4)), ((int) tzeVarL02.getLong(7)) != 0, ((int) tzeVarL02.getLong(8)) != 0, ((int) tzeVarL02.getLong(9)) != 0, ((int) tzeVarL02.getLong(10)) != 0, tzeVarL02.getLong(11), tzeVarL02.getLong(12), cmk.h(tzeVarL02.getBlob(13)));
                        Object objF0 = sta.f0(tzeVarL02.g0(0), bp0Var);
                        objF0.getClass();
                        List list6 = (List) objF0;
                        Object objF02 = sta.f0(tzeVarL02.g0(0), bp0Var2);
                        objF02.getClass();
                        arrayList.add(new sgj(strG03, zfjVarP, pf5VarJ, j, j2, j3, ql4Var, i15, jc1VarM, j4, j5, i17, i16, j6, i18, list6, (List) objF02));
                        i2 = 21;
                        i3 = 6;
                        i4 = 5;
                        i6 = 14;
                        i7 = 3;
                        break;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                pf5 pf5Var2 = (pf5) obj3;
                String str3 = (String) obj2;
                lze lzeVar6 = (lze) obj;
                lzeVar6.getClass();
                tze tzeVarL03 = lzeVar6.L0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    pf5 pf5Var3 = pf5.b;
                    tzeVarL03.p(rvk.o(pf5Var2), 1);
                    tzeVarL03.N(2, str3);
                    tzeVarL03.H0();
                    return ieiVar;
                } finally {
                }
            case 24:
                lze lzeVar7 = (lze) obj;
                lzeVar7.getClass();
                ((ahj) obj3).b.m0(lzeVar7, (tgj) obj2);
                return ieiVar;
            default:
                lze lzeVar8 = (lze) obj;
                lzeVar8.getClass();
                ((chj) obj3).b.m0(lzeVar8, (bhj) obj2);
                return ieiVar;
        }
    }
}
