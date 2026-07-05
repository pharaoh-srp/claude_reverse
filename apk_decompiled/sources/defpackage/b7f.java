package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b7f {
    public static final /* synthetic */ int a = 0;

    static {
        nga.e("Schedulers");
    }

    public static void a(ahj ahjVar, a5 a5Var, List list) {
        if (list.size() > 0) {
            a5Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ahjVar.e(jCurrentTimeMillis, ((tgj) it.next()).a);
            }
        }
    }

    public static void b(fg4 fg4Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ahj ahjVarW = workDatabase.w();
        workDatabase.b();
        try {
            cve cveVar = ahjVarW.a;
            cve cveVar2 = ahjVarW.a;
            List list2 = (List) u00.E(cveVar, true, false, new hdj(7));
            a(ahjVarW, fg4Var.d, list2);
            final int i = fg4Var.k;
            List list3 = (List) u00.E(cveVar2, true, false, new bz7() { // from class: xgj
                @Override // defpackage.bz7
                public final Object invoke(Object obj) throws Exception {
                    int i2;
                    Integer numValueOf;
                    int i3 = i;
                    lze lzeVar = (lze) obj;
                    lzeVar.getClass();
                    tze tzeVarL0 = lzeVar.L0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                    try {
                        tzeVarL0.o(1, i3);
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
                            int i4 = iV13;
                            int i5 = iV14;
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
                            int i6 = (int) tzeVarL0.getLong(iV10);
                            int i7 = iV;
                            int i8 = iV2;
                            jc1 jc1VarM = cmk.m((int) tzeVarL0.getLong(iV11));
                            long j4 = tzeVarL0.getLong(iV12);
                            long j5 = tzeVarL0.getLong(i4);
                            long j6 = tzeVarL0.getLong(i5);
                            int i9 = iV15;
                            long j7 = tzeVarL0.getLong(i9);
                            iV15 = i9;
                            int i10 = iV16;
                            int i11 = iV3;
                            boolean z = ((int) tzeVarL0.getLong(i10)) != 0;
                            int i12 = iV17;
                            int i13 = iV4;
                            xkc xkcVarO = cmk.o((int) tzeVarL0.getLong(i12));
                            int i14 = iV18;
                            int i15 = (int) tzeVarL0.getLong(i14);
                            int i16 = iV19;
                            int i17 = (int) tzeVarL0.getLong(i16);
                            int i18 = iV20;
                            long j8 = tzeVarL0.getLong(i18);
                            int i19 = iV21;
                            int i20 = (int) tzeVarL0.getLong(i19);
                            iV21 = i19;
                            int i21 = iV22;
                            int i22 = (int) tzeVarL0.getLong(i21);
                            int i23 = iV23;
                            Boolean boolValueOf = null;
                            String strG04 = tzeVarL0.isNull(i23) ? null : tzeVarL0.g0(i23);
                            int i24 = iV24;
                            if (tzeVarL0.isNull(i24)) {
                                i2 = i23;
                                iV22 = i21;
                                numValueOf = null;
                            } else {
                                i2 = i23;
                                iV22 = i21;
                                numValueOf = Integer.valueOf((int) tzeVarL0.getLong(i24));
                            }
                            if (numValueOf != null) {
                                boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                            }
                            Boolean bool = boolValueOf;
                            int i25 = iV25;
                            t1c t1cVarN = cmk.n((int) tzeVarL0.getLong(i25));
                            int i26 = iV26;
                            k1c k1cVarX = cmk.x(tzeVarL0.getBlob(i26));
                            int i27 = iV27;
                            boolean z2 = ((int) tzeVarL0.getLong(i27)) != 0;
                            int i28 = iV28;
                            boolean z3 = ((int) tzeVarL0.getLong(i28)) != 0;
                            int i29 = iV29;
                            boolean z4 = ((int) tzeVarL0.getLong(i29)) != 0;
                            iV29 = i29;
                            int i30 = iV30;
                            int i31 = iV31;
                            int i32 = iV32;
                            iV31 = i31;
                            int i33 = iV33;
                            arrayList.add(new tgj(strG0, zfjVarP, strG02, strG03, pf5VarJ, pf5VarJ2, j, j2, j3, new ql4(k1cVarX, t1cVarN, z2, z3, z4, ((int) tzeVarL0.getLong(i30)) != 0, tzeVarL0.getLong(i31), tzeVarL0.getLong(i32), cmk.h(tzeVarL0.getBlob(i33))), i6, jc1VarM, j4, j5, j6, j7, z, xkcVarO, i15, i17, j8, i20, i22, strG04, bool));
                            iV28 = i28;
                            iV4 = i13;
                            iV17 = i12;
                            iV18 = i14;
                            iV19 = i16;
                            iV20 = i18;
                            iV23 = i2;
                            iV24 = i24;
                            iV25 = i25;
                            iV26 = i26;
                            iV27 = i27;
                            iV33 = i33;
                            iV32 = i32;
                            iV30 = i30;
                            iV = i7;
                            iV3 = i11;
                            iV13 = i4;
                            iV14 = i5;
                            iV2 = i8;
                            iV16 = i10;
                        }
                        tzeVarL0.close();
                        return arrayList;
                    } catch (Throwable th) {
                        tzeVarL0.close();
                        throw th;
                    }
                }
            });
            a(ahjVarW, fg4Var.d, list3);
            list3.addAll(list2);
            List list4 = (List) u00.E(cveVar2, true, false, new hdj(9));
            workDatabase.p();
            workDatabase.f();
            if (list3.size() > 0) {
                tgj[] tgjVarArr = (tgj[]) list3.toArray(new tgj[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    x6f x6fVar = (x6f) it.next();
                    if (x6fVar.c()) {
                        x6fVar.e(tgjVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                tgj[] tgjVarArr2 = (tgj[]) list4.toArray(new tgj[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    x6f x6fVar2 = (x6f) it2.next();
                    if (!x6fVar2.c()) {
                        x6fVar2.e(tgjVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
