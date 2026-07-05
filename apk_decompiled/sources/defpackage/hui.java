package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.IOException;
import okio.FileSystem;

/* JADX INFO: loaded from: classes2.dex */
public final class hui implements oo5 {
    public final jy8 a;
    public final qjc b;

    public hui(jy8 jy8Var, qjc qjcVar) {
        this.a = jy8Var;
        this.b = qjcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[PHI: r5
      0x005b: PHI (r5v11 int) = (r5v8 int), (r5v8 int), (r5v40 int), (r5v40 int) binds: [B:34:0x0073, B:36:0x0079, B:22:0x004e, B:24:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    @Override // defpackage.oo5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.tp4 r31) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hui.a(tp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (defpackage.c0l.k(r11.getWidth(), r11.getHeight(), r12 instanceof defpackage.q46 ? ((defpackage.q46) r12).a : r11.getWidth(), r0 instanceof defpackage.q46 ? ((defpackage.q46) r0).a : r11.getHeight(), r10.c, (defpackage.j8g) defpackage.dch.z(r10, defpackage.mx8.b)) == 1.0d) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(android.graphics.Bitmap r11, defpackage.j8g r12) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hui.b(android.graphics.Bitmap, j8g):android.graphics.Bitmap");
    }

    public final void c(MediaMetadataRetriever mediaMetadataRetriever, jy8 jy8Var) throws IOException {
        huk hukVarM = jy8Var.m();
        if (hukVarM instanceof a7b) {
            mediaMetadataRetriever.setDataSource(((a7b) hukVarM).b);
            return;
        }
        boolean z = hukVarM instanceof xw0;
        qjc qjcVar = this.b;
        if (!z) {
            if (hukVarM instanceof bo4) {
                mediaMetadataRetriever.setDataSource(qjcVar.a, Uri.parse(((bo4) hukVarM).b.a));
                return;
            }
            if (!(hukVarM instanceof xpe)) {
                if (jy8Var.getFileSystem() == FileSystem.E) {
                    mediaMetadataRetriever.setDataSource(jy8Var.V().toFile().getPath());
                    return;
                } else {
                    mediaMetadataRetriever.setDataSource(new ni7(jy8Var.getFileSystem().R(jy8Var.V())));
                    return;
                }
            }
            xpe xpeVar = (xpe) hukVarM;
            mediaMetadataRetriever.setDataSource("android.resource://" + xpeVar.b + "/" + xpeVar.c);
            return;
        }
        AssetFileDescriptor assetFileDescriptorOpenFd = qjcVar.a.getAssets().openFd(((xw0) hukVarM).b);
        try {
            mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
            assetFileDescriptorOpenFd.close();
        } finally {
        }
    }
}
