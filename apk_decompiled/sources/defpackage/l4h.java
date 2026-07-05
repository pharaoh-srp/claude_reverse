package defpackage;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class l4h {
    public final k4h a;
    public final xpa b;

    public l4h(k4h k4hVar, xpa xpaVar) {
        k4hVar.getClass();
        xpaVar.getClass();
        this.a = k4hVar;
        this.b = xpaVar;
    }

    public final void a() throws IOException {
        k4h k4hVar = this.a;
        k4hVar.getClass();
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(k4hVar.b.f());
        Context context = k4hVar.a;
        File file = new File(oq5.G(context), "tmp_camera");
        if (!file.exists()) {
            file.mkdirs();
        }
        File fileCreateTempFile = File.createTempFile(str, ".jpg", file);
        k4hVar.c.setValue(fileCreateTempFile);
        fileCreateTempFile.getClass();
        Uri uriD = FileProvider.d(context, context.getPackageName() + ".provider", fileCreateTempFile);
        uriD.getClass();
        this.b.t(uriD);
    }
}
