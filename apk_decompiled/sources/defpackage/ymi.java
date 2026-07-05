package defpackage;

import android.location.Address;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ymi implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ ymi(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = 2;
        switch (this.E) {
            case 0:
                String addressLine = ((Address) this.F).getAddressLine(((Integer) obj).intValue());
                addressLine.getClass();
                return addressLine;
            case 1:
                po4 po4Var = (po4) this.F;
                ((i90) obj).getClass();
                return po4Var;
            case 2:
                UserLocationV0OutputUserLocationResult userLocationV0OutputUserLocationResult = (UserLocationV0OutputUserLocationResult) this.F;
                ka2 ka2Var = (ka2) obj;
                ka2Var.getClass();
                CameraPosition cameraPosition = new CameraPosition(new LatLng(userLocationV0OutputUserLocationResult.getLatitude(), userLocationV0OutputUserLocationResult.getLongitude()), 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
                synchronized (ka2Var.d) {
                    n88 n88Var = (n88) ka2Var.e.getValue();
                    if (n88Var == null) {
                        ka2Var.c.setValue(cameraPosition);
                    } else {
                        n88Var.c(wvj.e(cameraPosition));
                    }
                }
                return iei.a;
            case 3:
                l5j l5jVar = (l5j) this.F;
                v4a v4aVar = (v4a) obj;
                v4aVar.getClass();
                return new g83(v4aVar, l5jVar, 2);
            default:
                ahj ahjVar = (ahj) this.F;
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                tze tzeVarL0 = lzeVar.L0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                int i2 = 1;
                try {
                    tzeVarL0.N(1, "message_queue");
                    int i3 = 0;
                    bp0 bp0Var = new bp0(0);
                    bp0 bp0Var2 = new bp0(0);
                    while (tzeVarL0.H0()) {
                        String strG0 = tzeVarL0.g0(0);
                        if (!bp0Var.containsKey(strG0)) {
                            bp0Var.put(strG0, new ArrayList());
                        }
                        String strG02 = tzeVarL0.g0(0);
                        if (!bp0Var2.containsKey(strG02)) {
                            bp0Var2.put(strG02, new ArrayList());
                        }
                    }
                    tzeVarL0.reset();
                    ahjVar.b(lzeVar, bp0Var);
                    ahjVar.a(lzeVar, bp0Var2);
                    ArrayList arrayList = new ArrayList();
                    while (tzeVarL0.H0()) {
                        String strG03 = tzeVarL0.g0(i3);
                        zfj zfjVarP = cmk.p((int) tzeVarL0.getLong(i2));
                        byte[] blob = tzeVarL0.getBlob(i);
                        pf5 pf5Var = pf5.b;
                        pf5 pf5VarJ = rvk.j(blob);
                        int i4 = (int) tzeVarL0.getLong(3);
                        int i5 = (int) tzeVarL0.getLong(4);
                        long j = tzeVarL0.getLong(14);
                        long j2 = tzeVarL0.getLong(15);
                        long j3 = tzeVarL0.getLong(16);
                        bp0 bp0Var3 = bp0Var;
                        jc1 jc1VarM = cmk.m((int) tzeVarL0.getLong(17));
                        long j4 = tzeVarL0.getLong(18);
                        long j5 = tzeVarL0.getLong(19);
                        int i6 = (int) tzeVarL0.getLong(20);
                        long j6 = tzeVarL0.getLong(21);
                        bp0 bp0Var4 = bp0Var2;
                        int i7 = (int) tzeVarL0.getLong(22);
                        ql4 ql4Var = new ql4(cmk.x(tzeVarL0.getBlob(6)), cmk.n((int) tzeVarL0.getLong(5)), ((int) tzeVarL0.getLong(7)) != 0, ((int) tzeVarL0.getLong(8)) != 0, ((int) tzeVarL0.getLong(9)) != 0, ((int) tzeVarL0.getLong(10)) != 0, tzeVarL0.getLong(11), tzeVarL0.getLong(12), cmk.h(tzeVarL0.getBlob(13)));
                        Object objF0 = sta.f0(tzeVarL0.g0(0), bp0Var3);
                        objF0.getClass();
                        List list = (List) objF0;
                        Object objF02 = sta.f0(tzeVarL0.g0(0), bp0Var4);
                        objF02.getClass();
                        arrayList.add(new sgj(strG03, zfjVarP, pf5VarJ, j, j2, j3, ql4Var, i4, jc1VarM, j4, j5, i6, i5, j6, i7, list, (List) objF02));
                        bp0Var = bp0Var3;
                        i = 2;
                        i3 = 0;
                        bp0Var2 = bp0Var4;
                        i2 = 1;
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
