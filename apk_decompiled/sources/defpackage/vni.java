package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vni implements uja {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vni(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uja
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((wni) obj).e.a();
                break;
            case 1:
                File cacheDir = ((wni) obj).b.getCacheDir();
                cacheDir.getClass();
                File file = new File(cacheDir, "tmp");
                if (!file.exists()) {
                    file.mkdirs();
                }
                nk7.l0(file);
                break;
            case 2:
                File externalCacheDir = ((wni) obj).b.getExternalCacheDir();
                if (externalCacheDir != null) {
                    File file2 = new File(externalCacheDir, "tmp");
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    nk7.l0(file2);
                }
                break;
            case 3:
                ((wni) obj).c.a();
                break;
            case 4:
                ((wni) obj).d.a();
                break;
            case 5:
                ((wni) obj).f.e();
                break;
            default:
                ((zy7) ((nwb) obj).getValue()).a();
                break;
        }
    }
}
