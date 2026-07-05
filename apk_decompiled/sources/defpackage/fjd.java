package defpackage;

import android.graphics.Bitmap;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.l;
import io.sentry.w6;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class fjd extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fjd(Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.F = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        switch (this.F) {
            case 0:
                lj5 lj5Var = (lj5) obj;
                bz7 bz7Var = (bz7) obj2;
                lj5Var.getClass();
                bz7Var.getClass();
                bz7Var.invoke(new ek5((ax5) this.G, lj5Var, (dxc) this.H, (a2h) this.I, 3));
                return iei.a;
            default:
                l lVar = (l) obj;
                long jLongValue = ((Number) obj2).longValue();
                lVar.getClass();
                w6 w6Var = ((ReplayIntegration) this.G).H;
                if (w6Var == null) {
                    x44.o0("options");
                    throw null;
                }
                w6Var.getSessionReplay().getClass();
                Bitmap bitmap = (Bitmap) this.H;
                String str = (String) ((dae) this.I).E;
                bitmap.getClass();
                if (lVar.e() != null && !bitmap.isRecycled()) {
                    File fileE = lVar.e();
                    if (fileE != null) {
                        fileE.mkdirs();
                    }
                    File file = new File(lVar.e(), jLongValue + ".jpg");
                    file.createNewFile();
                    synchronized (bitmap) {
                        if (!bitmap.isRecycled()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                bitmap.compress(Bitmap.CompressFormat.JPEG, lVar.E.getSessionReplay().f.screenshotQuality, fileOutputStream);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                lVar.c(file, jLongValue, str);
                            } finally {
                            }
                        }
                    }
                }
                return iei.a;
        }
    }
}
