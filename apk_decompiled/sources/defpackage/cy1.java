package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudInterruptReason;
import com.anthropic.claude.bell.tts.f;
import com.google.android.play.core.install.zza;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cy1 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cy1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                context.getClass();
                intent.getClass();
                lh1 lh1Var = (lh1) this.b;
                switch (lh1Var.g) {
                    case 0:
                        String action = intent.getAction();
                        if (action == null) {
                            return;
                        }
                        nga ngaVarC = nga.c();
                        String str = mh1.a;
                        ngaVarC.getClass();
                        switch (action.hashCode()) {
                            case -1886648615:
                                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                    lh1Var.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case -54942926:
                                if (action.equals("android.os.action.DISCHARGING")) {
                                    lh1Var.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case 948344062:
                                if (action.equals("android.os.action.CHARGING")) {
                                    lh1Var.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            case 1019184907:
                                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    lh1Var.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    case 1:
                        if (intent.getAction() == null) {
                            return;
                        }
                        nga ngaVarC2 = nga.c();
                        String str2 = oh1.a;
                        intent.getAction();
                        ngaVarC2.getClass();
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            int iHashCode = action2.hashCode();
                            if (iHashCode == -1980154005) {
                                if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    lh1Var.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    lh1Var.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        if (intent.getAction() == null) {
                            return;
                        }
                        nga ngaVarC3 = nga.c();
                        int i2 = dpg.a;
                        intent.getAction();
                        ngaVarC3.getClass();
                        String action3 = intent.getAction();
                        if (action3 != null) {
                            int iHashCode2 = action3.hashCode();
                            if (iHashCode2 == -1181163412) {
                                if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    lh1Var.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            } else {
                                if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    lh1Var.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            case 1:
                context.getClass();
                intent.getClass();
                PowerManager powerManager = ((aq5) this.b).G;
                Boolean boolValueOf = powerManager != null ? Boolean.valueOf(powerManager.isPowerSaveMode()) : null;
                if (boolValueOf != null) {
                    ((aq5) this.b).K = boolValueOf;
                    return;
                }
                return;
            case 2:
                sa6 sa6Var = (sa6) this.b;
                context.getClass();
                intent.getClass();
                if (x44.r(intent.getAction(), "android.intent.action.DOWNLOAD_COMPLETE")) {
                    long longExtra = intent.getLongExtra("extra_download_id", -1L);
                    if (sa6Var.c.containsKey(Long.valueOf(longExtra))) {
                        gb9.D(sa6Var.d, null, o45.G, new ra6(sa6Var, longExtra, goAsync(), null, 0), 1);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (x44.r(intent != null ? intent.getAction() : null, "android.media.AUDIO_BECOMING_NOISY")) {
                    i2h i2hVar = ((f) this.b).p;
                    if (i2hVar != null) {
                        i2hVar.m(ReadAloudEvents$ReadAloudInterruptReason.ROUTE_CHANGE);
                    }
                    gb9.D(fd9.o(), null, null, new j2h((f) this.b, objArr == true ? 1 : 0, i), 3);
                    return;
                }
                return;
            default:
                pyj pyjVar = (pyj) this.b;
                boolean zEquals = context.getPackageName().equals(intent.getStringExtra("package.name"));
                sqb sqbVar = pyjVar.a;
                if (!zEquals) {
                    sqbVar.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                sqbVar.a("List of extras in received intent:", new Object[0]);
                for (String str3 : intent.getExtras().keySet()) {
                    pyjVar.a.a("Key: %s; value: %s", str3, intent.getExtras().get(str3));
                }
                zza zzaVarD = zza.d(intent, pyjVar.a);
                pyjVar.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVarD);
                synchronized (pyjVar) {
                    Iterator it = new HashSet(pyjVar.d).iterator();
                    while (it.hasNext()) {
                        ((kke) it.next()).a(zzaVarD);
                        break;
                    }
                }
                return;
        }
    }
}
