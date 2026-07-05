package io.sentry.android.replay;

import defpackage.ts9;
import defpackage.zy7;
import io.sentry.t5;
import io.sentry.w6;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ l G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, int i) {
        super(0);
        this.F = i;
        this.G = lVar;
    }

    @Override // defpackage.zy7
    public final Object a() throws IOException {
        int i = this.F;
        File file = null;
        l lVar = this.G;
        switch (i) {
            case 0:
                if (lVar.e() != null) {
                    file = new File(lVar.e(), ".ongoing_segment");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                }
                return file;
            default:
                w6 w6Var = lVar.E;
                io.sentry.protocol.w wVar = lVar.F;
                w6Var.getClass();
                wVar.getClass();
                String cacheDirPath = w6Var.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    w6Var.getLogger().h(t5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = w6Var.getCacheDirPath();
                cacheDirPath2.getClass();
                File file2 = new File(cacheDirPath2, "replay_" + wVar);
                file2.mkdirs();
                return file2;
        }
    }
}
