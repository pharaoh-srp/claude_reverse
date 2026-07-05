package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class dhk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ qgk J;

    public dhk(qgk qgkVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.E = i;
        this.F = str;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = qgkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vik vikVar = ((umk) this.J.E).L;
        umk.c(vikVar);
        boolean z = vikVar.F;
        qgk qgkVar = this.J;
        if (!z) {
            Log.println(6, qgkVar.Y0(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (qgkVar.G == 0) {
            vqj vqjVar = ((umk) qgkVar.E).K;
            if (vqjVar.I == null) {
                synchronized (vqjVar) {
                    try {
                        if (vqjVar.I == null) {
                            ApplicationInfo applicationInfo = ((umk) vqjVar.E).E.getApplicationInfo();
                            String strZ = u00.z();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                vqjVar.I = Boolean.valueOf(str != null && str.equals(strZ));
                            }
                            if (vqjVar.I == null) {
                                vqjVar.I = Boolean.TRUE;
                                vqjVar.b0().J.b("My process not in the list of running processes");
                            }
                        }
                    } finally {
                    }
                }
            }
            boolean zBooleanValue = vqjVar.I.booleanValue();
            qgk qgkVar2 = this.J;
            if (zBooleanValue) {
                qgkVar2.G = 'C';
            } else {
                qgkVar2.G = 'c';
            }
        }
        qgk qgkVar3 = this.J;
        if (qgkVar3.H < 0) {
            qgkVar3.H = 102001L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.E);
        qgk qgkVar4 = this.J;
        char c = qgkVar4.G;
        long j = qgkVar4.H;
        String strP0 = qgk.P0(true, this.F, this.G, this.H, this.I);
        StringBuilder sb = new StringBuilder("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        String strM = ij0.m(sb, ":", strP0);
        if (strM.length() > 1024) {
            strM = this.F.substring(0, FreeTypeConstants.FT_LOAD_NO_RECURSE);
        }
        ue7 ue7Var = vikVar.J;
        if (ue7Var != null) {
            String str2 = (String) ue7Var.H;
            String str3 = (String) ue7Var.G;
            vik vikVar2 = (vik) ue7Var.I;
            vikVar2.K0();
            if (((vik) ue7Var.I).T0().getLong((String) ue7Var.F, 0L) == 0) {
                ue7Var.f();
            }
            long j2 = vikVar2.T0().getLong(str3, 0L);
            if (j2 <= 0) {
                SharedPreferences.Editor editorEdit = vikVar2.T0().edit();
                editorEdit.putString(str2, strM);
                editorEdit.putLong(str3, 1L);
                editorEdit.apply();
                return;
            }
            long j3 = j2 + 1;
            boolean z2 = (vikVar2.J0().X1().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
            SharedPreferences.Editor editorEdit2 = vikVar2.T0().edit();
            if (z2) {
                editorEdit2.putString(str2, strM);
            }
            editorEdit2.putLong(str3, j3);
            editorEdit2.apply();
        }
    }
}
