package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class xw8 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ xv8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw8(xv8 xv8Var, int i) {
        super(0);
        this.F = i;
        this.G = xv8Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i;
        nsg pojVar;
        int largeMemoryClass;
        l4e l4eVar;
        switch (this.F) {
            case 0:
                Context context = (Context) this.G.F;
                Bitmap.Config[] configArr = l.a;
                double d = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                at atVar = new at(9);
                if (d > 0.0d) {
                    Bitmap.Config[] configArr2 = l.a;
                    try {
                        Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                        systemService2.getClass();
                        ActivityManager activityManager = (ActivityManager) systemService2;
                        largeMemoryClass = (context.getApplicationInfo().flags & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    } catch (Exception unused2) {
                        largeMemoryClass = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    }
                    i = (int) (d * ((double) largeMemoryClass) * 1024.0d * 1024.0d);
                    break;
                } else {
                    i = 0;
                }
                if (i > 0) {
                    qb5 qb5Var = new qb5();
                    qb5Var.E = atVar;
                    qb5Var.F = new f5e(i, qb5Var);
                    pojVar = qb5Var;
                } else {
                    pojVar = new poj(atVar);
                }
                return new x4e(pojVar, atVar);
            default:
                c0l c0lVar = c0l.T;
                Context context2 = (Context) this.G.F;
                synchronized (c0lVar) {
                    try {
                        l4eVar = c0l.U;
                        if (l4eVar == null) {
                            JvmSystemFileSystem jvmSystemFileSystem = FileSystem.E;
                            ft5 ft5Var = g86.a;
                            vr5 vr5Var = vr5.G;
                            Bitmap.Config[] configArr3 = l.a;
                            File cacheDir = context2.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File fileQ0 = nk7.q0(cacheDir, "image_cache");
                            String str = Path.F;
                            Path pathB = Path.Companion.b(fileQ0);
                            long jF0 = 10485760;
                            try {
                                File file = pathB.toFile();
                                file.mkdir();
                                StatFs statFs = new StatFs(file.getAbsolutePath());
                                jF0 = wd6.f0((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                break;
                            } catch (Exception unused3) {
                            }
                            l4e l4eVar2 = new l4e(jF0, vr5Var, jvmSystemFileSystem, pathB);
                            c0l.U = l4eVar2;
                            l4eVar = l4eVar2;
                        }
                    } finally {
                    }
                }
                return l4eVar;
        }
    }
}
