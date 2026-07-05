package defpackage;

import android.webkit.MimeTypeMap;
import java.io.File;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class li7 implements ih7 {
    public final File a;

    public li7(File file) {
        this.a = file;
    }

    @Override // defpackage.ih7
    public final Object a(tp4 tp4Var) {
        String str = Path.F;
        File file = this.a;
        return new bfg(new ri7(Path.Companion.b(file), FileSystem.E, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(nk7.m0(file)), rg5.G);
    }
}
