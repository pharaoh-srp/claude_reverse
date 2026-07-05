package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hdj implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ hdj(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        tze tzeVarL0;
        Integer numValueOf;
        Boolean boolValueOf;
        Integer numValueOf2;
        Boolean boolValueOf2;
        boolean z;
        Integer numValueOf3;
        Boolean boolValueOf3;
        switch (this.E) {
            case 0:
                return ((gdj) obj).g;
            case 1:
                return ((gdj) obj).f;
            case 2:
                return ((gdj) obj).c;
            case 3:
                return ((gdj) obj).e;
            case 4:
                tdj tdjVar = (tdj) obj;
                tdjVar.getClass();
                return tdjVar;
            case 5:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                tzeVarL0 = lzeVar.L0("DELETE FROM WorkProgress");
                try {
                    tzeVarL0.H0();
                    tzeVarL0.close();
                    return iei.a;
                } finally {
                }
            case 6:
                lze lzeVar2 = (lze) obj;
                lzeVar2.getClass();
                tzeVarL0 = lzeVar2.L0("SELECT * FROM workspec WHERE state=1");
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
                        int i = iV14;
                        int i2 = iV13;
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
                        int i3 = (int) tzeVarL0.getLong(iV10);
                        int i4 = iV4;
                        int i5 = iV3;
                        jc1 jc1VarM = cmk.m((int) tzeVarL0.getLong(iV11));
                        long j4 = tzeVarL0.getLong(iV12);
                        long j5 = tzeVarL0.getLong(i2);
                        long j6 = tzeVarL0.getLong(i);
                        int i6 = iV15;
                        long j7 = tzeVarL0.getLong(i6);
                        iV15 = i6;
                        int i7 = iV16;
                        int i8 = iV2;
                        boolean z2 = ((int) tzeVarL0.getLong(i7)) != 0;
                        int i9 = iV17;
                        int i10 = iV;
                        xkc xkcVarO = cmk.o((int) tzeVarL0.getLong(i9));
                        int i11 = iV18;
                        int i12 = (int) tzeVarL0.getLong(i11);
                        int i13 = iV19;
                        int i14 = (int) tzeVarL0.getLong(i13);
                        int i15 = iV20;
                        long j8 = tzeVarL0.getLong(i15);
                        int i16 = iV21;
                        int i17 = (int) tzeVarL0.getLong(i16);
                        iV21 = i16;
                        int i18 = iV22;
                        int i19 = (int) tzeVarL0.getLong(i18);
                        int i20 = iV23;
                        String strG04 = tzeVarL0.isNull(i20) ? null : tzeVarL0.g0(i20);
                        int i21 = iV24;
                        if (tzeVarL0.isNull(i21)) {
                            iV23 = i20;
                            iV22 = i18;
                            numValueOf = null;
                        } else {
                            iV23 = i20;
                            iV22 = i18;
                            numValueOf = Integer.valueOf((int) tzeVarL0.getLong(i21));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i22 = iV25;
                        t1c t1cVarN = cmk.n((int) tzeVarL0.getLong(i22));
                        int i23 = iV26;
                        k1c k1cVarX = cmk.x(tzeVarL0.getBlob(i23));
                        int i24 = iV27;
                        boolean z3 = ((int) tzeVarL0.getLong(i24)) != 0;
                        int i25 = iV28;
                        boolean z4 = ((int) tzeVarL0.getLong(i25)) != 0;
                        int i26 = iV29;
                        boolean z5 = ((int) tzeVarL0.getLong(i26)) != 0;
                        iV29 = i26;
                        int i27 = iV30;
                        int i28 = iV31;
                        int i29 = iV32;
                        iV31 = i28;
                        int i30 = iV33;
                        arrayList.add(new tgj(strG0, zfjVarP, strG02, strG03, pf5VarJ, pf5VarJ2, j, j2, j3, new ql4(k1cVarX, t1cVarN, z3, z4, z5, ((int) tzeVarL0.getLong(i27)) != 0, tzeVarL0.getLong(i28), tzeVarL0.getLong(i29), cmk.h(tzeVarL0.getBlob(i30))), i3, jc1VarM, j4, j5, j6, j7, z2, xkcVarO, i12, i14, j8, i17, i19, strG04, boolValueOf));
                        iV28 = i25;
                        iV = i10;
                        iV17 = i9;
                        iV18 = i11;
                        iV19 = i13;
                        iV20 = i15;
                        iV24 = i21;
                        iV25 = i22;
                        iV26 = i23;
                        iV27 = i24;
                        iV33 = i30;
                        iV32 = i29;
                        iV30 = i27;
                        iV3 = i5;
                        iV2 = i8;
                        iV13 = i2;
                        iV14 = i;
                        iV4 = i4;
                        iV16 = i7;
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 7:
                lze lzeVar3 = (lze) obj;
                lzeVar3.getClass();
                tzeVarL0 = lzeVar3.L0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int iV34 = iv1.v(tzeVarL0, "id");
                    int iV35 = iv1.v(tzeVarL0, "state");
                    int iV36 = iv1.v(tzeVarL0, "worker_class_name");
                    int iV37 = iv1.v(tzeVarL0, "input_merger_class_name");
                    int iV38 = iv1.v(tzeVarL0, "input");
                    int iV39 = iv1.v(tzeVarL0, "output");
                    int iV40 = iv1.v(tzeVarL0, "initial_delay");
                    int iV41 = iv1.v(tzeVarL0, "interval_duration");
                    int iV42 = iv1.v(tzeVarL0, "flex_duration");
                    int iV43 = iv1.v(tzeVarL0, "run_attempt_count");
                    int iV44 = iv1.v(tzeVarL0, "backoff_policy");
                    int iV45 = iv1.v(tzeVarL0, "backoff_delay_duration");
                    int iV46 = iv1.v(tzeVarL0, "last_enqueue_time");
                    int iV47 = iv1.v(tzeVarL0, "minimum_retention_duration");
                    int iV48 = iv1.v(tzeVarL0, "schedule_requested_at");
                    int iV49 = iv1.v(tzeVarL0, "run_in_foreground");
                    int iV50 = iv1.v(tzeVarL0, "out_of_quota_policy");
                    int iV51 = iv1.v(tzeVarL0, "period_count");
                    int iV52 = iv1.v(tzeVarL0, "generation");
                    int iV53 = iv1.v(tzeVarL0, "next_schedule_time_override");
                    int iV54 = iv1.v(tzeVarL0, "next_schedule_time_override_generation");
                    int iV55 = iv1.v(tzeVarL0, "stop_reason");
                    int iV56 = iv1.v(tzeVarL0, "trace_tag");
                    int iV57 = iv1.v(tzeVarL0, "backoff_on_system_interruptions");
                    int iV58 = iv1.v(tzeVarL0, "required_network_type");
                    int iV59 = iv1.v(tzeVarL0, "required_network_request");
                    int iV60 = iv1.v(tzeVarL0, "requires_charging");
                    int iV61 = iv1.v(tzeVarL0, "requires_device_idle");
                    int iV62 = iv1.v(tzeVarL0, "requires_battery_not_low");
                    int iV63 = iv1.v(tzeVarL0, "requires_storage_not_low");
                    int iV64 = iv1.v(tzeVarL0, "trigger_content_update_delay");
                    int iV65 = iv1.v(tzeVarL0, "trigger_max_content_delay");
                    int iV66 = iv1.v(tzeVarL0, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (tzeVarL0.H0()) {
                        String strG05 = tzeVarL0.g0(iV34);
                        int i31 = iV47;
                        int i32 = iV46;
                        zfj zfjVarP2 = cmk.p((int) tzeVarL0.getLong(iV35));
                        String strG06 = tzeVarL0.g0(iV36);
                        String strG07 = tzeVarL0.g0(iV37);
                        byte[] blob2 = tzeVarL0.getBlob(iV38);
                        pf5 pf5Var2 = pf5.b;
                        pf5 pf5VarJ3 = rvk.j(blob2);
                        pf5 pf5VarJ4 = rvk.j(tzeVarL0.getBlob(iV39));
                        long j9 = tzeVarL0.getLong(iV40);
                        long j10 = tzeVarL0.getLong(iV41);
                        long j11 = tzeVarL0.getLong(iV42);
                        int i33 = (int) tzeVarL0.getLong(iV43);
                        int i34 = iV37;
                        int i35 = iV36;
                        jc1 jc1VarM2 = cmk.m((int) tzeVarL0.getLong(iV44));
                        long j12 = tzeVarL0.getLong(iV45);
                        long j13 = tzeVarL0.getLong(i32);
                        long j14 = tzeVarL0.getLong(i31);
                        int i36 = iV48;
                        long j15 = tzeVarL0.getLong(i36);
                        int i37 = iV35;
                        int i38 = iV49;
                        boolean z6 = ((int) tzeVarL0.getLong(i38)) != 0;
                        int i39 = iV50;
                        int i40 = iV34;
                        xkc xkcVarO2 = cmk.o((int) tzeVarL0.getLong(i39));
                        iV49 = i38;
                        int i41 = iV51;
                        int i42 = (int) tzeVarL0.getLong(i41);
                        iV51 = i41;
                        int i43 = iV52;
                        int i44 = (int) tzeVarL0.getLong(i43);
                        int i45 = iV53;
                        long j16 = tzeVarL0.getLong(i45);
                        int i46 = iV54;
                        int i47 = (int) tzeVarL0.getLong(i46);
                        iV54 = i46;
                        int i48 = iV55;
                        int i49 = (int) tzeVarL0.getLong(i48);
                        int i50 = iV56;
                        String strG08 = tzeVarL0.isNull(i50) ? null : tzeVarL0.g0(i50);
                        int i51 = iV57;
                        if (tzeVarL0.isNull(i51)) {
                            iV56 = i50;
                            iV55 = i48;
                            numValueOf2 = null;
                        } else {
                            iV56 = i50;
                            iV55 = i48;
                            numValueOf2 = Integer.valueOf((int) tzeVarL0.getLong(i51));
                        }
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i52 = iV58;
                        t1c t1cVarN2 = cmk.n((int) tzeVarL0.getLong(i52));
                        int i53 = iV59;
                        k1c k1cVarX2 = cmk.x(tzeVarL0.getBlob(i53));
                        int i54 = iV60;
                        boolean z7 = ((int) tzeVarL0.getLong(i54)) != 0;
                        int i55 = iV61;
                        boolean z8 = ((int) tzeVarL0.getLong(i55)) != 0;
                        int i56 = iV62;
                        boolean z9 = ((int) tzeVarL0.getLong(i56)) != 0;
                        iV62 = i56;
                        int i57 = iV63;
                        int i58 = iV64;
                        int i59 = iV65;
                        iV64 = i58;
                        int i60 = iV66;
                        arrayList2.add(new tgj(strG05, zfjVarP2, strG06, strG07, pf5VarJ3, pf5VarJ4, j9, j10, j11, new ql4(k1cVarX2, t1cVarN2, z7, z8, z9, ((int) tzeVarL0.getLong(i57)) != 0, tzeVarL0.getLong(i58), tzeVarL0.getLong(i59), cmk.h(tzeVarL0.getBlob(i60))), i33, jc1VarM2, j12, j13, j14, j15, z6, xkcVarO2, i42, i44, j16, i47, i49, strG08, boolValueOf2));
                        iV61 = i55;
                        iV34 = i40;
                        iV50 = i39;
                        iV52 = i43;
                        iV53 = i45;
                        iV57 = i51;
                        iV58 = i52;
                        iV59 = i53;
                        iV60 = i54;
                        iV66 = i60;
                        iV65 = i59;
                        iV63 = i57;
                        iV47 = i31;
                        iV36 = i35;
                        iV37 = i34;
                        iV35 = i37;
                        iV48 = i36;
                        iV46 = i32;
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 8:
                lze lzeVar4 = (lze) obj;
                lzeVar4.getClass();
                tzeVarL0 = lzeVar4.L0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (tzeVarL0.H0()) {
                        z = false;
                        if (((int) tzeVarL0.getLong(0)) != 0) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    tzeVarL0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 9:
                lze lzeVar5 = (lze) obj;
                lzeVar5.getClass();
                tzeVarL0 = lzeVar5.L0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    tzeVarL0.o(1, 200L);
                    int iV67 = iv1.v(tzeVarL0, "id");
                    int iV68 = iv1.v(tzeVarL0, "state");
                    int iV69 = iv1.v(tzeVarL0, "worker_class_name");
                    int iV70 = iv1.v(tzeVarL0, "input_merger_class_name");
                    int iV71 = iv1.v(tzeVarL0, "input");
                    int iV72 = iv1.v(tzeVarL0, "output");
                    int iV73 = iv1.v(tzeVarL0, "initial_delay");
                    int iV74 = iv1.v(tzeVarL0, "interval_duration");
                    int iV75 = iv1.v(tzeVarL0, "flex_duration");
                    int iV76 = iv1.v(tzeVarL0, "run_attempt_count");
                    int iV77 = iv1.v(tzeVarL0, "backoff_policy");
                    int iV78 = iv1.v(tzeVarL0, "backoff_delay_duration");
                    int iV79 = iv1.v(tzeVarL0, "last_enqueue_time");
                    int iV80 = iv1.v(tzeVarL0, "minimum_retention_duration");
                    int iV81 = iv1.v(tzeVarL0, "schedule_requested_at");
                    int iV82 = iv1.v(tzeVarL0, "run_in_foreground");
                    int iV83 = iv1.v(tzeVarL0, "out_of_quota_policy");
                    int iV84 = iv1.v(tzeVarL0, "period_count");
                    int iV85 = iv1.v(tzeVarL0, "generation");
                    int iV86 = iv1.v(tzeVarL0, "next_schedule_time_override");
                    int iV87 = iv1.v(tzeVarL0, "next_schedule_time_override_generation");
                    int iV88 = iv1.v(tzeVarL0, "stop_reason");
                    int iV89 = iv1.v(tzeVarL0, "trace_tag");
                    int iV90 = iv1.v(tzeVarL0, "backoff_on_system_interruptions");
                    int iV91 = iv1.v(tzeVarL0, "required_network_type");
                    int iV92 = iv1.v(tzeVarL0, "required_network_request");
                    int iV93 = iv1.v(tzeVarL0, "requires_charging");
                    int iV94 = iv1.v(tzeVarL0, "requires_device_idle");
                    int iV95 = iv1.v(tzeVarL0, "requires_battery_not_low");
                    int iV96 = iv1.v(tzeVarL0, "requires_storage_not_low");
                    int iV97 = iv1.v(tzeVarL0, "trigger_content_update_delay");
                    int iV98 = iv1.v(tzeVarL0, "trigger_max_content_delay");
                    int iV99 = iv1.v(tzeVarL0, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (tzeVarL0.H0()) {
                        String strG09 = tzeVarL0.g0(iV67);
                        int i61 = iV79;
                        int i62 = iV80;
                        zfj zfjVarP3 = cmk.p((int) tzeVarL0.getLong(iV68));
                        String strG010 = tzeVarL0.g0(iV69);
                        String strG011 = tzeVarL0.g0(iV70);
                        byte[] blob3 = tzeVarL0.getBlob(iV71);
                        pf5 pf5Var3 = pf5.b;
                        pf5 pf5VarJ5 = rvk.j(blob3);
                        pf5 pf5VarJ6 = rvk.j(tzeVarL0.getBlob(iV72));
                        long j17 = tzeVarL0.getLong(iV73);
                        long j18 = tzeVarL0.getLong(iV74);
                        long j19 = tzeVarL0.getLong(iV75);
                        int i63 = (int) tzeVarL0.getLong(iV76);
                        int i64 = iV70;
                        int i65 = iV69;
                        jc1 jc1VarM3 = cmk.m((int) tzeVarL0.getLong(iV77));
                        long j20 = tzeVarL0.getLong(iV78);
                        long j21 = tzeVarL0.getLong(i61);
                        long j22 = tzeVarL0.getLong(i62);
                        int i66 = iV81;
                        long j23 = tzeVarL0.getLong(i66);
                        int i67 = iV68;
                        int i68 = iV82;
                        boolean z10 = ((int) tzeVarL0.getLong(i68)) != 0;
                        int i69 = iV83;
                        int i70 = iV67;
                        xkc xkcVarO3 = cmk.o((int) tzeVarL0.getLong(i69));
                        iV82 = i68;
                        int i71 = iV84;
                        int i72 = (int) tzeVarL0.getLong(i71);
                        iV84 = i71;
                        int i73 = iV85;
                        int i74 = (int) tzeVarL0.getLong(i73);
                        int i75 = iV86;
                        long j24 = tzeVarL0.getLong(i75);
                        int i76 = iV87;
                        int i77 = (int) tzeVarL0.getLong(i76);
                        iV87 = i76;
                        int i78 = iV88;
                        int i79 = (int) tzeVarL0.getLong(i78);
                        int i80 = iV89;
                        String strG012 = tzeVarL0.isNull(i80) ? null : tzeVarL0.g0(i80);
                        int i81 = iV90;
                        if (tzeVarL0.isNull(i81)) {
                            iV89 = i80;
                            iV88 = i78;
                            numValueOf3 = null;
                        } else {
                            iV89 = i80;
                            iV88 = i78;
                            numValueOf3 = Integer.valueOf((int) tzeVarL0.getLong(i81));
                        }
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        int i82 = iV91;
                        t1c t1cVarN3 = cmk.n((int) tzeVarL0.getLong(i82));
                        int i83 = iV92;
                        k1c k1cVarX3 = cmk.x(tzeVarL0.getBlob(i83));
                        int i84 = iV93;
                        boolean z11 = ((int) tzeVarL0.getLong(i84)) != 0;
                        int i85 = iV94;
                        boolean z12 = ((int) tzeVarL0.getLong(i85)) != 0;
                        int i86 = iV95;
                        boolean z13 = ((int) tzeVarL0.getLong(i86)) != 0;
                        iV95 = i86;
                        int i87 = iV96;
                        int i88 = iV97;
                        int i89 = iV98;
                        iV97 = i88;
                        int i90 = iV99;
                        arrayList3.add(new tgj(strG09, zfjVarP3, strG010, strG011, pf5VarJ5, pf5VarJ6, j17, j18, j19, new ql4(k1cVarX3, t1cVarN3, z11, z12, z13, ((int) tzeVarL0.getLong(i87)) != 0, tzeVarL0.getLong(i88), tzeVarL0.getLong(i89), cmk.h(tzeVarL0.getBlob(i90))), i63, jc1VarM3, j20, j21, j22, j23, z10, xkcVarO3, i72, i74, j24, i77, i79, strG012, boolValueOf3));
                        iV94 = i85;
                        iV67 = i70;
                        iV83 = i69;
                        iV85 = i73;
                        iV86 = i75;
                        iV90 = i81;
                        iV91 = i82;
                        iV92 = i83;
                        iV93 = i84;
                        iV99 = i90;
                        iV98 = i89;
                        iV96 = i87;
                        iV79 = i61;
                        iV69 = i65;
                        iV70 = i64;
                        iV68 = i67;
                        iV81 = i66;
                        iV80 = i62;
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            default:
                lze lzeVar6 = (lze) obj;
                lzeVar6.getClass();
                tzeVarL0 = lzeVar6.L0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    tzeVarL0.H0();
                    int iC = v40.C(lzeVar6);
                    tzeVarL0.close();
                    return Integer.valueOf(iC);
                } finally {
                }
        }
    }
}
