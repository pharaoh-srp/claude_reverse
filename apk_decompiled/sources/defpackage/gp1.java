package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gp1 implements occ, fsi {
    public int E;
    public int F;
    public Object G;

    public gp1(int i, int i2, vi6 vi6Var) {
        this.E = i;
        this.F = i2;
        this.G = new dpf(new wo7(i, i2, vi6Var));
    }

    @Override // defpackage.occ
    public int D(int i) {
        int iD = ((occ) this.G).D(i);
        if (i >= 0 && i <= this.E) {
            qqi.b(iD, this.F, i);
        }
        return iD;
    }

    public hp1 b() {
        hp1 hp1Var = new hp1();
        hp1Var.a = this.E;
        hp1Var.b = this.F;
        hp1Var.c = (String) this.G;
        return hp1Var;
    }

    public synchronized int c() {
        PackageInfo packageInfoE;
        if (this.E == 0) {
            try {
                packageInfoE = nij.a((Context) this.G).E(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoE = null;
            }
            if (packageInfoE != null) {
                this.E = packageInfoE.versionCode;
            }
        }
        return this.E;
    }

    public synchronized int d() {
        int i = this.F;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.G;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) nij.a(context).F).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.F = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.F = 2;
        return 2;
    }

    @Override // defpackage.dsi
    public sb0 f(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return ((dpf) this.G).f(j, sb0Var, sb0Var2, sb0Var3);
    }

    @Override // defpackage.fsi
    public int k() {
        return this.F;
    }

    @Override // defpackage.occ
    public int l(int i) {
        int iL = ((occ) this.G).l(i);
        if (i >= 0 && i <= this.F) {
            qqi.c(iL, this.E, i);
        }
        return iL;
    }

    @Override // defpackage.fsi
    public int o() {
        return this.E;
    }

    @Override // defpackage.dsi
    public sb0 p(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return ((dpf) this.G).p(j, sb0Var, sb0Var2, sb0Var3);
    }

    public gp1(int i, int i2, zy7 zy7Var) {
        this.E = i;
        this.F = i2;
        this.G = zy7Var;
    }

    public gp1() {
        this.G = new gp1[FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING];
        this.E = 0;
        this.F = 0;
    }

    public gp1(occ occVar, int i, int i2) {
        this.G = occVar;
        this.E = i;
        this.F = i2;
    }
}
