package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j10 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;

    public /* synthetic */ j10(long j, int i) {
        this.E = i;
        this.F = j;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        int i;
        int i2;
        Integer numValueOf;
        int i3 = this.E;
        iei ieiVar = iei.a;
        long j = this.F;
        switch (i3) {
            case 0:
                b52 b52Var = (b52) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (b52Var.E.g() >> 32)) / 2.0f;
                return b52Var.b(new k10(fIntBitsToFloat, rqk.i(b52Var, fIntBitsToFloat), new hr1(j, 5), 0));
            case 1:
                ((ekf) obj).a(hif.a, new gif(te8.E, this.F, fif.F, true));
                return ieiVar;
            case 2:
                cv9 cv9Var = (cv9) obj;
                cv9Var.getClass();
                cv9Var.a();
                cv9Var.M(this.F, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cv9Var.E.g() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), (504 & 8) != 0 ? 0.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (504 & 16) != 0 ? 0 : 0);
                return ieiVar;
            case 3:
                cv9 cv9Var2 = (cv9) obj;
                cv9Var2.getClass();
                cv9Var2.a();
                ib2 ib2Var = cv9Var2.E;
                cv9Var2.M(this.F, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ib2Var.g() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)))) & 4294967295L), (504 & 8) != 0 ? 0.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (504 & 16) != 0 ? 0 : 0);
                return ieiVar;
            case 4:
                cv9 cv9Var3 = (cv9) obj;
                cv9Var3.getClass();
                cv9Var3.a();
                cv9Var3.M(this.F, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cv9Var3.E.g() & 4294967295L))))), (504 & 8) != 0 ? 0.0f : cv9Var3.q0(1.0f), (504 & 16) != 0 ? 0 : 0);
                return ieiVar;
            case 5:
                h5b h5bVar = (h5b) obj;
                h5bVar.getClass();
                return h5bVar.u(j);
            case 6:
                b52 b52Var2 = (b52) obj;
                b52Var2.getClass();
                return b52Var2.a(new tl8(24, new w0e(x44.X(new d54(d54.b(0.2f, j)), new d54(d54.g)), null, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (b52Var2.E.g() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (b52Var2.E.g() & 4294967295L)))) & 4294967295L), Float.intBitsToFloat((int) (b52Var2.E.g() & 4294967295L)) * 0.6f, 0)));
            case 7:
                b52 b52Var3 = (b52) obj;
                b52Var3.getClass();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (b52Var3.E.g() & 4294967295L)) / 2.0f;
                float density = b52Var3.getDensity() * 8.0f;
                c40 c40VarA = f40.a();
                c40VarA.g(MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat2);
                float f = 0.0f;
                while (f < Float.intBitsToFloat((int) (b52Var3.E.g() >> 32))) {
                    float f2 = f + density;
                    float f3 = density * 2.0f;
                    float f4 = f % f3;
                    if (f4 != MTTypesetterKt.kLineSkipLimitMultiplier && Math.signum(f4) != Math.signum(f3)) {
                        f4 += f3;
                    }
                    c40VarA.a.quadTo((density / 2.0f) + f, (f4 < density ? -fIntBitsToFloat2 : fIntBitsToFloat2) + fIntBitsToFloat2, f2, fIntBitsToFloat2);
                    f = f2;
                }
                return b52Var3.a(new mf5(c40VarA, this.F, new ksg(b52Var3.getDensity() * 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1, 0, null, 26), 2));
            default:
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                tze tzeVarL0 = lzeVar.L0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    tzeVarL0.o(1, j);
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
                        int i4 = iV12;
                        int i5 = iV13;
                        zfj zfjVarP = cmk.p((int) tzeVarL0.getLong(iV2));
                        String strG02 = tzeVarL0.g0(iV3);
                        String strG03 = tzeVarL0.g0(iV4);
                        byte[] blob = tzeVarL0.getBlob(iV5);
                        pf5 pf5Var = pf5.b;
                        pf5 pf5VarJ = rvk.j(blob);
                        pf5 pf5VarJ2 = rvk.j(tzeVarL0.getBlob(iV6));
                        long j2 = tzeVarL0.getLong(iV7);
                        long j3 = tzeVarL0.getLong(iV8);
                        long j4 = tzeVarL0.getLong(iV9);
                        int i6 = (int) tzeVarL0.getLong(iV10);
                        int i7 = iV4;
                        int i8 = iV5;
                        jc1 jc1VarM = cmk.m((int) tzeVarL0.getLong(iV11));
                        long j5 = tzeVarL0.getLong(i4);
                        long j6 = tzeVarL0.getLong(i5);
                        long j7 = tzeVarL0.getLong(iV14);
                        int i9 = iV;
                        int i10 = iV15;
                        long j8 = tzeVarL0.getLong(i10);
                        iV15 = i10;
                        int i11 = iV14;
                        int i12 = iV16;
                        int i13 = iV2;
                        boolean z = ((int) tzeVarL0.getLong(i12)) != 0;
                        int i14 = iV17;
                        int i15 = iV3;
                        xkc xkcVarO = cmk.o((int) tzeVarL0.getLong(i14));
                        int i16 = iV18;
                        int i17 = (int) tzeVarL0.getLong(i16);
                        int i18 = iV19;
                        int i19 = (int) tzeVarL0.getLong(i18);
                        int i20 = iV20;
                        long j9 = tzeVarL0.getLong(i20);
                        int i21 = iV21;
                        int i22 = (int) tzeVarL0.getLong(i21);
                        int i23 = iV22;
                        int i24 = (int) tzeVarL0.getLong(i23);
                        int i25 = iV23;
                        Boolean boolValueOf = null;
                        String strG04 = tzeVarL0.isNull(i25) ? null : tzeVarL0.g0(i25);
                        int i26 = iV24;
                        if (tzeVarL0.isNull(i26)) {
                            i = i22;
                            i2 = i23;
                            numValueOf = null;
                        } else {
                            i = i22;
                            i2 = i23;
                            numValueOf = Integer.valueOf((int) tzeVarL0.getLong(i26));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        int i27 = iV25;
                        Boolean bool = boolValueOf;
                        t1c t1cVarN = cmk.n((int) tzeVarL0.getLong(i27));
                        int i28 = iV26;
                        k1c k1cVarX = cmk.x(tzeVarL0.getBlob(i28));
                        int i29 = iV27;
                        boolean z2 = ((int) tzeVarL0.getLong(i29)) != 0;
                        int i30 = iV28;
                        boolean z3 = ((int) tzeVarL0.getLong(i30)) != 0;
                        int i31 = iV29;
                        boolean z4 = ((int) tzeVarL0.getLong(i31)) != 0;
                        iV29 = i31;
                        int i32 = iV30;
                        int i33 = iV31;
                        int i34 = iV32;
                        int i35 = iV33;
                        arrayList.add(new tgj(strG0, zfjVarP, strG02, strG03, pf5VarJ, pf5VarJ2, j2, j3, j4, new ql4(k1cVarX, t1cVarN, z2, z3, z4, ((int) tzeVarL0.getLong(i32)) != 0, tzeVarL0.getLong(i33), tzeVarL0.getLong(i34), cmk.h(tzeVarL0.getBlob(i35))), i6, jc1VarM, j5, j6, j7, j8, z, xkcVarO, i17, i19, j9, i, i24, strG04, bool));
                        iV33 = i35;
                        iV31 = i33;
                        iV32 = i34;
                        iV12 = i4;
                        iV25 = i27;
                        iV26 = i28;
                        iV27 = i29;
                        iV = i9;
                        iV14 = i11;
                        iV2 = i13;
                        iV28 = i30;
                        iV16 = i12;
                        iV20 = i20;
                        iV21 = i21;
                        iV5 = i8;
                        iV23 = i25;
                        iV3 = i15;
                        iV17 = i14;
                        iV19 = i18;
                        iV22 = i2;
                        iV24 = i26;
                        iV30 = i32;
                        iV4 = i7;
                        iV13 = i5;
                        iV18 = i16;
                        break;
                    }
                    tzeVarL0.close();
                    return arrayList;
                } catch (Throwable th) {
                    tzeVarL0.close();
                    throw th;
                }
        }
    }
}
