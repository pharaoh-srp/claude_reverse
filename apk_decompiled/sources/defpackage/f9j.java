package defpackage;

import java.util.ArrayList;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f9j implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ f9j(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        tze tzeVarL0;
        int i;
        int i2;
        Integer numValueOf;
        int i3 = this.E;
        zua zuaVar = eva.F;
        switch (i3) {
            case 0:
                fva fvaVar = (fva) obj;
                fvaVar.getClass();
                return new cpc(Double.valueOf(fvaVar.a(zuaVar)), "kg");
            case 1:
                fva fvaVar2 = (fva) obj;
                fvaVar2.getClass();
                return new cpc(Double.valueOf(fvaVar2.a(zuaVar)), "kg");
            case 2:
                fva fvaVar3 = (fva) obj;
                fvaVar3.getClass();
                return new cpc(Double.valueOf(fvaVar3.a(zuaVar)), "kg");
            case 3:
                return new cpc(Double.valueOf(((Long) obj).longValue()), "count");
            case 4:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iV = iv1.v(tzeVarL0, "id");
                    int iV2 = iv1.v(tzeVarL0, "state");
                    int iV3 = iv1.v(tzeVarL0, "worker_class_name");
                    int iV4 = iv1.v(tzeVarL0, "input_merger_class_name");
                    int iV5 = iv1.v(tzeVarL0, "input");
                    int iV6 = iv1.v(tzeVarL0, "output");
                    int iV7 = iv1.v(tzeVarL0, "initial_delay");
                    int iV8 = iv1.v(tzeVarL0, "interval_duration");
                    int iV9 = iv1.v(tzeVarL0, "flex_duration");
                    int iV10 = iv1.v(tzeVarL0, "run_attempt_count");
                    int iV11 = iv1.v(tzeVarL0, "backoff_policy");
                    int iV12 = iv1.v(tzeVarL0, "backoff_delay_duration");
                    int iV13 = iv1.v(tzeVarL0, "last_enqueue_time");
                    int iV14 = iv1.v(tzeVarL0, "minimum_retention_duration");
                    int iV15 = iv1.v(tzeVarL0, "schedule_requested_at");
                    int iV16 = iv1.v(tzeVarL0, "run_in_foreground");
                    int iV17 = iv1.v(tzeVarL0, "out_of_quota_policy");
                    int iV18 = iv1.v(tzeVarL0, "period_count");
                    int iV19 = iv1.v(tzeVarL0, "generation");
                    int iV20 = iv1.v(tzeVarL0, "next_schedule_time_override");
                    int iV21 = iv1.v(tzeVarL0, "next_schedule_time_override_generation");
                    int iV22 = iv1.v(tzeVarL0, "stop_reason");
                    int iV23 = iv1.v(tzeVarL0, "trace_tag");
                    int iV24 = iv1.v(tzeVarL0, "backoff_on_system_interruptions");
                    int iV25 = iv1.v(tzeVarL0, "required_network_type");
                    int iV26 = iv1.v(tzeVarL0, "required_network_request");
                    int iV27 = iv1.v(tzeVarL0, "requires_charging");
                    int iV28 = iv1.v(tzeVarL0, "requires_device_idle");
                    int iV29 = iv1.v(tzeVarL0, "requires_battery_not_low");
                    int iV30 = iv1.v(tzeVarL0, "requires_storage_not_low");
                    int iV31 = iv1.v(tzeVarL0, "trigger_content_update_delay");
                    int iV32 = iv1.v(tzeVarL0, "trigger_max_content_delay");
                    int iV33 = iv1.v(tzeVarL0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (tzeVarL0.H0()) {
                        String strG0 = tzeVarL0.g0(iV);
                        int i4 = iV;
                        ArrayList arrayList2 = arrayList;
                        zfj zfjVarP = cmk.p((int) tzeVarL0.getLong(iV2));
                        String strG02 = tzeVarL0.g0(iV3);
                        String strG03 = tzeVarL0.g0(iV4);
                        byte[] blob = tzeVarL0.getBlob(iV5);
                        pf5 pf5Var = pf5.b;
                        pf5 pf5VarJ = rvk.j(blob);
                        pf5 pf5VarJ2 = rvk.j(tzeVarL0.getBlob(iV6));
                        long j = tzeVarL0.getLong(iV7);
                        long j2 = tzeVarL0.getLong(iV8);
                        long j3 = tzeVarL0.getLong(iV9);
                        int i5 = (int) tzeVarL0.getLong(iV10);
                        jc1 jc1VarM = cmk.m((int) tzeVarL0.getLong(iV11));
                        long j4 = tzeVarL0.getLong(iV12);
                        long j5 = tzeVarL0.getLong(iV13);
                        long j6 = tzeVarL0.getLong(iV14);
                        int i6 = iV15;
                        long j7 = tzeVarL0.getLong(i6);
                        int i7 = iV2;
                        int i8 = iV16;
                        int i9 = iV3;
                        boolean z = ((int) tzeVarL0.getLong(i8)) != 0;
                        int i10 = iV17;
                        int i11 = iV4;
                        xkc xkcVarO = cmk.o((int) tzeVarL0.getLong(i10));
                        int i12 = iV18;
                        int i13 = (int) tzeVarL0.getLong(i12);
                        int i14 = iV19;
                        int i15 = (int) tzeVarL0.getLong(i14);
                        long j8 = tzeVarL0.getLong(iV20);
                        int i16 = iV21;
                        int i17 = (int) tzeVarL0.getLong(i16);
                        int i18 = iV22;
                        int i19 = (int) tzeVarL0.getLong(i18);
                        int i20 = iV23;
                        Boolean boolValueOf = null;
                        String strG04 = tzeVarL0.isNull(i20) ? null : tzeVarL0.g0(i20);
                        int i21 = iV24;
                        if (tzeVarL0.isNull(i21)) {
                            i = i17;
                            i2 = i18;
                            numValueOf = null;
                        } else {
                            i = i17;
                            i2 = i18;
                            numValueOf = Integer.valueOf((int) tzeVarL0.getLong(i21));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        iV24 = i21;
                        int i22 = iV25;
                        Boolean bool = boolValueOf;
                        t1c t1cVarN = cmk.n((int) tzeVarL0.getLong(i22));
                        int i23 = iV26;
                        k1c k1cVarX = cmk.x(tzeVarL0.getBlob(i23));
                        iV25 = i22;
                        int i24 = iV27;
                        boolean z2 = ((int) tzeVarL0.getLong(i24)) != 0;
                        iV27 = i24;
                        int i25 = iV28;
                        boolean z3 = ((int) tzeVarL0.getLong(i25)) != 0;
                        iV28 = i25;
                        int i26 = iV29;
                        boolean z4 = ((int) tzeVarL0.getLong(i26)) != 0;
                        iV29 = i26;
                        int i27 = iV30;
                        int i28 = iV31;
                        int i29 = iV32;
                        iV31 = i28;
                        int i30 = iV33;
                        tgj tgjVar = new tgj(strG0, zfjVarP, strG02, strG03, pf5VarJ, pf5VarJ2, j, j2, j3, new ql4(k1cVarX, t1cVarN, z2, z3, z4, ((int) tzeVarL0.getLong(i27)) != 0, tzeVarL0.getLong(i28), tzeVarL0.getLong(i29), cmk.h(tzeVarL0.getBlob(i30))), i5, jc1VarM, j4, j5, j6, j7, z, xkcVarO, i13, i15, j8, i, i19, strG04, bool);
                        iV33 = i30;
                        iV32 = i29;
                        arrayList = arrayList2;
                        arrayList.add(tgjVar);
                        iV30 = i27;
                        iV = i4;
                        iV2 = i7;
                        iV15 = i6;
                        iV4 = i11;
                        iV17 = i10;
                        iV19 = i14;
                        iV21 = i16;
                        iV22 = i2;
                        iV23 = i20;
                        iV26 = i23;
                        iV3 = i9;
                        iV16 = i8;
                        iV18 = i12;
                        break;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 5:
                lze lzeVar2 = (lze) obj;
                lzeVar2.getClass();
                tzeVarL0 = lzeVar2.L0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i31 = tzeVarL0.H0() ? (int) tzeVarL0.getLong(0) : 0;
                    tzeVarL0.close();
                    return Integer.valueOf(i31);
                } finally {
                    tzeVarL0.close();
                }
            case 6:
                zj6 zj6Var = (zj6) obj;
                zj6Var.getClass();
                String nodeName = ((Node) zj6Var.F).getNodeName();
                nodeName.getClass();
                return Boolean.valueOf(nodeName.equals("item"));
            default:
                ((sjj) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
